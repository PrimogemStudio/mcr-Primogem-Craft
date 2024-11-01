
package net.mcreator.ceshi.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HqcaoItem extends Item {
	public HqcaoItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.primogemcraft.hqcao.description_0"));
		list.add(Component.translatable("item.primogemcraft.hqcao.description_1"));
		list.add(Component.translatable("item.primogemcraft.hqcao.description_2"));
		list.add(Component.translatable("item.primogemcraft.hqcao.description_3"));
		list.add(Component.translatable("item.primogemcraft.hqcao.description_4"));
		list.add(Component.translatable("item.primogemcraft.hqcao.description_5"));
	}
}
