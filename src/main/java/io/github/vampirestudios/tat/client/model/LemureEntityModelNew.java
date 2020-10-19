package io.github.vampirestudios.tat.client.model;

import io.github.vampirestudios.tat.entity.LemureEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class LemureEntityModelNew extends EntityModel<LemureEntity> {
	private final ModelPart head;
	private final ModelPart wisp01;
	private final ModelPart wisp02;
	private final ModelPart wisp02_1;
	private final ModelPart tailFront;
	private final ModelPart tailBack;
	private final ModelPart tailLeft;
	private final ModelPart tailRight;
	private final ModelPart armLeft;
	private final ModelPart armRight;

	public LemureEntityModelNew() {
		textureWidth = 32;
		textureHeight = 32;
		head = new ModelPart(this);
		head.setPivot(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addCuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		wisp01 = new ModelPart(this);
		wisp01.setPivot(0.0F, -3.0F, 5.0F);
		head.addChild(wisp01);
		wisp01.setTextureOffset(0, 14).addCuboid(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		wisp02 = new ModelPart(this);
		wisp02.setPivot(0.0F, -2.0F, 3.0F);
		wisp01.addChild(wisp02);
		wisp02.setTextureOffset(2, 15).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		wisp02_1 = new ModelPart(this);
		wisp02_1.setPivot(0.0F, -2.0F, 1.5F);
		wisp02.addChild(wisp02_1);
		wisp02_1.setTextureOffset(4, 16).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		tailFront = new ModelPart(this);
		tailFront.setPivot(0.0F, 3.0F, -1.5F);
		head.addChild(tailFront);
		setRotationAngle(tailFront, 0.1745F, 0.0F, 0.0F);
		tailFront.setTextureOffset(0, 21).addCuboid(-2.5F, 0.0F, 0.0F, 5.0F, 10.0F, 0.0F, 0.0F, false);

		tailBack = new ModelPart(this);
		tailBack.setPivot(0.0F, 3.0F, 1.5F);
		head.addChild(tailBack);
		setRotationAngle(tailBack, 0.5236F, 0.0F, 0.0F);
		tailBack.setTextureOffset(0, 21).addCuboid(-2.5F, 0.0F, 0.0F, 5.0F, 10.0F, 0.0F, 0.0F, false);

		tailLeft = new ModelPart(this);
		tailLeft.setPivot(-2.0F, 2.5F, 0.0F);
		head.addChild(tailLeft);
		setRotationAngle(tailLeft, 0.3491F, 0.0F, 0.0873F);
		tailLeft.setTextureOffset(12, 16).addCuboid(0.0F, 0.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, true);

		tailRight = new ModelPart(this);
		tailRight.setPivot(2.0F, 2.5F, 0.0F);
		head.addChild(tailRight);
		setRotationAngle(tailRight, 0.3491F, 0.0F, -0.0873F);
		tailRight.setTextureOffset(12, 16).addCuboid(0.0F, 0.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, false);

		armLeft = new ModelPart(this);
		armLeft.setPivot(-2.5F, 2.5F, 0.0F);
		head.addChild(armLeft);
		setRotationAngle(armLeft, 0.3491F, 0.0F, 0.3491F);
		armLeft.setTextureOffset(14, 11).addCuboid(0.0F, 0.0F, -1.5F, 0.0F, 5.0F, 3.0F, 0.0F, true);

		armRight = new ModelPart(this);
		armRight.setPivot(2.5F, 2.5F, 0.0F);
		head.addChild(armRight);
		setRotationAngle(armRight, 0.3491F, 0.0F, -0.3491F);
		armRight.setTextureOffset(14, 11).addCuboid(0.0F, 0.0F, -1.5F, 0.0F, 5.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setAngles(LemureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
			//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

}