package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                 new ResourceLocation("item/generated")).texture("layer0",
                  new ResourceLocation(ChainsMod.MOD_ID,"item/" + item.getId().getPath()));

    }


}
