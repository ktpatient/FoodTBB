package com.kitp13.food;

import com.kitp13.food.registry.FoodRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FoodMod.MODID)
public class FoodMod {
    public static final String MODID = "food";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public FoodMod(){
        FoodRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FoodRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
