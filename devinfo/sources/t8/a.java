package t8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f34501a;

    /* renamed from: b, reason: collision with root package name */
    public int f34502b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f34501a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f34501a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i4) {
        this.f34502b = this.f34501a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f34501a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i4 = this.f34502b;
        if (i4 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f34501a.position(i4);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f34501a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) {
        ByteBuffer byteBuffer = this.f34501a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i4, iMin);
        return iMin;
    }
}
