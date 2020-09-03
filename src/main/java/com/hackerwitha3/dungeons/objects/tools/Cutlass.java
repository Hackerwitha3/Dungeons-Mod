package com.hackerwitha3.dungeons.objects.tools;

import com.hackerwitha3.dungeons.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Cutlass extends SwordItem{
    public Cutlass(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A77" + "This curved blade,"));
            tooltip.add(new StringTextComponent("\u00A77" + "wielded by the"));
            tooltip.add(new StringTextComponent("\u00A77" + "warriors of the"));
            tooltip.add(new StringTextComponent("\u00A77" + "Squid Coast,"));
            tooltip.add(new StringTextComponent("\u00A77" + "requires a steady"));
            tooltip.add(new StringTextComponent("\u00A77" + "hand in battle."));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
