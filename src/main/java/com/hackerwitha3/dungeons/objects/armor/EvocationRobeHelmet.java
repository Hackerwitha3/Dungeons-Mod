package com.hackerwitha3.dungeons.objects.armor;

import com.hackerwitha3.dungeons.models.EvocationRobeModel;
import com.hackerwitha3.dungeons.util.helpers.KeyboardHelper;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class EvocationRobeHelmet extends ArmorItem {
    public EvocationRobeHelmet(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
        super(materialIn, slot, p_i48534_3_);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A77" + "Potent magical"));
            tooltip.add(new StringTextComponent("\u00A77" + "runes are weaved"));
            tooltip.add(new StringTextComponent("\u00A77" + "into the fabric"));
            tooltip.add(new StringTextComponent("\u00A77" + "of these robes,"));
            tooltip.add(new StringTextComponent("\u00A77" + "their origins and"));
            tooltip.add(new StringTextComponent("\u00A77" + "powers are"));
            tooltip.add(new StringTextComponent("\u00A77" + "shrouded in mystery."));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack stack, EquipmentSlotType armorSlot, A _default) {
            return (A) new EvocationRobeModel<>(1.0F, slot, entityLiving);
        }
}
