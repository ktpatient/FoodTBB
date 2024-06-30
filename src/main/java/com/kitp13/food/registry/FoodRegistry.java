package com.kitp13.food.registry;

import com.kitp13.food.FoodMod;
import com.kitp13.food.registry.holder.CakeFlavour;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodMod.MODID);

    public static CakeFlavour CAKE_FLAVOUR_CHOCOLATE = new CakeFlavour("chocolate");
    public static CakeFlavour CAKE_FLAVOUR_STRAWBERRY = new CakeFlavour("strawberry");
    public static CakeFlavour CAKE_FLAVOUR_MINT = new CakeFlavour("mint");
    public static CakeFlavour CAKE_FLAVOUR_VANILLA = new CakeFlavour("vanilla");
    public static CakeFlavour CAKE_FLAVOUR_PLAIN = new CakeFlavour("plain");
}
