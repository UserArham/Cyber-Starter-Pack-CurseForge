package com.cyber.cyberpack;

import net.neoforged.bus.api.IEventBus;
import net.fml.common.Mod;

@Mod("cyberpack")
public class CyberPackMod {
    public CyberPackMod(IEventBus modEventBus) {
        ModItems.register(modEventBus);
    }
}
