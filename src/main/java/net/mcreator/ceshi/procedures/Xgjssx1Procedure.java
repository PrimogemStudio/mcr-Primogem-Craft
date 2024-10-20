package net.mcreator.ceshi.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Xgjssx1Procedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		double a = 0;
		if (!world.isClientSide()) {
			if (sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(PrimogemcraftModMobEffects.JISHENG)) {
				a = a + 0.2;
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PrimogemcraftModItems.QWKWZW.get())) : false) {
					if (Math.random() < 0.25) {
						a = a + 0.2;
					}
				}
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC_KILL)), (float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
						* ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.JISHENG) ? _livEnt.getEffect(PrimogemcraftModMobEffects.JISHENG).getAmplifier() : 0) + 1) * a));
				if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PrimogemcraftModItems.QWKWZW.get())) : false) {
					if (Math.random() < 0.5) {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.1));
					}
				}
			}
		}
	}
}
