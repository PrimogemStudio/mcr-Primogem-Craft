
package net.mcreator.ceshi.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.Zsjsx2Procedure;
import net.mcreator.ceshi.procedures.ZsjgjsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class ZszsjItem extends SwordItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1561;
		}

		@Override
		public float getSpeed() {
			return 8f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 14;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(PrimogemcraftModItems.ZUISHENGSUIXIE.get()), new ItemStack(Items.DIAMOND));
		}
	};

	public ZszsjItem() {
		super(TOOL_TIER, new Item.Properties().attributes(SwordItem.createAttributes(TOOL_TIER, 4.5f, -2.2f)).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ZsjgjsxProcedure.execute(entity.level(), entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Zsjsx2Procedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.primogemcraft.zszsj.description_0"));
		list.add(Component.translatable("item.primogemcraft.zszsj.description_1"));
		list.add(Component.translatable("item.primogemcraft.zszsj.description_2"));
		list.add(Component.translatable("item.primogemcraft.zszsj.description_3"));
		list.add(Component.translatable("item.primogemcraft.zszsj.description_4"));
		list.add(Component.translatable("item.primogemcraft.zszsj.description_5"));
		list.add(Component.translatable("item.primogemcraft.zszsj.description_6"));
	}
}
