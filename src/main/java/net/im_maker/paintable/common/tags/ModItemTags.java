package net.im_maker.paintable.common.tags;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.im_maker.paintable.Paintable;

public class ModItemTags {

    public static final TagKey<Item> PAINTABLE_STRIPPED_LOG = tag("paintable_stripped_log");
    public static final TagKey<Item> PAINTABLE_STRIPPED_WOOD = tag("paintable_stripped_wood");
    public static final TagKey<Item> COLORED_PAINT_BRUSH = tag("colored_paint_brush");

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(new ResourceLocation(Paintable.MOD_ID, name));
    }
}