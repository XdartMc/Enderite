/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xdart.enderite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import dev.xdart.enderite.block.EnderiteOreBlock;
import dev.xdart.enderite.block.EnderiteBlockBlock;
import dev.xdart.enderite.EnderiteMod;

public class EnderiteModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EnderiteMod.MODID);
	public static final DeferredBlock<Block> ENDERITE_ORE;
	public static final DeferredBlock<Block> ENDERITE_BLOCK;
	static {
		ENDERITE_ORE = register("enderite_ore", EnderiteOreBlock::new);
		ENDERITE_BLOCK = register("enderite_block", EnderiteBlockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}