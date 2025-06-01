package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.item.ModItems;
import net.Yanni.chainsmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChainsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BLUE);
        simpleItem(ModItems.HELLBRINGER);
        simpleItem(ModItems.HELLBRINGER_SWORD);
        simpleItem(ModItems.PETROL);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.HELLBRINGER_ORE);
        simpleItem(ModItems.BLUE_ORE);
        simpleItem(ModItems.METAL_DETECTOR);

        fenceItem(ModBlocks.HELLBRINGER_FENCE, ModBlocks.HELLBRINGER_BLOCK);
        buttonItem(ModBlocks.HELLBRINGER_BUTTON, ModBlocks.HELLBRINGER_BLOCK);
        wallItem(ModBlocks.HELLBRINGER_WALL, ModBlocks.HELLBRINGER_BLOCK);

        evenSimplerBlockItem(ModBlocks.HELLBRINGER_STAIRS);
        evenSimplerBlockItem(ModBlocks.HELLBRINGER_SLAB);
        evenSimplerBlockItem(ModBlocks.HELLBRINGER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.HELLBRINGER_FENCE_GATE);

        trapdoorItem(ModBlocks.HELLBRINGER_TRAPDOOR);
        simpleBlockItem(ModBlocks.HELLBRINGER_DOOR);

        handheldItem(ModItems.HELLBRINGER_PICKAXE);
        handheldItem(ModItems.HELLBRINGER_AXE);
        handheldItem(ModItems.HELLBRINGER_SHOVEL);
        handheldItem(ModItems.HELLBRINGER_HOE);




    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChainsMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ChainsMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ChainsMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ChainsMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ChainsMod.MOD_ID,"item/" + item.getId().getPath()));
    }


    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ChainsMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChainsMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
