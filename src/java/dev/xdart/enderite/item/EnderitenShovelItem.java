package dev.xdart.enderite.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitenShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1444, 9f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("enderite:enderiten_shovel_repair_items")));

	public EnderitenShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -2.7f, properties);
	}
}