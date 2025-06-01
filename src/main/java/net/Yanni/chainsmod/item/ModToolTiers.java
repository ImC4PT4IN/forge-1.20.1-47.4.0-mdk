package net.Yanni.chainsmod.item;

import com.sun.net.httpserver.Filter;
import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier HELLBRINGER = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2000, 9f, 4f, 15,
                    ModTags.Blocks.NEEDS_HELLBRINGER_TOOL, () -> Ingredient.of(ModItems.HELLBRINGER.get())),
            new ResourceLocation(ChainsMod.MOD_ID, "hellbringer"), List.of(Tiers.DIAMOND), List.of());

}
