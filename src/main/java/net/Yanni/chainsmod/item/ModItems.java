package net.Yanni.chainsmod.item;

import net.Yanni.chainsmod.ChainsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChainsMod.MOD_ID);

    public static final RegistryObject<Item> HELLBRINGER = Items.register("hellbringer",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_SWORD = Items.register("hellbringer_sword",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_ORE = Items.register("hellbringer_ore",
            () -> new Item((new Item.Properties())));


public static void register(IEventBus eventBus){

    Items.register(eventBus);

}
}