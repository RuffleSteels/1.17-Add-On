package com.santapexie.addon.templates;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class StairTemplate extends StairsBlock {
    public StairTemplate(Block base) {
        super(base.getDefaultState(), FabricBlockSettings.copy(base));
    }

}
