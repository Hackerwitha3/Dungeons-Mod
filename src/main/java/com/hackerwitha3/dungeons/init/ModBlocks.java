package com.hackerwitha3.dungeons.init;

import com.hackerwitha3.dungeons.Dungeons;
import com.hackerwitha3.dungeons.objects.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dungeons.MOD_ID);


    //Blocks ONLY
    public static final RegistryObject<Block> STAINED_GRASS = BLOCKS.register("stained_grass", StainedGrass::new);

    public static final RegistryObject<Block> STAINED_GRASS_SPROUTS = BLOCKS.register("stained_grass_sprouts", StainedGrassSprouts::new);

    public static final RegistryObject<Block> SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks", SandstoneBricks::new);

    public static final RegistryObject<Block> ORANGE_LEAVES = BLOCKS.register("orange_leaves", OrangeLeaves::new);

    public static final RegistryObject<Block> RED_LEAVES = BLOCKS.register("red_leaves", RedLeaves::new);

    
}
