
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

import net.mcreator.ceshi.procedures.FumianqiwufaguangProcedure;
import net.mcreator.ceshi.procedures.Daima_1_shuxingProcedure;

import java.util.List;

public class LuanqibazaodedaimaItem extends Item {
	public LuanqibazaodedaimaItem() {
		super(new Item.Properties().durability(31).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return FumianqiwufaguangProcedure.execute(itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_0"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_1"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_2"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_3"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_4"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_5"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_6"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_7"));
		list.add(Component.translatable("item.primogemcraft.luanqibazaodedaima.description_8"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Daima_1_shuxingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}
