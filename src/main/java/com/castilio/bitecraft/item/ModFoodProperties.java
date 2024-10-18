package com.castilio.bitecraft.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties DOUGH = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build();
    //Meat
    public static final FoodProperties RAW_BACON = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties COOKED_BACON = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties STEW_CHICKEN = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    //Veggy
    public static final FoodProperties GOLDEN_POTATO = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties GOLDEN_POISON_POTATO = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.POISON, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 6000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 6000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DARKNESS, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.UNLUCK, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 2400, 3), 1.0F)
            .alwaysEdible().build();


    //Sluce
    public static final FoodProperties HONEY_BREAD = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(1.4f).build();
    public static final FoodProperties PIE_SLICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(1.4f).build();
    //Honey product
    public static final FoodProperties CAKE_SLICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(1.4f).build();
    public static final FoodProperties HONEY_APPLE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(2.4f).build();
    public static final FoodProperties HONEY_COOKIE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(3.4f).build();
    public static final FoodProperties HONEY_BERRY = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties HONEY_MILK = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    //Juice
    public static final FoodProperties APPLE_JUICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties MELLON_JUICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties BERRY_JUICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties CAROT_JUICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties PUMPKIN_JUICE = (new FoodProperties.Builder())
            .nutrition(2).saturationModifier(0.4f).build();

}
