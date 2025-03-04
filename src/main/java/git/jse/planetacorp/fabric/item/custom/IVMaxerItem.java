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
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
<<<<<<< HEAD

public class IVMaxerItem extends PokemonUseItem {
=======
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IVMaxerItem extends Item {
>>>>>>> master

    public IVMaxerItem() {
        super(new Item.Settings().maxCount(1));
    }

<<<<<<< HEAD
    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        // Verifica se o Pokémon é Ditto
        String speciesPath = pokemon.getSpecies().getResourceIdentifier().getPath();
        if ("ditto".equals(speciesPath)) {
            player.sendMessage(Text.of("Não é possível usar este item em Ditto!"));
            return ActionResult.FAIL;
        }

        IVs ivs = pokemon.getIvs(); // Acessa os IVs do Pokémon
        int IVsMaxed = 0;

        // Verifica quantos IVs já estão maximizados
        for (Stat stat : Stats.values()) {
            Integer currentIV = ivs.get(stat);
            if (currentIV == null) { // Ignora stats inválidos
                continue;
            }
            if (currentIV == IVs.MAX_VALUE) {
                IVsMaxed++;
            }
        }

        if (IVsMaxed == 6) { // Todos os IVs já maximizados
            player.sendMessage(Text.of("Todos os IVs já estão no máximo!"));
            return ActionResult.FAIL;
        }

        // Maximiza todos os IVs
        for (Stat stat : Stats.values()) {
            Integer currentIV = ivs.get(stat);
            if (currentIV != null) {
                ivs.set(stat, IVs.MAX_VALUE);
            }
        }

        // Remove o item após o uso
        itemStack.decrement(1);
        player.sendMessage(Text.of("Todos os valores de IV atingiram o máximo."));
        return ActionResult.SUCCESS;
    }
=======
>>>>>>> master

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.iv_maxer.lore").formatted(Formatting.GRAY));
    }
}
