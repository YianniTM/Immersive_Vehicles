package net.yianni.immersive_vehicles.world.feature.tree;

import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yianni.immersive_vehicles.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class RubberTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pLargeHive) {
        return ModConfiguredFeatures.RUBBER_TREE.getHolder().get();
    }
}
