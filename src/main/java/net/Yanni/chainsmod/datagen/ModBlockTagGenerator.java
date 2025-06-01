package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.block.ModBlocks;
import net.Yanni.chainsmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChainsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.HELLBRINGER_BLOCK_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.HELLBRINGER_BLOCK.get(),
                        ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.BLUE_BLOCK_ORE.get(),
                        ModBlocks.BLUE_BLOCK.get(),
                        ModBlocks.SOUND_BLOCK.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.HELLBRINGER_BLOCK.get());



        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE.get(),
                        ModBlocks.BLUE_BLOCK.get(),
                        ModBlocks.BLUE_BLOCK_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_HELLBRINGER_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());

                        this.tag(BlockTags.FENCES)
                .add(ModBlocks.HELLBRINGER_FENCE.get());

                        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.HELLBRINGER_FENCE_GATE.get());

                        this.tag(BlockTags.WALLS)
                .add(ModBlocks.HELLBRINGER_WALL.get());














    ;}
}
