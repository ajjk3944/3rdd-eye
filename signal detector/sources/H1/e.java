package H1;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import u1.y;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f1759c;

    /* renamed from: a, reason: collision with root package name */
    public y f1760a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f1761b;

    static {
        char[] cArr = p.f1779a;
        f1759c = new ArrayDeque(0);
    }

    public final void a() {
        this.f1761b = null;
        this.f1760a = null;
        ArrayDeque arrayDeque = f1759c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1760a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1760a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f1760a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f1760a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f1760a.read();
        } catch (IOException e6) {
            this.f1761b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f1760a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j6) throws IOException {
        try {
            return this.f1760a.skip(j6);
        } catch (IOException e6) {
            this.f1761b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f1760a.read(bArr);
        } catch (IOException e6) {
            this.f1761b = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        try {
            return this.f1760a.read(bArr, i, i3);
        } catch (IOException e6) {
            this.f1761b = e6;
            throw e6;
        }
    }
}
