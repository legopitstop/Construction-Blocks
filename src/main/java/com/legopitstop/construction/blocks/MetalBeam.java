package com.legopitstop.construction.blocks;

import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalBeam extends Beam {
    // func_235861_h_  -> setRequiresTool
    public MetalBeam() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(1.25f,4.2f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_()
                .notSolid());
    }
}
