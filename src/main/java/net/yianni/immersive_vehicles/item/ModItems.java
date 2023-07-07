package net.yianni.immersive_vehicles.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yianni.immersive_vehicles.Immersive_Vehicles;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Immersive_Vehicles.MOD_ID);

    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
