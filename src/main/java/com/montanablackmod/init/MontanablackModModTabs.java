
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.montanablackmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MontanablackModModTabs {
	public static CreativeModeTab TAB_MONTANA_BLACK_CREATIVE_INVENTORY;

	public static void load() {
		TAB_MONTANA_BLACK_CREATIVE_INVENTORY = new CreativeModeTab("tabmontana_black_creative_inventory") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MontanablackModModItems.SANDWICH_CAP_GOML_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
