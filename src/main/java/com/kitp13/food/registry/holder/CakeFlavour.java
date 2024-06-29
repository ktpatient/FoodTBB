package com.kitp13.food.registry.holder;

import com.kitp13.food.block.CakeBlock;
import com.kitp13.food.registry.FoodRegistry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CakeFlavour {
    public RegistryObject<Item> BITE;
    public RegistryObject<Item> CAKE_ITEM;
    public RegistryObject<Block> CAKE_BLOCK;
    public String Flavor;
    public CakeFlavour(String flavor){
        Flavor = flavor;
        BITE = FoodRegistry.ITEMS.register(Flavor + "_bite", ()-> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(2f).build())));
        CAKE_BLOCK = FoodRegistry.BLOCKS.register(Flavor + "_cake", () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), BITE));
        CAKE_ITEM = FoodRegistry.ITEMS.register(Flavor + "_cake", ()-> new BlockItem(CAKE_BLOCK.get(),new Item.Properties()));
    }

}
