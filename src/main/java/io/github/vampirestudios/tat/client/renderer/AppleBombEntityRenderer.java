package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.AppleBombEntityModel;
import io.github.vampirestudios.tat.entity.AppleBombEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class AppleBombEntityRenderer extends MobEntityRenderer<AppleBombEntity, AppleBombEntityModel> {

    public AppleBombEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new AppleBombEntityModel(), 1.0F);
    }

    @Override
    public Identifier getTexture(AppleBombEntity entity) {
        return new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/apple_bomb.png");
    }

}
