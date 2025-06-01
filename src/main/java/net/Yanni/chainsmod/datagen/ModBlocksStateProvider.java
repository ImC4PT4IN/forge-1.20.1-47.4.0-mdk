package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChainsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HELLBRINGER_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE);
        blockWithItem(ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE);
        blockWithItem(ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE);
        blockWithItem(ModBlocks.BLUE_BLOCK);
        blockWithItem(ModBlocks.BLUE_BLOCK_ORE);
        blockWithItem(ModBlocks.HELLBRINGER_BLOCK_ORE);
        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.HELLBRINGER_STAIRS.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.HELLBRINGER_SLAB.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.HELLBRINGER_BUTTON.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.HELLBRINGER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.HELLBRINGER_FENCE.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.HELLBRINGER_FENCE_GATE.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.HELLBRINGER_WALL.get()), blockTexture(ModBlocks.HELLBRINGER_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.HELLBRINGER_DOOR.get()), modLoc("block/hellbringer_door_bottom"), modLoc("block/hellbringer_door_top"),"cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.HELLBRINGER_TRAPDOOR.get()), modLoc("block/hellbringer_trapdoor"),true ,"cutout");


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
