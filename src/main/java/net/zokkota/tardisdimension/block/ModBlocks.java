package net.zokkota.tardisdimension.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.zokkota.tardisdimension.TardisDimension;

public class ModBlocks {
    public static final Block SHULKERWORLD_BLOCK = registerBlock("shulkerworld_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SHULKER_BOX).sounds(BlockSoundGroup.SCULK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TardisDimension.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TardisDimension.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerBlocks() {
        TardisDimension.LOGGER.info("Registering ModBlocks");
    }
}
