package me.jellysquid.mods.sodium.render.chunk.arena;

import me.jellysquid.mods.thingl.buffer.Buffer;

import java.util.stream.Stream;

public interface GlBufferArena {
    int getDeviceUsedMemory();

    int getDeviceAllocatedMemory();

    void free(GlBufferSegment entry);

    void delete();

    boolean isEmpty();

    Buffer getBufferObject();

    boolean upload(Stream<PendingUpload> stream);
}
