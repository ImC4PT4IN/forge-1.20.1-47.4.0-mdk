package net.Yanni.chainsmod.item;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChainsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CHAINS_TAB = CREATIVE_MODE_TABS.register("chains_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HELLBRINGER.get()))
                    .title(Component.translatable("chains.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HELLBRINGER.get());
                        pOutput.accept(ModItems.HELLBRINGER_SWORD.get());
                        pOutput.accept(ModBlocks.BLUE_BLOCK.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_BLOCK.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_BLOCK_ORE.get());
                        pOutput.accept(ModItems.HELLBRINGER_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_HELLBRINGER_BLOCK_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_HELLBRINGER_BLOCK_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_HELLBRINGER_BLOCK_ORE.get());
                        pOutput.accept(ModItems.BLUE_ORE.get());
                        pOutput.accept(ModBlocks.BLUE_BLOCK_ORE.get());
                        pOutput.accept(ModItems.BLUE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.PETROL.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_SLAB.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_DOOR.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_WALL.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_BUTTON.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_FENCE.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.HELLBRINGER_STAIRS.get());
                        pOutput.accept(ModItems.BLUE_STAFF.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
