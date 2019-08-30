package fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items;

import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.essence.Shard;
import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.essence.Shard2;
import fr.WarzouMc.MonaiServGroup.hubCenter.newItems.items.superOre.SuperCoal;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class GetNewItems {

    public GetNewItems() {
        List();
    }

    /*
     * * * * * * *
     * * @List * *
     * * * * * * *
     */

    public int total = 2;

    public Items SHARDLVL1;
    public Items SHARDLVL2;
    public Items SUPERCOAL;

    public void List(){
        SHARDLVL1 = new Shard();
        SHARDLVL2 = new Shard2();
        SUPERCOAL = new SuperCoal();
    }

    /*
     * * * * * * * * *
     * * getItem() * *
     * * * * * * * * *
     */


    public List<Items> listing(){
        List<Items> l = new ArrayList<>();
        l.add(SHARDLVL1);
        l.add(SHARDLVL2);
        l.add(SUPERCOAL);

        return l;
    }

    public Items getItem(ItemStack itemStack){
        for (int i = 0; i < total; i++) {
            if (listing().get(i).equals(itemStack)){
                return listing().get(i);
            }
        }
        return null;
    }

    /*
     * * * * * * * * * * * * * *
     * * @Get characteristic * *
     * * * * * * * * * * * * * *
     */

}
