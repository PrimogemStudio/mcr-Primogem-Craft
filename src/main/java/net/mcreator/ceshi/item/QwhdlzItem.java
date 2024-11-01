
package net.mcreator.ceshi.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Hdlz_sx_1Procedure;

import java.util.List;

public class QwhdlzItem extends Item {
	public QwhdlzItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.primogemcraft.qwhdlz.description_0"));
		list.add(Component.translatable("item.primogemcraft.qwhdlz.description_1"));
		list.add(Component.translatable("item.primogemcraft.qwhdlz.description_2"));
		list.add(Component.translatable("item.primogemcraft.qwhdlz.description_3"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Hdlz_sx_1Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
