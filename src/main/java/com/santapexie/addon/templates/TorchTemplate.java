package com.santapexie.addon.templates;

import net.minecraft.block.*;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

public class TorchTemplate extends TorchBlock {

    public TorchTemplate(Settings settings, ParticleEffect particle) {
        super(settings, particle);
    }
}
