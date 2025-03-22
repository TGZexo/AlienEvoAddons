
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alienevoaddons.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlienevoaddonsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> ALLOW_HELPING_DETRANSFORM = GameRules.register("allowHelpingDetransform", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> BASE_FORM_HELPING_DETRANSFORMATION = GameRules.register("baseFormHelpingDetransformation", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> MASTER_CONTROL_TIMER = GameRules.register("masterControlTimer", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
