package git.jse.planetacorp.fabric.item;

import git.jse.planetacorp.fabric.PlanetaAddonsMod;
import git.jse.planetacorp.fabric.item.PlanetaAddonsItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class PlanetaAddonsItemGroups {

    public static final ItemGroup PLANETAADDONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PlanetaAddonsMod.MODID, "all_iv_maxer"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planetaaddons"))
                    .icon(() -> new ItemStack(PlanetaAddonsItems.ALL_IV_MAXER)).entries((displayContext, entries) -> {

                        // troca pokebola
                        entries.add(PlanetaAddonsItems.BALL_CHANGER);

                        //amizade maxima
                        entries.add(PlanetaAddonsItems.FRIENDSHIP_ADD_MAX);
                        // Gold BottleCap
                        entries.add(PlanetaAddonsItems.ALL_IV_MAXER);
                        // Random BottleCap
                        entries.add(PlanetaAddonsItems.IV_RANDOM);
                        // Legendary BottleCap
                        entries.add(PlanetaAddonsItems.IV_LEGENDRANDOM);
                        // Silver BottleCap
                        entries.add(PlanetaAddonsItems.SILVER_BOTTLECAP);
                        // Copper BottleCap
                        entries.add(PlanetaAddonsItems.COPPER_BOTTLECAP);
                        // Level maximo
                        entries.add(PlanetaAddonsItems.LVL_ADD_MAX);
                        // Level aleatorio
                        entries.add(PlanetaAddonsItems.LVL_RANDOM);
                        // NatureChanger
                        entries.add(PlanetaAddonsItems.NATURE_CHANGER);
                        // Troca genero
                        entries.add(PlanetaAddonsItems.GENDER_SWAPPER);
                        // ShinySwap
                        entries.add(PlanetaAddonsItems.SHINY_SWAPPER);
                    }).build());


    public static void registerItemGroups() {
        PlanetaAddonsMod.LOGGER.info("Registrando os itens do " + PlanetaAddonsMod.MODID);
    }
}
