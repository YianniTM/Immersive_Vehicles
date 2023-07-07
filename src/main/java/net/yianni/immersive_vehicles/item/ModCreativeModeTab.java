package net.yianni.immersive_vehicles.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.yianni.immersive_vehicles.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab IMMERSIVE_VEHICLES_ITEMS = new CreativeModeTab("immersive_vehicles_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COPPER_WIRE.get());
        }
    };

    public static final CreativeModeTab IMMERSIVE_VEHICLES_BLOCKS = new CreativeModeTab("immersive_vehicles_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RUBBER_BLOCK.get());
        }
    };
}
