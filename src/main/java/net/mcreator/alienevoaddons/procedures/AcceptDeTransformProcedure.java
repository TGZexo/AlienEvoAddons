package net.mcreator.alienevoaddons.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.alienevoaddons.network.AlienevoaddonsModVariables;
import net.mcreator.alienevoaddons.init.AlienevoaddonsModGameRules;
import net.mcreator.alienevoaddons.AlienevoaddonsMod;

public class AcceptDeTransformProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).deTransformCooldown > 0) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("tellraw " + entity.getDisplayName().getString() + " [\"\",{\"text\":\"[AlienEvo-Addon] \",\"bold\":true,\"color\":\"green\"},{\"text\":\"Detransforming..\"}]"));
			{
				double _setval = 0;
				entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.deTransformCooldown = _setval;
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
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("scoreboard players set " + (entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName + " AlienEvo.Timer 6000"));
			if ((entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).hasMasterControl
					&& world.getLevelData().getGameRules().getBoolean(AlienevoaddonsModGameRules.MASTER_CONTROL_TIMER) == true) {
				AlienevoaddonsMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("scoreboard players set " + (entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName + " AlienEvo.Timer 0"));
					{
						boolean _setval = false;
						entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.hasMasterControl = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				});
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("tellraw " + entity.getDisplayName().getString() + " [\"\",{\"text\":\"[AlienEvo-Addon] \",\"bold\":true,\"color\":\"green\"},{\"text\":\"Request Timed Out...\"}]"));
		}
	}
}
