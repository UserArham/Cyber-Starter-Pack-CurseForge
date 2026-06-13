package com.cyber.cyberpack;

import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = "cyberpack")
public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    // Base hand (1) + Material (8) + Tool Modifier = Your Target Damage
    public static final ItemSword CYBER_SWORD = new ItemSword(ModMaterials.CYBER);
    public static final ItemSword CYBER_SPEAR = new ItemSword(ModMaterials.CYBER);
    public static final ItemPickaxe CYBER_PICKAXE = new CustomPickaxe(ModMaterials.CYBER);
    public static final ItemAxe CYBER_AXE = new CustomAxe(ModMaterials.CYBER, 8.0F, -3.0F);
    public static final ItemHoe CYBER_HOE = new CustomHoe(ModMaterials.CYBER);
    public static final ItemSpade CYBER_SHOVEL = new CustomShovel(ModMaterials.CYBER);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        
        register(r, CYBER_SWORD, "cyber_sword");
        register(r, CYBER_SPEAR, "cyber_spear");
        register(r, CYBER_PICKAXE, "cyber_pickaxe");
        register(r, CYBER_AXE, "cyber_axe");
        register(r, CYBER_HOE, "cyber_hoe");
        register(r, CYBER_SHOVEL, "cyber_shovel");
    }

    private static void register(IForgeRegistry<Item> r, Item item, String name) {
        item.setRegistryName(name);
        item.setUnlocalizedName(name);
        item.setCreativeTab(net.minecraft.creativetab.CreativeTabs.COMBAT);
        r.register(item);
        ITEMS.add(item);
    }

    // Custom overrides to force 1.12.2 to match your exact requested stats
    public static class CustomPickaxe extends ItemPickaxe { 
        public CustomPickaxe(ToolMaterial m) { super(m); this.attackDamage = 8.0F; } 
    }
    public static class CustomAxe extends ItemAxe { 
        public CustomAxe(ToolMaterial m, float dmg, float spd) { super(m, dmg, spd); } 
    }
    public static class CustomHoe extends ItemHoe { 
        public CustomHoe(ToolMaterial m) { super(m); this.speedOnBreakingBlock = 7.0F; } 
    }
    public static class CustomShovel extends ItemSpade { 
        public CustomShovel(ToolMaterial m) { super(m); this.attackDamage = 5.0F; } 
    }
}
