package com.santapexie.addon;

import com.google.common.collect.ImmutableBiMap;
import com.santapexie.addon.registry.ModBlocks;
import net.minecraft.item.Items;

public class WaxingHooks {
    public static ImmutableBiMap.Builder addEntries(ImmutableBiMap.Builder builder) {
        return builder.put(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB).put(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB).put(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB).put(ModBlocks.COPPER_CHAIN, ModBlocks.WAXED_COPPER_CHAIN).put(ModBlocks.EXPOSED_COPPER_CHAIN, ModBlocks.WAXED_EXPOSED_COPPER_CHAIN).put(ModBlocks.WEATHERED_COPPER_CHAIN, ModBlocks.WAXED_WEATHERED_COPPER_CHAIN);    }
}
