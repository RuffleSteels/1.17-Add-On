package com.santapexie.addon.registry;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class WaxedBlock extends Block {
    public static final BooleanProperty IS_HOLDING = BooleanProperty.of("isholding");

    public WaxedBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(IS_HOLDING, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(IS_HOLDING);
    }
}
