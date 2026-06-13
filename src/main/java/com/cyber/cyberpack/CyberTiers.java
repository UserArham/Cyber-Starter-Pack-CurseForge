package com.cyber.cyberpack;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import java.util.function.Supplier;

public enum CyberTiers implements Tier {
    CYBER(4, 3000, 12.0F, 5.0F, 22, 
    () -> Ingredient.of(Items.NETHERITE_INGOT));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    CyberTiers(int lvl, int u, float spd, float dmg, int ench, Supplier<Ingredient> rep) {
        this.level = lvl;
        this.uses = u;
        this.speed = spd;
        this.damage = dmg;
        this.enchantmentValue = ench;
        this.repairIngredient = rep;
    }

    @Override public int getUses() { return this.uses; }
    @Override public float getSpeed() { return this.speed; }
    @Override public float getAttackDamageBonus() { return this.damage; }
    @Override public int getLevel() { return this.level; }
    @Override public int getEnchantmentValue() { return this.enchantmentValue; }
    @Override public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }
}
