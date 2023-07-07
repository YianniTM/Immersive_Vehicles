package net.yianni.immersive_vehicles.item;

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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> WIRE_CUTTER = ITEMS.register("wire_cutter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> METAL_PLATING = ITEMS.register("metal_plating",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> GEAR = ITEMS.register("gear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> CYLINDER = ITEMS.register("cylinder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> ENGINE = ITEMS.register("engine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> CHASSIS = ITEMS.register("chassis",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> BATTERY = ITEMS.register("battery",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> TRANSMISSION = ITEMS.register("transmission",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> RADIATOR = ITEMS.register("radiator",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static final RegistryObject<Item> WHEEL = ITEMS.register("wheel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMERSIVE_VEHICLES_ITEMS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
