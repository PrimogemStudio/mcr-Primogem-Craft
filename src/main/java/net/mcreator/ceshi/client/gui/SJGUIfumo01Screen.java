package net.mcreator.ceshi.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ceshi.world.inventory.SJGUIfumo01Menu;
import net.mcreator.ceshi.network.SJGUIfumo01ButtonMessage;
import net.mcreator.ceshi.PrimogemcraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SJGUIfumo01Screen extends AbstractContainerScreen<SJGUIfumo01Menu> {
	private final static HashMap<String, Object> guistate = SJGUIfumo01Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_heita_xuanzeanniu;
	ImageButton imagebutton_heita_xuanzeanniu1;
	ImageButton imagebutton_heita_xuanzeanniu2;

	public SJGUIfumo01Screen(SJGUIfumo01Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("primogemcraft:textures/screens/sjgu_ifumo_01.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.sjgu_ifumo_01.label_jin_xing_1ci_di_pin_zhi_fu_mo"), 37, 15, -5070724, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.sjgu_ifumo_01.label_jin_xing_1ci_di_gao_pin_zhi_fu_mo"), 37, 63, -5070724, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.sjgu_ifumo_01.label_jin_xing_1ci_zhong_te_ji_pin_zhi_fu_mo"), 37, 111, -5070724, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.sjgu_ifumo_01.label_xiao_hao_10yu_zhou_sui_pian"), 37, 28, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.sjgu_ifumo_01.label_xiao_hao_20yu_zhou_sui_pian"), 37, 76, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.sjgu_ifumo_01.label_xiao_hao_40yu_zhou_sui_pian"), 37, 124, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_heita_xuanzeanniu = new ImageButton(this.leftPos + 31, this.topPos + 13, 114, 43, 0, 0, 43, new ResourceLocation("primogemcraft:textures/screens/atlas/imagebutton_heita_xuanzeanniu.png"), 114, 86, e -> {
			if (true) {
				PrimogemcraftMod.PACKET_HANDLER.sendToServer(new SJGUIfumo01ButtonMessage(0, x, y, z));
				SJGUIfumo01ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heita_xuanzeanniu", imagebutton_heita_xuanzeanniu);
		this.addRenderableWidget(imagebutton_heita_xuanzeanniu);
		imagebutton_heita_xuanzeanniu1 = new ImageButton(this.leftPos + 31, this.topPos + 61, 114, 43, 0, 0, 43, new ResourceLocation("primogemcraft:textures/screens/atlas/imagebutton_heita_xuanzeanniu1.png"), 114, 86, e -> {
			if (true) {
				PrimogemcraftMod.PACKET_HANDLER.sendToServer(new SJGUIfumo01ButtonMessage(1, x, y, z));
				SJGUIfumo01ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heita_xuanzeanniu1", imagebutton_heita_xuanzeanniu1);
		this.addRenderableWidget(imagebutton_heita_xuanzeanniu1);
		imagebutton_heita_xuanzeanniu2 = new ImageButton(this.leftPos + 31, this.topPos + 109, 114, 43, 0, 0, 43, new ResourceLocation("primogemcraft:textures/screens/atlas/imagebutton_heita_xuanzeanniu2.png"), 114, 86, e -> {
			if (true) {
				PrimogemcraftMod.PACKET_HANDLER.sendToServer(new SJGUIfumo01ButtonMessage(2, x, y, z));
				SJGUIfumo01ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_heita_xuanzeanniu2", imagebutton_heita_xuanzeanniu2);
		this.addRenderableWidget(imagebutton_heita_xuanzeanniu2);
	}
}
