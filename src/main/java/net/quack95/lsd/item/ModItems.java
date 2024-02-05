package net.quack95.lsd.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quack95.lsd.LSD;

public class ModItems {
    public static final Item CRACK = registerItem("crack", new Item(new FabricItemSettings().food(ModFoods.CRACK)));
    public static final Item METH = registerItem("meth", new Item(new FabricItemSettings().food(ModFoods.METH)));
    public static final Item ACID = registerItem("acid", new Item(new FabricItemSettings().food(ModFoods.ACID)));
    public static final Item COCAINE = registerItem("cocaine", new Item(new FabricItemSettings()));
    public static final Item JOINT = registerItem("joint", new Item(new FabricItemSettings()));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
        entries.add(CRACK);
        entries.add(ACID);
        entries.add(COCAINE);
        entries.add(JOINT);
        entries.add(METH);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LSD.MOD_ID, name), item);
    }

    public static void registerModItems(){
        LSD.LOGGER.info("Registering mod items for " + LSD.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
