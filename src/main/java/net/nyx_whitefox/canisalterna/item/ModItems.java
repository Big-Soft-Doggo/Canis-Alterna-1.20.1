package net.nyx_whitefox.canisalterna.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nyx_whitefox.canisalterna.CanisAlterna;
import net.nyx_whitefox.canisalterna.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CanisAlterna.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FEY_DEW = ITEMS.register("fey_dew",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANDY_BAR = ITEMS.register("candy_bar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTED_DOUGH = ITEMS.register("enchanted_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CROWN = ITEMS.register("sapphire_crown",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PLATE = ITEMS.register("sapphire_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_GREAVES = ITEMS.register("sapphire_greaves",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
