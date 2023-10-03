
package net.mcreator.enhancedswords.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.enhancedswords.procedures.SerpentineSwordLivingEntityIsHitWithToolProcedure;

public class SerpentineSwordItem extends SwordItem {
	public SerpentineSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SerpentineSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
