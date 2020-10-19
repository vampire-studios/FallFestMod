package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.SoulCandleGolemEntityModel;
import io.github.vampirestudios.tat.entity.SoulCandleGolemEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SoulCandleGolemEntityRenderer extends MobEntityRenderer<SoulCandleGolemEntity, SoulCandleGolemEntityModel> {

    public SoulCandleGolemEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new SoulCandleGolemEntityModel(), 1.0F);
    }

    @Override
    public Identifier getTexture(SoulCandleGolemEntity entity) {
        return new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/soul_candle_golem.png");
    }

}
