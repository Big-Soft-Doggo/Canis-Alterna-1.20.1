package net.nyx_whitefox.canisalterna.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.nyx_whitefox.canisalterna.CanisAlterna;
import net.nyx_whitefox.canisalterna.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CanisAlterna.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.BLOOM_ESSENCE);
        simpleItem(ModItems.CANDY_BAR);
        simpleItem(ModItems.ENCHANTED_BREAD);
        simpleItem(ModItems.ENCHANTED_COAL);
        simpleItem(ModItems.ENCHANTED_DOUGH);
        simpleItem(ModItems.DOUGH);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_SALAD);
        simpleItem(ModItems.SAPPHIRE_SWORD);
        simpleItem(ModItems.MORTAR_AND_PESTLE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CanisAlterna.MOD_ID,"item/" + item.getId().getPath()));
    }
}

