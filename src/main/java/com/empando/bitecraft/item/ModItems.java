package com.empando.bitecraft.item;


import com.empando.bitecraft.BiteCraft;
import com.empando.bitecraft.item.custom.DrinkJuice;
import com.empando.bitecraft.item.custom.MilkJuiceItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;

import net.neoforged.bus.api.IEventBus;

import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BiteCraft.MODID);
    //ITEMS

    //FOOD
    public static final DeferredItem<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DOUGH)));

    //MEAT???
    public static final DeferredItem<Item> RAW_BACON = ITEMS.register("raw_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BACON)));
    public static final DeferredItem<Item> COOKED_BACON = ITEMS.register("cooked_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BACON)));
    public static final DeferredItem<Item> STEW_CHICKEN = ITEMS.register("stew_chicken",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STEW_CHICKEN).stacksTo(1)));

    //Somthing


    public static final DeferredItem<Item> PIE_SLICE = ITEMS.register("pie_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PIE_SLICE)));
    public static final DeferredItem<Item> CAKE_SLICE = ITEMS.register("cake_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAKE_SLICE)));



    //Honey products
    public static final DeferredItem<Item> HONEY_BREAD = ITEMS.register("honey_bread",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_BREAD)));
    public static final DeferredItem<Item> HONEY_APPLE = ITEMS.register("honey_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_APPLE)));
    public static final DeferredItem<Item> HONEY_BERRY= ITEMS.register("honey_berry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_BERRY)));
    public static final DeferredItem<Item> HONEY_CAROT= ITEMS.register("honey_carot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_BERRY)));
    public static final DeferredItem<Item> HONEY_COOKIE = ITEMS.register("honey_cookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_COOKIE)));
    public static final DeferredItem<Item> HONEY_MILK= ITEMS.register("honey_milk",
            () -> new MilkJuiceItem(new Item.Properties().food(ModFoodProperties.HONEY_MILK)));
    //Juice
    public static final DeferredItem<Item> APPLE_JUICE= ITEMS.register("apple_juice",
            () -> new DrinkJuice(new Item.Properties().food(ModFoodProperties.APPLE_JUICE)));
    public static final DeferredItem<Item> MELLON_JUICE= ITEMS.register("mellon_juice",
            () -> new DrinkJuice(new Item.Properties().food(ModFoodProperties.MELLON_JUICE)));
    public static final DeferredItem<Item> BERRY_JUICE= ITEMS.register("berry_juice",
            () -> new DrinkJuice(new Item.Properties().food(ModFoodProperties.BERRY_JUICE)));
    public static final DeferredItem<Item> CAROT_JUICE= ITEMS.register("carot_juice",
            () -> new DrinkJuice(new Item.Properties().food(ModFoodProperties.CAROT_JUICE)));
    public static final DeferredItem<Item> PUMPKIN_JUICE= ITEMS.register("pumpkin_juice",
            () -> new DrinkJuice(new Item.Properties().food(ModFoodProperties.PUMPKIN_JUICE)));
    //VEGAN
    public static final DeferredItem<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDEN_POTATO)));
    public static final DeferredItem<Item> GOLDEN_POISON_POTATO = ITEMS.register("golden_poison_potato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDEN_POISON_POTATO)));
    public static final DeferredItem<Item> HERB_SALAD= ITEMS.register("herb_salad",
            () -> new BowItem(new Item.Properties().food(ModFoodProperties.CAKE_SLICE)));
    public static final DeferredItem<Item> VEGETABLE_SOUP= ITEMS.register("vegetable_soup",
            () -> new BowItem(new Item.Properties().food(ModFoodProperties.CAKE_SLICE)));
    //MISC
    public static final DeferredItem<Item> FRIED_EGG= ITEMS.register("fried_egg",
            () -> new BowItem(new Item.Properties().food(ModFoodProperties.CAKE_SLICE)));


    // Helper methods
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}