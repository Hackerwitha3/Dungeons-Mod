package com.hackerwitha3.dungeons.objects.items;

import com.hackerwitha3.dungeons.Dungeons;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DungeonsBread extends Item {

    public DungeonsBread() {
        super(new Item.Properties()
                .group(Dungeons.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.0f)
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.REGENERATION, 600, 0), 1)
                        .fastToEat()
                        .build())
                .maxStackSize(1)

        );
    }
}
