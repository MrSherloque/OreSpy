package net.mrsherloque.orespy.event;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class AttackBlockHandler implements AttackBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction) {
        
        return ActionResult.PASS;
    }
}
