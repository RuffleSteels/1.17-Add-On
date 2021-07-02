package com.santapexie.addon.base_tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.tag.BlockTags;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}