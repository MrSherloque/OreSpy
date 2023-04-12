package net.mrsherloque.orespy;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.mrsherloque.orespy.event.AttackBlockHandler;

public class orespyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        AttackBlockCallback.EVENT.register(new AttackBlockHandler());
    }
}
