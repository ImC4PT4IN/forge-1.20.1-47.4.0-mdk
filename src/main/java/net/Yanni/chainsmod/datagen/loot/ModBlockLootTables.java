package net.Yanni.chainsmod.datagen.loot;

import net.Yanni.chainsmod.block.ModBlocks;
import net.Yanni.chainsmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.HELLBRINGER_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_BLOCK.get());

        this.add(ModBlocks.HELLBRINGER_BLOCK_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HELLBRINGER_BLOCK_ORE.get(), ModItems.HELLBRINGER_ORE.get()));
        this.add(ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE.get(), ModItems.HELLBRINGER_ORE.get()));
        this.add(ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE.get(),
                block -> createSecondCopperLikeOreDrops(ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE.get(), ModItems.HELLBRINGER_ORE.get()));
        this.add(ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE.get(),
                block -> createSecondCopperLikeOreDrops(ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE.get(), ModItems.HELLBRINGER_ORE.get()));
        this.add(ModBlocks.BLUE_BLOCK_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.BLUE_BLOCK_ORE.get(), ModItems.BLUE_ORE.get()));





    }
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createSecondCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
