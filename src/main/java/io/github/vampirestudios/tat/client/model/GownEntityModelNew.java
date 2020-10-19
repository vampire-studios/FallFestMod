package io.github.vampirestudios.tat.client.model;

import io.github.vampirestudios.tat.entity.GownEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class GownEntityModelNew extends EntityModel<GownEntity> {
	private final ModelPart chest;
	private final ModelPart stomach;
	private final ModelPart waist;
	private final ModelPart gownFront;
	private final ModelPart gownBack;
	private final ModelPart gownLeft;
	private final ModelPart gownRight;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart lowerJaw;
	private final ModelPart lHorn01;
	private final ModelPart lHorn02;
	private final ModelPart lHorn03;
	private final ModelPart lHorn04;
	private final ModelPart rHorn01;
	private final ModelPart rHorn02;
	private final ModelPart rHorn03;
	private final ModelPart rHorn04;
	private final ModelPart lArm01;
	private final ModelPart lArm02;
	private final ModelPart rArm01;
	private final ModelPart rArm02;

	public GownEntityModelNew() {
		textureWidth = 64;
		textureHeight = 64;
		chest = new ModelPart(this);
		chest.setPivot(0.0F, -6.4F, 0.0F);
		setRotationAngle(chest, 0.192F, 0.0F, 0.0F);
		chest.setTextureOffset(0, 0).addCuboid(-4.0F, -9.0F, -3.5F, 8.0F, 9.0F, 7.0F, 0.0F, false);

		stomach = new ModelPart(this);
		stomach.setPivot(0.0F, -0.2F, 0.0F);
		chest.addChild(stomach);
		setRotationAngle(stomach, -0.0698F, 0.0F, 0.0F);
		stomach.setTextureOffset(0, 17).addCuboid(-3.5F, 0.0F, -3.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);

		waist = new ModelPart(this);
		waist.setPivot(0.0F, 1.7F, 0.0F);
		stomach.addChild(waist);
		setRotationAngle(waist, -0.0698F, 0.0F, 0.0F);
		waist.setTextureOffset(0, 25).addCuboid(-4.0F, 0.0F, -3.5F, 8.0F, 3.0F, 7.0F, 0.0F, false);

		gownFront = new ModelPart(this);
		gownFront.setPivot(0.0F, 2.8F, -2.0F);
		waist.addChild(gownFront);
		setRotationAngle(gownFront, -0.1047F, 0.0F, 0.0F);
		gownFront.setTextureOffset(2, 37).addCuboid(-4.0F, 0.0F, -1.5F, 8.0F, 22.0F, 3.0F, 0.0F, false);

		gownBack = new ModelPart(this);
		gownBack.setPivot(0.0F, 2.8F, 2.2F);
		waist.addChild(gownBack);
		setRotationAngle(gownBack, -0.1047F, -3.1416F, 0.0F);
		gownBack.setTextureOffset(2, 37).addCuboid(-4.0F, 0.0F, -1.5F, 8.0F, 22.0F, 3.0F, 0.0F, false);

		gownLeft = new ModelPart(this);
		gownLeft.setPivot(2.5F, 2.8F, 0.0F);
		waist.addChild(gownLeft);
		setRotationAngle(gownLeft, -0.1396F, -1.5708F, 0.0F);
		gownLeft.setTextureOffset(2, 37).addCuboid(-3.5F, 0.0F, -1.5F, 7.0F, 22.0F, 3.0F, 0.0F, false);

		gownRight = new ModelPart(this);
		gownRight.setPivot(-2.5F, 2.8F, 0.0F);
		waist.addChild(gownRight);
		setRotationAngle(gownRight, -0.1396F, 1.5708F, 0.0F);
		gownRight.setTextureOffset(2, 37).addCuboid(-3.5F, 0.0F, -1.5F, 7.0F, 22.0F, 3.0F, 0.0F, false);

		neck = new ModelPart(this);
		neck.setPivot(0.0F, -9.0F, 0.0F);
		chest.addChild(neck);
		neck.setTextureOffset(7, 3).addCuboid(-2.0F, -1.4F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		head = new ModelPart(this);
		head.setPivot(0.0F, -1.1F, 0.0F);
		neck.addChild(head);
		head.setTextureOffset(31, 0).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		lowerJaw = new ModelPart(this);
		lowerJaw.setPivot(0.0F, -1.7F, 0.0F);
		head.addChild(lowerJaw);
		lowerJaw.setTextureOffset(31, 17).addCuboid(-3.5F, -5.8F, -3.5F, 7.0F, 8.0F, 7.0F, 0.0F, false);

		lHorn01 = new ModelPart(this);
		lHorn01.setPivot(-2.0F, -6.7F, 0.0F);
		head.addChild(lHorn01);
		setRotationAngle(lHorn01, -0.6109F, 0.0F, -0.2269F);
		lHorn01.setTextureOffset(28, 53).addCuboid(-1.2F, -3.3F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		lHorn02 = new ModelPart(this);
		lHorn02.setPivot(0.0F, -2.8F, -0.5F);
		lHorn01.addChild(lHorn02);
		setRotationAngle(lHorn02, -0.7854F, 0.0F, 0.0F);
		lHorn02.setTextureOffset(28, 53).addCuboid(-1.0F, -2.7F, -1.1F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		lHorn03 = new ModelPart(this);
		lHorn03.setPivot(0.1F, -2.5F, 0.1F);
		lHorn02.addChild(lHorn03);
		setRotationAngle(lHorn03, 0.3491F, 0.0F, 0.0F);
		lHorn03.setTextureOffset(28, 53).addCuboid(-0.8F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		lHorn04 = new ModelPart(this);
		lHorn04.setPivot(0.0F, -1.8F, -0.2F);
		lHorn03.addChild(lHorn04);
		setRotationAngle(lHorn04, 0.2269F, 0.0F, 0.0F);
		lHorn04.setTextureOffset(28, 53).addCuboid(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		rHorn01 = new ModelPart(this);
		rHorn01.setPivot(2.0F, -6.7F, 0.0F);
		head.addChild(rHorn01);
		setRotationAngle(rHorn01, -0.6109F, 0.0F, 0.2269F);
		rHorn01.setTextureOffset(28, 53).addCuboid(-1.1F, -3.3F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		rHorn02 = new ModelPart(this);
		rHorn02.setPivot(0.0F, -2.8F, -0.5F);
		rHorn01.addChild(rHorn02);
		setRotationAngle(rHorn02, -0.7854F, 0.0F, 0.0F);
		rHorn02.setTextureOffset(28, 53).addCuboid(-0.9F, -2.7F, -1.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		rHorn03 = new ModelPart(this);
		rHorn03.setPivot(0.1F, -2.5F, 0.1F);
		rHorn02.addChild(rHorn03);
		setRotationAngle(rHorn03, 0.3491F, 0.0F, 0.0F);
		rHorn03.setTextureOffset(28, 53).addCuboid(-0.7F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rHorn04 = new ModelPart(this);
		rHorn04.setPivot(0.0F, -1.8F, -0.2F);
		rHorn03.addChild(rHorn04);
		setRotationAngle(rHorn04, 0.2269F, 0.0F, 0.0F);
		rHorn04.setTextureOffset(28, 53).addCuboid(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		lArm01 = new ModelPart(this);
		lArm01.setPivot(-3.8F, -7.4F, 0.0F);
		chest.addChild(lArm01);
		setRotationAngle(lArm01, 0.2094F, 0.0F, 0.1745F);
		lArm01.setTextureOffset(28, 33).addCuboid(-3.0F, -1.5F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, true);

		lArm02 = new ModelPart(this);
		lArm02.setPivot(-1.7F, 12.9F, 0.0F);
		lArm01.addChild(lArm02);
		setRotationAngle(lArm02, -0.6109F, 0.0F, 0.0F);
		lArm02.setTextureOffset(48, 33).addCuboid(-1.31F, -0.7F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, true);

		rArm01 = new ModelPart(this);
		rArm01.setPivot(3.8F, -7.4F, 0.0F);
		chest.addChild(rArm01);
		setRotationAngle(rArm01, 0.2094F, 0.0F, -0.1745F);
		rArm01.setTextureOffset(28, 33).addCuboid(0.0F, -1.5F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, false);

		rArm02 = new ModelPart(this);
		rArm02.setPivot(1.7F, 12.9F, 0.0F);
		rArm01.addChild(rArm02);
		setRotationAngle(rArm02, -0.6109F, 0.0F, 0.0F);
		rArm02.setTextureOffset(48, 33).addCuboid(-1.69F, -0.7F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setAngles(GownEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		chest.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

}