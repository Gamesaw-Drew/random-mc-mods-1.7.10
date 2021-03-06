package com.meme.mememod.mob;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;

import com.meme.mememod.MemeMod;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityOverlordMinion 
{
	public static void summonOberlordMinion() 
	{
		registerEntity();
	}
	
	public static void registerEntity() 
	{
		createEntity(EntityOverlordMinionMob.class, "oberlordminion", 0x292727, 0xAD2121);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor)
	{
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MemeMod.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.monster);
		
		createEgg(randomId, solidColor, spotColor);
		
		
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}