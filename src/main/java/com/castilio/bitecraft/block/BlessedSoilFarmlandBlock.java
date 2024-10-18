package com.castilio.bitecraft.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.piston.MovingPistonBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.util.TriState;


public class BlessedSoilFarmlandBlock extends FarmBlock {
    public BlessedSoilFarmlandBlock() {
        super(Properties.of()
                .sound(SoundType.ROOTED_DIRT)
                .strength(2.0f)
                .randomTicks()
        );
    }
    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockState blockstate = pLevel.getBlockState(pPos.above());
        if (blockstate.is(Blocks.BAMBOO) || blockstate.is(Blocks.CACTUS) || blockstate.is(Blocks.BAMBOO_SAPLING))
            return true;
        return !blockstate.isSolid() || blockstate.getBlock() instanceof FenceGateBlock || blockstate.getBlock() instanceof MovingPistonBlock;
    }

    @Override
    public TriState canSustainPlant(BlockState state, BlockGetter level, BlockPos soilPosition, Direction facing, BlockState plant) {
        if (facing != Direction.UP) return TriState.FALSE;
        if (plant.getBlock() instanceof CactusBlock)
            return TriState.TRUE;

        if (plant.getBlock() instanceof SugarCaneBlock)
            return TriState.TRUE;

        if (plant.getBlock() == Blocks.BAMBOO || plant.getBlock() == Blocks.BAMBOO_SAPLING)
            return TriState.TRUE;

        if (plant.getBlock() == Blocks.NETHER_WART)
            return TriState.TRUE;

        if (plant.getBlock() instanceof BushBlock)
            return TriState.TRUE;

        return TriState.DEFAULT;
    }

    @Override
    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        pEntity.causeFallDamage(pFallDistance, 1.0F, pEntity.damageSources().fall());
    }
}
