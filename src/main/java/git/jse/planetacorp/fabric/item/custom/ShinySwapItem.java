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

public class ShinySwapItem extends PokemonUseItem {
    public ShinySwapItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        // Verifica se o Pokémon é Ditto, precisamos ripar o ditto familia
        String speciesPath = pokemon.getSpecies().getResourceIdentifier().getPath();
        if ("ditto".equals(speciesPath)) {
            player.sendMessage(Text.of("Não é possível usar este item em Ditto!"));
            return ActionResult.FAIL;
        }

        boolean isShiny = pokemon.getShiny(); // Verifica se o Pokémon é Shiny

        // Alterna o status de Shiny
        pokemon.setShiny(!isShiny);

        String shinyMessage = isShiny ? "não é mais Shiny" : "agora é Shiny";
        player.sendMessage(Text.of("O Pokémon " + shinyMessage));
        itemStack.decrement(1); // Remove o item após o uso

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.shiny_swapper.lore").formatted(Formatting.GRAY));
    }


}
