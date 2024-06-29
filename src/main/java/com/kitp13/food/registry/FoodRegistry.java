package com.kitp13.food.registry;

import com.kitp13.food.FoodMod;
import com.kitp13.food.registry.holder.CakeFlavour;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodRegistry {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodMod.MODID);

    public static CakeFlavour CAKE_FLAVOUR_CHOCOLATE = new CakeFlavour("chocolate");

}
