package io.github.vampirestudios.tat;

import io.github.vampirestudios.tat.client.renderer.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class TreatsAndTrickeryClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(TreatsAndTrickery.LEMURE, (entityRenderDispatcher, context) -> new LemureEntityRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(TreatsAndTrickery.GOWN, (entityRenderDispatcher, context) -> new GownEntityRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(TreatsAndTrickery.CANDY_SPRITE, (entityRenderDispatcher, context) -> new CandySpriteEntityRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(TreatsAndTrickery.APPLE_BOMB, (entityRenderDispatcher, context) -> new AppleBombEntityRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(TreatsAndTrickery.PUNKKIN, (entityRenderDispatcher, context) -> new PunkkinEntityRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(TreatsAndTrickery.SOUL_CANDLE_GOLEM, (entityRenderDispatcher, context) -> new SoulCandleGolemEntityRenderer(entityRenderDispatcher));
    }

}