package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        k.e(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, Buffer buffer, long j8) throws IOException {
        k.e(buffer, "sink");
        if (j8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j9 = j;
        long j10 = j8;
        while (j10 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j9, j10, buffer);
            j9 += jTransferTo;
            j10 -= jTransferTo;
        }
    }

    public final void write(long j, Buffer buffer, long j8) throws IOException {
        k.e(buffer, "source");
        if (j8 < 0 || j8 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j9 = j;
        long j10 = j8;
        while (j10 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(buffer, j9, j10);
            j9 += jTransferFrom;
            j10 -= jTransferFrom;
        }
    }
}
