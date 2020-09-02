package com.hackerwitha3.dungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SandstoneBricks extends Block {

    public SandstoneBricks() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.8f, 0.8f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
