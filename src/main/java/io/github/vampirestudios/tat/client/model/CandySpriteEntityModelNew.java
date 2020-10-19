package io.github.vampirestudios.tat.client.model;

import io.github.vampirestudios.tat.entity.CandySpriteEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class CandySpriteEntityModelNew extends EntityModel<CandySpriteEntity> {
	private final ModelPart body;
	private final ModelPart lWrapper1;
	private final ModelPart lWrapper1a;
	private final ModelPart lWrapper1b;
	private final ModelPart lWrapper1c;
	private final ModelPart lWrapper1d;
	private final ModelPart lWrapper2;
	private final ModelPart lWrapper2a;
	private final ModelPart lWrapper2b;
	private final ModelPart lWrapper2c;
	private final ModelPart lWrapper2d;
	private final ModelPart rWrapper1;
	private final ModelPart rWrapper1a;
	private final ModelPart rWrapper1b;
	private final ModelPart rWrapper1c;
	private final ModelPart rWrapper1d;
	private final ModelPart rWrapper2;
	private final ModelPart rWrapper2a;
	private final ModelPart rWrapper2b;
	private final ModelPart rWrapper2c;
	private final ModelPart rWrapper2d;
	private final ModelPart lArm;
	private final ModelPart rArm;
	private final ModelPart basketBottom;
	private final ModelPart lBasket;
	private final ModelPart rBasket;
	private final ModelPart fBasket;
	private final ModelPart bBasket;

	public CandySpriteEntityModelNew() {
		textureWidth = 32;
		textureHeight = 32;
		body = new ModelPart(this);
		body.setPivot(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addCuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		lWrapper1 = new ModelPart(this);
		lWrapper1.setPivot(-2.9F, 0.0F, 0.0F);
		body.addChild(lWrapper1);
		lWrapper1.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		lWrapper1a = new ModelPart(this);
		lWrapper1a.setPivot(0.0F, 0.0F, -1.2F);
		lWrapper1.addChild(lWrapper1a);
		setRotationAngle(lWrapper1a, 0.0F, -0.5236F, 0.0F);
		lWrapper1a.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper1b = new ModelPart(this);
		lWrapper1b.setPivot(0.0F, 0.0F, 1.2F);
		lWrapper1.addChild(lWrapper1b);
		setRotationAngle(lWrapper1b, 0.0F, 0.5236F, 0.0F);
		lWrapper1b.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper1c = new ModelPart(this);
		lWrapper1c.setPivot(0.0F, -1.2F, 0.0F);
		lWrapper1.addChild(lWrapper1c);
		setRotationAngle(lWrapper1c, 1.5708F, 0.0F, 0.5236F);
		lWrapper1c.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper1d = new ModelPart(this);
		lWrapper1d.setPivot(0.0F, 1.2F, 0.0F);
		lWrapper1.addChild(lWrapper1d);
		setRotationAngle(lWrapper1d, -1.5708F, 0.0F, -0.5236F);
		lWrapper1d.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper2 = new ModelPart(this);
		lWrapper2.setPivot(-2.9F, 0.0F, 0.0F);
		body.addChild(lWrapper2);
		setRotationAngle(lWrapper2, 0.7854F, 0.0F, 0.0F);
		lWrapper2.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		lWrapper2a = new ModelPart(this);
		lWrapper2a.setPivot(0.0F, 0.0F, -0.8F);
		lWrapper2.addChild(lWrapper2a);
		setRotationAngle(lWrapper2a, 0.0F, -0.3491F, 0.0F);
		lWrapper2a.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper2b = new ModelPart(this);
		lWrapper2b.setPivot(0.0F, 0.0F, 0.8F);
		lWrapper2.addChild(lWrapper2b);
		setRotationAngle(lWrapper2b, 0.0F, 0.3491F, 0.0F);
		lWrapper2b.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper2c = new ModelPart(this);
		lWrapper2c.setPivot(0.0F, -0.8F, 0.0F);
		lWrapper2.addChild(lWrapper2c);
		setRotationAngle(lWrapper2c, 1.5708F, 0.0F, 0.3491F);
		lWrapper2c.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		lWrapper2d = new ModelPart(this);
		lWrapper2d.setPivot(0.0F, 0.8F, 0.0F);
		lWrapper2.addChild(lWrapper2d);
		setRotationAngle(lWrapper2d, -1.5708F, 0.0F, -0.3491F);
		lWrapper2d.setTextureOffset(0, 15).addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);

		rWrapper1 = new ModelPart(this);
		rWrapper1.setPivot(2.9F, 0.0F, 0.0F);
		body.addChild(rWrapper1);
		rWrapper1.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rWrapper1a = new ModelPart(this);
		rWrapper1a.setPivot(0.0F, 0.0F, -1.2F);
		rWrapper1.addChild(rWrapper1a);
		setRotationAngle(rWrapper1a, 0.0F, 0.5236F, 0.0F);
		rWrapper1a.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper1b = new ModelPart(this);
		rWrapper1b.setPivot(0.0F, 0.0F, 1.2F);
		rWrapper1.addChild(rWrapper1b);
		setRotationAngle(rWrapper1b, 0.0F, -0.5236F, 0.0F);
		rWrapper1b.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper1c = new ModelPart(this);
		rWrapper1c.setPivot(0.0F, -1.2F, 0.0F);
		rWrapper1.addChild(rWrapper1c);
		setRotationAngle(rWrapper1c, 1.5708F, 0.0F, -0.5236F);
		rWrapper1c.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper1d = new ModelPart(this);
		rWrapper1d.setPivot(0.0F, 1.2F, 0.0F);
		rWrapper1.addChild(rWrapper1d);
		setRotationAngle(rWrapper1d, -1.5708F, 0.0F, 0.5236F);
		rWrapper1d.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper2 = new ModelPart(this);
		rWrapper2.setPivot(2.9F, 0.0F, 0.0F);
		body.addChild(rWrapper2);
		setRotationAngle(rWrapper2, 0.7854F, 0.0F, 0.0F);
		rWrapper2.setTextureOffset(0, 0).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rWrapper2a = new ModelPart(this);
		rWrapper2a.setPivot(0.0F, 0.0F, -0.8F);
		rWrapper2.addChild(rWrapper2a);
		setRotationAngle(rWrapper2a, 0.0F, 0.3491F, 0.0F);
		rWrapper2a.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper2b = new ModelPart(this);
		rWrapper2b.setPivot(0.0F, 0.0F, 0.8F);
		rWrapper2.addChild(rWrapper2b);
		setRotationAngle(rWrapper2b, 0.0F, -0.3491F, 0.0F);
		rWrapper2b.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper2c = new ModelPart(this);
		rWrapper2c.setPivot(0.0F, -0.8F, 0.0F);
		rWrapper2.addChild(rWrapper2c);
		setRotationAngle(rWrapper2c, 1.5708F, 0.0F, -0.3491F);
		rWrapper2c.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		rWrapper2d = new ModelPart(this);
		rWrapper2d.setPivot(0.0F, 0.8F, 0.0F);
		rWrapper2.addChild(rWrapper2d);
		setRotationAngle(rWrapper2d, -1.5708F, 0.0F, 0.3491F);
		rWrapper2d.setTextureOffset(0, 15).addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		lArm = new ModelPart(this);
		lArm.setPivot(-2.2F, 3.0F, 0.0F);
		body.addChild(lArm);
		lArm.setTextureOffset(8, 12).addCuboid(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, true);

		rArm = new ModelPart(this);
		rArm.setPivot(2.2F, 3.0F, 0.0F);
		body.addChild(rArm);
		rArm.setTextureOffset(8, 12).addCuboid(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);

		basketBottom = new ModelPart(this);
		basketBottom.setPivot(0.0F, 12.0F, 0.0F);
		body.addChild(basketBottom);
		basketBottom.setTextureOffset(0, 24).addCuboid(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		lBasket = new ModelPart(this);
		lBasket.setPivot(0.0F, 0.0F, 0.0F);
		basketBottom.addChild(lBasket);
		lBasket.setTextureOffset(14, 12).addCuboid(-2.5F, -4.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		rBasket = new ModelPart(this);
		rBasket.setPivot(0.0F, 0.0F, 0.0F);
		basketBottom.addChild(rBasket);
		setRotationAngle(rBasket, 0.0F, -3.1416F, 0.0F);
		rBasket.setTextureOffset(14, 12).addCuboid(-2.5F, -4.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		fBasket = new ModelPart(this);
		fBasket.setPivot(0.0F, 0.0F, 0.0F);
		basketBottom.addChild(fBasket);
		setRotationAngle(fBasket, 0.0F, -1.5708F, 0.0F);
		fBasket.setTextureOffset(21, 21).addCuboid(-2.5F, -4.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		bBasket = new ModelPart(this);
		bBasket.setPivot(0.0F, 0.0F, 0.0F);
		basketBottom.addChild(bBasket);
		setRotationAngle(bBasket, 0.0F, 1.5708F, 0.0F);
		bBasket.setTextureOffset(21, 21).addCuboid(-2.5F, -4.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setAngles(CandySpriteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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