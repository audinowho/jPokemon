package org.jpokemon.pmapi.util;

/**
 * Defines the six persistent status ailments a Pokémon may suffer even outside
 * of battle (includes `Poison`, `Frozen`, and so on).
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public enum StatusAilment {
	/** Indicates that the Pokémon does not have a status ailment. */
	NONE("None"),

	/** Indicates that the Pokémon has fainted. */
	FAINTED("Fainted"),

	/** Indicates that the Pokémon is asleep. */
	ASLEEP("Asleep"),

	/** Indicates that the Pokémon is burned. */
	BURNED("Burned"),

	/** Indicates that the Pokémon is frozen solid. */
	FROZEN("Frozen"),

	/** Indicates that the Pokémon is paralyzed. */
	PARALYSIS("Paralyzed"),

	/** Indicates that the Pokémon is poisoned. */
	POISON("Poisoned");

	private final String name;

	private StatusAilment(String name) {
		this.name = name;
	}

	/** Gets the name of this status ailment. */
	public String getName() {
		return name;
	}
}