
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.montanablackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.montanablackmod.MontanablackModMod;

public class MontanablackModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MontanablackModMod.MODID);
	public static final RegistryObject<SoundEvent> ENTITY_MONTANABLACK_HURT = REGISTRY.register("entity.montanablack.hurt",
			() -> new SoundEvent(new ResourceLocation("montanablack_mod", "entity.montanablack.hurt")));
}
