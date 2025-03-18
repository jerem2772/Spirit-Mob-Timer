package fr.jerem2772.spiritmobtimer.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigHandler {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec CONFIG;

    // Option de configuration : Range d’inflation
    public static final ForgeConfigSpec.DoubleValue SPAWN_RANGE;

    static {
        SPAWN_RANGE = BUILDER
                .comment("Defines the detection range (in blocks) around the Soul Cage for spawned entities.",
                        "Default: 11.0")
                .defineInRange("spawning.range", 11.0, 0.5, 20.0);

        CONFIG = BUILDER.build();
    }

    public static void register() {
        net.minecraftforge.fml.ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CONFIG, "spiritmobtimer-common.toml");
    }
}
