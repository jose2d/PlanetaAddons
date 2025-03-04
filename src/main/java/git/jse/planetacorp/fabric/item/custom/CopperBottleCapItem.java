<<<<<<< HEAD
package git.jse.planetacorp.fabric.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

/**
 * Classe CopperBottleCapItem que representa um item sem funcionalidade específica.
 * Algum momento vai funcionar.
 */
public class CopperBottleCapItem extends Item {

    public CopperBottleCapItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.copper_bottlecap.lore").formatted(Formatting.GRAY));
    }
}
=======
package git.jse.planetacorp.fabric.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

/**
 * Classe CopperBottleCapItem que representa um item sem funcionalidade específica.
 * Algum momento vai funcionar.
 */
public class CopperBottleCapItem extends Item {

    public CopperBottleCapItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.copper_bottlecap.lore").formatted(Formatting.GRAY));
    }
}
>>>>>>> master
