package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class WuqidengjiHSProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack item, double xian_zhi, double zhi) {
		if (entity == null)
			return;
		ItemStack i1 = ItemStack.EMPTY;
		double a = 0;
		double b = 0;
		if (item.is(ItemTags.create(ResourceLocation.parse("pgc:wuqi")))) {
			a = xian_zhi - 1;
			i1 = item;
			b = i1.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("deng_ji");
			if (b >= a) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("dengji_hs_0").getString())), false);
			} else {
				{
					final String _tagName = "deng_ji";
					final double _tagValue = (b + zhi);
					CustomData.update(DataComponents.CUSTOM_DATA, i1, tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (i1.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("deng_ji") > a) {
					{
						final String _tagName = "deng_ji";
						final double _tagValue = a;
						CustomData.update(DataComponents.CUSTOM_DATA, i1, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				WuqishuaxinProcedure.execute(world, entity, i1);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("dengji_hs_2").getString())), false);
		}
	}
}
