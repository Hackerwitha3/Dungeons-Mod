package com.hackerwitha3.dungeons.init;

import com.hackerwitha3.dungeons.Dungeons;
import com.hackerwitha3.dungeons.objects.blocks.BlockItemBase;
import com.hackerwitha3.dungeons.objects.items.*;
import com.hackerwitha3.dungeons.objects.tools.Cutlass;
import com.hackerwitha3.dungeons.objects.tools.NamelessBlade;
import com.hackerwitha3.dungeons.util.enums.ModArmorMaterial;
import com.hackerwitha3.dungeons.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dungeons.MOD_ID);

    //Items ONLY
    public static final RegistryObject<LightFeather> LIGHT_FEATHER = ITEMS.register("light_feather",
            () -> new LightFeather(new Item.Properties().group(Dungeons.TAB)));



    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);

    public static final RegistryObject<Item> IRON_LEATHER = ITEMS.register("iron_leather", ItemBase::new);

    public static final RegistryObject<Item> STEEL_LEATHER = ITEMS.register("steel_leather", ItemBase::new);

    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", ItemBase::new);

    public static final RegistryObject<DungeonsApple> DUNGEONS_APPLE = ITEMS.register("dungeons_apple", DungeonsApple::new);

    public static final RegistryObject<DungeonsBread> DUNGEONS_BREAD = ITEMS.register("dungeons_bread", DungeonsBread::new);

    public static final RegistryObject<DeathcapMushroom> DEATHCAP_MUSHROOM = ITEMS.register("deathcap_mushroom", DeathcapMushroom::new);

    //Block Items ONLY
    public static final RegistryObject<Item> STAINED_GRASS_ITEM = ITEMS.register("stained_grass",
            () -> new BlockItemBase(ModBlocks.STAINED_GRASS.get()));

    public static final RegistryObject<Item> STAINED_GRASS_SPROUTS_ITEM = ITEMS.register("stained_grass_sprouts",
            () -> new BlockItemBase(ModBlocks.STAINED_GRASS_SPROUTS.get()));

    public static final RegistryObject<Item> SANDSTONE_BRICKS_ITEM = ITEMS.register("sandstone_bricks",
            () -> new BlockItemBase(ModBlocks.SANDSTONE_BRICKS.get()));

    public static final RegistryObject<Item> ORANGE_LEAVES_ITEM = ITEMS.register("orange_leaves",
            () -> new BlockItemBase(ModBlocks.ORANGE_LEAVES.get()));

    public static final RegistryObject<Item> RED_LEAVES_ITEM = ITEMS.register("red_leaves",
            () -> new BlockItemBase(ModBlocks.RED_LEAVES.get()));



    //Tools ONLY
    public static final RegistryObject<NamelessBlade> NAMELESS_BLADE = ITEMS.register("nameless_blade", () ->
            new NamelessBlade(ModItemTier.CUTLASS, 6, -2.0F, new Item.Properties().group(Dungeons.TAB).setNoRepair())); //UNIQUE

    public static final RegistryObject<Cutlass> CUTLASS = ITEMS.register("cutlass", () ->
            new Cutlass(ModItemTier.CUTLASS, 3, -2.0F, new Item.Properties().group(Dungeons.TAB)));

    public static final RegistryObject<SwordItem> GAUNTLETS = ITEMS.register("gauntlets", () ->
            new SwordItem(ModItemTier.IRON_L, 1, -0.2F, new Item.Properties().group(Dungeons.TAB)));

    public static final RegistryObject<SwordItem> FIGHTERS_BINDINGS = ITEMS.register("fighters_bindings", () ->
            new SwordItem(ModItemTier.STEEL_L, 3, 0.0F, new Item.Properties().group(Dungeons.TAB).setNoRepair())); // UNIQUE


    //Armor ONLY
    public static final RegistryObject<ArmorItem> SCALE_MAIL = ITEMS.register("scale_mail", () ->
            new ArmorItem(ModArmorMaterial.SCALE_MAIL_TYPE, EquipmentSlotType.CHEST, new Item.Properties().group(Dungeons.TAB)));

    public static final RegistryObject<ArmorItem> HIGHLAND_ARMOR_CHESTPLATE = ITEMS.register("highland_armor_chestplate", () ->
            new ArmorItem(ModArmorMaterial.HIGHLAND_ARMOR_TYPE, EquipmentSlotType.CHEST, new Item.Properties().group(Dungeons.TAB)));

    public static final RegistryObject<ArmorItem> HIGHLAND_ARMOR_HELMET = ITEMS.register("highland_armor_helmet", () ->
            new ArmorItem(ModArmorMaterial.HIGHLAND_ARMOR_TYPE, EquipmentSlotType.HEAD, new Item.Properties().group(Dungeons.TAB)));


}
