
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enhancedswords.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.enhancedswords.item.SerpentineSwordItem;
import net.mcreator.enhancedswords.item.LapisSwordItem;
import net.mcreator.enhancedswords.EnhancedSwordsMod;

public class EnhancedSwordsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedSwordsMod.MODID);
	public static final RegistryObject<Item> SERPENTINE_SWORD = REGISTRY.register("serpentine_sword", () -> new SerpentineSwordItem());
	public static final RegistryObject<Item> LAPIS_SWORD = REGISTRY.register("lapis_sword", () -> new LapisSwordItem());
}
