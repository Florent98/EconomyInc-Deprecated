package fr.fifou.economy.items;

import fr.fifou.economy.ModEconomy;
import net.minecraft.item.Item;

public class ItemPacketFifty extends Item
{
    public static final String NAME = "item_packetfifty";

    public ItemPacketFifty()
    {
        ItemsRegistery.setItemName(this, "item_packetfifty");
        this.maxStackSize = 64;
        this.setCreativeTab(ModEconomy.tabEconomy);
        this.setUnlocalizedName("item_packetfifty");
    }
}
