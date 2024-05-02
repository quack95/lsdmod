package net.quack95.lsd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.quack95.lsd.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ACID, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JOINT, Models.GENERATED);
    }
}
