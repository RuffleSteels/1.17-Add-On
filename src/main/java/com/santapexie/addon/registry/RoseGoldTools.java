package com.santapexie.addon.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;


public class RoseGoldTools implements ToolMaterial {

    public static final RoseGoldTools INSTANCE = new RoseGoldTools();

    @Override
    public int getDurability() {
        return ToolMaterials.IRON.getDurability();
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return ToolMaterials.GOLD.getMiningSpeedMultiplier();
    }

    @Override
    public float getAttackDamage() {
        return ToolMaterials.GOLD.getAttackDamage();
    }

    @Override
    public int getMiningLevel() {
        return ToolMaterials.IRON.getMiningLevel();
    }

    @Override
    public int getEnchantability() {
        return ToolMaterials.GOLD.getEnchantability();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}
