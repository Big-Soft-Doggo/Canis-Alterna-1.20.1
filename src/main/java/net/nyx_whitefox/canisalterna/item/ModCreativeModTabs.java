package net.nyx_whitefox.canisalterna.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nyx_whitefox.canisalterna.CanisAlterna;
import net.nyx_whitefox.canisalterna.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CanisAlterna.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CANIS_TAB = CREATIVE_MODE_TABS.register("canis_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLOOM_ESSENCE.get()))
            .title(Component.translatable("creativetab.canis_tab"))
            .displayItems((pParameters, pOutput) -> {
                for(RegistryObject<Item> item:
                ModItems.ITEMS.getEntries()){
                    pOutput.accept(item.get());
                }
                for(RegistryObject<Block> block:
                        ModBlocks.BLOCKS.getEntries()){
                    pOutput.accept(block.get());
                }
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
