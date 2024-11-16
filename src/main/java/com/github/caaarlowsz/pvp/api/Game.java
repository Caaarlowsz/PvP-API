package com.github.caaarlowsz.pvp.api;

import java.util.Set;

public interface Game {

	public Set<Kit> getKits();

	public Kit getKit(String name);
}