package net.mcreator.alienevoaddons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.alienevoaddons.network.AlienevoaddonsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReduceTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		ItemStack itema = ItemStack.EMPTY;
		if ((entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).deTransformCooldown > 0) {
			{
				double _setval = (entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).deTransformCooldown - 0.05;
				entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.deTransformCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).deTransformCooldown <= 0
					&& !((entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerRequestedDetransform).equals("")) {
				{
					String _setval = "";
					entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.playerRequestedDetransform = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
