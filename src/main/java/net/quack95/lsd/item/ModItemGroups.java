package net.quack95.lsd.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.quack95.lsd.LSD;

public class ModItemGroups {

    public static final ItemGroup LSD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LSD.MOD_ID, "crack"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lsd"))
                    .icon(() -> new ItemStack(ModItems.ACID)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRACK);
                        entries.add(ModItems.JOINT);
                        entries.add(ModItems.METH);
                        entries.add(ModItems.COCAINE);
                        entries.add(ModItems.ACID);
                    }).build());
    public static void registerItemGroups(){
        LSD.LOGGER.info("Registering item groups for " + LSD.MOD_ID);
    }
}
