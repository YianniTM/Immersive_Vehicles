package net.yianni.immersive_vehicles.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yianni.immersive_vehicles.Immersive_Vehicles;
import net.yianni.immersive_vehicles.block.custom.ModFlammableRotatedPillarBlock;
import net.yianni.immersive_vehicles.item.ModCreativeModeTab;
import net.yianni.immersive_vehicles.item.ModItems;
import net.yianni.immersive_vehicles.world.feature.tree.RubberTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Immersive_Vehicles.MOD_ID);

    public static final RegistryObject<Block> RUBBER_BLOCK = registerBlock("rubber_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.WEB)
                    .instabreak()), ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> RUBBER_LOG = registerBlock("rubber_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> RUBBER_WOOD = registerBlock("rubber_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> STRIPPED_RUBBER_LOG = registerBlock("stripped_rubber_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> STRIPPED_RUBBER_WOOD = registerBlock("stripped_rubber_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> RUBBER_PLANKS = registerBlock("rubber_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            }, ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> RUBBER_LEAVES = registerBlock("rubber_leaves",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    public static final RegistryObject<Block> RUBBER_SAPLING = registerBlock("rubber_sapling",
            () -> new SaplingBlock(new RubberTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.IMMERSIVE_VEHICLES_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                         CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}