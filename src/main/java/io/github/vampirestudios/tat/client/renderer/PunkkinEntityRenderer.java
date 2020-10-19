package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.PunkkinEntityModel;
import io.github.vampirestudios.tat.entity.PunkkinEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PunkkinEntityRenderer extends MobEntityRenderer<PunkkinEntity, PunkkinEntityModel> {

    public PunkkinEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PunkkinEntityModel(), 1.0F);
    }

    @Override
    public Identifier getTexture(PunkkinEntity entity) {
        return new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/punkkin.png");
    }

}
