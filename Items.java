package fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items;

import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.craft.CraftConstructor;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;

public interface Items extends CraftConstructor {

    boolean cancelEvent();

    boolean craftable();

    ItemStack build();

    boolean equals(ItemStack itemStack);

    void action(Action action);

}
