package net.quack95.lsd.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoods {
    public static final FoodComponent ACID = new FoodComponent.Builder().hunger(4).saturationModifier(0.45f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400, 5), 1)
            .alwaysEdible().build();
    public static final FoodComponent CRACK = new FoodComponent.Builder().hunger(4).saturationModifier(0.45f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 400, 5), 0.60f)
            .alwaysEdible().build();
    public static final FoodComponent METH = new FoodComponent.Builder().hunger(4).saturationModifier(0.45f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 400, 1), 0.50f)
            .alwaysEdible().build();
}
