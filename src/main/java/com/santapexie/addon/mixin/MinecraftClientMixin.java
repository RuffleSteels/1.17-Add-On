package com.santapexie.addon.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ClientPlayerEntity.class)
public class MinecraftClientMixin {
    @Inject(method = "tick", at = @At("RETURN"))
    private void mixin(CallbackInfo ci) {
        if (MinecraftClient.getInstance().player.getInventory().getMainHandStack().isOf(Items.HONEYCOMB)) {
            System.out.println(MinecraftClient.getInstance().player.getInventory().getMainHandStack());
        }
    }
}
