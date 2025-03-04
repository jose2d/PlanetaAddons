package git.jse.planetacorp.fabric.item;

import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.api.pokemon.Natures;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import git.jse.planetacorp.fabric.PlanetaAddonsMod;
import git.jse.planetacorp.fabric.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PlanetaAddonsItems {
    // register IVMaxer
    public static final IVMaxerItem ALL_IV_MAXER = registerIVMaxerItem("gold_bottlecap",new IVMaxerItem());
    // register IVRandom
    public static final IVRandomItem IV_RANDOM = registerIVRandomItem("iv_random",new IVRandomItem());
    // register IVLegendRandom
    public static final IVLegendRandomItem IV_LEGENDRANDOM = registerIVLegendRandomItem("iv_legend_random",new IVLegendRandomItem());

    // register IVLegendRandom
    public static final SilverBottleCapItem SILVER_BOTTLECAP = registerSilverBottleCapItem("silver_bottlecap",new SilverBottleCapItem());

    public static final CopperBottleCapItem COPPER_BOTTLECAP = registerCopperBottleCapItem("copper_bottlecap",new CopperBottleCapItem());
    // register LVLRandom
    public static final LVLRandomItem LVL_RANDOM = registerLVLRandomItem("level_random",new LVLRandomItem());
    // register GenderSwap
    public static final GenderSwapItem GENDER_SWAPPER = registerGenderSwapItem("gender_swapper",new GenderSwapItem());
    //ShinySwap
    public static final ShinySwapItem SHINY_SWAPPER = registerShinySwapItem("shiny_swapper",new ShinySwapItem());
    //CaughtBallChanger
    public static final CaughtBallChangerItem BALL_CHANGER = registerCaughtBallChangerItem("ball_changer", new CaughtBallChangerItem());

    // FriendshipAddItem
    public static final FriendshipAddItem FRIENDSHIP_ADD_MAX = registerFriendshipAddItem("friendship_max", new FriendshipAddItem());
    // IVAddItem
    public static final LVLAddItem LVL_ADD_MAX = registerLVLAddItem("lvl_max", new LVLAddItem());
    // NatureChangerItem
    public static final NatureChangerItem NATURE_CHANGER = registerNatureChangerItem("nature_changer", new NatureChangerItem());

    // Registrar itens vanilla
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),item);
    }
<<<<<<< HEAD
=======
    /**
>>>>>>> master
    // Registrar PokemonUse
    private static PokemonUseItem registerPokemonUseItem(String name, PokemonUseItem pokemonUseItem) {
        return (PokemonUseItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),pokemonUseItem);
    }
<<<<<<< HEAD
=======
    */
>>>>>>> master
    //Registrar IVMaxer
    private static IVMaxerItem registerIVMaxerItem(String name, IVMaxerItem ivMaxerItem) {
        return (IVMaxerItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name), ivMaxerItem);
    }
    // Registrar IVRandomizer
    private static IVRandomItem registerIVRandomItem(String name, IVRandomItem ivRandomItem) {
        return (IVRandomItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),ivRandomItem);
    }
    // Registrar IVRandomizer
    private static IVLegendRandomItem registerIVLegendRandomItem(String name, IVLegendRandomItem ivLegendRandomItem) {
        return (IVLegendRandomItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),ivLegendRandomItem);
    }

    private static SilverBottleCapItem registerSilverBottleCapItem(String name, SilverBottleCapItem silverBottleCapItem) {
        return (SilverBottleCapItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),silverBottleCapItem);
    }

    private static CopperBottleCapItem registerCopperBottleCapItem(String name, CopperBottleCapItem copperBottleCapItem) {
        return (CopperBottleCapItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),copperBottleCapItem);
    }
    // Registrar lvlrandom
    private static LVLRandomItem registerLVLRandomItem(String name, LVLRandomItem lvlRandomItem) {
        return (LVLRandomItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),lvlRandomItem);
    }
    // Registrar GenderSwap
    private static GenderSwapItem registerGenderSwapItem(String name, GenderSwapItem genderSwapItem) {
        return (GenderSwapItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name),genderSwapItem);
    }
    // Registrar ShinySwap
    private static ShinySwapItem registerShinySwapItem(String name, ShinySwapItem shinySwapItem) {
        return (ShinySwapItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name), shinySwapItem);
    }
    // Registrar CaightBallChanger
    private static CaughtBallChangerItem registerCaughtBallChangerItem(String name, CaughtBallChangerItem caughtBallChangerItem) {
        return (CaughtBallChangerItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name), caughtBallChangerItem);
    }
    // Registrar FriendShipAdd
    private static FriendshipAddItem registerFriendshipAddItem(String name, FriendshipAddItem friendshipAddItem) {
        return (FriendshipAddItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name), friendshipAddItem);
    }
    // Registrar LVLAddItem
    private static LVLAddItem registerLVLAddItem(String name, LVLAddItem lvlAddItem) {
        return (LVLAddItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name), lvlAddItem);
    }
    // Registrar NatureChangerItem
    private static NatureChangerItem registerNatureChangerItem(String name, NatureChangerItem natureChangerItem) {
        return (NatureChangerItem) Registry.register(Registries.ITEM, Identifier.of(PlanetaAddonsMod.MODID, name), natureChangerItem);
    }

    public static void registerModItems() {
        PlanetaAddonsMod.LOGGER.info("Registrando os itens do mod " + PlanetaAddonsMod.MODID) ;

        // criativo
        PlanetaAddonsItemGroups.registerItemGroups();
    }
}
