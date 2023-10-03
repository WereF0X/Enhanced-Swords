
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enhancedswords.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.enhancedswords.EnhancedSwordsMod;

public class EnhancedSwordsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnhancedSwordsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ENHANCED_SWORDS = REGISTRY.register("enhanced_swords",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.enhanced_swords.enhanced_swords")).icon(() -> new ItemStack(Blocks.NETHERITE_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(EnhancedSwordsModItems.SERPENTINE_SWORD.get());
				tabData.accept(EnhancedSwordsModItems.LAPIS_SWORD.get());
			})

					.build());
}
