package io.github.vampirestudios.tat.client.model;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

/**
 * gown - CyberCat5555
 * Created using Tabula 8.0.0
 */
@Environment(EnvType.CLIENT)
public class GownEntityModel<T extends Entity> extends EntityModel<T> {
    public ModelPart chest;
    public ModelPart stomach;
    public ModelPart neck;
    public ModelPart lArm01;
    public ModelPart rArm01;
    public ModelPart waist;
    public ModelPart gownFront;
    public ModelPart gownBack;
    public ModelPart gownLeft;
    public ModelPart gownRight;
    public ModelPart head;
    public ModelPart lowerJaw;
    public ModelPart lHorn01;
    public ModelPart rHorn01;
    public ModelPart lHorn02;
    public ModelPart lHorn03;
    public ModelPart lHorn04;
    public ModelPart rHorn02;
    public ModelPart rHorn03;
    public ModelPart rHorn04;
    public ModelPart lArm02;
    public ModelPart rArm02;

    public GownEntityModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.chest = new ModelPart(this, 0, 0);
        this.chest.setPivot(0.0F, -6.4F, 0.0F);
        this.chest.addCuboid(-4.0F, -9.0F, -3.5F, 8.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.19198621771937624F, 0.0F, 0.0F);
        this.lHorn01 = new ModelPart(this, 28, 53);
        this.lHorn01.setPivot(2.0F, -6.7F, 0.0F);
        this.lHorn01.addCuboid(-1.3F, -3.3F, -1.5F, 2.5F, 3.0F, 2.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lHorn01, -0.6108652381980153F, 0.0F, 0.22689280275926282F);
        this.rHorn04 = new ModelPart(this, 28, 53);
        this.rHorn04.mirror = true;
        this.rHorn04.setPivot(0.0F, -1.8F, -0.2F);
        this.rHorn04.addCuboid(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rHorn04, 0.22689280275926282F, 0.0F, 0.0F);
        this.gownLeft = new ModelPart(this, 2, 37);
        this.gownLeft.setPivot(-2.5F, 2.8F, 0.0F);
        this.gownLeft.addCuboid(-3.5F, 0.0F, -1.5F, 7.0F, 22.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(gownLeft, -0.13962634015954636F, 1.5707963267948966F, 0.0F);
        this.lowerJaw = new ModelPart(this, 31, 17);
        this.lowerJaw.setPivot(0.0F, -1.7F, 0.0F);
        this.lowerJaw.addCuboid(-4.0F, -5.8F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, -0.5F, -0.5F);
        this.lHorn03 = new ModelPart(this, 28, 53);
        this.lHorn03.setPivot(-0.1F, -2.5F, 0.1F);
        this.lHorn03.addCuboid(-0.7F, -2.0F, -1.0F, 1.5F, 2.0F, 1.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lHorn03, 0.3490658503988659F, 0.0F, 0.0F);
        this.gownFront = new ModelPart(this, 2, 37);
        this.gownFront.setPivot(0.0F, 2.8F, -2.0F);
        this.gownFront.addCuboid(-4.0F, 0.0F, -1.5F, 8.0F, 22.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(gownFront, -0.10471975511965977F, 0.0F, 0.0F);
        this.neck = new ModelPart(this, 7, 3);
        this.neck.setPivot(0.0F, -9.0F, 0.0F);
        this.neck.addCuboid(-2.0F, -1.4F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.lArm01 = new ModelPart(this, 28, 33);
        this.lArm01.setPivot(3.8F, -7.4F, 0.0F);
        this.lArm01.addCuboid(0.0F, -1.5F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lArm01, 0.20943951023931953F, 0.0F, -0.17453292519943295F);
        this.rArm01 = new ModelPart(this, 28, 33);
        this.rArm01.mirror = true;
        this.rArm01.setPivot(-3.8F, -7.4F, 0.0F);
        this.rArm01.addCuboid(-3.0F, -1.5F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rArm01, 0.20943951023931953F, 0.0F, 0.17453292519943295F);
        this.head = new ModelPart(this, 31, 0);
        this.head.setPivot(0.0F, -1.1F, 0.0F);
        this.head.addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.stomach = new ModelPart(this, 0, 17);
        this.stomach.setPivot(0.0F, -0.2F, 0.0F);
        this.stomach.addCuboid(-3.5F, 0.0F, -3.0F, 7.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(stomach, -0.06981317007977318F, 0.0F, 0.0F);
        this.rArm02 = new ModelPart(this, 48, 33);
        this.rArm02.mirror = true;
        this.rArm02.setPivot(-1.7F, 12.9F, 0.0F);
        this.rArm02.addCuboid(-1.31F, -0.7F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rArm02, -0.6108652381980153F, 0.0F, 0.0F);
        this.lHorn04 = new ModelPart(this, 28, 53);
        this.lHorn04.setPivot(0.0F, -1.8F, -0.2F);
        this.lHorn04.addCuboid(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lHorn04, 0.22689280275926282F, 0.0F, 0.0F);
        this.gownBack = new ModelPart(this, 2, 37);
        this.gownBack.setPivot(0.0F, 2.8F, 2.2F);
        this.gownBack.addCuboid(-4.0F, 0.0F, -1.5F, 8.0F, 22.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(gownBack, -0.10471975511965977F, 3.141592653589793F, 0.0F);
        this.lHorn02 = new ModelPart(this, 28, 53);
        this.lHorn02.setPivot(0.0F, -2.8F, -0.5F);
        this.lHorn02.addCuboid(-1.0F, -2.7F, -1.1F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lHorn02, -0.7853981633974483F, 0.0F, 0.0F);
        this.waist = new ModelPart(this, 0, 25);
        this.waist.setPivot(0.0F, 1.7F, 0.0F);
        this.waist.addCuboid(-4.0F, 0.0F, -3.5F, 8.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(waist, -0.06981317007977318F, 0.0F, 0.0F);
        this.lArm02 = new ModelPart(this, 48, 33);
        this.lArm02.setPivot(1.7F, 12.9F, 0.0F);
        this.lArm02.addCuboid(-1.69F, -0.7F, -2.0F, 3.0F, 15.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lArm02, -0.6108652381980153F, 0.0F, 0.0F);
        this.rHorn02 = new ModelPart(this, 28, 53);
        this.rHorn02.mirror = true;
        this.rHorn02.setPivot(0.0F, -2.8F, -0.5F);
        this.rHorn02.addCuboid(-1.1F, -2.7F, -1.1F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rHorn02, -0.7853981633974483F, 0.0F, 0.0F);
        this.rHorn01 = new ModelPart(this, 28, 53);
        this.rHorn01.mirror = true;
        this.rHorn01.setPivot(-2.0F, -6.7F, 0.0F);
        this.rHorn01.addCuboid(-1.4F, -3.3F, -1.5F, 2.5F, 3.0F, 2.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rHorn01, -0.6108652381980153F, 0.0F, -0.22689280275926282F);
        this.gownRight = new ModelPart(this, 2, 37);
        this.gownRight.setPivot(2.5F, 2.8F, 0.0F);
        this.gownRight.addCuboid(-3.5F, 0.0F, -1.5F, 7.0F, 22.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(gownRight, -0.13962634015954636F, -1.5707963267948966F, 0.0F);
        this.rHorn03 = new ModelPart(this, 28, 53);
        this.rHorn03.mirror = true;
        this.rHorn03.setPivot(-0.1F, -2.5F, 0.1F);
        this.rHorn03.addCuboid(-0.8F, -2.0F, -1.0F, 1.5F, 2.0F, 1.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rHorn03, 0.3490658503988659F, 0.0F, 0.0F);
        this.head.addChild(this.lHorn01);
        this.rHorn03.addChild(this.rHorn04);
        this.waist.addChild(this.gownLeft);
        this.head.addChild(this.lowerJaw);
        this.lHorn02.addChild(this.lHorn03);
        this.waist.addChild(this.gownFront);
        this.chest.addChild(this.neck);
        this.chest.addChild(this.lArm01);
        this.chest.addChild(this.rArm01);
        this.neck.addChild(this.head);
        this.chest.addChild(this.stomach);
        this.rArm01.addChild(this.rArm02);
        this.lHorn03.addChild(this.lHorn04);
        this.waist.addChild(this.gownBack);
        this.lHorn01.addChild(this.lHorn02);
        this.stomach.addChild(this.waist);
        this.lArm01.addChild(this.lArm02);
        this.rHorn01.addChild(this.rHorn02);
        this.head.addChild(this.rHorn01);
        this.waist.addChild(this.gownRight);
        this.rHorn02.addChild(this.rHorn03);
    }

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumer vertexConsumerIn, int lightIn, int overlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.chest).forEach((modelPart) -> {
            modelPart.render(matrixStackIn, vertexConsumerIn, lightIn, overlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setAngles(T entityIn, float limbAngle, float limbAngleAmount, float animationProgress, float headYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart modelPart, float x, float y, float z) {
        modelPart.pivotX = x;
        modelPart.pivotY = y;
        modelPart.pivotZ = z;
    }
}
