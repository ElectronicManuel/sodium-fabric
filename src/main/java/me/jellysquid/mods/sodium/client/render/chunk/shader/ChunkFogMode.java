package me.jellysquid.mods.sodium.client.render.chunk.shader;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Function;

public enum ChunkFogMode {
    NONE(ChunkShaderFogComponent.None::new, ImmutableList.of()),
    SMOOTH(ChunkShaderFogComponent.Smooth::new, ImmutableList.of("USE_FOG", "USE_FOG_SMOOTH"));

    private final Function<ChunkProgram, ChunkShaderFogComponent> factory;
    private final List<String> defines;

    ChunkFogMode(Function<ChunkProgram, ChunkShaderFogComponent> factory, List<String> defines) {
        this.factory = factory;
        this.defines = defines;
    }

    public Function<ChunkProgram, ChunkShaderFogComponent> getFactory() {
        return this.factory;
    }

    public List<String> getDefines() {
        return this.defines;
    }
}
