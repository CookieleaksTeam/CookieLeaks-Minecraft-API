package de.cookieleaks.minecraftapi;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemCreator {

    public Material material;
    public ItemMeta itemMeta;
    public ItemStack itemStack;

    public ItemCreator(Material material, Integer Amount) {
        this.material = material;
        itemStack = new ItemStack(material, Amount);


    }

    public ItemCreator setName(String name) {
        itemMeta.setDisplayName(name);
        return this;
    }

    public ItemCreator setLore(List<String> Lore) {
        itemMeta.setLore(Lore);
        return this;
    }

    public ItemCreator setEnchanment(Enchantment enchanments, Integer lvl) {
        itemMeta.addEnchant(enchanments, lvl, true);
        return this;
    }

    public ItemCreator setflag(ItemFlag itemFlag) {
        itemMeta.addItemFlags(itemFlag);
        return this;
    }

    public ItemStack build() {
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }


}
