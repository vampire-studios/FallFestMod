// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package io.github.vampirestudios.tat.client.model;

import io.github.vampirestudios.tat.entity.AppleBombEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class AppleBombEntityModel extends EntityModel<AppleBombEntity> {

	private final ModelPart main;
	private final ModelPart stem;

	public AppleBombEntityModel() {
		textureWidth = 32;
		textureHeight = 32;
		main = new ModelPart(this);
		main.setPivot(0.0F, 21.0F, 0.0F);
		main.setTextureOffset(0, 0).addCuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		stem = new ModelPart(this);
		stem.setPivot(0.0F, -2.6F, 0.0F);
		main.addChild(stem);
		setRotationAngle(stem, -0.7854F, 0.0F, 0.0F);
		stem.setTextureOffset(0, 14).addCuboid(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setAngles(AppleBombEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

}