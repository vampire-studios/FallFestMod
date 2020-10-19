package io.github.vampirestudios.tat;

import io.github.vampirestudios.tat.entity.*;
import io.github.vampirestudios.tat.utils.EntityRegistryBuilder;
import io.github.vampirestudios.tat.utils.EntityUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;

public class TreatsAndTrickery implements ModInitializer {

    public static final String MOD_ID = "tat";

    public static EntityType<GownEntity> GOWN;
    public static EntityType<LemureEntity> LEMURE;
    public static EntityType<CandySpriteEntity> CANDY_SPRITE;
    public static EntityType<AppleBombEntity> APPLE_BOMB;
    public static EntityType<PunkkinEntity> PUNKKIN;
    public static EntityType<SoulCandleGolemEntity> SOUL_CANDLE_GOLEM;

    @Override
    public void onInitialize() {
        GOWN = EntityRegistryBuilder.<GownEntity>createBuilder(new Identifier(MOD_ID, "gown"))
                .entity(GownEntity::new)
                .category(SpawnGroup.CREATURE)
                .dimensions(EntityDimensions.fixed(0.6F, 2.9F))
                .hasEgg(true)
                .egg(0xFFFFFF, 0x000000)
                .build();
        FabricDefaultAttributeRegistry.register(GOWN, EntityUtils.createGenericEntityAttributes());
        LEMURE = EntityRegistryBuilder.<LemureEntity>createBuilder(new Identifier(MOD_ID, "lemure"))
                .entity(LemureEntity::new)
                .category(SpawnGroup.CREATURE)
                .dimensions(EntityDimensions.fixed(0.6F, 0.6F))
                .hasEgg(true)
                .egg(0xFFFFFF, 0x000000)
                .build();
        FabricDefaultAttributeRegistry.register(LEMURE, EntityUtils.createGenericEntityAttributes());
        CANDY_SPRITE = EntityRegistryBuilder.<CandySpriteEntity>createBuilder(new Identifier(MOD_ID, "candy_sprite"))
                .entity(CandySpriteEntity::new)
                .category(SpawnGroup.CREATURE)
                .dimensions(EntityDimensions.fixed(0.6F, 0.6F))
                .hasEgg(true)
                .egg(0xFFFFFF, 0x000000)
                .build();
        FabricDefaultAttributeRegistry.register(CANDY_SPRITE, EntityUtils.createGenericEntityAttributes());
        APPLE_BOMB = EntityRegistryBuilder.<AppleBombEntity>createBuilder(new Identifier(MOD_ID, "apple_bomb"))
                .entity(AppleBombEntity::new)
                .category(SpawnGroup.CREATURE)
                .dimensions(EntityDimensions.fixed(0.3F, 0.3F))
                .hasEgg(true)
                .egg(0xFFFFFF, 0x000000)
                .build();
        FabricDefaultAttributeRegistry.register(APPLE_BOMB, EntityUtils.createGenericEntityAttributes());
        PUNKKIN = EntityRegistryBuilder.<PunkkinEntity>createBuilder(new Identifier(MOD_ID, "punkkin"))
                .entity(PunkkinEntity::new)
                .category(SpawnGroup.CREATURE)
                .dimensions(EntityDimensions.fixed(0.6F, 0.6F))
                .hasEgg(true)
                .egg(0xFFFFFF, 0x000000)
                .build();
        FabricDefaultAttributeRegistry.register(PUNKKIN, EntityUtils.createGenericEntityAttributes());
        SOUL_CANDLE_GOLEM = EntityRegistryBuilder.<SoulCandleGolemEntity>createBuilder(new Identifier(MOD_ID, "soul_candle_golem"))
                .entity(SoulCandleGolemEntity::new)
                .category(SpawnGroup.CREATURE)
                .dimensions(EntityDimensions.fixed(0.6F, 0.6F))
                .hasEgg(true)
                .egg(0xFFFFFF, 0x000000)
                .build();
        FabricDefaultAttributeRegistry.register(SOUL_CANDLE_GOLEM, EntityUtils.createGenericEntityAttributes());
    }

}