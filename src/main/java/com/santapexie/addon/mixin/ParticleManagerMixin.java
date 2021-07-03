package com.santapexie.addon.mixin;

import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.particle.SoulParticle;
import net.minecraft.particle.ParticleTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleManager.class)
public class ParticleManagerMixin {
    @Inject(method = "registerDefaultFactories", at = @At("HEAD"))
    private void mixin(CallbackInfo ci) {
        this.registerFactory(ParticleTypes.COPPER_SULFATE, (ParticleManager.SpriteAwareFactory)(CopperSulfateParticle.Factory::new));
    }
}
