package net.mcreator.ceshi.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ceshi.world.inventory.LiulangzhezhinangguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LiulangzhezhinangguiScreen extends AbstractContainerScreen<LiulangzhezhinangguiMenu> {
	private final static HashMap<String, Object> guistate = LiulangzhezhinangguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LiulangzhezhinangguiScreen(LiulangzhezhinangguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 156;
	}

	private static final ResourceLocation texture = new ResourceLocation("primogemcraft:textures/screens/liulangzhezhinanggui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.liulangzhezhinanggui.label_liu_lang_zhe_zhi_nang"), 7, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.primogemcraft.liulangzhezhinanggui.label_wu_pin_lan"), 7, 59, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
