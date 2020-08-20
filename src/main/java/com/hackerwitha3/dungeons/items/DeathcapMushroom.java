package com.hackerwitha3.dungeons.items;

import com.hackerwitha3.dungeons.Dungeons;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DeathcapMushroom extends Item {
    public DeathcapMushroom() {
        super(new Item.Properties()
                .group(Dungeons.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(1.0f)
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.HASTE, 1200, 1), 1)
                        .effect(new EffectInstance(Effects.SPEED, 600, 2), 1)
                        .effect(new EffectInstance(Effects.STRENGTH, 200, 3), 1)
                        .fastToEat()
                        .build())
                .maxStackSize(16)

        );
    }
}
