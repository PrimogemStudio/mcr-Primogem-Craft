
package net.mcreator.ceshi.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.world.inventory.GUIqiwuxuanzeMenu;
import net.mcreator.ceshi.procedures.GUIqwxzanniusx2Procedure;
import net.mcreator.ceshi.procedures.GUIqwxzanniusx1Procedure;
import net.mcreator.ceshi.procedures.GUIqwxzanniusx0Procedure;
import net.mcreator.ceshi.PrimogemcraftMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record GUIqiwuxuanzeButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<GUIqiwuxuanzeButtonMessage> TYPE = new Type<>(new ResourceLocation(PrimogemcraftMod.MODID, "gu_iqiwuxuanze_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, GUIqiwuxuanzeButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, GUIqiwuxuanzeButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new GUIqiwuxuanzeButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<GUIqiwuxuanzeButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final GUIqiwuxuanzeButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = GUIqiwuxuanzeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GUIqwxzanniusx0Procedure.execute(entity);
		}
		if (buttonID == 1) {

			GUIqwxzanniusx1Procedure.execute(entity);
		}
		if (buttonID == 2) {

			GUIqwxzanniusx2Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PrimogemcraftMod.addNetworkMessage(GUIqiwuxuanzeButtonMessage.TYPE, GUIqiwuxuanzeButtonMessage.STREAM_CODEC, GUIqiwuxuanzeButtonMessage::handleData);
	}
}
