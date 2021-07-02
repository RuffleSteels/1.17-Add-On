package com.santapexie.addon.mixin;

import com.santapexie.addon.registry.ModItems;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PowderSnowBlock.class)
public class PowderSnowMixin {
    @Inject(method = "canWalkOnPowderSnow(Lnet/minecraft/entity/Entity;)Z", at = @At("HEAD"), cancellable = true)
    private static void mixin(Entity entity, CallbackInfoReturnable<Boolean> ci) {
        if(entity instanceof LivingEntity && ((LivingEntity)entity).getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.REINFORCED_LEATHER_BOOTS)) {
            ci.setReturnValue(true);
        }
    }
}
