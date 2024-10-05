package net.nyx_whitefox.canisalterna.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nyx_whitefox.canisalterna.CanisAlterna;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CanisAlterna.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CANIS_TAB = CREATIVE_MODE_TABS.register("canis_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FEY_DEW.get()))
            .title(Component.translatable("creativetab.canis_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.SAPPHIRE.get());
                pOutput.accept(ModItems.FEY_DEW.get());
                pOutput.accept(ModItems.CANDY_BAR.get());
                pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                pOutput.accept(ModItems.DOUGH.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
