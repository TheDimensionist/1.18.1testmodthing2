package net.dimension.tutorialmod.item;

import net.dimension.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GLOBUOLES = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "globuoles"),
            () -> new ItemStack(ModItems.GLOBUOLE_BALL));
}
