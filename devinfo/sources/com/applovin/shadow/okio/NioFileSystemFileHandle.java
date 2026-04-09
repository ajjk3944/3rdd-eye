package com.applovin.shadow.okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z3, FileChannel fileChannel) {
        super(z3);
        k.e(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized int protectedRead(long j, byte[] bArr, int i4, int i10) {
        k.e(bArr, "array");
        this.fileChannel.position(j);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i4, i10);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int i12 = this.fileChannel.read(byteBufferWrap);
            if (i12 != -1) {
                i11 += i12;
            } else if (i11 == 0) {
                return -1;
            }
        }
        return i11;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedResize(long j) throws Throwable {
        try {
            try {
                long size = size();
                long j8 = j - size;
                if (j8 > 0) {
                    int i4 = (int) j8;
                    protectedWrite(size, new byte[i4], 0, i4);
                } else {
                    this.fileChannel.truncate(j);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedWrite(long j, byte[] bArr, int i4, int i10) {
        k.e(bArr, "array");
        this.fileChannel.position(j);
        this.fileChannel.write(ByteBuffer.wrap(bArr, i4, i10));
    }
}
