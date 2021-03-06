package com.santapexie.addon.mixin.fire_overlays;

import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.hit.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(PersistentProjectileEntity.class)
public abstract class PersistentProjectileEntityMixin {
    @Inject(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;setOnFireFor(I)V"), locals = LocalCapture.CAPTURE_FAILSOFT)
    private void onEntityHit(EntityHitResult entityHitResult, CallbackInfo callbackInfo, Entity entity) {
        if (((OnCopperSulfateFireAccessor) this).getOnCopperSulfateFire()) {
            ((OnCopperSulfateFireAccessor) entity).setOnCopperSulfateFire(true);
        }
        if (((OnSoulFireAccessor) this).getOnSoulFire()) {
            ((OnSoulFireAccessor) entity).setOnSoulFire(true);
        }
    }
}