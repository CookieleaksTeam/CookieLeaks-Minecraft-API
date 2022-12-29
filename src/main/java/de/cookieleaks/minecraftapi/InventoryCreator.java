package de.cookieleaks.minecraftapi;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryCreator {

    /**
     *
     * **/

    public Inventory inventory;



    public InventoryCreator(int size, String title) {
        inventory = Bukkit.createInventory(null, size, title);
    }


    public InventoryCreator addItem(ItemStack itemStack) {
        inventory.addItem(itemStack);
        return this;
    }
    public InventoryCreator setItem(ItemStack itemStack, Integer slot) {
        inventory.setItem(slot, itemStack);
        return this;
    }

    public Inventory build() {
        return inventory;
    }


}
