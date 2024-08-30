package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

public class Daima2shuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		JinzhifumoProcedure.execute(world, x, y, z, entity, itemstack);
		Luandaima_shuxingProcedure.execute(itemstack);
		NaijiuxianzhishuchuProcedure.execute(itemstack);
		if (entity.getPersistentData().getBoolean("daima2_naijiu")) {
			itemstack.setDamageValue((int) (itemstack.getDamageValue() - 1));
			NaijiuxianzhiProcedure.execute(itemstack);
			entity.getPersistentData().putBoolean("daima2_naijiu", false);
		}
		if (!itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("daishanchu") && !itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("daima2_yixiufu")
				&& itemstack.getDamageValue() == 0) {
			{
				final String _tagName = "daima2_yixiufu";
				final boolean _tagValue = true;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putBoolean(_tagName, _tagValue));
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A75\u300E\u5947\u7269\u300F\u00A79\u6709\u70B9\u8E4A\u8DF7\u7684\u4EE3\u7801\u00A7a\u4FEE\u590D\u5B8C\u6210"), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("primogemcraft:qiwusunhuai066")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("daima2_yixiufu")) {
			if (!(entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(PrimogemcraftModMobEffects.QIQIAODAIMAXIUFU))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIQIAODAIMAXIUFU, 200, 0, false, false));
				NaijiuxianzhiProcedure.execute(itemstack);
			}
		}
	}
}
