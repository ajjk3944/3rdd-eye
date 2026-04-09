package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j6, long j7) {
        return a(randomAccessFile.getChannel(), j6, j7);
    }

    public static q a(FileChannel fileChannel, long j6, long j7) {
        fileChannel.getClass();
        return new m(fileChannel, j6, j7);
    }
}
