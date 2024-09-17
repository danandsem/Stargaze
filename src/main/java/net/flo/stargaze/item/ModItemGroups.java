package net.flo.stargaze.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flo.stargaze.Stargaze;
import net.flo.stargaze.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup STARGAZE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Stargaze.MOD_ID, "clearancejade"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.clearancejade"))
                    .icon(() -> new ItemStack(ModItems.CLEARANCEJADE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CLEARANCEJADE);
                        entries.add(ModItems.POLISHEDJADE);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.RAW_JADE_BLOCK);

                    }).build());
    public static void registerItemGroups(){
        Stargaze.LOGGER.info("Registering Item Groups for" + Stargaze.MOD_ID);


    }

}
