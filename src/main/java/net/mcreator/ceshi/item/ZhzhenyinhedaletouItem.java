
package net.mcreator.ceshi.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ZhzhenyinhedaletouItem extends Item {
	public ZhzhenyinhedaletouItem() {
		super(new Item.Properties().durability(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.primogemcraft.zhzhenyinhedaletou.description_0"));
		list.add(Component.translatable("item.primogemcraft.zhzhenyinhedaletou.description_1"));
		list.add(Component.translatable("item.primogemcraft.zhzhenyinhedaletou.description_2"));
		list.add(Component.translatable("item.primogemcraft.zhzhenyinhedaletou.description_3"));
		list.add(Component.translatable("item.primogemcraft.zhzhenyinhedaletou.description_4"));
		list.add(Component.translatable("item.primogemcraft.zhzhenyinhedaletou.description_5"));
	}
}
