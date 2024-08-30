
package net.mcreator.ceshi.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class Ceshifumo01Enchantment extends Enchantment {
	public Ceshifumo01Enchantment() {
		super(Enchantment.definition(ItemTags.create(new ResourceLocation("enchantable/durability")), 5, 4, Enchantment.dynamicCost(1, 10), Enchantment.dynamicCost(6, 10), 2, EquipmentSlot.values()

		));
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(ItemTags.create(new ResourceLocation("enchantable/durability"))).test(itemstack);
	}
}
