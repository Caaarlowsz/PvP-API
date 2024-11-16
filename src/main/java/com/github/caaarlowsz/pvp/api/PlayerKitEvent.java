package com.github.caaarlowsz.pvp.api;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerKitEvent extends PlayerEvent {

	private static final HandlerList handlers = new HandlerList();
	private Kit kit;

	public PlayerKitEvent(Player who, Kit kit) {
		super(who);
		this.kit = kit;
	}

	public Kit getKit() {
		return this.kit;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}