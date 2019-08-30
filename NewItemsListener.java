package fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items;

import fr.WarzouMc.MonaiServGroup.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class NewItemsListener implements Listener {

    private Main main;
    public NewItemsListener(Main main) {this.main = main;}

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack itemStack = event.getItem();

        GetNewItems getNewItems = new GetNewItems();
        if (event.getAction() != Action.PHYSICAL && itemStack != null && getNewItems.getItem(itemStack) != null && getNewItems.getItem(itemStack).cancelEvent()) event.setCancelled(true);
    }

    @EventHandler
    public void onCraft(PrepareItemCraftEvent event){
        CraftingInventory craftingInventory = event.getInventory();
        ItemStack[] itemStacks = craftingInventory.getMatrix();

        GetNewItems getNewItems = new GetNewItems();

        Bukkit.broadcastMessage(itemStacks[0].getType() + "");

        for (Items items : getNewItems.listing()) {
            if (items.build().isSimilar(craftingInventory.getResult())){
                if (Arrays.equals(items.getMatrix(itemStacks), itemStacks)){
                    craftingInventory.setResult(items.build());
                }else craftingInventory.setResult(null);
            }
        }
    }
}
