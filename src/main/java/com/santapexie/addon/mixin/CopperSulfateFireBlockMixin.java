package com.santapexie.addon.mixin;

import com.santapexie.addon.registry.CopperSulfateFireBlock;
import com.santapexie.addon.registry.ModBlocks;
import com.santapexie.addon.templates.FireBlockTemplate;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFireBlock.class)
public class CopperSulfateFireBlockMixin {
    @Inject(method = "getState", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/SoulFireBlock;isSoulBase(Lnet/minecraft/block/BlockState;)Z"), cancellable = true)
    private static void mixin(BlockView world, BlockPos pos, CallbackInfoReturnable<BlockState> ci) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if(CopperSulfateFireBlock.isCopperSulfateBase(world, blockState, pos)) {
            ci.setReturnValue(ModBlocks.COPPER_SULFATE_FIRE_BLOCK.getDefaultState());
        }
    }
}



