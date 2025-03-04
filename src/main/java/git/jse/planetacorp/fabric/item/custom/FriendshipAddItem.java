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

<<<<<<< HEAD
public class FriendshipAddItem extends PokemonUseItem {
=======
public class FriendshipAddItem extends Item {
>>>>>>> master

    public FriendshipAddItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
<<<<<<< HEAD
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        int maxFriendship = 255; // Maximum friendship value
        int currentFriendship = pokemon.getFriendship(); // Current friendship value

        if (currentFriendship >= maxFriendship) {
            // If friendship is already at max, return fail
            player.sendMessage(Text.of("A amizade do Pokémon já está no máximo"), false);
            return ActionResult.FAIL;
        }

        // Calculate the amount needed to reach max friendship
        int amountToMax = maxFriendship - currentFriendship;

        // Increment the friendship by the calculated amount
        boolean increasedFriendship = pokemon.incrementFriendship(amountToMax, false);

        if (increasedFriendship) {
            player.sendMessage(Text.of("A amizade do Pokémon foi aumentada para o máximo (" + maxFriendship + ")"), false);

            // Remove one item from the stack, super important
            itemStack.decrement(1);

            return ActionResult.SUCCESS;
        } else {
            player.sendMessage(Text.of("Não foi possível aumentar a amizade do Pokémon."), false);
            return ActionResult.FAIL;
        }
    }

    @Override
=======
>>>>>>> master
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.friendship_max.lore").formatted(Formatting.GRAY));
    }

}
