package git.jse.planetacorp.fabric.item.custom;

import com.cobblemon.mod.common.api.interaction.PokemonEntityInteraction.Ownership;
import com.cobblemon.mod.common.api.storage.StoreCoordinates;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

<<<<<<< HEAD
=======
/**
>>>>>>> master
public abstract class PokemonUseItem extends Item {
    public PokemonUseItem(Item.Settings settings) {
        super(settings);
    }

    private Pokemon lastInteractedPokemon;
    private Pokemon pokemon;

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity player, LivingEntity target, Hand hand) {
        if (player.getWorld().isClient) {
            return ActionResult.PASS;
        }

        //checks whether target is Pokémon
        if (!(target instanceof PokemonEntity pokemonEntity)) {
            player.sendMessage(Text.of("Não é um pokemon"));
            return ActionResult.FAIL;
        }
        // stores pokemon information u.u
        lastInteractedPokemon = pokemonEntity.getPokemon();

        // stores pokemon information xd
        Pokemon pokemon = pokemonEntity.getPokemon();
        StoreCoordinates<?> storeCoordinates = pokemon.getStoreCoordinates().get();

        // determines Pokémon ownership :o
        Ownership ownership;
        if (storeCoordinates == null) {
            ownership = Ownership.WILD;
        } else if (storeCoordinates.getStore().getUuid().equals(player.getUuid())) {
            ownership = Ownership.OWNER;
        } else {
            ownership = Ownership.OWNED_ANOTHER;
        }

        // when you are not Pokémon's owner, give error
        if (ownership != Ownership.OWNER) {
            player.sendMessage(Text.of("Este não é seu Pokémon"));
            return ActionResult.FAIL;
        }

        return processInteraction(itemStack, player, pokemonEntity, pokemon);
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }

    public Pokemon getLastInteractedPokemon() {
        return lastInteractedPokemon;
    }
    public abstract ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon);

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
    }


<<<<<<< HEAD
}
=======
}
 */
>>>>>>> master
