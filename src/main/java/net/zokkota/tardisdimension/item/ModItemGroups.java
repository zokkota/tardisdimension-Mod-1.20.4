package net.zokkota.tardisdimension.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zokkota.tardisdimension.TardisDimension;
import net.zokkota.tardisdimension.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SHULKERWORLD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TardisDimension.MOD_ID, "shulkerworld"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModBlocks.SHULKERWORLD_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.SHULKERWORLD_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        TardisDimension.LOGGER.info("Registering Item Groups for " + TardisDimension.MOD_ID);
    }
}