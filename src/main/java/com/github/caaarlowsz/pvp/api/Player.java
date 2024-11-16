package com.github.caaarlowsz.pvp.api;

public interface Player extends org.bukkit.entity.Player {

	public boolean hasKit();

	public Kit getKit();

	public void setKit(Kit kit);

	public void removeKit();
}