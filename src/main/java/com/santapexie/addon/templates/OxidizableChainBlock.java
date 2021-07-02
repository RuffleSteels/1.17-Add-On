package com.santapexie.addon.templates;

import com.sun.net.httpserver.Filter;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class OxidizableChainBlock extends ChainBlock implements Oxidizable {
    private final OxidizationLevel oxidizationLevel;

    public OxidizableChainBlock(OxidizationLevel oxidizationLevel, AbstractBlock.Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public OxidizationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}
