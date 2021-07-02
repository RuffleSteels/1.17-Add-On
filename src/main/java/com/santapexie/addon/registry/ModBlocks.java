package com.santapexie.addon.registry;


import com.ibm.icu.text.MessagePattern;
import com.santapexie.addon.AddOnMod;
import com.santapexie.addon.templates.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    //Slabs
    public static final SlabTemplate AMETHYST_SLAB = new SlabTemplate(Blocks.AMETHYST_BLOCK);
    public static final OxidizableSlabBlock COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK));
    public static final OxidizableSlabBlock EXPOSED_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER));
    public static final OxidizableSlabBlock WEATHERED_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER));
    public static final OxidizableSlabBlock OXIDIZED_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER));
    public static final SlabTemplate WAXED_COPPER_SLAB = new SlabTemplate(Blocks.WAXED_COPPER_BLOCK);
    public static final SlabTemplate WAXED_EXPOSED_COPPER_SLAB = new SlabTemplate(Blocks.WAXED_EXPOSED_COPPER);
    public static final SlabTemplate WAXED_WEATHERED_COPPER_SLAB = new SlabTemplate(Blocks.WAXED_WEATHERED_COPPER);

    //Stairs
    public static final StairTemplate AMETHYST_STAIRS = new StairTemplate(Blocks.AMETHYST_BLOCK);

    //Misc
    public static final OxidizableChainBlock COPPER_CHAIN = new OxidizableChainBlock(Oxidizable.OxidizationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final OxidizableChainBlock EXPOSED_COPPER_CHAIN = new OxidizableChainBlock(Oxidizable.OxidizationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final OxidizableChainBlock WEATHERED_COPPER_CHAIN = new OxidizableChainBlock(Oxidizable.OxidizationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final OxidizableChainBlock OXIDIZED_COPPER_CHAIN = new OxidizableChainBlock(Oxidizable.OxidizationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final ChainBlock WAXED_COPPER_CHAIN = new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final ChainBlock WAXED_EXPOSED_COPPER_CHAIN = new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final ChainBlock WAXED_WEATHERED_COPPER_CHAIN = new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN));
    public static final PaneTemplate COPPER_BARS = new PaneTemplate(Blocks.IRON_BARS);
    public static final TorchTemplate COPPER_SULFATE_TORCH = new TorchTemplate(AbstractBlock.Settings.copy(Blocks.TORCH), ParticleTypes.ANGRY_VILLAGER);
    public static final WallTorchTemplate COPPER_SULFATE_WALL_TORCH = new WallTorchTemplate(AbstractBlock.Settings.copy(Blocks.WALL_TORCH), ParticleTypes.ANGRY_VILLAGER);

    //Fire
    public static final CopperSulfateFireBlock COPPER_SULFATE_FIRE_BLOCK = new CopperSulfateFireBlock(FabricBlockSettings.of(Material.FIRE, MapColor.GREEN).noCollision().breakInstantly().luminance(10), 2.0F);

    public static void registerBlocks() {
        //Slab
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "amethyst_slab"), AMETHYST_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "copper_slab"), COPPER_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "exposed_copper_slab"), EXPOSED_COPPER_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "weathered_copper_slab"), WEATHERED_COPPER_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "oxidized_copper_slab"), OXIDIZED_COPPER_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "waxed_copper_slab"), WAXED_COPPER_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "waxed_exposed_copper_slab"), WAXED_EXPOSED_COPPER_SLAB);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "waxed_weathered_copper_slab"), WAXED_WEATHERED_COPPER_SLAB);

        //Stairs
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "amethyst_stairs"), AMETHYST_STAIRS);

        //Misc
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "copper_chain"), COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "exposed_copper_chain"), EXPOSED_COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "weathered_copper_chain"), WEATHERED_COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "oxidized_copper_chain"), OXIDIZED_COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "waxed_copper_chain"), WAXED_COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "waxed_exposed_copper_chain"), WAXED_EXPOSED_COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "waxed_weathered_copper_chain"), WAXED_WEATHERED_COPPER_CHAIN);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "copper_bars"), COPPER_BARS);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "copper_sulfate_torch"), COPPER_SULFATE_TORCH);
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "copper_sulfate_wall_torch"), COPPER_SULFATE_WALL_TORCH);

        //Fire
        Registry.register(net.minecraft.util.registry.Registry.BLOCK, new Identifier(AddOnMod.MOD_ID, "copper_sulfate_fire_block"), COPPER_SULFATE_FIRE_BLOCK);
    }
}












