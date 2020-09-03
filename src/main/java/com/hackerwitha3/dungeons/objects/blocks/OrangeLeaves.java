package com.hackerwitha3.dungeons.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OrangeLeaves extends Block {

    public OrangeLeaves() {
        super(Block.Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2f, 0.2f)
                .sound(SoundType.PLANT)
                .harvestLevel(1)
                .harvestTool(ToolType.HOE)
                .notSolid()
        );
    }
}
