package io.github.vampirestudios.tat.utils;

import io.github.vampirestudios.tat.TreatsAndTrickery;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.BlockEntityType.Builder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

public class RegistryUtils {

    public static <B extends Block> B register(B block, Identifier name) {
        return register(block, name, ItemGroup.DECORATIONS);
    }

    public static <B extends Block> B register(String name, B block) {
        return register(block, new Identifier(TreatsAndTrickery.MOD_ID, name), ItemGroup.DECORATIONS);
    }

    public static <B extends Block> B register(String name, B block, ItemGroup itemGroup) {
        return register(block, new Identifier(TreatsAndTrickery.MOD_ID, name), itemGroup);
    }

    public static <B extends Block> B register(B block, Identifier name, ItemGroup itemGroup) {
        Registry.register(Registry.BLOCK, name, block);
        BlockItem item = new BlockItem(block, (new Settings()).group(itemGroup));
        item.appendBlocks(Item.BLOCK_ITEMS, item);
        Registry.register(Registry.ITEM, name, item);
        return block;
    }

    public static <B extends Block> B registerBlockWithoutItem(B block, Identifier identifier) {
        Registry.register(Registry.BLOCK, identifier, block);
        return block;
    }

    public static <B extends Block> B registerBlockWithoutItem(String name, B block) {
        Registry.register(Registry.BLOCK, new Identifier(TreatsAndTrickery.MOD_ID, name), block);
        return block;
    }

    public static Item registerItem(Item item, Identifier name) {
        return Registry.register(Registry.ITEM, name, item);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TreatsAndTrickery.MOD_ID, name), item);
    }

    public static Block registerBlockWithWallBlock(Block block, Block wallBlock, Identifier name) {
        Registry.register(Registry.BLOCK, name, block);
        Registry.register(Registry.ITEM, name, new WallStandingBlockItem(block, wallBlock, new Settings().group(ItemGroup.DECORATIONS)));
        return block;
    }

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(Builder<T> builder, Identifier name) {
        BlockEntityType<T> blockEntityType = builder.build(null);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, name, blockEntityType);
        return blockEntityType;
    }

    public static Block registerNetherStem(Identifier name, MaterialColor materialColor) {
        return register(new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, (blockState) -> materialColor)
                .strength(1.0F).sounds(BlockSoundGroup.NETHER_STEM)), name);
    }

    public static Block registerLog(Identifier name, MaterialColor materialColor, MaterialColor materialColor2) {
        return register(new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, (blockState) ->
                blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? materialColor : materialColor2)
                .strength(2.0F).sounds(BlockSoundGroup.WOOD)), name);
    }

    public static Block registerNetherStem(String name, MaterialColor materialColor) {
        return register(new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, (blockState) -> materialColor)
                .strength(1.0F).sounds(BlockSoundGroup.NETHER_STEM)), new Identifier(TreatsAndTrickery.MOD_ID, name),
                ItemGroup.BUILDING_BLOCKS);
    }

    public static Block registerLog(String name, MaterialColor materialColor, MaterialColor materialColor2) {
        return register(new PillarBlock(AbstractBlock.Settings.of(Material.WOOD, (blockState) ->
                blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? materialColor : materialColor2)
                .strength(2.0F).sounds(BlockSoundGroup.WOOD)), new Identifier(TreatsAndTrickery.MOD_ID, name));
    }

}
