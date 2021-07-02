package com.santapexie.addon.mixin;


import com.santapexie.addon.registry.WaxedBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Blocks.class)
public class BlocksMixin {
    @Redirect(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=waxed_copper_block")),
            at = @At(value = "NEW", target = "Lnet/minecraft/block/Block;", ordinal = 0))
    private static Block mixin(AbstractBlock.Settings abs) {
        return new WaxedBlock(abs);
    }
}
