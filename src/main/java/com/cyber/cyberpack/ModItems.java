package com.cyber.cyberpack;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
        DeferredRegister.createItems("cyberpack");

    // Sword: 12 Damage
    public static final DeferredHolder<Item, SwordItem> CYBER_SWORD = 
        ITEMS.register("cyber_sword", () -> 
        new SwordItem(CyberTiers.CYBER, 7, -2.4F, new Item.Properties()));

    // Spear: 12 Damage
    public static final DeferredHolder<Item, SwordItem> CYBER_SPEAR = 
        ITEMS.register("cyber_spear", () -> 
        new SwordItem(CyberTiers.CYBER, 7, -2.0F, new Item.Properties()));

    // Pickaxe: 8 Damage
    public static final DeferredHolder<Item, PickaxeItem> CYBER_PICKAXE = 
        ITEMS.register("cyber_pickaxe", () -> 
        new PickaxeItem(CyberTiers.CYBER, 3, -2.8F, new Item.Properties()));

    // Axe: 8 Damage
    public static final DeferredHolder<Item, AxeItem> CYBER_AXE = 
        ITEMS.register("cyber_axe", () -> 
        new AxeItem(CyberTiers.CYBER, 3, -3.0F, new Item.Properties()));

    // Hoe: 7 Damage
    public static final DeferredHolder<Item, HoeItem> CYBER_HOE = 
        ITEMS.register("cyber_hoe", () -> 
        new HoeItem(CyberTiers.CYBER, 2, -1.0F, new Item.Properties()));

    // Shovel: 5 Damage
    public static final DeferredHolder<Item, ShovelItem> CYBER_SHOVEL = 
        ITEMS.register("cyber_shovel", () -> 
        new ShovelItem(CyberTiers.CYBER, 0, -3.0F, new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
