package com.hackerwitha3.dungeons.objects.tools;

import com.hackerwitha3.dungeons.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class FightersBindings extends SwordItem{
    public FightersBindings(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A77" + "Made in the wilds"));
            tooltip.add(new StringTextComponent("\u00A77" + " beyond the mountains,"));
            tooltip.add(new StringTextComponent("\u00A77" + "have been worn by"));
            tooltip.add(new StringTextComponent("\u00A77" + "warriors for"));
            tooltip.add(new StringTextComponent("\u00A77" + "centuries."));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
