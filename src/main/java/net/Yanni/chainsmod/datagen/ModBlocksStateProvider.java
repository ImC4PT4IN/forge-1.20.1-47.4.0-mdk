package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
