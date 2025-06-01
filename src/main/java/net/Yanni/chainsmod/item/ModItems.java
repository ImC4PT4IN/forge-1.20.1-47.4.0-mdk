package net.Yanni.chainsmod.item;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.item.custom.FuelItem;
import net.Yanni.chainsmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
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
            () -> new SwordItem(ModToolTiers.HELLBRINGER, 4, 2, new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_ORE = Items.register("hellbringer_ore",
            () -> new Item((new Item.Properties())));
    public static final  RegistryObject<Item> BLUE_ORE = Items.register("blue_ore",
            () -> new Item((new Item.Properties())));
    public static final  RegistryObject<Item> BLUE = Items.register("blue",
            () -> new Item((new Item.Properties())));
    public static final  RegistryObject<Item> METAL_DETECTOR = Items.register("metal_detector",
            () -> new MetalDetectorItem((new Item.Properties().durability(100))));
    public static final  RegistryObject<Item> STRAWBERRY = Items.register("strawberry",
            () -> new Item((new Item.Properties().food(ModFoods.STRAWBERRY).stacksTo(16))));
    public static final  RegistryObject<Item> BLUE_STAFF = Items.register("blue_staff",
            () -> new Item((new Item.Properties().stacksTo(1))));
    public static final  RegistryObject<Item> HELLBRINGER_PICKAXE = Items.register("hellbringer_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELLBRINGER, 1, 1,(new Item.Properties())));
    public static final  RegistryObject<Item> HELLBRINGER_AXE = Items.register("hellbringer_axe",
            () -> new AxeItem(ModToolTiers.HELLBRINGER, 7, 1,(new Item.Properties())));
    public static final  RegistryObject<Item> HELLBRINGER_SHOVEL = Items.register("hellbringer_shovel",
            () -> new ShovelItem(ModToolTiers.HELLBRINGER,0 , 0,(new Item.Properties())));
    public static final  RegistryObject<Item> HELLBRINGER_HOE = Items.register("hellbringer_hoe",
            () -> new HoeItem(ModToolTiers.HELLBRINGER,0 ,0 ,(new Item.Properties())));



    public static final RegistryObject<Item> PETROL = Items.register("petrol",
            () -> new FuelItem(new Item.Properties(), 400));

public static void register(IEventBus eventBus){

    Items.register(eventBus);

}
}