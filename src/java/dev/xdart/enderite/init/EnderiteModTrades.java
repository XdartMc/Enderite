/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package dev.xdart.enderite.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class EnderiteModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 30), new ItemStack(EnderiteModItems.ENDERITE_UPGRADE.get()), 4, 30, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 27), new ItemStack(EnderiteModItems.ENDERITE_UPGRADE.get()), 1, 5, 1f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND_HELMET), new ItemStack(Items.EMERALD, 35), new ItemStack(EnderiteModItems.ENDERITE_HELMET.get()), 1, 30, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(Items.EMERALD, 35), new ItemStack(EnderiteModItems.ENDERITE_CHESTPLATE.get()), 1, 30, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(Items.EMERALD, 35), new ItemStack(EnderiteModItems.ENDERITE_LEGGINGS.get()), 1, 30, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.EMERALD, 35), new ItemStack(EnderiteModItems.ENDERITE_BOOTS.get()), 1, 30, 0.05f));
		}
	}
}