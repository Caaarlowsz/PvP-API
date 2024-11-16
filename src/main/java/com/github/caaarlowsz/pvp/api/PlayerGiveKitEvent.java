package com.github.caaarlowsz.pvp.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class PlayerGiveKitEvent extends PlayerKitEvent implements Cancellable {

	private boolean cancel = false;

	public PlayerGiveKitEvent(Player who, Kit kit) {
		super(who, kit);
	}

	@Override
	public boolean isCancelled() {
		return this.cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}
}