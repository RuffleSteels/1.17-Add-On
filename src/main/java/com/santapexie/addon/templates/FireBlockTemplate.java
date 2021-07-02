package com.santapexie.addon.templates;

import net.minecraft.block.BlockState;
import net.minecraft.block.FireBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class FireBlockTemplate extends FireBlock {

    public FireBlockTemplate(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getStateForPosition(BlockView world, BlockPos pos) {
        return super.getStateForPosition(world, pos);
    }
}
