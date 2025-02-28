package git.jse.planetacorp.fabric.item.custom;

import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.IVs;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;

import java.util.List;
import java.util.Random;

public class IVRandomItem extends PokemonUseItem {
    public IVRandomItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        // Verifica se o Pokémon é Ditto
        String speciesPath = pokemon.getSpecies().getResourceIdentifier().getPath();
        if ("ditto".equals(speciesPath)) {
            player.sendMessage(Text.of("Não é possível usar este item em Ditto!"));
            return ActionResult.FAIL;
        }

        IVs ivs = pokemon.getIvs(); // Acessa os IVs do Pokémon
        Random random = new Random(); // Gerador de números aleatórios

        // Randomiza todos os IVs
        for (Stat stat : Stats.values()) {
            int randomValue = random.nextInt(IVs.MAX_VALUE + 1); // Gera um valor aleatório entre 0 e o valor máximo de IV
            ivs.set(stat, randomValue); // Define o IV para o valor gerado
        }

        itemStack.decrement(1); // Remove o item após o uso
        player.sendMessage(Text.of("Todos os IVs foram randomizados."));
        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.iv_random.lore").formatted(Formatting.GRAY));
    }
}
