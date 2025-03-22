package net.mcreator.alienevoaddons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
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

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReduceOmniTimerProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AlienevoaddonsModGameRules.ALLOW_HELPING_DETRANSFORM) == true) {
			if (!((entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerRequestedDetransform).equals(sourceentity.getDisplayName().getString())) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"scoreboard players set @a[distance=..5] isTransformed 0");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("scoreboard players set @a[distance=..5]" + " isTransformed 0"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("scoreboard players set @a[distance=..5," + "tag=AlienEvo.Transformation] isTransformed 1"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("scoreboard players set @a[distance=..5," + "tag=AlienEvo.BaseForm] hasBaseForm 1"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("scoreboard players set @a[distance=..5," + "tag=AlienEvo.MasterControl] hasMasterControl 1"));
				if (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("isTransformed", entity) == 1) {
					if (!(new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.level().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
							return 0;
						}
					}.getScore("hasMasterControl", entity) == 1)) {
						if (new Object() {
							public int getScore(String score, Entity _ent) {
								Scoreboard _sc = _ent.level().getScoreboard();
								Objective _so = _sc.getObjective(score);
								if (_so != null)
									return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
								return 0;
							}
						}.getScore("hasMasterControl", sourceentity) == 1) {
							{
								boolean _setval = true;
								entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.hasMasterControl = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = (sourceentity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName;
								entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.playerRequestedDetransform = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 10;
								entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.deTransformCooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("tellraw " + (entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName
												+ " [\"\",{\"text\":\"[AlienEvo-Addon] \",\"bold\":true,\"color\":\"green\"},{\"text\":\""
												+ (sourceentity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName
												+ "\",\"color\":\"white\"},{\"text\":\" is trying to detransform you, would you like to?\",\"color\":\"white\"},{\"text\":\"\\n\"},{\"text\":\"> Yes\",\"bold\":true,\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/confirmDeTransform\"}},{\"text\":\"\\n\",\"bold\":true},{\"text\":\"> No\",\"bold\":true,\"color\":\"dark_red\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/denyDeTransform\"}}]"));
						} else if (new Object() {
							public int getScore(String score, Entity _ent) {
								Scoreboard _sc = _ent.level().getScoreboard();
								Objective _so = _sc.getObjective(score);
								if (_so != null)
									return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
								return 0;
							}
						}.getScore("hasBaseForm", sourceentity) == 1 && world.getLevelData().getGameRules().getBoolean(AlienevoaddonsModGameRules.BASE_FORM_HELPING_DETRANSFORMATION) == true) {
							{
								String _setval = (sourceentity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName;
								entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.playerRequestedDetransform = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 10;
								entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.deTransformCooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("tellraw " + (entity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName
												+ " [\"\",{\"text\":\"[AlienEvo-Addon] \",\"bold\":true,\"color\":\"green\"},{\"text\":\""
												+ (sourceentity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName
												+ "\",\"color\":\"white\"},{\"text\":\" is trying to detransform you, would you like to?\",\"color\":\"white\"},{\"text\":\"\\n\"},{\"text\":\"> Yes\",\"bold\":true,\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/confirmDeTransform\"}},{\"text\":\"\\n\",\"bold\":true},{\"text\":\"> No\",\"bold\":true,\"color\":\"dark_red\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/denyDeTransform\"}}]"));
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("tellraw " + (sourceentity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName
												+ " [\"\",{\"text\":\"[AlienEvo-Addon] \",\"bold\":true,\"color\":\"green\"},{\"text\":\"You must have Base Form or Master Control to do this...\"}]"));
						}
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("tellraw " + (sourceentity.getCapability(AlienevoaddonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AlienevoaddonsModVariables.PlayerVariables())).playerName
											+ " [\"\",{\"text\":\"[AlienEvo-Addon] \",\"bold\":true,\"color\":\"green\"},{\"text\":\"The targeted player has Master Control\"}]"));
					}
				}
			}
		}
	}
}
