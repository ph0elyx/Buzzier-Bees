package com.bagel.buzzierbees.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

//Use the forge event that fires when a player right-clicks a block
//if the block is a flower pot and the player is holding a cartwheel, then set the blockstate to the correct state
public class PottedCartwheelBlock extends FlowerPotBlock {
	@SuppressWarnings("deprecation")
	public PottedCartwheelBlock(Block flower, Properties properties) {
		super(flower, properties);
	}

	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlayer().getHorizontalFacing());
	}
	
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}
}
