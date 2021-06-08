package me.drawethree.ultraprisoncore.autosell.api;

import me.drawethree.ultraprisoncore.autosell.SellRegion;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.Collection;

public interface UltraPrisonAutoSellAPI {

    /**
     * Method to get current earnings of player
     *
     * @param player Player
     * @return Current earnings
     */
    double getCurrentEarnings(Player player);

    /**
     * Method to get price for broken block in specified mine region
     * @param regionName Name of region
     * @param material Type of block
     * @return Price for broken block
     */
    double getPriceForBlock(String regionName, Material material);

    /**
     * Method to get if player has autosell enabled
     * @param p Player
     * @return true if player has autosell enabled, otherwise false
     */
    boolean hasAutoSellEnabled(Player p);

    /**
     * Method to get all sell regions
     *
     * @return Collection of all loaded and active Sell Regions
     */
    Collection<SellRegion> getSellRegions();
}
