package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iy implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f12537a;

    public iy(ByteBuffer byteBuffer) {
        this.f12537a = byteBuffer.duplicate();
    }

    public final int c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f12537a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public final long e() {
        return this.f12537a.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
