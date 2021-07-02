package com.santapexie.addon;

import com.google.common.collect.ImmutableBiMap;
import com.santapexie.addon.registry.ModBlocks;
import net.minecraft.block.Blocks;

public class OxidizableHooks {
    public static ImmutableBiMap.Builder addEntries(ImmutableBiMap.Builder builder) {
        return builder.put(ModBlocks.COPPER_SLAB, ModBlocks.EXPOSED_COPPER_SLAB).put(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_SLAB).put(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.OXIDIZED_COPPER_SLAB).put(ModBlocks.COPPER_CHAIN, ModBlocks.EXPOSED_COPPER_CHAIN).put(ModBlocks.EXPOSED_COPPER_CHAIN, ModBlocks.WEATHERED_COPPER_CHAIN).put(ModBlocks.WEATHERED_COPPER_CHAIN, ModBlocks.OXIDIZED_COPPER_CHAIN);
    }
}