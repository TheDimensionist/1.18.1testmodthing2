package net.dimension.tutorialmod.item;

import net.dimension.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item GLOBUOLE_BALL = registerItem("globuole_ball",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.GLOBUOLES)));

    public static final Item GLOBUOLE_BALL_INFECTED = registerItem("globuole_ball_infected",
            new Item(new FabricItemSettings().group(ModItemGroup.GLOBUOLES).maxCount(7)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
        public static void registerModItems () {
            TutorialMod.LOGGER.info("Registering Mod Items");
        }
}


