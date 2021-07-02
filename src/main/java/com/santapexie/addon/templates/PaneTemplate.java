package com.santapexie.addon.templates;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;

public class PaneTemplate extends PaneBlock {
    public PaneTemplate(Block base) {
        super(FabricBlockSettings.copy(base));
    }

}
