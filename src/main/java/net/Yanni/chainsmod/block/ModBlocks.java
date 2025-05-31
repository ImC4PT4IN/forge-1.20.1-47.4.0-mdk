package net.Yanni.chainsmod.block;

import net.Yanni.chainsmod.ChainsMod;
import net.Yanni.chainsmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ChainsMod.MOD_ID);


    public static final RegistryObject<Block> HELLBRINGER_BLOCK = registerBlock("hellbringer_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BLUE_BLOCK = registerBlock("blue_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> HELLBRINGER_BLOCK_ORE = registerBlock("hellbringer_block_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    private  static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }



    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){

        return ModItems.Items.register(name, () -> new BlockItem((block.get()), new Item.Properties()));
    }

        public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
