package git.jse.planetacorp.fabric;

import git.jse.planetacorp.fabric.item.PlanetaAddonsItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlanetaAddonsMod implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger(PlanetaAddonsMod.class); // Logger do mod
    public static final String MODID = "planetaaddons"; // Meu ID

    @Override
    public void onInitialize() {
        // Registra os itens do mod
        PlanetaAddonsItems.registerModItems();
        // Inicia essa bomba
        LOGGER.info("[PlanetaAddonsMod] Mod inicializado com sucesso!");
    }
}
