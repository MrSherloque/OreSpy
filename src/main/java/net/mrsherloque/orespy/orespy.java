package net.mrsherloque.orespy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.mrsherloque.orespy.event.AttackBlockHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class orespy implements ModInitializer {
	public static final String MOD_ID = "orespy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AttackBlockCallback.EVENT.register(((player, world, hand, pos, direction) -> {
			BlockState state = world.getBlockState(pos);

			if (state.isToolRequired() && !player.isSpectator() &&
					player.getMainHandStack().isEmpty()
		}));
	}
}
