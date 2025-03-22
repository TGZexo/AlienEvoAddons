package net.mcreator.alienevoaddons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.alienevoaddons.network.AlienevoaddonsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnJoinSetProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = entity.getDisplayName().getString();
			entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.playerName = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
