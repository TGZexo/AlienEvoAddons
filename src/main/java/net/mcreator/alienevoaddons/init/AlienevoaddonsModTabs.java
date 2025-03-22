
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alienevoaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.alienevoaddons.AlienevoaddonsMod;

public class AlienevoaddonsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlienevoaddonsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ALIEN_EVO_OUTFIT = REGISTRY.register("alien_evo_outfit", () -> CreativeModeTab.builder().title(Component.translatable("item_group.alienevoaddons.alien_evo_outfit"))
			.icon(() -> new ItemStack(AlienevoaddonsModItems.BEN_10_ALIEN_FORCE_OUTFIT_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlienevoaddonsModItems.INVIS_ARMOR_HELMET.get());
				tabData.accept(AlienevoaddonsModItems.INVIS_ARMOR_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.INVIS_ARMOR_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.INVIS_ARMOR_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OG_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OG_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OG_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OG_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OG_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OG_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_ALIEN_FORCE_OUTFIT_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_ALIEN_FORCE_OUTFIT_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_ALIEN_FORCE_OUTFIT_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_ALIEN_FORCE_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_ALIEN_FORCE_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_ALIEN_FORCE_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OMNI_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OMNI_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OMNI_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OMNI_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OMNI_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OMNI_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OMNITRIXLESS_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OMNITRIXLESS_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_OMNITRIXLESS_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OMNITRIXLESS_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OMNITRIXLESS_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_OMNITRIXLESS_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_REBOOT_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_REBOOT_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.BEN_10_REBOOT_BOOTS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_REBOOT_CHESTPLATE.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_REBOOT_LEGGINGS.get());
				tabData.accept(AlienevoaddonsModItems.ALBEDO_REBOOT_BOOTS.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> ALIEN_ICONS = REGISTRY.register("alien_icons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alienevoaddons.alien_icons")).icon(() -> new ItemStack(AlienevoaddonsModItems.OMNITRIX_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlienevoaddonsModItems.HEATBLAST.get());
				tabData.accept(AlienevoaddonsModItems.WILDMUTT.get());
				tabData.accept(AlienevoaddonsModItems.DIAMOND_HEAD.get());
				tabData.accept(AlienevoaddonsModItems.XLR_8.get());
				tabData.accept(AlienevoaddonsModItems.GREYMATTER.get());
				tabData.accept(AlienevoaddonsModItems.FOUR_ARMS.get());
				tabData.accept(AlienevoaddonsModItems.STINKFLY.get());
				tabData.accept(AlienevoaddonsModItems.RIPJAWS.get());
				tabData.accept(AlienevoaddonsModItems.UPGRADE.get());
				tabData.accept(AlienevoaddonsModItems.GHOSTFREAK.get());
				tabData.accept(AlienevoaddonsModItems.CANNONBOLT.get());
				tabData.accept(AlienevoaddonsModItems.SWAMPFIRE.get());
				tabData.accept(AlienevoaddonsModItems.ECHO_ECHO.get());
				tabData.accept(AlienevoaddonsModItems.HUMUNGOUSAUR.get());
				tabData.accept(AlienevoaddonsModItems.JETRAY.get());
				tabData.accept(AlienevoaddonsModItems.BIG_CHILL.get());
				tabData.accept(AlienevoaddonsModItems.CHROMASTONE.get());
				tabData.accept(AlienevoaddonsModItems.ATOMIX.get());
			}).withSearchBar().withTabsBefore(ALIEN_EVO_OUTFIT.getId()).build());
	public static final RegistryObject<CreativeModeTab> ALIEN_EVO_ADDONS_FABRICS = REGISTRY.register("alien_evo_addons_fabrics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alienevoaddons.alien_evo_addons_fabrics")).icon(() -> new ItemStack(AlienevoaddonsModItems.ROLL_OF_FABRIC_WHITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_WHITE.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_LIGHT_GREY.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_GREY.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_BLACK.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_BROWN.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_RED.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_ORANGE.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_YELLOW.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_LIME.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_GREEN.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_CYAN.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_LIGHT_BLUE.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_BLUE.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_PURPLE.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_MAGENTA.get());
				tabData.accept(AlienevoaddonsModItems.ROLL_OF_FABRIC_PINK.get());
			}).withTabsBefore(ALIEN_ICONS.getId()).build());
}
