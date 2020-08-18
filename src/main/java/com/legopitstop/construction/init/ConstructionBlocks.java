package com.legopitstop.construction.init;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionBlocks {

    // Register blocks
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructionMod.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> NAILED = BLOCKS.register("nailed", NailedBlock::new);
    public static final RegistryObject<Block> NAIL = BLOCKS.register("nail", NailBlock::new);
    public static final RegistryObject<Block> CONE_POST = BLOCKS.register("cone_post", ConePost::new);
    public static final RegistryObject<Block> CONE_BARREL = BLOCKS.register("cone_barrel", ConeBarrel::new);
    public static final RegistryObject<Block> CAUTION_BLOCK_POWDER = BLOCKS.register("caution_block_powder", GravityBlock::new);
    public static final RegistryObject<Block> GYPSUM_BLOCK = BLOCKS.register("gypsum_block", GypsumBlock::new);
    public static final RegistryObject<Block> RUSTY_IRON_BLOCK = BLOCKS.register("rusty_iron_block", MetalBlock::new);
    public static final RegistryObject<Block> SEA_LANTERN_OFF = BLOCKS.register("sea_lantern_off", GlassBlock::new);
    // Sample Blocks (don't have item as they will not stay in the mod)
    public static final RegistryObject<Block> SAMPLE_BLOCK = BLOCKS.register("sample_block", ConcreteBlock::new);
    public static final RegistryObject<Block> SAMPLE_SLAB = BLOCKS.register("sample_slab", StoneSlab::new);
    public static final RegistryObject<Block> SAMPLE_STAIRS = BLOCKS.register("sample_stairs", StoneStairs::new);
    public static final RegistryObject<Block> SAMPLE_WALL = BLOCKS.register("sample_wall", StoneWall::new);
    public static final RegistryObject<Block> SAMPLE_BUTTON = BLOCKS.register("sample_button", StoneButton::new);
    public static final RegistryObject<Block> SAMPLE_PRESSURE_PLATE = BLOCKS.register("sample_pressure_plate", StonePressurePlate::new);
    // Beam
    public static final RegistryObject<Block> ANVIL_BEAM = BLOCKS.register("anvil_beam", MetalBeam::new);
    public static final RegistryObject<Block> DIAMOND_BEAM = BLOCKS.register("diamond_beam", MetalBeam::new);
    public static final RegistryObject<Block> EMERALD_BEAM = BLOCKS.register("emerald_beam", MetalBeam::new);
    public static final RegistryObject<Block> GOLD_BEAM = BLOCKS.register("gold_beam", MetalBeam::new);
    public static final RegistryObject<Block> IRON_BEAM = BLOCKS.register("iron_beam", MetalBeam::new);
    public static final RegistryObject<Block> NETHERITE_BEAM = BLOCKS.register("netherite_beam", MetalBeam::new);
    public static final RegistryObject<Block> RUSTY_IRON_BEAM = BLOCKS.register("rusty_iron_beam", MetalBeam::new);
    // Caution Blocks
    public static final RegistryObject<Block> CAUTION_BLOCK = BLOCKS.register("caution_block", ConcreteBlock::new);
    public static final RegistryObject<Block> CAUTION_SLAB = BLOCKS.register("caution_slab", StoneSlab::new);
    public static final RegistryObject<Block> CAUTION_STAIRS = BLOCKS.register("caution_stairs", StoneStairs::new);
    public static final RegistryObject<Block> CAUTION_WALL = BLOCKS.register("caution_wall", StoneWall::new);
    public static final RegistryObject<Block> CAUTION_BUTTON = BLOCKS.register("caution_button", StoneButton::new);
    public static final RegistryObject<Block> CAUTION_PRESSURE_PLATE = BLOCKS.register("caution_pressure_plate", StonePressurePlate::new);
    // Bookshelf
    public static final RegistryObject<Block> ACACIA_BOOKSHELF = BLOCKS.register("acacia_bookshelf", WoodBlock::new);
    public static final RegistryObject<Block> BIRCH_BOOKSHELF = BLOCKS.register("birch_bookshelf", WoodBlock::new);
    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = BLOCKS.register("crimson_bookshelf", NetherWoodBlock::new);
    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = BLOCKS.register("dark_oak_bookshelf", WoodBlock::new);
    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = BLOCKS.register("jungle_bookshelf", WoodBlock::new);
    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = BLOCKS.register("spruce_bookshelf", WoodBlock::new);
    public static final RegistryObject<Block> WARPED_BOOKSHELF = BLOCKS.register("warped_bookshelf", NetherWoodBlock::new);
    // Celing Tile
    public static final RegistryObject<Block> CELINGTILE = BLOCKS.register("celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> BLACK_CELINGTILE = BLOCKS.register("black_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> BLUE_CELINGTILE = BLOCKS.register("blue_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> BROWN_CELINGTILE = BLOCKS.register("brown_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> CYAN_CELINGTILE = BLOCKS.register("cyan_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> GRAY_CELINGTILE = BLOCKS.register("gray_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> GREEN_CELINGTILE = BLOCKS.register("green_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CELINGTILE = BLOCKS.register("light_blue_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CELINGTILE = BLOCKS.register("light_gray_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> LIME_CELINGTILE = BLOCKS.register("lime_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> MAGENTA_CELINGTILE = BLOCKS.register("magenta_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> ORANGE_CELINGTILE = BLOCKS.register("orange_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> PINK_CELINGTILE = BLOCKS.register("pink_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> PURPLE_CELINGTILE = BLOCKS.register("purple_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> RED_CELINGTILE = BLOCKS.register("red_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> WHITE_CELINGTILE = BLOCKS.register("white_celingtile", CelingTileBlock::new);
    public static final RegistryObject<Block> YELLOW_CELINGTILE = BLOCKS.register("yellow_celingtile", CelingTileBlock::new);
    // Planks
    public static final RegistryObject<Block> BLACK_PLANKS = BLOCKS.register("black_planks", WoodBlock::new);
    public static final RegistryObject<Block> BLUE_PLANKS = BLOCKS.register("blue_planks", WoodBlock::new);
    public static final RegistryObject<Block> BROWN_PLANKS = BLOCKS.register("brown_planks", WoodBlock::new);
    public static final RegistryObject<Block> CYAN_PLANKS = BLOCKS.register("cyan_planks", WoodBlock::new);
    public static final RegistryObject<Block> GRAY_PLANKS = BLOCKS.register("gray_planks", WoodBlock::new);
    public static final RegistryObject<Block> GREEN_PLANKS = BLOCKS.register("green_planks", WoodBlock::new);
    public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = BLOCKS.register("light_blue_planks", WoodBlock::new);
    public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = BLOCKS.register("light_gray_planks", WoodBlock::new);
    public static final RegistryObject<Block> LIME_PLANKS = BLOCKS.register("lime_planks", WoodBlock::new);
    public static final RegistryObject<Block> MAGENTA_PLANKS = BLOCKS.register("magenta_planks", WoodBlock::new);
    public static final RegistryObject<Block> ORANGE_PLANKS = BLOCKS.register("orange_planks", WoodBlock::new);
    public static final RegistryObject<Block> PINK_PLANKS = BLOCKS.register("pink_planks", WoodBlock::new);
    public static final RegistryObject<Block> PURPLE_PLANKS = BLOCKS.register("purple_planks", WoodBlock::new);
    public static final RegistryObject<Block> RED_PLANKS = BLOCKS.register("red_planks", WoodBlock::new);
    public static final RegistryObject<Block> WHITE_PLANKS = BLOCKS.register("white_planks", WoodBlock::new);
    public static final RegistryObject<Block> YELLOW_PLANKS = BLOCKS.register("yellow_planks", WoodBlock::new);
    // Concrete Pillars
    public static final RegistryObject<Block> BLACK_CONCRETE_PILLAR = BLOCKS.register("black_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_PILLAR = BLOCKS.register("blue_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_PILLAR = BLOCKS.register("brown_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_PILLAR = BLOCKS.register("cyan_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_PILLAR = BLOCKS.register("gray_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_PILLAR = BLOCKS.register("green_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PILLAR = BLOCKS.register("light_blue_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PILLAR = BLOCKS.register("light_gray_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> LIME_CONCRETE_PILLAR = BLOCKS.register("lime_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_PILLAR = BLOCKS.register("magenta_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_PILLAR = BLOCKS.register("orange_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> PINK_CONCRETE_PILLAR = BLOCKS.register("pink_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_PILLAR = BLOCKS.register("purple_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> RED_CONCRETE_PILLAR = BLOCKS.register("red_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_PILLAR = BLOCKS.register("white_concrete_pillar", StoneColmn::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_PILLAR = BLOCKS.register("yellow_concrete_pillar", StoneColmn::new);
    // Concrete Large Brick
    public static final RegistryObject<Block> BLACK_CONCRETE_LARGE_BRICKS = BLOCKS.register("black_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_LARGE_BRICKS = BLOCKS.register("blue_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_LARGE_BRICKS = BLOCKS.register("brown_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_LARGE_BRICKS = BLOCKS.register("cyan_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_LARGE_BRICKS = BLOCKS.register("gray_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_LARGE_BRICKS = BLOCKS.register("green_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LARGE_BRICKS = BLOCKS.register("light_blue_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LARGE_BRICKS = BLOCKS.register("light_gray_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> LIME_CONCRETE_LARGE_BRICKS = BLOCKS.register("lime_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LARGE_BRICKS = BLOCKS.register("magenta_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LARGE_BRICKS = BLOCKS.register("orange_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> PINK_CONCRETE_LARGE_BRICKS = BLOCKS.register("pink_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LARGE_BRICKS = BLOCKS.register("purple_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> RED_CONCRETE_LARGE_BRICKS = BLOCKS.register("red_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_LARGE_BRICKS = BLOCKS.register("white_concrete_large_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LARGE_BRICKS = BLOCKS.register("yellow_concrete_large_bricks", ConcreteBlock::new);
    // Concrete Small Brick
    public static final RegistryObject<Block> BLACK_CONCRETE_SMALL_BRICKS = BLOCKS.register("black_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> BLUE_CONCRETE_SMALL_BRICKS = BLOCKS.register("blue_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> BROWN_CONCRETE_SMALL_BRICKS = BLOCKS.register("brown_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> CYAN_CONCRETE_SMALL_BRICKS = BLOCKS.register("cyan_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> GRAY_CONCRETE_SMALL_BRICKS = BLOCKS.register("gray_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> GREEN_CONCRETE_SMALL_BRICKS = BLOCKS.register("green_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SMALL_BRICKS = BLOCKS.register("light_blue_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SMALL_BRICKS = BLOCKS.register("light_gray_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> LIME_CONCRETE_SMALL_BRICKS = BLOCKS.register("lime_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SMALL_BRICKS = BLOCKS.register("magenta_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SMALL_BRICKS = BLOCKS.register("orange_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> PINK_CONCRETE_SMALL_BRICKS = BLOCKS.register("pink_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SMALL_BRICKS = BLOCKS.register("purple_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> RED_CONCRETE_SMALL_BRICKS = BLOCKS.register("red_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> WHITE_CONCRETE_SMALL_BRICKS = BLOCKS.register("white_concrete_small_bricks", ConcreteBlock::new);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SMALL_BRICKS = BLOCKS.register("yellow_concrete_small_bricks", ConcreteBlock::new);

}
