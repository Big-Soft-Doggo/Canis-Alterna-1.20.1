package net.nyx_whitefox.canisalterna.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CANDY_BAR = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1).build();
    public static final FoodProperties ENCHANTED_BREAD = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();
    public static final FoodProperties SAPPHIRE_SALAD = new FoodProperties.Builder().nutrition(4).fast()
            .saturationMod(0.6f).build();

}
