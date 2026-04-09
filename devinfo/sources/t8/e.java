package t8;

import g8.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f34506c;

    /* renamed from: a, reason: collision with root package name */
    public y f34507a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f34508b;

    static {
        char[] cArr = m.f34520a;
        f34506c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f34507a.available();
    }

    public final void c() {
        this.f34508b = null;
        this.f34507a = null;
        ArrayDeque arrayDeque = f34506c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34507a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        this.f34507a.mark(i4);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f34507a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f34507a.read();
        } catch (IOException e2) {
            this.f34508b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f34507a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f34507a.skip(j);
        } catch (IOException e2) {
            this.f34508b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f34507a.read(bArr);
        } catch (IOException e2) {
            this.f34508b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        try {
            return this.f34507a.read(bArr, i4, i10);
        } catch (IOException e2) {
            this.f34508b = e2;
            throw e2;
        }
    }
}
