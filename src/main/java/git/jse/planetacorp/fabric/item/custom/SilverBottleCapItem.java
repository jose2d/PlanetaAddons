package git.jse.planetacorp.fabric.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

/**
 * Classe SilverBottleCapItem que representa um item sem funcionalidade específica.
 * Fazer a funcionalidade em um mod aparte
 */
public class SilverBottleCapItem extends Item {

    public SilverBottleCapItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.silver_bottlecap.lore").formatted(Formatting.GRAY));
    }
}
