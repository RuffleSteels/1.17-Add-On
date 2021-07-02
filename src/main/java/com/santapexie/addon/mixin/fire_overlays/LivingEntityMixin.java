package com.santapexie.addon.mixin.fire_overlays;

import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @ModifyVariable(method = "damage", at = @At("HEAD"))
    private float damage(float amount, DamageSource source) {
        if (source == DamageSource.ON_FIRE && ((OnSoulFireAccessor) this).getOnSoulFire()) {
            return amount * 2;
        }
        if (source == DamageSource.ON_FIRE && ((OnCopperSulfateFireAccessor) this).getOnCopperSulfateFire()) {
            return amount * 2;
        }
        return amount;
    }
}