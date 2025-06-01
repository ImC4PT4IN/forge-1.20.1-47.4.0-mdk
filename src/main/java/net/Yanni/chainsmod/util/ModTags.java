package net.Yanni.chainsmod.util;

import net.Yanni.chainsmod.ChainsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_HELLBRINGER_TOOL = tag("needs_hellbringer_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ChainsMod.MOD_ID, name));
        }
    }



    public static class Items {
        public static final TagKey<Item> SOME_ITEM_TAG = tag("some_item_tag");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ChainsMod.MOD_ID, name));
        }
    }
}

