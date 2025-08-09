package com.empando.bitecraft.block.entity;

import com.empando.bitecraft.BiteCraft;
import com.empando.bitecraft.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BiteCraft.MODID);

    public static final Supplier<BlockEntityType<CheesePressBlockEntity>> CHEESE_PRESS_BE =
            BLOCK_ENTITIES.register("cheese_press_be", () -> BlockEntityType.Builder.of(
                    CheesePressBlockEntity::new, ModBlocks.CHEESE_PRESS.get()).build(null));

    public static final Supplier<BlockEntityType<DryingRackBlockEntity>> DRYNG_RACK_BE =
            BLOCK_ENTITIES.register("dryng_rack_be", () -> BlockEntityType.Builder.of(
                    DryingRackBlockEntity::new, ModBlocks.DRYNG_RACK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
