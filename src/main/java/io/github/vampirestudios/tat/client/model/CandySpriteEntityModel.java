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
 * candy_sprite - CyberCat5555
 * Created using Tabula 8.0.0
 */
@Environment(EnvType.CLIENT)
public class CandySpriteEntityModel<T extends Entity> extends EntityModel<T> {
    public ModelPart body;
    public ModelPart lWrapper1;
    public ModelPart lWrapper2;
    public ModelPart rWrapper1;
    public ModelPart rWrapper2;
    public ModelPart lArm;
    public ModelPart rArm;
    public ModelPart basketBottom;
    public ModelPart lWrapper1a;
    public ModelPart lWrapper1b;
    public ModelPart lWrapper1c;
    public ModelPart lWrapper1d;
    public ModelPart lWrapper2a;
    public ModelPart lWrapper2b;
    public ModelPart lWrapper2c;
    public ModelPart lWrapper2d;
    public ModelPart rWrapper1a;
    public ModelPart rWrapper1b;
    public ModelPart rWrapper1c;
    public ModelPart rWrapper1d;
    public ModelPart rWrapper2a;
    public ModelPart rWrapper2b;
    public ModelPart rWrapper2c;
    public ModelPart rWrapper2d;
    public ModelPart lBasket;
    public ModelPart rBasket;
    public ModelPart fBasket;
    public ModelPart bBasket;

    public CandySpriteEntityModel() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.lBasket = new ModelPart(this, 14, 12);
        this.lBasket.setPivot(0.0F, 0.0F, 0.0F);
        this.lBasket.addCuboid(1.5F, -4.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.lWrapper1a = new ModelPart(this, 0, 15);
        this.lWrapper1a.setPivot(0.0F, 0.0F, -1.2F);
        this.lWrapper1a.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper1a, 0.0F, 0.5235987755982988F, 0.0F);
        this.lWrapper1d = new ModelPart(this, 0, 15);
        this.lWrapper1d.setPivot(0.0F, 1.2F, 0.0F);
        this.lWrapper1d.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper1d, -1.5707963267948966F, 0.0F, 0.5235987755982988F);
        this.lWrapper2 = new ModelPart(this, 0, 0);
        this.lWrapper2.setPivot(2.9F, 0.0F, 0.0F);
        this.lWrapper2.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper2, 0.7853981633974483F, 0.0F, 0.0F);
        this.bBasket = new ModelPart(this, 21, 21);
        this.bBasket.setPivot(0.0F, 0.0F, 0.0F);
        this.bBasket.addCuboid(1.5F, -4.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bBasket, 0.0F, -1.5707963267948966F, 0.0F);
        this.rWrapper2 = new ModelPart(this, 0, 0);
        this.rWrapper2.setPivot(-2.9F, 0.0F, 0.0F);
        this.rWrapper2.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper2, 0.7853981633974483F, 0.0F, 0.0F);
        this.rWrapper2b = new ModelPart(this, 0, 15);
        this.rWrapper2b.mirror = true;
        this.rWrapper2b.setPivot(0.0F, 0.0F, 0.8F);
        this.rWrapper2b.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper2b, 0.0F, 0.3490658503988659F, 0.0F);
        this.lWrapper2c = new ModelPart(this, 0, 15);
        this.lWrapper2c.setPivot(0.0F, -0.8F, 0.0F);
        this.lWrapper2c.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper2c, 1.5707963267948966F, 0.0F, -0.3490658503988659F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPivot(0.0F, 0.0F, 0.0F);
        this.body.addCuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.rWrapper2c = new ModelPart(this, 0, 15);
        this.rWrapper2c.mirror = true;
        this.rWrapper2c.setPivot(0.0F, -0.8F, 0.0F);
        this.rWrapper2c.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper2c, 1.5707963267948966F, 0.0F, 0.3490658503988659F);
        this.lArm = new ModelPart(this, 8, 12);
        this.lArm.setPivot(2.2F, 3.0F, 0.0F);
        this.lArm.addCuboid(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.lWrapper1b = new ModelPart(this, 0, 15);
        this.lWrapper1b.setPivot(0.0F, 0.0F, 1.2F);
        this.lWrapper1b.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper1b, 0.0F, -0.5235987755982988F, 0.0F);
        this.lWrapper2a = new ModelPart(this, 0, 15);
        this.lWrapper2a.setPivot(0.0F, 0.0F, -0.8F);
        this.lWrapper2a.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper2a, 0.0F, 0.3490658503988659F, 0.0F);
        this.lWrapper2b = new ModelPart(this, 0, 15);
        this.lWrapper2b.setPivot(0.0F, 0.0F, 0.8F);
        this.lWrapper2b.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper2b, 0.0F, -0.3490658503988659F, 0.0F);
        this.rWrapper1b = new ModelPart(this, 0, 15);
        this.rWrapper1b.mirror = true;
        this.rWrapper1b.setPivot(0.0F, 0.0F, 1.2F);
        this.rWrapper1b.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper1b, 0.0F, 0.5235987755982988F, 0.0F);
        this.lWrapper2d = new ModelPart(this, 0, 15);
        this.lWrapper2d.setPivot(0.0F, 0.8F, 0.0F);
        this.lWrapper2d.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper2d, -1.5707963267948966F, 0.0F, 0.3490658503988659F);
        this.rWrapper1d = new ModelPart(this, 0, 15);
        this.rWrapper1d.setPivot(0.0F, 1.2F, 0.0F);
        this.rWrapper1d.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper1d, -1.5707963267948966F, 0.0F, -0.5235987755982988F);
        this.rWrapper2d = new ModelPart(this, 0, 15);
        this.rWrapper2d.mirror = true;
        this.rWrapper2d.setPivot(0.0F, 0.8F, 0.0F);
        this.rWrapper2d.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper2d, -1.5707963267948966F, 0.0F, -0.3490658503988659F);
        this.rWrapper1c = new ModelPart(this, 0, 15);
        this.rWrapper1c.mirror = true;
        this.rWrapper1c.setPivot(0.0F, -1.2F, 0.0F);
        this.rWrapper1c.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper1c, 1.5707963267948966F, 0.0F, 0.5235987755982988F);
        this.rWrapper1 = new ModelPart(this, 0, 0);
        this.rWrapper1.setPivot(-2.9F, 0.0F, 0.0F);
        this.rWrapper1.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.rWrapper1a = new ModelPart(this, 0, 15);
        this.rWrapper1a.mirror = true;
        this.rWrapper1a.setPivot(0.0F, 0.0F, -1.2F);
        this.rWrapper1a.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper1a, 0.0F, -0.5235987755982988F, 0.0F);
        this.rWrapper2a = new ModelPart(this, 0, 15);
        this.rWrapper2a.mirror = true;
        this.rWrapper2a.setPivot(0.0F, 0.0F, -0.8F);
        this.rWrapper2a.addCuboid(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rWrapper2a, 0.0F, -0.3490658503988659F, 0.0F);
        this.lWrapper1c = new ModelPart(this, 0, 15);
        this.lWrapper1c.setPivot(0.0F, -1.2F, 0.0F);
        this.lWrapper1c.addCuboid(-0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lWrapper1c, 1.5707963267948966F, 0.0F, -0.5235987755982988F);
        this.fBasket = new ModelPart(this, 21, 21);
        this.fBasket.setPivot(0.0F, 0.0F, 0.0F);
        this.fBasket.addCuboid(1.5F, -4.0F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(fBasket, 0.0F, 1.5707963267948966F, 0.0F);
        this.rArm = new ModelPart(this, 8, 12);
        this.rArm.mirror = true;
        this.rArm.setPivot(-2.2F, 3.0F, 0.0F);
        this.rArm.addCuboid(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.basketBottom = new ModelPart(this, 0, 24);
        this.basketBottom.setPivot(0.0F, 12.0F, 0.0F);
        this.basketBottom.addCuboid(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.lWrapper1 = new ModelPart(this, 0, 0);
        this.lWrapper1.setPivot(2.9F, 0.0F, 0.0F);
        this.lWrapper1.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.rBasket = new ModelPart(this, 14, 12);
        this.rBasket.setPivot(0.0F, 0.0F, 0.0F);
        this.rBasket.addCuboid(1.5F, -4.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rBasket, 0.0F, 3.141592653589793F, 0.0F);
        this.basketBottom.addChild(this.lBasket);
        this.lWrapper1.addChild(this.lWrapper1a);
        this.lWrapper1.addChild(this.lWrapper1d);
        this.body.addChild(this.lWrapper2);
        this.basketBottom.addChild(this.bBasket);
        this.body.addChild(this.rWrapper2);
        this.rWrapper2.addChild(this.rWrapper2b);
        this.lWrapper2.addChild(this.lWrapper2c);
        this.rWrapper2.addChild(this.rWrapper2c);
        this.body.addChild(this.lArm);
        this.lWrapper1.addChild(this.lWrapper1b);
        this.lWrapper2.addChild(this.lWrapper2a);
        this.lWrapper2.addChild(this.lWrapper2b);
        this.rWrapper1.addChild(this.rWrapper1b);
        this.lWrapper2.addChild(this.lWrapper2d);
        this.rWrapper1.addChild(this.rWrapper1d);
        this.rWrapper2.addChild(this.rWrapper2d);
        this.rWrapper1.addChild(this.rWrapper1c);
        this.body.addChild(this.rWrapper1);
        this.rWrapper1.addChild(this.rWrapper1a);
        this.rWrapper2.addChild(this.rWrapper2a);
        this.lWrapper1.addChild(this.lWrapper1c);
        this.basketBottom.addChild(this.fBasket);
        this.body.addChild(this.rArm);
        this.body.addChild(this.basketBottom);
        this.body.addChild(this.lWrapper1);
        this.basketBottom.addChild(this.rBasket);
    }

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumer vertexConsumerIn, int lightIn, int overlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.body).forEach((modelPart) -> {
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
