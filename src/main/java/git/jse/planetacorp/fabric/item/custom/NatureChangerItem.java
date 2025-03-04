package git.jse.planetacorp.fabric.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

/**
 * Classe NatureChangerItem que representa um item sem funcionalidade específica.
 */
public class NatureChangerItem extends Item {

    public NatureChangerItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.nature_changer.lore").formatted(Formatting.GRAY));
    }
}
