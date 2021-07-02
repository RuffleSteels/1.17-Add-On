package com.santapexie.addon.templates;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;

public class SlabTemplate extends SlabBlock {
    public SlabTemplate(Block base) {
        super(FabricBlockSettings.copy(base));
    }
}
