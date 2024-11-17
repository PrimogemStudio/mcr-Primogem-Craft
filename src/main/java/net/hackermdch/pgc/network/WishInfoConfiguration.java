package net.hackermdch.pgc.network;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.configuration.ServerConfigurationPacketListener;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.network.configuration.ICustomConfigurationTask;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.function.Consumer;

import static net.mcreator.ceshi.PrimogemcraftMod.MODID;

@EventBusSubscriber(modid = MODID)
public record WishInfoConfiguration(ServerConfigurationPacketListener listener) implements ICustomConfigurationTask {
    private static final Type TYPE = new Type(ResourceLocation.fromNamespaceAndPath(MODID, "wish_info"));
    private static Set<Holder<Item>> items, items1, items2;
    private static RegistryAccess registry;

    @Override
    public void run(@NotNull Consumer<CustomPacketPayload> sender) {
        sender.accept(new WishInfoPacket(items, 0, registry));
        sender.accept(new WishInfoPacket(items1, 1, registry));
        sender.accept(new WishInfoPacket(items2, 2, registry));
        listener.finishCurrentTask(TYPE);
    }

    @Override
    @NotNull
    public Type type() {
        return TYPE;
    }

    @SubscribeEvent
    private static void onReload(AddReloadListenerEvent event) {
        var provider = event.getRegistryAccess().asGetterLookup();
        registry = event.getRegistryAccess();
        items = getItems(provider, "q_qqyzi");
        items1 = getItems(provider, "qq_qqylan");
        items2 = getItems(provider, "qqyjin");
    }

    private static Set<Holder<Item>> getItems(HolderGetter.Provider provider, String name) {
        var builder = ImmutableSet.<Holder<Item>>builder();
        provider.get(Registries.LOOT_TABLE, ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(MODID, name))).ifPresent(table -> table.value().pools.forEach(pool -> pool.entries.forEach(entry -> {
            if (entry instanceof LootItem item) builder.add(item.item);
        })));
        return builder.build();
    }
}
