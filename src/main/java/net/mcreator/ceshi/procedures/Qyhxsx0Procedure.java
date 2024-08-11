package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class Qyhxsx0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double a = 0;
		double a1 = 0;
		double a2 = 0;
		if (!world.isClientSide()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.COMMAND_BLOCK.asItem()) {
				a = 1000;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pgc:qysz_10")))) {
				a = 10;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pgc:qysz_7")))) {
				a = 7;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pgc:qysz_5")))) {
				a = 5;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("pgc:qysz_3")))) {
				a = 3;
			} else {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:beacon_payment_items")))) {
					a = 4;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:trim_materials")))) {
					a = 2;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:trimmable_armor")))) {
					a = 6;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:breaks_decorated_pots")))) {
					a = 4;
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:storage_blocks")))) {
					a = 6;
				} else {
					a = 1;
				}
			}
			if (itemstack.getItem() == PrimogemcraftModItems.QYHX.get()) {
				if (!(itemstack.getOrCreateTag().getDouble("qyhx_cishu") > 29)) {
					if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem())
							&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
						if (entity.isShiftKeyDown()) {
							a1 = itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1);
							a2 = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount();
							if (a1 > a2) {
								itemstack.getOrCreateTag().putDouble("Prayers_strengthen", (itemstack.getOrCreateTag().getDouble("Prayers_strengthen") + a2 * a));
								itemstack.getOrCreateTag().putDouble("qyhx_cishu", (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + a2));
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink((int) a2);
								itemstack.setDamageValue((int) (itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.05));
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.05), false);
									}
								}
							} else {
								itemstack.getOrCreateTag().putDouble("Prayers_strengthen", (itemstack.getOrCreateTag().getDouble("Prayers_strengthen") + a1 * a));
								itemstack.getOrCreateTag().putDouble("qyhx_cishu", (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + a1));
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink((int) a1);
								itemstack.setDamageValue((int) (itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.05));
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.05), false);
									}
								}
							}
						} else {
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
							itemstack.getOrCreateTag().putDouble("Prayers_strengthen", (itemstack.getOrCreateTag().getDouble("Prayers_strengthen") + a));
							itemstack.getOrCreateTag().putDouble("qyhx_cishu", (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1));
							itemstack.setDamageValue((int) (itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
											(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.05));
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
											(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.05), false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c\u526F\u624B\u7269\u54C1\u65E0\u6548\uFF01"), false);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7c\u8BE5\u7269\u54C1\u52A0\u6210\u5DF2\u8FBE\u6700\u5927\uFF01"), false);
				}
			} else {
				if (!(itemstack.getOrCreateTag().getDouble("qyhx_cishu") > 299)) {
					if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem())
							&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
						if (entity.isShiftKeyDown()) {
							a1 = itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1);
							a2 = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount();
							if (a1 > a2) {
								itemstack.getOrCreateTag().putDouble("Prayers_strengthen", (itemstack.getOrCreateTag().getDouble("Prayers_strengthen") + a2 * a));
								itemstack.getOrCreateTag().putDouble("qyhx_cishu", (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + a2));
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink((int) a2);
								itemstack.setDamageValue((int) (itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.005));
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.005), false);
									}
								}
							} else {
								itemstack.getOrCreateTag().putDouble("Prayers_strengthen", (itemstack.getOrCreateTag().getDouble("Prayers_strengthen") + a1 * a));
								itemstack.getOrCreateTag().putDouble("qyhx_cishu", (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + a1));
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink((int) a1);
								itemstack.setDamageValue((int) (itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.005));
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
												(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.005), false);
									}
								}
							}
						} else {
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
							itemstack.getOrCreateTag().putDouble("Prayers_strengthen", (itemstack.getOrCreateTag().getDouble("Prayers_strengthen") + a));
							itemstack.getOrCreateTag().putDouble("qyhx_cishu", (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1));
							itemstack.setDamageValue((int) (itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
											(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.005));
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("primogemcraft:jingyanshu00")), SoundSource.PLAYERS, (float) 0.5,
											(float) ((itemstack.getMaxDamage() - (itemstack.getOrCreateTag().getDouble("qyhx_cishu") + 1)) * 0.005), false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c\u526F\u624B\u7269\u54C1\u65E0\u6548\uFF01"), false);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7c\u8BE5\u7269\u54C1\u52A0\u6210\u5DF2\u8FBE\u6700\u5927\uFF01"), false);
				}
			}
		}
	}
}
