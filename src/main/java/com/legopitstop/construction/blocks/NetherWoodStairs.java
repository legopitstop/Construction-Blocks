package com.legopitstop.construction.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodStairs extends StairsBlock {
    // field_235344_mC_ -> CRIMSON_PLANKS
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodStairs() {
        super(Blocks.field_235344_mC_.getDefaultState(),Properties.create(Material.field_237214_y_)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.field_235580_B_)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
