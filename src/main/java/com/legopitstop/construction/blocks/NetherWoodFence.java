package com.legopitstop.construction.blocks;

import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherWoodFence extends FenceBlock {
    // field_235580_B_ -> FUNGUS
    // field_237214_y_ -> NETHER_WOOD
    public NetherWoodFence() {
        super(Properties.create(Material.field_237214_y_)
                .hardnessAndResistance(2f,3f)
                .sound(SoundType.field_235580_B_)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
