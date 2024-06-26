package net.flo.stargaze.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flo.stargaze.Stargaze;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CLEARANCEJADE = registerItem("clearancejade", new Item(new FabricItemSettings()));
    public static final Item POLISHEDJADE = registerItem("polishedjade", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CLEARANCEJADE);
        entries.add(POLISHEDJADE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Stargaze.MOD_ID, name),item);
    }
    public static void registerModItems() {
        Stargaze.LOGGER.info("Registering Mod Items for"+Stargaze.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
