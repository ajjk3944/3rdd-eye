package h3;

import U2.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f38199d;

    /* renamed from: b, reason: collision with root package name */
    public w f38200b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f38201c;

    static {
        char[] cArr = l.f38217a;
        f38199d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f38200b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38200b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f38200b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f38200b.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f38200b.read();
        } catch (IOException e4) {
            this.f38201c = e4;
            throw e4;
        }
    }

    public final void release() {
        this.f38201c = null;
        this.f38200b = null;
        ArrayDeque arrayDeque = f38199d;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f38200b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j4) throws IOException {
        try {
            return this.f38200b.skip(j4);
        } catch (IOException e4) {
            this.f38201c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f38200b.read(bArr);
        } catch (IOException e4) {
            this.f38201c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        try {
            return this.f38200b.read(bArr, i, i10);
        } catch (IOException e4) {
            this.f38201c = e4;
            throw e4;
        }
    }
}
