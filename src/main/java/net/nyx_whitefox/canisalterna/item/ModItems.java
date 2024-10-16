package net.nyx_whitefox.canisalterna.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nyx_whitefox.canisalterna.CanisAlterna;
import net.nyx_whitefox.canisalterna.item.custom.FuelItem;
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
    public static final RegistryObject<Item> BLOOM_ESSENCE = ITEMS.register("bloom_essence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTED_DOUGH = ITEMS.register("enchanted_dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRIMORDIUM = ITEMS.register("primordium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYLPHITE = ITEMS.register("sylphite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUNATITE = ITEMS.register("lunatite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABYSSITE = ITEMS.register("abyssite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANISITE = ITEMS.register("canisite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_CROWN = ITEMS.register("sapphire_crown",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PLATE = ITEMS.register("sapphire_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_GREAVES = ITEMS.register("sapphire_greaves",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENCHANTED_COAL = ITEMS.register("enchanted_coal",
            () -> new FuelItem(new Item.Properties(), 2000));

    public static final RegistryObject<Item> SAPPHIRE_SALAD = ITEMS.register("sapphire_salad",
            () -> new Item(new Item.Properties().food((ModFoods.SAPPHIRE_SALAD))));
    public static final RegistryObject<Item> ENCHANTED_BREAD = ITEMS.register("enchanted_bread",
            () -> new Item(new Item.Properties().food((ModFoods.ENCHANTED_BREAD))));
    public static final RegistryObject<Item> CANDY_BAR = ITEMS.register("candy_bar",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_BAR)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
