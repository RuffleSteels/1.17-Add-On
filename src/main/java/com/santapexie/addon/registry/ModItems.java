package com.santapexie.addon.registry;

import com.santapexie.addon.AddOnMod;
import com.santapexie.addon.base_tools.AxeBase;
import com.santapexie.addon.base_tools.HoeBase;
import com.santapexie.addon.base_tools.PickaxeBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {

    //Tools
    public static ToolItem ROSE_GOLD_SWORD = new SwordItem(RoseGoldTools.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ROSE_GOLD_SHOVEL = new ShovelItem(RoseGoldTools.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ROSE_GOLD_PICKAXE = new PickaxeBase(new RoseGoldTools(), 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ROSE_GOLD_AXE = new AxeBase(new RoseGoldTools(), 6.0F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ROSE_GOLD_HOE = new HoeBase(new RoseGoldTools(), 0, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

    //Armor
    public static final ArmorMaterial ROSE_GOLD_ARMOR = new RoseGoldArmorMaterial();
    public static final ArmorMaterial PLATED_NETHERITE_ARMOR = new PlatedNetheriteArmorMaterial();
    public static final ArmorMaterial REINFORCED_LEATHER_ARMOR = new ReinforcedLeatherArmorMaterial();
    public static final Item ROSE_GOLD_HELMET = new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item ROSE_GOLD_CHESTPLATE = new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item ROSE_GOLD_LEGGINGS = new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item ROSE_GOLD_BOOTS = new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PLATED_NETHERITE_HELMET = new ArmorItem(PLATED_NETHERITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PLATED_NETHERITE_CHESTPLATE = new ArmorItem(PLATED_NETHERITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PLATED_NETHERITE_LEGGINGS = new ArmorItem(PLATED_NETHERITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item PLATED_NETHERITE_BOOTS = new ArmorItem(PLATED_NETHERITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item REINFORCED_LEATHER_HELMET = new DyeableArmorItem(REINFORCED_LEATHER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item REINFORCED_LEATHER_CHESTPLATE = new DyeableArmorItem(REINFORCED_LEATHER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item REINFORCED_LEATHER_LEGGINGS = new DyeableArmorItem(REINFORCED_LEATHER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item REINFORCED_LEATHER_BOOTS = new DyeableArmorItem(REINFORCED_LEATHER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));

    //Items
    public static final Item COPPER_NUGGET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    //Block Items
    public static final BlockItem AMETHYST_SLAB = new BlockItem(ModBlocks.AMETHYST_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem AMETHYST_STAIRS = new BlockItem(ModBlocks.AMETHYST_STAIRS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem COPPER_SULFATE_TORCH = new BlockItem(ModBlocks.COPPER_SULFATE_TORCH, new Item.Settings().group(ItemGroup.MATERIALS));

    public static final BlockItem COPPER_CHAIN = new BlockItem(ModBlocks.COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem EXPOSED_COPPER_CHAIN = new BlockItem(ModBlocks.EXPOSED_COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WEATHERED_COPPER_CHAIN = new BlockItem(ModBlocks.WEATHERED_COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem OXIDIZED_COPPER_CHAIN = new BlockItem(ModBlocks.OXIDIZED_COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WAXED_COPPER_CHAIN = new BlockItem(ModBlocks.WAXED_COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WAXED_EXPOSED_COPPER_CHAIN = new BlockItem(ModBlocks.WAXED_EXPOSED_COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WAXED_WEATHERED_COPPER_CHAIN = new BlockItem(ModBlocks.WAXED_WEATHERED_COPPER_CHAIN, new Item.Settings().group(ItemGroup.DECORATIONS));


    public static final BlockItem COPPER_BARS = new BlockItem(ModBlocks.COPPER_BARS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem COPPER_SLAB = new BlockItem(ModBlocks.COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem EXPOSED_COPPER_SLAB = new BlockItem(ModBlocks.EXPOSED_COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WEATHERED_COPPER_SLAB = new BlockItem(ModBlocks.WEATHERED_COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem OXIDIZED_COPPER_SLAB = new BlockItem(ModBlocks.OXIDIZED_COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WAXED_COPPER_SLAB = new BlockItem(ModBlocks.WAXED_COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WAXED_EXPOSED_COPPER_SLAB = new BlockItem(ModBlocks.WAXED_EXPOSED_COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WAXED_WEATHERED_COPPER_SLAB = new BlockItem(ModBlocks.WAXED_WEATHERED_COPPER_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registerItems() {
        //BlockItems
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "amethyst_slab"), AMETHYST_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "amethyst_stairs"), AMETHYST_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "copper_chain"), COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "exposed_copper_chain"), EXPOSED_COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "weathered_copper_chain"), WEATHERED_COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "waxed_copper_chain"), WAXED_COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "waxed_exposed_copper_chain"), WAXED_EXPOSED_COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "waxed_weathered_copper_chain"), WAXED_WEATHERED_COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "oxidized_copper_chain"), OXIDIZED_COPPER_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "copper_bars"), COPPER_BARS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "copper_slab"), COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "exposed_copper_slab"), EXPOSED_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "weathered_copper_slab"), WEATHERED_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "oxidized_copper_slab"), OXIDIZED_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "waxed_copper_slab"), WAXED_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "waxed_exposed_copper_slab"), WAXED_EXPOSED_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "waxed_weathered_copper_slab"), WAXED_WEATHERED_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "copper_sulfate_torch"), COPPER_SULFATE_TORCH);

        //Armor
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_helmet"), ROSE_GOLD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_chestplate"), ROSE_GOLD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_leggings"), ROSE_GOLD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_boots"), ROSE_GOLD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "plated_netherite_helmet"), PLATED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "plated_netherite_chestplate"), PLATED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "plated_netherite_leggings"), PLATED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "plated_netherite_boots"), PLATED_NETHERITE_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "reinforced_leather_helmet"), REINFORCED_LEATHER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "reinforced_leather_chestplate"), REINFORCED_LEATHER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "reinforced_leather_leggings"), REINFORCED_LEATHER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "reinforced_leather_boots"), REINFORCED_LEATHER_BOOTS);

        //Tools
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_sword"), ROSE_GOLD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_shovel"), ROSE_GOLD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_pickaxe"), ROSE_GOLD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_axe"), ROSE_GOLD_AXE);
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "rose_gold_hoe"), ROSE_GOLD_HOE);

        //Items
        Registry.register(Registry.ITEM, new Identifier(AddOnMod.MOD_ID, "copper_nugget"), COPPER_NUGGET);
    }
}
