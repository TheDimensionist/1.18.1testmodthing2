package net.dimension.tutorialmod.block;

import net.dimension.tutorialmod.TutorialMod;
import net.dimension.tutorialmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dimension.tutorialmod.TutorialMod.MOD_ID;

public class ModBlocks {

    public static final Block GLOBUOLE_BLOCK =registerBlock("globuole_block",
            new Block(FabricBlockSettings.of(Material.METAL).breakInstantly().breakByHand(true).luminance(8).slipperiness(1)),
            ModItemGroup.GLOBUOLES);

    public static final Block INFECTED_GLOBUOLE_BLOCK =registerBlock("infected_globuole_block",
            new Block(FabricBlockSettings.of(Material.METAL).breakInstantly().jumpVelocityMultiplier(2).breakByHand(true)
                    .luminance(15).slipperiness((float) 1.2)), ModItemGroup.GLOBUOLES);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks");
    }

}
