package com.hackerwitha3.dungeons.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StainedGrass extends Block {

    public StainedGrass() {
        super(Block.Properties.create(Material.EARTH)
                .hardnessAndResistance(0.6f, 0.6f)
                .sound(SoundType.GROUND)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL)
        );
    }
}
