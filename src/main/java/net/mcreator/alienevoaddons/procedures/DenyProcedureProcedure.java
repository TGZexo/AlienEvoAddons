package net.mcreator.alienevoaddons.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.alienevoaddons.network.AlienevoaddonsModVariables;

public class DenyProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.deTransformCooldown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = false;
			entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hasMasterControl = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "";
			entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.playerRequestedDetransform = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
