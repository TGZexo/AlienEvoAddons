
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alienevoaddons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.alienevoaddons.client.model.ModeltestModel;
import net.mcreator.alienevoaddons.client.model.ModelSkinTightSuit;
import net.mcreator.alienevoaddons.client.model.ModelSkinTightBoots;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AlienevoaddonsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSkinTightBoots.LAYER_LOCATION, ModelSkinTightBoots::createBodyLayer);
		event.registerLayerDefinition(ModeltestModel.LAYER_LOCATION, ModeltestModel::createBodyLayer);
		event.registerLayerDefinition(ModelSkinTightSuit.LAYER_LOCATION, ModelSkinTightSuit::createBodyLayer);
	}
}
