package com.hackerwitha3.dungeons.objects.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import com.hackerwitha3.dungeons.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class ScaleMail extends ArmorItem {
    public ScaleMail(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
        super(materialIn, slot, p_i48534_3_);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A77" + "This armor,"));
            tooltip.add(new StringTextComponent("\u00A77" + "crafted near"));
            tooltip.add(new StringTextComponent("\u00A77" + "the shores of a"));
            tooltip.add(new StringTextComponent("\u00A77" + "great sea, was"));
            tooltip.add(new StringTextComponent("\u00A77" + "inspired by the"));
            tooltip.add(new StringTextComponent("\u00A77" + "scales of fish."));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
