package dev.xdart.enderite.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderiteUpgradeItem extends Item {
	public EnderiteUpgradeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(16));
	}
}