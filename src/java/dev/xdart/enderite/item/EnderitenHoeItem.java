package dev.xdart.enderite.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitenHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1444, 9f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("enderite:enderiten_hoe_repair_items")));

	public EnderitenHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -2.7f, properties);
	}
}