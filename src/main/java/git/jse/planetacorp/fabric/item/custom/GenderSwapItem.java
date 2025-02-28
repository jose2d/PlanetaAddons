package git.jse.planetacorp.fabric.item.custom;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Gender;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;

import java.util.List;

public class GenderSwapItem extends PokemonUseItem {
    public GenderSwapItem() { super(new Item.Settings().maxCount(1));}

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {

        Gender gender = pokemon.getGender();
        // if gender is genderless, it cannot swap
        if (gender == Gender.GENDERLESS) {
            player.sendMessage(Text.of("Não é possível alterar o gênero de um Pokémon de gênero desconhecido"));
            return ActionResult.FAIL;
        }



        // swap male -> female and female -> male
        // future updates, make verify if the pokémon have only 1 gender
        if (gender == Gender.MALE) {
            Gender newGender = Gender.FEMALE;
            pokemon.setGender(newGender);
            String genderName = newGender.name().toLowerCase(); // Get the lowercase gender name
            String formattedGender = Character.toUpperCase(genderName.charAt(0)) + genderName.substring(1); // Convert to title case
            player.sendMessage(Text.of("O gênero do Pokémon foi alterado para "+formattedGender));
        } else if (gender == Gender.FEMALE) {
            Gender newGender = Gender.MALE;
            pokemon.setGender(newGender);
            String genderName = newGender.name().toLowerCase(); // Get the lowercase gender name
            String formattedGender = Character.toUpperCase(genderName.charAt(0)) + genderName.substring(1); // Convert to title case
            player.sendMessage(Text.of("O gênero do Pokémon foi alterado para "+formattedGender));
        }

        itemStack.decrement(1);
        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.planetaaddons.gender_swapper.lore").formatted(Formatting.GRAY));
    }
}
