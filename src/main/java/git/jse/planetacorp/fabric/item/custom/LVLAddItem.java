package git.jse.planetacorp.fabric.item.custom;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;

import java.util.List;

public class LVLAddItem extends PokemonUseItem {

    public LVLAddItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        int maxLevel = 100; // Maximum level
        int currentLevel = pokemon.getLevel(); // Current level

        if (currentLevel >= maxLevel) {
            // If level is already at max, return fail
            player.sendMessage(Text.of("O nível do Pokémon já está no máximo."), false);
            return ActionResult.FAIL;
        }

        // Set the Pokémon's level to the maximum
        pokemon.setLevel(maxLevel);

        player.sendMessage(Text.of("O nível do Pokémon foi aumentado para o máximo (" + maxLevel + ")."), false);

        itemStack.decrement(1);

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.lvl_max.lore").formatted(Formatting.GRAY));
    }
}
