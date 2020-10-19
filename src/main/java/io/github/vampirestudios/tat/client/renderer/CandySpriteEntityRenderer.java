package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.CandySpriteEntityModelNew;
import io.github.vampirestudios.tat.entity.CandySpriteEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CandySpriteEntityRenderer extends MobEntityRenderer<CandySpriteEntity, CandySpriteEntityModelNew> {

    public CandySpriteEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CandySpriteEntityModelNew(), 1.0F);
    }

    @Override
    public Identifier getTexture(CandySpriteEntity entity) {
        return new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/candy_sprite_base.png");
    }

}
