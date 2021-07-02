package com.santapexie.addon;

import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import com.santapexie.addon.registry.ModBlocks;
import com.santapexie.addon.registry.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class AddOnMod implements ModInitializer, ClientModInitializer {

    public static final String MOD_ID = "addon";
    public static final Tag<Block> COPPER_SULFATE_BASE_BLOCKS = TagRegistry.block(new Identifier("addon", "copper_sulfate_base_blocks"));
    public static Tag<Item> PIGLIN_SAFE_ARMOR = TagRegistry.item(new Identifier("addon", "piglin_safe_armor"));

    protected void renderTransparent(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }

    @Override
    public void onInitialize() {
        ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {
                    if (alive) {
                        ((OnCopperSulfateFireAccessor) newPlayer).setOnCopperSulfateFire(((OnCopperSulfateFireAccessor) oldPlayer).getOnCopperSulfateFire());
                    }
                    if (alive) {
                        ((OnSoulFireAccessor) newPlayer).setOnSoulFire(((OnSoulFireAccessor) oldPlayer).getOnSoulFire());
                    }
                });
        renderTransparent(ModBlocks.COPPER_BARS);
        renderTransparent(ModBlocks.COPPER_CHAIN);
        renderTransparent(ModBlocks.EXPOSED_COPPER_CHAIN);
        renderTransparent(ModBlocks.WEATHERED_COPPER_CHAIN);
        renderTransparent(ModBlocks.OXIDIZED_COPPER_CHAIN);
        renderTransparent(ModBlocks.WAXED_COPPER_CHAIN);
        renderTransparent(ModBlocks.WAXED_EXPOSED_COPPER_CHAIN);
        renderTransparent(ModBlocks.WAXED_WEATHERED_COPPER_CHAIN);
        renderTransparent(ModBlocks.COPPER_SULFATE_FIRE_BLOCK);
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            return tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack);
        }, ModItems.REINFORCED_LEATHER_BOOTS, ModItems.REINFORCED_LEATHER_LEGGINGS, ModItems.REINFORCED_LEATHER_CHESTPLATE, ModItems.REINFORCED_LEATHER_HELMET);
    }

    @Override
    public void onInitializeClient() {

    }
}
