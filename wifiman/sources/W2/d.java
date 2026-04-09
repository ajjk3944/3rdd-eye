package W2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final Queue f23581c = l.f(0);

    /* renamed from: a, reason: collision with root package name */
    private InputStream f23582a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f23583b;

    d() {
    }

    public static d g(InputStream inputStream) {
        d dVar;
        Queue queue = f23581c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.j(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f23583b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f23582a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23582a.close();
    }

    public void h() {
        this.f23583b = null;
        this.f23582a = null;
        Queue queue = f23581c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void j(InputStream inputStream) {
        this.f23582a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f23582a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f23582a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f23582a.read();
        } catch (IOException e10) {
            this.f23583b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f23582a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f23582a.skip(j10);
        } catch (IOException e10) {
            this.f23583b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f23582a.read(bArr);
        } catch (IOException e10) {
            this.f23583b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f23582a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f23583b = e10;
            throw e10;
        }
    }
}
