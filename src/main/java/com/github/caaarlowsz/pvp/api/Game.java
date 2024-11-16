package com.github.caaarlowsz.pvp.api;

import java.util.Set;

public interface Game {

	public Set<Player> getPlayers();

	public Player getPlayer(org.bukkit.entity.Player player);

	public Set<Kit> getKits();

	public Kit getKit(String name);
}