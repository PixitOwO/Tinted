package net.pixit.tinted;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

public class TintedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Block[] TintedBlocks = new Block[]{Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_COBBLESTONE_STAIRS, Blocks.MOSSY_STONE_BRICK_STAIRS, Blocks.MOSSY_COBBLESTONE_WALL, Blocks.MOSSY_STONE_BRICK_WALL};
        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> {assert world != null; assert pos != null; return BiomeColors.getGrassColor(world, pos);}), TintedBlocks);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TintedBlocks);

        Block[] TintedPlants = new Block[]{Blocks.ALLIUM, Blocks.AZURE_BLUET, Blocks.BLUE_ORCHID, Blocks.CORNFLOWER, Blocks.DANDELION, Blocks.LILAC, Blocks.LILY_OF_THE_VALLEY, Blocks.ORANGE_TULIP, Blocks.OXEYE_DAISY, Blocks.PEONY, Blocks.PINK_TULIP, Blocks.PITCHER_CROP, Blocks.PITCHER_PLANT, Blocks.POPPY, Blocks.RED_TULIP, Blocks.ROSE_BUSH, Blocks.SUNFLOWER, Blocks.TORCHFLOWER_CROP, Blocks.TORCHFLOWER, Blocks.WHITE_TULIP, Blocks.WITHER_ROSE, Blocks.SWEET_BERRY_BUSH, Blocks.POTATOES, Blocks.CARROTS, Blocks.WHEAT, Blocks.BEETROOTS, Blocks.FLOWERING_AZALEA, Blocks.AZALEA, Blocks.POTTED_FLOWERING_AZALEA_BUSH, Blocks.POTTED_AZALEA_BUSH, Blocks.MOSS_BLOCK, Blocks.MOSS_CARPET, Blocks.CAVE_VINES, Blocks.CAVE_VINES_PLANT};
        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> {assert world != null; assert pos != null; return BiomeColors.getGrassColor(world, pos);}), TintedPlants);
    }
}
