package net.Yanni.chainsmod.datagen;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.block.ModBlocks;
import net.Yanni.chainsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> HELLBRINGER_SMELTABLES = List.of(ModItems.HELLBRINGER_ORE.get(),
            ModBlocks.HELLBRINGER_BLOCK_ORE.get(), ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE.get(), ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE.get(),
            ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE.get());
    private static final List<ItemLike> BLUE_SMELTABLES = List.of(ModItems.BLUE_ORE.get(), ModBlocks.BLUE_BLOCK_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, HELLBRINGER_SMELTABLES, RecipeCategory.MISC, ModItems.HELLBRINGER.get(), 0.25f, 100,"hellbringer" );
        oreSmelting(pWriter, HELLBRINGER_SMELTABLES, RecipeCategory.MISC, ModItems.HELLBRINGER.get(), 0.25f, 300,"hellbringer" );
        oreBlasting(pWriter, BLUE_SMELTABLES, RecipeCategory.MISC, ModItems.BLUE.get(), 0.25f, 100,"blue" );
        oreSmelting(pWriter, BLUE_SMELTABLES, RecipeCategory.MISC, ModItems.BLUE.get(), 0.25f, 300,"blue" );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HELLBRINGER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.HELLBRINGER.get())
                .unlockedBy(getHasName(ModItems.HELLBRINGER.get()), has(ModItems.HELLBRINGER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.BLUE.get())
                .unlockedBy(getHasName(ModItems.BLUE.get()), has(ModItems.BLUE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLUE_STAFF.get())
                .pattern("&#&")
                .pattern(" S ")
                .pattern(" S ")
                .define('#', ModItems.BLUE.get())
                .define('&', Items.GOLD_INGOT)
                .define('S', Items.GOLD_BLOCK)
                .unlockedBy(getHasName(ModItems.BLUE.get()), has(ModBlocks.BLUE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HELLBRINGER.get(),9)
                .requires(ModBlocks.HELLBRINGER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.HELLBRINGER_BLOCK.get()), has(ModBlocks.HELLBRINGER_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLUE.get(),9)
                .requires(ModBlocks.BLUE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLUE_BLOCK.get()), has(ModBlocks.BLUE_BLOCK.get()))
                .save(pWriter);




    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, ChainsMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
