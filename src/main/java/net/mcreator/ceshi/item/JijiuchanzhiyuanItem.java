
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.JijiuchanzhiyuanWanJiaWanChengShiYongWuPinShiProcedure;
import net.mcreator.ceshi.procedures.JijiuchanzhiyuanDangWuPinZaiShouShangMeiKeFaShengProcedure;
import net.mcreator.ceshi.procedures.JcsxcxsxProcedure;

import java.util.List;

public class JijiuchanzhiyuanItem extends Item {
	public JijiuchanzhiyuanItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-1f).alwaysEat().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77\u957F\u6309\u53F3\u952E\u4F7F\u7528"));
		list.add(Component.literal("\u00A76\u6F5C\u884C+\u5DE6\u952E\u00A75\u83B7\u53D6\u7948\u613F\u52A0\u6210\u4FE1\u606F"));
		list.add(Component.literal("\u00A7c\u4F7F\u7528\u8005\u5FC5\u987B\u5728\u9644\u8FD1"));
		list.add(Component.literal("\u00A7520%\u00A77\u3001\u00A763%"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		JijiuchanzhiyuanWanJiaWanChengShiYongWuPinShiProcedure.execute(world, x, y, z, entity, itemstack);
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		JcsxcxsxProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			JijiuchanzhiyuanDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(entity);
	}
}
