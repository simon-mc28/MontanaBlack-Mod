
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.montanablackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import com.montanablackmod.item.SandwichCapGOMLItem;
import com.montanablackmod.MontanablackModMod;

public class MontanablackModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MontanablackModMod.MODID);
	public static final RegistryObject<Item> SANDWICH_CAP_GOML_HELMET = REGISTRY.register("sandwich_cap_goml_helmet",
			() -> new SandwichCapGOMLItem.Helmet());
	public static final RegistryObject<Item> MONTANA_BLACK = REGISTRY.register("montana_black_spawn_egg",
			() -> new ForgeSpawnEggItem(MontanablackModModEntities.MONTANA_BLACK, -1, -16777216,
					new Item.Properties().tab(MontanablackModModTabs.TAB_MONTANA_BLACK_CREATIVE_INVENTORY)));
}
