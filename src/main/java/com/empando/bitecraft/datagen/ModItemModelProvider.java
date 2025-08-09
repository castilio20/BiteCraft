package com.empando.bitecraft.datagen;


import com.empando.bitecraft.BiteCraft;
import com.empando.bitecraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BiteCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DOUGH.get());
        basicItem(ModItems.HONEY_BREAD.get());
        basicItem(ModItems.RAW_BACON.get());
        basicItem(ModItems.COOKED_BACON.get());
        basicItem(ModItems.STEW_CHICKEN.get());
        basicItem(ModItems.GOLDEN_POTATO.get());
        basicItem(ModItems.APPLE_JUICE.get());
        basicItem(ModItems.BERRY_JUICE.get());
        basicItem(ModItems.CARROT_JUICE.get());
        basicItem(ModItems.MELLON_JUICE.get());
        basicItem(ModItems.PUMPKIN_JUICE.get());
        basicItem(ModItems.CHEESE.get());



        basicItem(ModItems.CAKE_SLICE.get());
        basicItem(ModItems.PIE_SLICE.get());

    }
}
