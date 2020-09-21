package com.hackerwitha3.dungeons.util.enums;

import com.hackerwitha3.dungeons.Dungeons;
import com.hackerwitha3.dungeons.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    EVOCATION_ROBE_TYPE(Dungeons.MOD_ID + ":evocation_robe", 17, new int[]{1, 5, 3, 1}, 30,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0F, () -> {
        return Ingredient.fromItems(ModItems.CLOTH.get());
    }, 0.25F),


    SCALE_MAIL_TYPE(Dungeons.MOD_ID + ":scale_mail", 17, new int[]{2, 7, 5, 2}, 22,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.5F, () -> {
        return Ingredient.fromItems(ModItems.STEEL_INGOT.get());
    }, 0.25F),

    HIGHLAND_ARMOR_TYPE(Dungeons.MOD_ID + ":highland_armor", 17, new int[]{3, 7, 5, 2}, 25,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.5F, () -> {
        return Ingredient.fromItems(ModItems.STEEL_INGOT.get());
    }, 0.4F);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}