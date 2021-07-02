package com.santapexie.addon.mixin.fire_overlays;

import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ZombieEntity.class)
public abstract class ZombieEntityMixin {
    @Inject(method = "tryAttack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;setOnFireFor(I)V"))
    private void tryAttack(Entity target, CallbackInfoReturnable<Boolean> callbackInfo) {
        if (((OnCopperSulfateFireAccessor) this).getOnCopperSulfateFire()) {
            ((OnCopperSulfateFireAccessor) target).setOnCopperSulfateFire(true);
        }
        if (((OnSoulFireAccessor) this).getOnSoulFire()) {
            ((OnSoulFireAccessor) target).setOnSoulFire(true);
        }
    }
}