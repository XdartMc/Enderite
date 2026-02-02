package dev.xdart.enderite.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderitenAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1444, 11f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("enderite:enderiten_axe_repair_items")));

	public EnderitenAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 12f, -3.4f, properties);
	}
}