package com.santapexie.addon;

import com.santapexie.addon.client.particles.CopperSulfateParticle;
import com.santapexie.addon.interfaces.OnCopperSulfateFireAccessor;
import com.santapexie.addon.interfaces.OnSoulFireAccessor;
import com.santapexie.addon.registry.ModBlocks;
import com.santapexie.addon.registry.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AddOnMod implements ModInitializer, ClientModInitializer {

    public static DefaultParticleType COPPER_SULFATE_PARTICLE;

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
        renderTransparent(ModBlocks.COPPER_SULFATE_TORCH);
        renderTransparent(ModBlocks.COPPER_SULFATE_WALL_TORCH);
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            return tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack);
        }, ModItems.REINFORCED_LEATHER_BOOTS, ModItems.REINFORCED_LEATHER_LEGGINGS, ModItems.REINFORCED_LEATHER_CHESTPLATE, ModItems.REINFORCED_LEATHER_HELMET);
    }

    public static Identifier id(String path) {
        return new Identifier(AddOnMod.MOD_ID, path);
    }

    @Override
    public void onInitializeClient() {
        COPPER_SULFATE_PARTICLE = Registry.register(Registry.PARTICLE_TYPE, AddOnMod.id("copper_sulfate_particle"), FabricParticleTypes.simple(false));
        ParticleFactoryRegistry.getInstance().register(COPPER_SULFATE_PARTICLE, CopperSulfateParticle.Factory::new);
    }
}
