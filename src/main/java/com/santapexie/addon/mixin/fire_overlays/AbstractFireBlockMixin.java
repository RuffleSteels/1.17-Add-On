package com.santapexie.addon.mixin.fire_overlays;

import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import com.santapexie.addon.registry.CopperSulfateFireBlock;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoulFireBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractFireBlock.class)
public class AbstractFireBlockMixin {
    @Inject(method = "onEntityCollision", at = @At("HEAD"))
    private void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, CallbackInfo callbackInfo) {
        ((OnCopperSulfateFireAccessor) entity).setOnCopperSulfateFire(state.getBlock() instanceof CopperSulfateFireBlock);
        ((OnSoulFireAccessor) entity).setOnSoulFire(state.getBlock() instanceof SoulFireBlock);
    }

}