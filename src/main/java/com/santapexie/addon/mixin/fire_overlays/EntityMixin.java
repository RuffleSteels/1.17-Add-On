package com.santapexie.addon.mixin.fire_overlays;

import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin implements OnCopperSulfateFireAccessor, OnSoulFireAccessor {
    private static final TrackedData<Boolean> ON_COPPER_SULFATE_FIRE = DataTracker.registerData(Entity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Boolean> ON_SOUL_FIRE = DataTracker.registerData(Entity.class, TrackedDataHandlerRegistry.BOOLEAN);

    @Shadow
    public World world;

    @Final
    @Shadow
    protected DataTracker dataTracker;

    @Shadow
    public abstract int getFireTicks();

    @Override
    public boolean getOnSoulFire() {
        return dataTracker.get(ON_SOUL_FIRE);
    }

    @Override
    public void setOnSoulFire(boolean onSoulFire) {
        dataTracker.set(ON_SOUL_FIRE, onSoulFire);
    }

    @Override
    public boolean getOnCopperSulfateFire() {
        return dataTracker.get(ON_COPPER_SULFATE_FIRE);
    }

    @Override
    public void setOnCopperSulfateFire(boolean onCopperSulfateFire) {
        dataTracker.set(ON_COPPER_SULFATE_FIRE, onCopperSulfateFire);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo callbackInfo) {
        if (!world.isClient && getFireTicks() <= 0 && getOnCopperSulfateFire()) {
            setOnCopperSulfateFire(false);
        }
        if (!world.isClient && getFireTicks() <= 0 && getOnSoulFire()) {
            setOnSoulFire(false);
        }
    }

    @Inject(method = "readNbt", at = @At("TAIL"))
    private void readNbt(NbtCompound nbt, CallbackInfo callbackInfo) {
        setOnCopperSulfateFire(nbt.getBoolean("OnSoulFire"));
        setOnSoulFire(nbt.getBoolean("OnSoulFire"));
    }

    @Inject(method = "writeNbt", at = @At("TAIL"))
    private void writeNbt(NbtCompound nbt, CallbackInfoReturnable<NbtCompound> callbackInfo) {
        nbt.putBoolean("OnSoulFire", getOnCopperSulfateFire());
        nbt.putBoolean("OnSoulFire", getOnSoulFire());
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(CallbackInfo callbackInfo) {
        dataTracker.startTracking(ON_COPPER_SULFATE_FIRE, false);
        dataTracker.startTracking(ON_SOUL_FIRE, false);
    }
}
