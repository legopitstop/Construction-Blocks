package com.legopitstop.construction.init;

import com.legopitstop.construction.ConstructionMod;
import com.legopitstop.construction.bases.BlockItemBase;
import com.legopitstop.construction.bases.ItemBase;
import com.legopitstop.construction.item.HammerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ConstructionItems {

    // Register items & blocks
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionMod.MOD_ID);

    // Block Items
    public static final RegistryObject<Item> NAILED_ITEM = ITEMS.register("nailed",
            () -> new BlockItemBase(ConstructionBlocks.NAILED.get()));
    public static final RegistryObject<Item> NAIL_ITEM = ITEMS.register("nail",
            () -> new BlockItemBase(ConstructionBlocks.NAIL.get()));

    // Caution Blocks
    public static final RegistryObject<Item> CAUTION_BLOCK_ITEM = ITEMS.register("caution_block",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_BLOCK.get()));
    public static final RegistryObject<Item> CAUTION_SLAB_ITEM = ITEMS.register("caution_slab",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_SLAB.get()));
    public static final RegistryObject<Item> CAUTION_STAIRS_ITEM = ITEMS.register("caution_stairs",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_STAIRS.get()));
    public static final RegistryObject<Item> CAUTION_WALL_ITEM = ITEMS.register("caution_wall",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_WALL.get()));
    public static final RegistryObject<Item> CAUTION_BUTTON_ITEM = ITEMS.register("caution_button",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_BUTTON.get()));
    public static final RegistryObject<Item> CAUTION_PRESSURE_PLATE_ITEM = ITEMS.register("caution_pressure_plate",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_PRESSURE_PLATE.get()));

    // Beam
    public static final RegistryObject<Item> ANVIL_BEAM_ITEM = ITEMS.register("anvil_beam",
            () -> new BlockItemBase(ConstructionBlocks.ANVIL_BEAM.get()));
    public static final RegistryObject<Item> DIAMOND_BEAM_ITEM = ITEMS.register("diamond_beam",
            () -> new BlockItemBase(ConstructionBlocks.DIAMOND_BEAM.get()));
    public static final RegistryObject<Item> EMERALD_BEAM_ITEM = ITEMS.register("emerald_beam",
            () -> new BlockItemBase(ConstructionBlocks.EMERALD_BEAM.get()));
    public static final RegistryObject<Item> GOLD_BEAM_ITEM = ITEMS.register("gold_beam",
            () -> new BlockItemBase(ConstructionBlocks.GOLD_BEAM.get()));
    public static final RegistryObject<Item> IRON_BEAM_ITEM = ITEMS.register("iron_beam",
            () -> new BlockItemBase(ConstructionBlocks.IRON_BEAM.get()));
    public static final RegistryObject<Item> NETHERITE_BEAM_ITEM = ITEMS.register("netherite_beam",
            () -> new BlockItemBase(ConstructionBlocks.NETHERITE_BEAM.get()));
    public static final RegistryObject<Item> RUSTY_IRON_BEAM_ITEM = ITEMS.register("rusty_iron_beam",
            () -> new BlockItemBase(ConstructionBlocks.RUSTY_IRON_BEAM.get()));

    // Bookshelf
    public static final RegistryObject<Item> ACACIA_BOOKSHELF_ITEM = ITEMS.register("acacia_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.ACACIA_BOOKSHELF.get()));
    public static final RegistryObject<Item> BIRCH_BOOKSHELF_ITEM = ITEMS.register("birch_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.BIRCH_BOOKSHELF.get()));
    public static final RegistryObject<Item> CRIMSON_BOOKSHELF_ITEM = ITEMS.register("crimson_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.CRIMSON_BOOKSHELF.get()));
    public static final RegistryObject<Item> DARK_OAK_BOOKSHELF_ITEM = ITEMS.register("dark_oak_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.DARK_OAK_BOOKSHELF.get()));
    public static final RegistryObject<Item> JUNGLE_BOOKSHELF_ITEM = ITEMS.register("jungle_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.JUNGLE_BOOKSHELF.get()));
    public static final RegistryObject<Item> SPRUCE_BOOKSHELF_ITEM = ITEMS.register("spruce_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.SPRUCE_BOOKSHELF.get()));
    public static final RegistryObject<Item> WARPED_BOOKSHELF_ITEM = ITEMS.register("warped_bookshelf",
            () -> new BlockItemBase(ConstructionBlocks.WARPED_BOOKSHELF.get()));
    // Celing tile
    public static final RegistryObject<Item> CELINGTILE_ITEM = ITEMS.register("celingtile",
            () -> new BlockItemBase(ConstructionBlocks.CELINGTILE.get()));
    public static final RegistryObject<Item> BLACK_CELINGTILE_ITEM = ITEMS.register("black_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.BLACK_CELINGTILE.get()));
    public static final RegistryObject<Item> BLUE_CELINGTILE_ITEM = ITEMS.register("blue_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.BLUE_CELINGTILE.get()));
    public static final RegistryObject<Item> BROWN_CELINGTILE_ITEM = ITEMS.register("brown_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.BROWN_CELINGTILE.get()));
    public static final RegistryObject<Item> CYAN_CELINGTILE_ITEM = ITEMS.register("cyan_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.CYAN_CELINGTILE.get()));
    public static final RegistryObject<Item> GRAY_CELINGTILE_ITEM = ITEMS.register("gray_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.GRAY_CELINGTILE.get()));
    public static final RegistryObject<Item> GREEN_CELINGTILE_ITEM = ITEMS.register("green_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.GREEN_CELINGTILE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CELINGTILE_ITEM = ITEMS.register("light_blue_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_BLUE_CELINGTILE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CELINGTILE_ITEM = ITEMS.register("light_gray_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_GRAY_CELINGTILE.get()));
    public static final RegistryObject<Item> LIME_CELINGTILE_ITEM = ITEMS.register("lime_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.LIME_CELINGTILE.get()));
    public static final RegistryObject<Item> MAGENTA_CELINGTILE_ITEM = ITEMS.register("magenta_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.MAGENTA_CELINGTILE.get()));
    public static final RegistryObject<Item> ORANGE_CELINGTILE_ITEM = ITEMS.register("orange_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.ORANGE_CELINGTILE.get()));
    public static final RegistryObject<Item> PINK_CELINGTILE_ITEM = ITEMS.register("pink_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.PINK_CELINGTILE.get()));
    public static final RegistryObject<Item> PURPLE_CELINGTILE_ITEM = ITEMS.register("purple_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.PURPLE_CELINGTILE.get()));
    public static final RegistryObject<Item> RED_CELINGTILE_ITEM = ITEMS.register("red_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.RED_CELINGTILE.get()));
    public static final RegistryObject<Item> WHITE_CELINGTILE_ITEM = ITEMS.register("white_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.WHITE_CELINGTILE.get()));
    public static final RegistryObject<Item> YELLOW_CELINGTILE_ITEM = ITEMS.register("yellow_celingtile",
            () -> new BlockItemBase(ConstructionBlocks.YELLOW_CELINGTILE.get()));
    // Planks
    public static final RegistryObject<Item> BLACK_PLANKS_ITEM = ITEMS.register("black_planks",
            () -> new BlockItemBase(ConstructionBlocks.BLACK_PLANKS.get()));
    public static final RegistryObject<Item> BLUE_PLANKS_ITEM = ITEMS.register("blue_planks",
            () -> new BlockItemBase(ConstructionBlocks.BLUE_PLANKS.get()));
    public static final RegistryObject<Item> BROWN_PLANKS_ITEM = ITEMS.register("brown_planks",
            () -> new BlockItemBase(ConstructionBlocks.BROWN_PLANKS.get()));
    public static final RegistryObject<Item> CYAN_PLANKS_ITEM = ITEMS.register("cyan_planks",
            () -> new BlockItemBase(ConstructionBlocks.CYAN_PLANKS.get()));
    public static final RegistryObject<Item> GRAY_PLANKS_ITEM = ITEMS.register("gray_planks",
            () -> new BlockItemBase(ConstructionBlocks.GRAY_PLANKS.get()));
    public static final RegistryObject<Item> GREEN_PLANKS_ITEM = ITEMS.register("green_planks",
            () -> new BlockItemBase(ConstructionBlocks.GREEN_PLANKS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANKS_ITEM = ITEMS.register("light_blue_planks",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_BLUE_PLANKS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANKS_ITEM = ITEMS.register("light_gray_planks",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_GRAY_PLANKS.get()));
    public static final RegistryObject<Item> LIME_PLANKS_ITEM = ITEMS.register("lime_planks",
            () -> new BlockItemBase(ConstructionBlocks.LIME_PLANKS.get()));
    public static final RegistryObject<Item> MAGENTA_PLANKS_ITEM = ITEMS.register("magenta_planks",
            () -> new BlockItemBase(ConstructionBlocks.MAGENTA_PLANKS.get()));
    public static final RegistryObject<Item> ORANGE_PLANKS_ITEM = ITEMS.register("orange_planks",
            () -> new BlockItemBase(ConstructionBlocks.ORANGE_PLANKS.get()));
    public static final RegistryObject<Item> PINK_PLANKS_ITEM = ITEMS.register("pink_planks",
            () -> new BlockItemBase(ConstructionBlocks.PINK_PLANKS.get()));
    public static final RegistryObject<Item> PURPLE_PLANKS_ITEM = ITEMS.register("purple_planks",
            () -> new BlockItemBase(ConstructionBlocks.PURPLE_PLANKS.get()));
    public static final RegistryObject<Item> RED_PLANKS_ITEM = ITEMS.register("red_planks",
            () -> new BlockItemBase(ConstructionBlocks.RED_PLANKS.get()));
    public static final RegistryObject<Item> WHITE_PLANKS_ITEM = ITEMS.register("white_planks",
            () -> new BlockItemBase(ConstructionBlocks.WHITE_PLANKS.get()));
    public static final RegistryObject<Item> YELLOW_PLANKS_ITEM = ITEMS.register("yellow_planks",
            () -> new BlockItemBase(ConstructionBlocks.YELLOW_PLANKS.get()));
    // Concrete Pillar
    public static final RegistryObject<Item> BLACK_CONCRETE_PILLAR_ITEM = ITEMS.register("black_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.BLACK_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_PILLAR_ITEM = ITEMS.register("blue_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.BLUE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_PILLAR_ITEM = ITEMS.register("brown_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.BROWN_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_PILLAR_ITEM = ITEMS.register("cyan_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.CYAN_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_PILLAR_ITEM = ITEMS.register("gray_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.GRAY_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_PILLAR_ITEM = ITEMS.register("green_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.GREEN_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_PILLAR_ITEM = ITEMS.register("light_blue_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_PILLAR_ITEM = ITEMS.register("light_gray_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_PILLAR_ITEM = ITEMS.register("lime_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.LIME_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_PILLAR_ITEM = ITEMS.register("magenta_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.MAGENTA_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_PILLAR_ITEM = ITEMS.register("orange_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.ORANGE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_PILLAR_ITEM = ITEMS.register("pink_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.PINK_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_PILLAR_ITEM = ITEMS.register("purple_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.PURPLE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> RED_CONCRETE_PILLAR_ITEM = ITEMS.register("red_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.RED_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_PILLAR_ITEM = ITEMS.register("white_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.WHITE_CONCRETE_PILLAR.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_PILLAR_ITEM = ITEMS.register("yellow_concrete_pillar",
            () -> new BlockItemBase(ConstructionBlocks.YELLOW_CONCRETE_PILLAR.get()));
    // Concrete Large Bricks
    public static final RegistryObject<Item> BLACK_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("black_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.BLACK_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("blue_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.BLUE_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("brown_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.BROWN_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("cyan_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.CYAN_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("gray_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.GRAY_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("green_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.GREEN_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("light_blue_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_BLUE_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("light_gray_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_GRAY_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("lime_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.LIME_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("magenta_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.MAGENTA_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("orange_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.ORANGE_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("pink_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.PINK_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("purple_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.PURPLE_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> RED_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("red_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.RED_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("white_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.WHITE_CONCRETE_LARGE_BRICKS.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_LARGE_BRICKS_ITEM = ITEMS.register("yellow_concrete_large_bricks",
            () -> new BlockItemBase(ConstructionBlocks.YELLOW_CONCRETE_LARGE_BRICKS.get()));
    // Concrete Large Bricks
    public static final RegistryObject<Item> BLACK_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("black_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.BLACK_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("blue_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.BLUE_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("brown_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.BROWN_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("cyan_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.CYAN_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("gray_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.GRAY_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("green_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.GREEN_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("light_blue_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_BLUE_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("light_gray_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.LIGHT_GRAY_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("lime_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.LIME_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("magenta_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.MAGENTA_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("orange_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.ORANGE_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("pink_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.PINK_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("purple_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.PURPLE_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("red_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.RED_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("white_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.WHITE_CONCRETE_SMALL_BRICKS.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SMALL_BRICKS_ITEM = ITEMS.register("yellow_concrete_small_bricks",
            () -> new BlockItemBase(ConstructionBlocks.YELLOW_CONCRETE_SMALL_BRICKS.get()));

    // Other
    public static final RegistryObject<Item> POST_CONE_ITEM = ITEMS.register("cone_post",
            () -> new BlockItemBase(ConstructionBlocks.CONE_POST.get()));
    public static final RegistryObject<Item> POST_BARREL_ITEM = ITEMS.register("cone_barrel",
            () -> new BlockItemBase(ConstructionBlocks.CONE_BARREL.get()));

    public static final RegistryObject<Item> CAUTION_BLOCK_POWDER_ITEM = ITEMS.register("caution_block_powder",
            () -> new BlockItemBase(ConstructionBlocks.CAUTION_BLOCK_POWDER.get()));

    public static final RegistryObject<Item> GYPSUM_BLOCK_ITEM = ITEMS.register("gypsum_block",
            () -> new BlockItemBase(ConstructionBlocks.GYPSUM_BLOCK.get()));

    public static final RegistryObject<Item> RUSTY_IRON_BLOCK_ITEM = ITEMS.register("rusty_iron_block",
            () -> new BlockItemBase(ConstructionBlocks.RUSTY_IRON_BLOCK.get()));

    public static final RegistryObject<Item> SEA_LANTERN_OFF_ITEM = ITEMS.register("sea_lantern_off",
            () -> new BlockItemBase(ConstructionBlocks.SEA_LANTERN_OFF.get()));

    // Tools
    public static final RegistryObject<HammerItem> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new HammerItem(ItemTier.WOOD, 1, 2F, new Item.Properties().group(ConstructionMod.TAB)));
    public static final RegistryObject<HammerItem> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(ItemTier.STONE, 1, 2f, new Item.Properties().group(ConstructionMod.TAB)));
    public static final RegistryObject<HammerItem> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(ItemTier.IRON, 1, 2f, new Item.Properties().group(ConstructionMod.TAB)));
    public static final RegistryObject<HammerItem> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new HammerItem(ItemTier.GOLD, 1, 2f, new Item.Properties().group(ConstructionMod.TAB)));
    public static final RegistryObject<HammerItem> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(ItemTier.DIAMOND, 1, 2f, new Item.Properties().group(ConstructionMod.TAB)));
    public static final RegistryObject<HammerItem> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(ItemTier.NETHERITE, 1, 2f, new Item.Properties().group(ConstructionMod.TAB)));
// Items
    public static final RegistryObject<Item> SAMPLE_ITEM = ITEMS.register("sample_item", ItemBase::new);
    public static final RegistryObject<Item> GYPSUM_DUST = ITEMS.register("gypsum_dust", ItemBase::new);
    public static final RegistryObject<Item> SANDPAPER = ITEMS.register("sandpaper", ItemBase::new);
    public static final RegistryObject<Item> WET_SANDPAPER = ITEMS.register("wet_sandpaper", ItemBase::new);

    // Dyed Paper
    public static final RegistryObject<Item> BLACK_DYED_PAPER = ITEMS.register("black_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> BLUE_DYED_PAPER = ITEMS.register("blue_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> BROWN_DYED_PAPER = ITEMS.register("brown_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> CYAN_DYED_PAPER = ITEMS.register("cyan_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> GRAY_DYED_PAPER = ITEMS.register("gray_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> GREEN_DYED_PAPER = ITEMS.register("green_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_BLUE_DYED_PAPER = ITEMS.register("light_blue_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> LIGHT_GRAY_DYED_PAPER = ITEMS.register("light_gray_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> LIME_DYED_PAPER = ITEMS.register("lime_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> MAGENTA_DYED_PAPER = ITEMS.register("magenta_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> ORANGE_DYED_PAPER = ITEMS.register("orange_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> PINK_DYED_PAPER = ITEMS.register("pink_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> PURPLE_DYED_PAPER = ITEMS.register("purple_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> RED_DYED_PAPER = ITEMS.register("red_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> WHITE_DYED_PAPER = ITEMS.register("white_dyed_paper", ItemBase::new);
    public static final RegistryObject<Item> YELLOW_DYED_PAPER = ITEMS.register("yellow_dyed_paper", ItemBase::new);
}