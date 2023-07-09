package net.yianni.immersive_vehicles.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yianni.immersive_vehicles.Immersive_Vehicles;
import net.yianni.immersive_vehicles.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Immersive_Vehicles.MOD_ID);

    public static final RegistryObject<PlacedFeature> RUBBER_TREE_CHECKED = PLACED_FEATURES.register("rubber_tree_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBBER_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.RUBBER_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> RUBBER_TREE_PLACED = PLACED_FEATURES.register("rubber_tree_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBBER_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
