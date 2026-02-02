/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xdart.enderite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import dev.xdart.enderite.item.*;
import dev.xdart.enderite.EnderiteMod;

public class EnderiteModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EnderiteMod.MODID);
	public static final DeferredItem<Item> ENDERITE_ORE;
	public static final DeferredItem<Item> ENDERITE_NUGGET;
	public static final DeferredItem<Item> ENDERITE_BLOCK;
	public static final DeferredItem<Item> ENDERITE_INGOT;
	public static final DeferredItem<Item> ENDERITE_HELMET;
	public static final DeferredItem<Item> ENDERITE_CHESTPLATE;
	public static final DeferredItem<Item> ENDERITE_LEGGINGS;
	public static final DeferredItem<Item> ENDERITE_BOOTS;
	public static final DeferredItem<Item> ENDERITE_UPGRADE;
	public static final DeferredItem<Item> ENDERITEN_PICKAXE;
	public static final DeferredItem<Item> ENDERITEN_AXE;
	public static final DeferredItem<Item> ENDERITEN_SWORD;
	public static final DeferredItem<Item> ENDERITEN_SHOVEL;
	public static final DeferredItem<Item> ENDERITEN_HOE;
	public static final DeferredItem<Item> ENDERSPIDER_SPAWN_EGG;
	static {
		ENDERITE_ORE = block(EnderiteModBlocks.ENDERITE_ORE);
		ENDERITE_NUGGET = register("enderite_nugget", EnderiteNuggetItem::new);
		ENDERITE_BLOCK = block(EnderiteModBlocks.ENDERITE_BLOCK);
		ENDERITE_INGOT = register("enderite_ingot", EnderiteIngotItem::new);
		ENDERITE_HELMET = register("enderite_helmet", EnderiteItem.Helmet::new);
		ENDERITE_CHESTPLATE = register("enderite_chestplate", EnderiteItem.Chestplate::new);
		ENDERITE_LEGGINGS = register("enderite_leggings", EnderiteItem.Leggings::new);
		ENDERITE_BOOTS = register("enderite_boots", EnderiteItem.Boots::new);
		ENDERITE_UPGRADE = register("enderite_upgrade", EnderiteUpgradeItem::new);
		ENDERITEN_PICKAXE = register("enderiten_pickaxe", EnderitenPickaxeItem::new);
		ENDERITEN_AXE = register("enderiten_axe", EnderitenAxeItem::new);
		ENDERITEN_SWORD = register("enderiten_sword", EnderitenSwordItem::new);
		ENDERITEN_SHOVEL = register("enderiten_shovel", EnderitenShovelItem::new);
		ENDERITEN_HOE = register("enderiten_hoe", EnderitenHoeItem::new);
		ENDERSPIDER_SPAWN_EGG = register("enderspider_spawn_egg", properties -> new SpawnEggItem(EnderiteModEntities.ENDERSPIDER.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}