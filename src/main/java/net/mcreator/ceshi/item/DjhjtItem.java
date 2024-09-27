
package net.mcreator.ceshi.item;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import net.mcreator.ceshi.procedures.DjtsxProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;
import java.util.EnumMap;

import com.google.common.collect.Iterables;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class DjhjtItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 5);
				map.put(ArmorItem.Type.LEGGINGS, 7);
				map.put(ArmorItem.Type.CHESTPLATE, 8);
				map.put(ArmorItem.Type.HELMET, 5);
				map.put(ArmorItem.Type.BODY, 8);
			}), 18, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_netherite")), () -> Ingredient.of(new ItemStack(PrimogemcraftModItems.DIJINGDUANPIAN.get()), new ItemStack(Items.NETHERITE_INGOT)),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("primogemcraft:djhjt_"))), 4f, 0.2f);
			registerHelper.register(ResourceLocation.parse("primogemcraft:djhjt"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public DjhjtItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends DjhjtItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(203)).fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.literal("\u00A76\u5957\u88C5\u6548\u679C\uFF1A"));
			list.add(Component.literal("\u00A77 2x \u63D0\u4F9B\u6C38\u4E45\u6F6E\u6D8C\u6838\u5FC3\u6548\u679C"));
			list.add(Component.literal("\u00A77 4x \u95F4\u6B47\u6027\u6062\u590D\u751F\u547D\u503C"));
			list.add(Component.literal("\u00A78\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u503C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A79+2 \u5957\u88C5\u503C\uFF08\u9752\u91D1\uFF09"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				DjtsxProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Chestplate extends DjhjtItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(203)).fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.literal("\u00A76\u5957\u88C5\u6548\u679C\uFF1A"));
			list.add(Component.literal("\u00A77 2x \u63D0\u4F9B\u6C38\u4E45\u6F6E\u6D8C\u6838\u5FC3\u6548\u679C"));
			list.add(Component.literal("\u00A77 4x \u95F4\u6B47\u6027\u6062\u590D\u751F\u547D\u503C"));
			list.add(Component.literal("\u00A78\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u503C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A79+2 \u5957\u88C5\u503C\uFF08\u9752\u91D1\uFF09"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				DjtsxProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Leggings extends DjhjtItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(203)).fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.literal("\u00A76\u5957\u88C5\u6548\u679C\uFF1A"));
			list.add(Component.literal("\u00A77 2x \u63D0\u4F9B\u6C38\u4E45\u6F6E\u6D8C\u6838\u5FC3\u6548\u679C"));
			list.add(Component.literal("\u00A77 4x \u95F4\u6B47\u6027\u6062\u590D\u751F\u547D\u503C"));
			list.add(Component.literal("\u00A78\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u503C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A79+2 \u5957\u88C5\u503C\uFF08\u9752\u91D1\uFF09"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				DjtsxProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Boots extends DjhjtItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(203)).fireResistant());
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.literal("\u00A76\u5957\u88C5\u6548\u679C\uFF1A"));
			list.add(Component.literal("\u00A77 2x \u63D0\u4F9B\u6C38\u4E45\u6F6E\u6D8C\u6838\u5FC3\u6548\u679C"));
			list.add(Component.literal("\u00A77 4x \u95F4\u6B47\u6027\u6062\u590D\u751F\u547D\u503C"));
			list.add(Component.literal("\u00A78\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u503C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A79+2 \u5957\u88C5\u503C\uFF08\u9752\u91D1\uFF09"));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				DjtsxProcedure.execute(entity, itemstack);
			}
		}
	}
}
