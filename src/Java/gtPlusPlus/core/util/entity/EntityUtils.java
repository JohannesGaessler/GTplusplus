package gtPlusPlus.core.util.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import ic2.core.IC2Potion;
import ic2.core.item.armor.ItemArmorHazmat;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityUtils {

	public static void setEntityOnFire(final Entity entity, final int length){
		entity.setFire(length);
	}

	public static int getFacingDirection(final Entity entity){
		final int d = MathHelper.floor_double((entity.rotationYaw * 4.0F) / 360 + 0.50) & 3;
		return d;
	}

	@Deprecated
	public static Block findBlockUnderEntityNonBoundingBox(final Entity parEntity){
		final int blockX = MathHelper.floor_double(parEntity.posX);
		final int blockY = MathHelper.floor_double(parEntity.posY-0.2D - parEntity.yOffset);
		final int blockZ = MathHelper.floor_double(parEntity.posZ);
		return parEntity.worldObj.getBlock(blockX, blockY, blockZ);
	}

	public static Block findBlockUnderEntity(final Entity parEntity){
		final int blockX = MathHelper.floor_double(parEntity.posX);
		final int blockY = MathHelper.floor_double(parEntity.boundingBox.minY)-1;
		final int blockZ = MathHelper.floor_double(parEntity.posZ);
		return parEntity.worldObj.getBlock(blockX, blockY, blockZ);
	}

	//TODO
	public static void registerEntityToBiomeSpawns(final Class<EntityLiving> classy, final EnumCreatureType EntityType, final BiomeGenBase baseBiomeGen){
		EntityRegistry.addSpawn(classy, 6, 1, 5, EntityType, baseBiomeGen); //change the values to vary the spawn rarity, biome, etc.
	}

	public static boolean applyRadiationDamageToEntity(final int damage, final World world, final Entity entityHolding){
		if (!world.isRemote){
			if ((damage > 0) && (entityHolding instanceof EntityLivingBase)) {
				final EntityLivingBase entityLiving = (EntityLivingBase) entityHolding;
				if (!ItemArmorHazmat.hasCompleteHazmat(entityLiving)) {
					int duration;
					if (entityLiving.getActivePotionEffect(IC2Potion.radiation) != null){
						//Utils.LOG_INFO("t");
						duration = (damage*5)+entityLiving.getActivePotionEffect(IC2Potion.radiation).getDuration();
					}
					else {
						//Utils.LOG_INFO("f");
						duration = damage*30;
					}
					IC2Potion.radiation.applyTo(entityLiving, duration, damage * 15);
				}
			}
			return true;
		}
		return false;
	}

}
