
package net.mcreator.alienevoaddons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UpgradeItem extends Item {
	public UpgradeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
