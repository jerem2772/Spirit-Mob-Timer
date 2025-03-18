package fr.jerem2772.spiritmobtimer.mixin;

import fr.jerem2772.spiritmobtimer.config.ConfigHandler;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import me.codexadrian.spirit.blocks.blockentity.SoulCageBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(SoulCageBlockEntity.class)
public class SoulCageBlockEntityMixin {

    @Inject(method = "tick", at = @At("TAIL"), remap = false)
    private static void onEntitySpawn(Level level, BlockPos pos, BlockState state, SoulCageBlockEntity blockEntity, CallbackInfo ci) {
        if (!(level instanceof ServerLevel)) return;
        if (blockEntity == null || blockEntity.type == null) return;

        ServerLevel serverLevel = (ServerLevel) level;

        double range = ConfigHandler.SPAWN_RANGE.get();

        for (Entity entity : serverLevel.getEntities(null, entityBox(pos, range))) {
            if (entity.getType() == blockEntity.type) {
                if (entity.tickCount < 5) {
                    if (!entity.getPersistentData().contains("despawntimers.spawntime")) {
                        long gameTime = serverLevel.getGameTime();
                        entity.getPersistentData().putLong("despawntimers.spawntime", gameTime);
                    }
                }
            }
        }
    }
    private static net.minecraft.world.phys.AABB entityBox(BlockPos pos, double range) {
        return new net.minecraft.world.phys.AABB(pos).inflate(range);
    }
}
