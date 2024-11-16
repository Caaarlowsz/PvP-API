package com.github.caaarlowsz.pvp.api;

import java.util.Collections;
import java.util.Set;

public class PvPAPI {

	private static Game game;

	public static Game getInstance() {
		return game;
	}

	public PvPAPI setInstance(Game instance) {
		if (game == null)
			game = instance;
		return this;
	}

	public static Set<Player> getPlayers() {
		return Collections.unmodifiableSet(game.getPlayers());
	}

	public static Player getPlayer(org.bukkit.entity.Player player) {
		return game.getPlayer(player);
	}

	public static Set<Kit> getKits() {
		return game.getKits();
	}

	public static Kit getKit(String name) {
		return game.getKit(name);
	}
}