package io.github.vampirestudios.tat.client.model;

import io.github.vampirestudios.tat.entity.PunkkinEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class PunkkinEntityModel extends EntityModel<PunkkinEntity> {

	private final ModelPart main;
	private final ModelPart stem01;
	private final ModelPart stem00;
	private final ModelPart leaf01;
	private final ModelPart leaf02;

	public PunkkinEntityModel() {
		textureWidth = 64;
		textureHeight = 64;
		main = new ModelPart(this);
		main.setPivot(0.0F, 18.0F, 0.0F);
		main.setTextureOffset(0, 0).addCuboid(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);

		stem01 = new ModelPart(this);
		stem01.setPivot(0.0F, -10.3F, 0.6F);
		main.addChild(stem01);
		setRotationAngle(stem01, -1.5708F, 0.0F, 0.0F);
		stem01.setTextureOffset(0, 20).addCuboid(0.0F, -13.0F, -1.1F, 0.0F, 13.0F, 18.0F, 0.0F, false);

		stem00 = new ModelPart(this);
		stem00.setPivot(0.0F, -5.8F, 0.0F);
		main.addChild(stem00);
		setRotationAngle(stem00, -0.5236F, 0.0F, 0.0F);
		stem00.setTextureOffset(0, 0).addCuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		leaf01 = new ModelPart(this);
		leaf01.setPivot(0.0F, -1.0F, 0.0F);
		stem00.addChild(leaf01);
		setRotationAngle(leaf01, -0.576F, 0.0F, 0.4363F);
		leaf01.setTextureOffset(0, 25).addCuboid(-8.0F, -3.5F, 0.0F, 8.0F, 7.0F, 0.0F, 0.0F, true);

		leaf02 = new ModelPart(this);
		leaf02.setPivot(0.0F, -1.0F, 0.0F);
		stem00.addChild(leaf02);
		setRotationAngle(leaf02, -0.576F, 0.0F, -0.4363F);
		leaf02.setTextureOffset(0, 25).addCuboid(0.0F, -3.5F, 0.0F, 8.0F, 7.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setAngles(PunkkinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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