package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.LemureEntityModelNew;
import io.github.vampirestudios.tat.entity.LemureEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class LemureEntityRenderer extends MobEntityRenderer<LemureEntity, LemureEntityModelNew> {

    public LemureEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LemureEntityModelNew(), 1.0F);
        this.addFeature(new LemureEyesFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(LemureEntity entity) {
        return new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/lemure.png");
    }

}
