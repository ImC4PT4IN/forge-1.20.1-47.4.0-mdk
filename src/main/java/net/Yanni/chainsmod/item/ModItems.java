package net.Yanni.chainsmod.item;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.item.custom.FuelItem;
import net.Yanni.chainsmod.item.custom.MetalDetectorItem;
import net.Yanni.chainsmod.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChainsMod.MOD_ID);

    //materials

    public static final RegistryObject<Item> HELLBRINGER = Items.register("hellbringer",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_ORE = Items.register("hellbringer_ore",
            () -> new Item((new Item.Properties())));
    public static final  RegistryObject<Item> BLUE_ORE = Items.register("blue_ore",
            () -> new Item((new Item.Properties())));
    public static final  RegistryObject<Item> BLUE = Items.register("blue",
            () -> new Item((new Item.Properties())));

    //moditems

    public static final  RegistryObject<Item> METAL_DETECTOR = Items.register("metal_detector",
            () -> new MetalDetectorItem((new Item.Properties().durability(100))));
    public static final  RegistryObject<Item> BLUE_STAFF = Items.register("blue_staff",
            () -> new Item((new Item.Properties().stacksTo(1))));

    //food

    public static final  RegistryObject<Item> STRAWBERRY = Items.register("strawberry",
            () -> new Item((new Item.Properties().food(ModFoods.STRAWBERRY).stacksTo(16))));

    //tools

    public static final  RegistryObject<Item> HELLBRINGER_SWORD = Items.register("hellbringer_sword",
            () -> new SwordItem(ModToolTiers.HELLBRINGER, 4, -2, new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_PICKAXE = Items.register("hellbringer_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELLBRINGER, 1, -2.8f,(new Item.Properties())));
    public static final  RegistryObject<Item> HELLBRINGER_AXE = Items.register("hellbringer_axe",
            () -> new AxeItem(ModToolTiers.HELLBRINGER, 7, -2.8f,(new Item.Properties())));
    public static final  RegistryObject<Item> HELLBRINGER_SHOVEL = Items.register("hellbringer_shovel",
            () -> new ShovelItem(ModToolTiers.HELLBRINGER,0 , -3,(new Item.Properties())));
    public static final  RegistryObject<Item> HELLBRINGER_HOE = Items.register("hellbringer_hoe",
            () -> new HoeItem(ModToolTiers.HELLBRINGER,0 ,-3 ,(new Item.Properties())));

    //armor

    public static final  RegistryObject<Item> HELLBRINGER_HELMET = Items.register("hellbringer_helmet",
            () -> new ArmorItem(ModArmorMaterials.HELLBRINGER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_CHESTPLATE = Items.register("hellbringer_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HELLBRINGER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_LEGGINGS = Items.register("hellbringer_leggings",
            () -> new ArmorItem(ModArmorMaterials.HELLBRINGER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final  RegistryObject<Item> HELLBRINGER_BOOTS = Items.register("hellbringer_boots",
            () -> new ArmorItem(ModArmorMaterials.HELLBRINGER, ArmorItem.Type.BOOTS, new Item.Properties()));

    //

    public static final  RegistryObject<Item> BLUE_HELMET = Items.register("blue_helmet",
            () -> new ModArmorItem(ModArmorMaterials.BLUE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final  RegistryObject<Item> BLUE_CHESTPLATE = Items.register("blue_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLUE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final  RegistryObject<Item> BLUE_LEGGINGS = Items.register("blue_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLUE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final  RegistryObject<Item> BLUE_BOOTS = Items.register("blue_boots",
            () -> new ArmorItem(ModArmorMaterials.BLUE, ArmorItem.Type.BOOTS, new Item.Properties()));


    //fuel

    public static final RegistryObject<Item> PETROL = Items.register("petrol",
            () -> new FuelItem(new Item.Properties(), 400));

public static void register(IEventBus eventBus){

    Items.register(eventBus);

}
}