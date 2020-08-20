package com.hackerwitha3.dungeons.items;

import com.hackerwitha3.dungeons.Dungeons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Dungeons.TAB));

    }
}
