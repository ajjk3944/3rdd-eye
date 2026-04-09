package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j, long j8) {
        return a(randomAccessFile.getChannel(), j, j8);
    }

    public static q a(FileChannel fileChannel, long j, long j8) {
        fileChannel.getClass();
        return new m(fileChannel, j, j8);
    }
}
