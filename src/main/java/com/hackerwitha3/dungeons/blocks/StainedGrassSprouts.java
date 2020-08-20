package com.hackerwitha3.dungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StainedGrassSprouts extends Block {

    public StainedGrassSprouts() {
        super(Block.Properties.create(Material.EARTH)
                .hardnessAndResistance(0.6f, 0.6f)
                .sound(SoundType.GROUND)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL)
        );
    }
}
