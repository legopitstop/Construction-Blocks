package com.legopitstop.construction;

import com.legopitstop.construction.init.ConstructionBlocks;
import com.legopitstop.construction.init.ConstructionItems;
import com.legopitstop.construction.init.ConstructionSounds;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("const")
public class ConstructionMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "const";

    public ConstructionMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ConstructionSounds.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ConstructionItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Custom tab
    public static final ItemGroup TAB = new ItemGroup("constTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ConstructionBlocks.CAUTION_BLOCK.get());
        }
    };
}
