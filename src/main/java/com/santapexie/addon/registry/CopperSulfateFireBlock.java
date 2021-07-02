package com.santapexie.addon.registry;


import com.santapexie.addon.AddOnMod;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.*;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;


public class CopperSulfateFireBlock extends AbstractFireBlock {
    public static final Tag<Block> COPPER_SULFATE_BASE_BLOCKS = TagRegistry.block(Identifier.tryParse("copper_sulfate_base_blocks"));
    public final float damage;

    public CopperSulfateFireBlock(Settings settings, float damage) {
        super(settings, 2.0F);
        this.damage = damage;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return this.canPlaceAt(state, world, pos) ? this.getDefaultState() : Blocks.AIR.getDefaultState();
    }


    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return isCopperSulfateBase(world, world.getBlockState(pos.down()), pos);
    }

    public static boolean isCopperSulfateBase(BlockView world, BlockState state, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return world.getBlockState(blockPos).isSideSolidFullSquare(world, blockPos, Direction.UP) && state.isIn(AddOnMod.COPPER_SULFATE_BASE_BLOCKS);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        super.onBlockAdded(state, world, pos, oldState, notify);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }
}

