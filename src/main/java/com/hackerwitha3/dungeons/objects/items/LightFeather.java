package com.hackerwitha3.dungeons.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

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
}
