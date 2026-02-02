/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xdart.enderite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import dev.xdart.enderite.EnderiteMod;

@EventBusSubscriber
public class EnderiteModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnderiteMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EnderiteModBlocks.ENDERITE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EnderiteModItems.ENDERITE_NUGGET.get());
			tabData.accept(EnderiteModItems.ENDERITE_INGOT.get());
			tabData.accept(EnderiteModItems.ENDERITE_UPGRADE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EnderiteModItems.ENDERITE_HELMET.get());
			tabData.accept(EnderiteModItems.ENDERITE_CHESTPLATE.get());
			tabData.accept(EnderiteModItems.ENDERITE_LEGGINGS.get());
			tabData.accept(EnderiteModItems.ENDERITE_BOOTS.get());
			tabData.accept(EnderiteModItems.ENDERITEN_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EnderiteModItems.ENDERITEN_PICKAXE.get());
			tabData.accept(EnderiteModItems.ENDERITEN_AXE.get());
			tabData.accept(EnderiteModItems.ENDERITEN_SHOVEL.get());
			tabData.accept(EnderiteModItems.ENDERITEN_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EnderiteModItems.ENDERSPIDER_SPAWN_EGG.get());
		}
	}
}