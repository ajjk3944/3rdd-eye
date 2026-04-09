package H1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f1753a;

    /* renamed from: b, reason: collision with root package name */
    public int f1754b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f1753a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1753a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f1754b = this.f1753a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f1753a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f1754b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f1753a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        ByteBuffer byteBuffer = this.f1753a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j6, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) {
        ByteBuffer byteBuffer = this.f1753a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i3, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
