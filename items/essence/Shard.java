package fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.essence;

import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.Items;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Shard implements Items {

    @Override
    public boolean cancelEvent() {
        return true;
    }

    @Override
    public boolean craftable() {
        return false;
    }

    @Override
    public ItemStack build() {
        ItemStack itemStack = new ItemStack(Material.SLIME_BALL);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName("§2Shard §5§oLvl 1");
        itemMeta.setLore(Arrays.asList("§5###########", "§2Utilisable pour :", "§2-Shard level 2", "§2-SuperCoal", "§5###########", "§4§lCette item est utilisable", "§4§lcomme n'importe quel item :", "§4§l-craft", "§4§l-comburant", "§4§l...", "§5###########"));

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    @Override
    public boolean equals(ItemStack itemStack) {
        return itemStack.isSimilar(build());
    }

    @Override
    public void action(Action action) {
    }

    @Override
    public boolean whatCraft() {
        return false;
    }

    @Override
    public ShapedRecipe craft() {
        return null;
    }

    @Override
    public ItemStack a() {
        return null;
    }

    @Override
    public ItemStack b() {
        return null;
    }

    @Override
    public ItemStack c() {
        return null;
    }

    @Override
    public ItemStack d() {
        return null;
    }

    @Override
    public ItemStack e() {
        return null;
    }

    @Override
    public ItemStack f() {
        return null;
    }

    @Override
    public ItemStack g() {
        return null;
    }

    @Override
    public ItemStack h() {
        return null;
    }

    @Override
    public ItemStack i() {
        return null;
    }

    @Override
    public ItemStack[] getMatrix(ItemStack[] itemStacks) {
        return new ItemStack[] {a(),b(),c(),d(),e(),f(),g(),h(),i()};
    }
}
