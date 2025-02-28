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

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IVLegendRandomItem extends PokemonUseItem {
    public IVLegendRandomItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        IVs ivs = pokemon.getIvs(); // Access the IVs of the Pokémon
        Random random = new Random(); // Random number generator

        // Get only the main stats to modify
        List<Stat> mainStats = Stream.of(Stats.HP, Stats.ATTACK, Stats.DEFENCE, Stats.SPECIAL_ATTACK, Stats.SPECIAL_DEFENCE, Stats.SPEED).collect(Collectors.toList());
        Collections.shuffle(mainStats); // Shuffle to randomize

        int guaranteedIVs = 0;

        if (pokemon.isLegendary()) {
            guaranteedIVs = 3;
        } else if (pokemon.isUltraBeast()) {
            guaranteedIVs = 2;
        }

        // Set guaranteed IVs to 31
        for (int i = 0; i < guaranteedIVs; i++) {
            ivs.set(mainStats.get(i), IVs.MAX_VALUE);
        }

        // Set the remaining stats to random values
        for (int i = guaranteedIVs; i < mainStats.size(); i++) {
            int randomValue = random.nextInt(IVs.MAX_VALUE + 1);
            ivs.set(mainStats.get(i), randomValue);
        }

        if (guaranteedIVs == 0) { // Randomize all if it's a normal Pokémon
            for (Stat stat : mainStats) {
                int randomValue = random.nextInt(IVs.MAX_VALUE + 1);
                ivs.set(stat, randomValue);
            }
        }

        itemStack.decrement(1);
        player.sendMessage(Text.of("Você usou seu IV Aleatorio"));
        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.iv_legend_random.lore").formatted(Formatting.GRAY));
    }

}
