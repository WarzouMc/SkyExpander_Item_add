package fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.superOre;

import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.GetNewItems;
import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.Items;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class SuperCoal implements Items {
    @Override
    public boolean cancelEvent() {
        return true;
    }

    @Override
    public boolean craftable() {
        return true;
    }

    @Override
    public ItemStack build() {
        ItemStack itemStack = new ItemStack(Material.COAL);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName("§0§oSuper coal");
        itemMeta.setLore(Arrays.asList("§5###########", "§2Utilisable pour :", "§2-Shard level 2", "§2-Coal pickaxe", "§5###########", "§4§lCette item est utilisable", "§4§lcomme n'importe quel item :", "§4§l-craft", "§4§l-comburant", "§4§l...", "§5###########"));

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
        ShapedRecipe shapedRecipe = new ShapedRecipe(build());
        shapedRecipe.shape(new String[] {"abc", "def", "ghi"});
        shapedRecipe.setIngredient('a', a().getType());
        shapedRecipe.setIngredient('a', a().getData());

        shapedRecipe.setIngredient('b', b().getType());
        shapedRecipe.setIngredient('b', b().getData());

        shapedRecipe.setIngredient('c', c().getType());
        shapedRecipe.setIngredient('c', c().getData());

        shapedRecipe.setIngredient('d', d().getType());
        shapedRecipe.setIngredient('d', d().getData());

        shapedRecipe.setIngredient('e', e().getType());
        shapedRecipe.setIngredient('e', e().getData());

        shapedRecipe.setIngredient('f', f().getType());
        shapedRecipe.setIngredient('f', f().getData());

        shapedRecipe.setIngredient('g', g().getType());
        shapedRecipe.setIngredient('g', g().getData());

        shapedRecipe.setIngredient('h', h().getType());
        shapedRecipe.setIngredient('h', h().getData());

        shapedRecipe.setIngredient('i', i().getType());
        shapedRecipe.setIngredient('i', i().getData());

        return shapedRecipe;
    }

    @Override
    public ItemStack a() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_BLOCK);
        return itemStack;
    }

    @Override
    public ItemStack b() {
        return a();
    }

    @Override
    public ItemStack c() {
        return a();
    }

    @Override
    public ItemStack d() {
        return a();
    }

    @Override
    public ItemStack e() {
        GetNewItems getNewItems = new GetNewItems();
        return getNewItems.SHARDLVL1.build();
    }

    @Override
    public ItemStack f() {
        return a();
    }

    @Override
    public ItemStack g() {
        return a();
    }

    @Override
    public ItemStack h() {
        return a();
    }

    @Override
    public ItemStack i() {
        return a();
    }

    @Override
    public ItemStack[] getMatrix(ItemStack[] itemStacks) {
        ItemStack a = a();
        a.setAmount(itemStacks[0].getAmount());

        ItemStack b = b();
        b.setAmount(itemStacks[1].getAmount());

        ItemStack c = c();
        c.setAmount(itemStacks[2].getAmount());

        ItemStack d = d();
        d.setAmount(itemStacks[3].getAmount());

        ItemStack e = e();
        e.setAmount(itemStacks[4].getAmount());

        ItemStack f = f();
        f.setAmount(itemStacks[5].getAmount());

        ItemStack g = g();
        g.setAmount(itemStacks[6].getAmount());

        ItemStack h = h();
        h.setAmount(itemStacks[7].getAmount());

        ItemStack i = i();
        i.setAmount(itemStacks[8].getAmount());

        return new ItemStack[] {a,b,c,d,e,f,g,h,i};
    }

}
