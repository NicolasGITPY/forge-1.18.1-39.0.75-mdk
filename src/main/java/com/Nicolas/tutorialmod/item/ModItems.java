package com.Nicolas.tutorialmod.item;

import com.Nicolas.tutorialmod.item.custom.CoalCokeItem;
import com.Nicolas.tutorialmod.item.custom.DowsingRodItem;
import com.Nicolas.tutorialmod.tutorialmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialmod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", ()
    -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine", ()
            -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod", ()
            -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).durability(16)));

    public static final RegistryObject<Item> SHREK_DICK = ITEMS.register("shrek_dick", ()
            -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).food(ModFoods.SHREK_DICK)));

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke", ()
            -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
