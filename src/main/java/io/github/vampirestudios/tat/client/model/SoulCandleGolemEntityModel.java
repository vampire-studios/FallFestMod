package io.github.vampirestudios.tat.client.model;

import io.github.vampirestudios.tat.entity.SoulCandleGolemEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SoulCandleGolemEntityModel extends EntityModel<SoulCandleGolemEntity> {

	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart melt;
	private final ModelPart wick;

	public SoulCandleGolemEntityModel() {
		textureWidth = 32;
		textureHeight = 32;
		body = new ModelPart(this);
		body.setPivot(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 10).addCuboid(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		head = new ModelPart(this);
		head.setPivot(0.0F, -4.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addCuboid(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		melt = new ModelPart(this);
		melt.setPivot(0.0F, -6.5F, 0.0F);
		head.addChild(melt);
		melt.setTextureOffset(0, 20).addCuboid(-3.5F, 0.0F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, false);

		wick = new ModelPart(this);
		wick.setPivot(0.0F, -5.8F, 0.0F);
		head.addChild(wick);
		setRotationAngle(wick, 0.0F, 0.0F, 0.0017F);
		wick.setTextureOffset(0, 0).addCuboid(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setAngles(SoulCandleGolemEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

}