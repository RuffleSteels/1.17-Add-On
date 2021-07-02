package com.santapexie.addon.mixin;

import com.santapexie.addon.AddOnMod;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {


    @Inject(method = "wearsGoldArmor(Lnet/minecraft/entity/LivingEntity;)Z", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"), cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    private static void wearsGoldArmorInject(LivingEntity entity, CallbackInfoReturnable<Boolean> cir, Iterable<ItemStack> iterable, Iterator iterator, ItemStack stack, Item item) {
        if (stack.isIn(AddOnMod.PIGLIN_SAFE_ARMOR)) {
            cir.setReturnValue(true);
        }
    }
}
