package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.GownEntityModelNew;
import io.github.vampirestudios.tat.entity.GownEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GownEntityRenderer extends MobEntityRenderer<GownEntity, GownEntityModelNew> {

    public GownEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new GownEntityModelNew(), 1.0F);
    }

    @Override
    public Identifier getTexture(GownEntity entity) {
        return new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/gown.png");
    }

}
