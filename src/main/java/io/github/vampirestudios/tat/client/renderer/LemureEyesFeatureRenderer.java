//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.github.vampirestudios.tat.client.renderer;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import io.github.vampirestudios.tat.client.model.LemureEntityModelNew;
import io.github.vampirestudios.tat.entity.LemureEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class LemureEyesFeatureRenderer extends EyesFeatureRenderer<LemureEntity, LemureEntityModelNew> {
    private static final RenderLayer SKIN = RenderLayer.getEyes(new Identifier(TreatsAndTrickery.MOD_ID, "textures/entity/lemure_eyes.png"));

    public LemureEyesFeatureRenderer(FeatureRendererContext<LemureEntity, LemureEntityModelNew> featureRendererContext) {
        super(featureRendererContext);
    }

    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}
