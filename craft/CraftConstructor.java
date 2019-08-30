package fr.WarzouMc.MonaiServGroup.hubCenter.newItems.craft;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public interface CraftConstructor {

    boolean whatCraft();

    ShapedRecipe craft();

    /**
     * Return ItemStack in first position on craft table
     * @return ItemStack
     */

    ItemStack a();

    /**
     * Return ItemStack in second position on craft table
     * @return ItemStack
     */

    ItemStack b();

    /**
     * Return ItemStack in third position on craft table
     * @return ItemStack
     */

    ItemStack c();

    /**
     * Return ItemStack in forth position on craft table
     * @return ItemStack
     */

    ItemStack d();

    /**
     * Return ItemStack in fifth position on craft table
     * @return ItemStack
     */

    ItemStack e();

    /**
     * Return ItemStack in sixth position on craft table
     * @return ItemStack
     */

    ItemStack f();

    /**
     * Return ItemStack in seventh position on craft table
     * @return ItemStack
     */

    ItemStack g();

    /**
     * Return ItemStack in eighth position on craft table
     * @return ItemStack
     */

    ItemStack h();

    /**
     * Return ItemStack in ninth position on craft table
     * @return ItemStack
     */

    ItemStack i();

    ItemStack[] getMatrix(ItemStack[] itemStacks);

}
