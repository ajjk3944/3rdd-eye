package ia;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes3.dex */
public final class v implements f {

    /* renamed from: b, reason: collision with root package name */
    public final A f38681b;

    /* renamed from: c, reason: collision with root package name */
    public final C4468d f38682c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38683d;

    public v(A sink) {
        kotlin.jvm.internal.l.f(sink, "sink");
        this.f38681b = sink;
        this.f38682c = new C4468d();
    }

    @Override // ia.f
    public final f A0(int i, int i10, byte[] source) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.B0(source, i, i10);
        c();
        return this;
    }

    @Override // ia.f
    public final f H0(long j4) throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.D0(j4);
        c();
        return this;
    }

    @Override // ia.f
    public final f L(int i) throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.C0(i);
        c();
        return this;
    }

    @Override // ia.f
    public final f P(h byteString) throws IOException {
        kotlin.jvm.internal.l.f(byteString, "byteString");
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.y0(byteString);
        c();
        return this;
    }

    @Override // ia.f
    public final long X(C c10) throws IOException {
        long j4 = 0;
        while (true) {
            long j10 = ((p) c10).read(this.f38682c, 8192L);
            if (j10 == -1) {
                return j4;
            }
            j4 += j10;
            c();
        }
    }

    public final f a() throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        C4468d c4468d = this.f38682c;
        long j4 = c4468d.f38643c;
        if (j4 > 0) {
            this.f38681b.write(c4468d, j4);
        }
        return this;
    }

    public final f c() throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        C4468d c4468d = this.f38682c;
        long jE = c4468d.e();
        if (jE > 0) {
            this.f38681b.write(c4468d, jE);
        }
        return this;
    }

    @Override // ia.f
    public final f c0(String string) throws IOException {
        kotlin.jvm.internal.l.f(string, "string");
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.R0(string);
        c();
        return this;
    }

    @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        A a10 = this.f38681b;
        if (this.f38683d) {
            return;
        }
        try {
            C4468d c4468d = this.f38682c;
            long j4 = c4468d.f38643c;
            if (j4 > 0) {
                a10.write(c4468d, j4);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            a10.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f38683d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ia.f
    public final f f0(long j4) throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.N0(j4);
        c();
        return this;
    }

    @Override // ia.f, ia.A, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        C4468d c4468d = this.f38682c;
        long j4 = c4468d.f38643c;
        A a10 = this.f38681b;
        if (j4 > 0) {
            a10.write(c4468d, j4);
        }
        a10.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f38683d;
    }

    @Override // ia.f
    public final f j(int i) throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.P0(i);
        c();
        return this;
    }

    @Override // ia.f
    public final f m(int i) throws IOException {
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        this.f38682c.O0(i);
        c();
        return this;
    }

    @Override // ia.f
    public final C4468d q() {
        return this.f38682c;
    }

    @Override // ia.f
    public final f t0(byte[] source) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        C4468d c4468d = this.f38682c;
        c4468d.getClass();
        c4468d.B0(source, 0, source.length);
        c();
        return this;
    }

    @Override // ia.A
    public final D timeout() {
        return this.f38681b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f38681b + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        if (this.f38683d) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f38682c.write(source);
        c();
        return iWrite;
    }

    @Override // ia.A
    public final void write(C4468d source, long j4) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        if (!this.f38683d) {
            this.f38682c.write(source, j4);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
