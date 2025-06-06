package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.block.ModBlocks;
import net.Yanni.chainsmod.block.custom.CornCropBlock;
import net.Yanni.chainsmod.block.custom.StrawberryCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

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

        makeStrawberryCrop((CropBlock)ModBlocks.STRAWBERRY_CROP.get(),"strawberry_stage","strawberry_stage");
        makeCornCrop((CropBlock)ModBlocks.CORN_CROP.get(),"corn_stage_","corn_stage_");

        simpleBlockWithItem(ModBlocks.CATMINT.get(), models().cross(blockTexture(ModBlocks.CATMINT.get()).getPath(),
                blockTexture(ModBlocks.CATMINT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CATMINT.get(), models().singleTexture("potted_catmint", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.CATMINT.get())).renderType("cutout"));
    }
    public void makeStrawberryCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> strawberryStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] strawberryStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((StrawberryCropBlock) block).getAgeProperty()),
                new ResourceLocation(ChainsMod.MOD_ID, "block/" + textureName + state.getValue(((StrawberryCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    public void makeCornCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cornStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cornStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CornCropBlock) block).getAgeProperty()),
                new ResourceLocation(ChainsMod.MOD_ID, "block/" + textureName + state.getValue(((CornCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }





    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
