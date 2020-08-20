package com.hackerwitha3.dungeons.util.enums;


import com.hackerwitha3.dungeons.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    CUTLASS(0, 800, 9.0F, 3.0F, 25, () -> {
        return Ingredient.fromItems(ModItems.STEEL_INGOT.get());
    }),
    STEEL_L(0, 780, 9.0F, 1.5F, 35, () -> {
        return Ingredient.fromItems(ModItems.STEEL_LEATHER.get());
    }),
    IRON_L(0, 600, 9.0F, 1.25F, 30, () -> {
        return Ingredient.fromItems(ModItems.IRON_LEATHER.get());
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient>repairMaterial){
        this.harvestLevel = harvestLevel;
        this. maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
