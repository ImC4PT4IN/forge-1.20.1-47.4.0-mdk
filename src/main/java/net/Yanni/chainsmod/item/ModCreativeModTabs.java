package net.Yanni.chainsmod.item;

import net.Yanni.chainsmod.ChainsMod;
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

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
