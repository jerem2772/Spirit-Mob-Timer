package fr.jerem2772.spiritmobtimer;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import fr.jerem2772.spiritmobtimer.config.ConfigHandler;


@Mod("spiritmobtimer")
public class SpiritMobTimer {
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpiritMobTimer() {
        MinecraftForge.EVENT_BUS.register(this);
        ConfigHandler.register();
        LOGGER.info("SpiritMobTimer mod loadded !");
    }
}
