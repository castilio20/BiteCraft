package com.empando.bitecraft.item;


import com.empando.bitecraft.BiteCraft;
import com.empando.bitecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BiteCraft.MODID);

    public static final Supplier<CreativeModeTab> BITECRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("bitecraft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DOUGH.get()))
                    .displayItems((itemDisplayParameters, output) -> {

                        //FOOD
                        output.accept(ModItems.DOUGH);

                        //Meat?
                        output.accept(ModItems.RAW_BACON);
                        output.accept(ModItems.COOKED_BACON);
                        output.accept(ModItems.STEW_CHICKEN);


                        //Veggy
                        output.accept(ModItems.GOLDEN_POTATO);
                        output.accept(ModItems.GOLDEN_POISON_POTATO);
                        output.accept(ModItems.VEGETABLE_SOUP);


                        //Slice
                        output.accept(ModItems.PIE_SLICE);
                        output.accept(ModItems.CAKE_SLICE);

                        //Honey product
                        output.accept(ModItems.HONEY_BREAD);
                        output.accept(ModItems.HONEY_APPLE);
                        output.accept(ModItems.HONEY_CAROT);
                        output.accept(ModItems.HONEY_BERRY);
                        output.accept(ModItems.HONEY_COOKIE);
                        output.accept(ModItems.HONEY_MILK);
                        //Juice
                        output.accept(ModItems.APPLE_JUICE);
                        output.accept(ModItems.MELLON_JUICE);
                        output.accept(ModItems.BERRY_JUICE);
                        output.accept(ModItems.CARROT_JUICE);
                        output.accept(ModItems.PUMPKIN_JUICE);

                        //BLOCKS??
                        //output.accept(ModBlocks.CAROT_CAKE);
                        //VEGAN
                        output.accept(ModItems.HERB_SALAD);
                        //Lactate
                        output.accept(ModItems.CHEESE);


                        //MISC
                        output.accept(ModItems.FRIED_EGG);

                        //Blocks
                        output.accept(ModBlocks.CHEESE_PRESS.get());




                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}