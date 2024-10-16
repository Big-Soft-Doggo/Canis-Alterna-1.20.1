package net.nyx_whitefox.canisalterna.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.nyx_whitefox.canisalterna.CanisAlterna;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CanisAlterna.MOD_ID, name));
        }
    }

    public static class Items {


        public static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CanisAlterna.MOD_ID, name));
        }
    }
}
