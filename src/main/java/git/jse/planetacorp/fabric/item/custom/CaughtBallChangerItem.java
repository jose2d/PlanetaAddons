package git.jse.planetacorp.fabric.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

/**
 * Classe CaughtBallChangerItem que representa um item sem funcionalidade específica.
 * Fazer funcionar é isso.
 */
public class CaughtBallChangerItem extends Item {

    public CaughtBallChangerItem() {
        super(new Item.Settings().maxCount(1)); // Apenas 1 item por pilha
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.caught_ball_changer.lore").formatted(Formatting.GRAY));
    }

}
