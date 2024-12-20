package com.nyan.main.content.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;

public class TriluxPlantBlock extends Block {
    private static final IntegerProperty AGE = BlockStateProperties.AGE_15;
    public TriluxPlantBlock(Properties pProperties) {
        super(Properties.of()
                .randomTicks()
                .pushReaction(PushReaction.DESTROY)
                .destroyTime(0.5f));
    }

    @SuppressWarnings("deprecation")
    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        super.randomTick(pState, pLevel, pPos, pRandom);


    }
}
