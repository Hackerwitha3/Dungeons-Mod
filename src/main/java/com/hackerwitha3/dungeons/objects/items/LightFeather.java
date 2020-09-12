package com.hackerwitha3.dungeons.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import com.hackerwitha3.dungeons.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import java.util.List;

public class LightFeather extends Item {
    public LightFeather(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 30, 4));
        playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 10, 1));
        playerIn.getCooldownTracker().setCooldown(this, 200);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A77" + "No one knows what"));
            tooltip.add(new StringTextComponent("\u00A77" + "mysterious creature"));
            tooltip.add(new StringTextComponent("\u00A77" + "this feather came from,"));
            tooltip.add(new StringTextComponent("\u00A77" + "but it is as beautiful"));
            tooltip.add(new StringTextComponent("\u00A77" + "and powerful."));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
