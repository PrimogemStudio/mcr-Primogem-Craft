
package net.mcreator.ceshi.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class Bbuzainianqingdeqincezhuang012Item extends RecordItem {
	public Bbuzainianqingdeqincezhuang012Item() {
		super(10, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("primogemcraft:liyueqincezhuang012")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5000);
	}
}
