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
 * lemure - CyberCat5555
 * Created using Tabula 8.0.0
 */
@Environment(EnvType.CLIENT)
public class LemureEntityModel<T extends Entity> extends EntityModel<T> {
    public ModelPart head;
    public ModelPart wisp01;
    public ModelPart tailFront;
    public ModelPart tailBack;
    public ModelPart tailLeft;
    public ModelPart tailRight;
    public ModelPart armLeft;
    public ModelPart armRight;
    public ModelPart wisp02;
    public ModelPart wisp02_1;

    public LemureEntityModel() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.tailFront = new ModelPart(this, 0, 21);
        this.tailFront.setPivot(0.0F, 3.0F, -1.5F);
        this.tailFront.addCuboid(-2.5F, 0.0F, 0.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tailFront, 0.17453292519943295F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 0, 0);
        this.head.setPivot(0.0F, 0.0F, 0.0F);
        this.head.addCuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.tailLeft = new ModelPart(this, 12, 16);
        this.tailLeft.setPivot(2.0F, 2.5F, 0.0F);
        this.tailLeft.addCuboid(0.0F, 0.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tailLeft, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
        this.wisp02 = new ModelPart(this, 2, 15);
        this.wisp02.setPivot(0.0F, -2.0F, 3.0F);
        this.wisp02.addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.tailBack = new ModelPart(this, 0, 21);
        this.tailBack.setPivot(0.0F, 3.0F, 1.5F);
        this.tailBack.addCuboid(-2.5F, 0.0F, 0.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tailBack, 0.5235987755982988F, 0.0F, 0.0F);
        this.tailRight = new ModelPart(this, 12, 16);
        this.tailRight.mirror = true;
        this.tailRight.setPivot(-2.0F, 2.5F, 0.0F);
        this.tailRight.addCuboid(0.0F, 0.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tailRight, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
        this.armLeft = new ModelPart(this, 14, 11);
        this.armLeft.setPivot(2.5F, 2.5F, 0.0F);
        this.armLeft.addCuboid(0.0F, 0.0F, -1.5F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armLeft, 0.3490658503988659F, 0.0F, -0.3490658503988659F);
        this.armRight = new ModelPart(this, 14, 11);
        this.armRight.setPivot(-2.5F, 2.5F, 0.0F);
        this.armRight.addCuboid(0.0F, 0.0F, -1.5F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armRight, 0.3490658503988659F, 0.0F, 0.3490658503988659F);
        this.wisp01 = new ModelPart(this, 0, 14);
        this.wisp01.setPivot(0.0F, -3.0F, 5.0F);
        this.wisp01.addCuboid(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.wisp02_1 = new ModelPart(this, 4, 16);
        this.wisp02_1.setPivot(0.0F, -2.0F, 1.5F);
        this.wisp02_1.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.head.addChild(this.tailFront);
        this.head.addChild(this.tailLeft);
        this.wisp01.addChild(this.wisp02);
        this.head.addChild(this.tailBack);
        this.head.addChild(this.tailRight);
        this.head.addChild(this.armLeft);
        this.head.addChild(this.armRight);
        this.head.addChild(this.wisp01);
        this.wisp02.addChild(this.wisp02_1);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {}

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        for (ModelPart modelRenderer : ImmutableList.of(this.head)) {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pivotX = x;
        modelRenderer.pivotY = y;
        modelRenderer.pivotZ = z;
    }
}
