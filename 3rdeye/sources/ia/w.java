package ia;

import A9.I;
import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes3.dex */
public final class w implements g {

    /* renamed from: b, reason: collision with root package name */
    public final C f38684b;

    /* renamed from: c, reason: collision with root package name */
    public final C4468d f38685c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38686d;

    public w(C source) {
        kotlin.jvm.internal.l.f(source, "source");
        this.f38684b = source;
        this.f38685c = new C4468d();
    }

    @Override // ia.g
    public final void F0(long j4) throws EOFException {
        if (!l0(j4)) {
            throw new EOFException();
        }
    }

    @Override // ia.g
    public final byte[] I() throws IOException {
        C c10 = this.f38684b;
        C4468d c4468d = this.f38685c;
        c4468d.X(c10);
        return c4468d.F(c4468d.f38643c);
    }

    @Override // ia.g
    public final long J0() throws EOFException {
        C4468d c4468d;
        byte bL;
        F0(1L);
        int i = 0;
        while (true) {
            int i10 = i + 1;
            boolean zL0 = l0(i10);
            c4468d = this.f38685c;
            if (!zL0) {
                break;
            }
            bL = c4468d.l(i);
            if ((bL < 48 || bL > 57) && ((bL < 97 || bL > 102) && (bL < 65 || bL > 70))) {
                break;
            }
            i = i10;
        }
        if (i == 0) {
            com.google.gson.internal.c.e(16);
            String string = Integer.toString(bL, 16);
            kotlin.jvm.internal.l.e(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c4468d.J0();
    }

    @Override // ia.g
    public final boolean K() {
        if (this.f38686d) {
            throw new IllegalStateException("closed");
        }
        C4468d c4468d = this.f38685c;
        return c4468d.K() && this.f38684b.read(c4468d, 8192L) == -1;
    }

    @Override // ia.g
    public final InputStream L0() {
        return new a();
    }

    @Override // ia.g
    public final String S(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "limit < 0: ").toString());
        }
        long j10 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long jA = a((byte) 10, 0L, j10);
        C4468d c4468d = this.f38685c;
        if (jA != -1) {
            return ja.a.a(c4468d, jA);
        }
        if (j10 < Long.MAX_VALUE && l0(j10) && c4468d.l(j10 - 1) == 13 && l0(j10 + 1) && c4468d.l(j10) == 10) {
            return ja.a.a(c4468d, j10);
        }
        C4468d c4468d2 = new C4468d();
        c4468d.k(c4468d2, 0L, Math.min(32, c4468d.f38643c));
        throw new EOFException("\\n not found: limit=" + Math.min(c4468d.f38643c, j4) + " content=" + c4468d2.g(c4468d2.f38643c).d() + (char) 8230);
    }

    public final long a(byte b10, long j4, long j10) {
        if (this.f38686d) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10) {
            throw new IllegalArgumentException(Oo.d(j10, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j10) {
            byte b11 = b10;
            long j11 = j10;
            long jN = this.f38685c.n(b11, jMax, j11);
            if (jN != -1) {
                return jN;
            }
            C4468d c4468d = this.f38685c;
            long j12 = c4468d.f38643c;
            if (j12 >= j11 || this.f38684b.read(c4468d, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
            b10 = b11;
            j10 = j11;
        }
        return -1L;
    }

    public final long c(h targetBytes) {
        kotlin.jvm.internal.l.f(targetBytes, "targetBytes");
        if (this.f38686d) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C4468d c4468d = this.f38685c;
            long jD = c4468d.D(targetBytes, jMax);
            if (jD != -1) {
                return jD;
            }
            long j4 = c4468d.f38643c;
            if (this.f38684b.read(c4468d, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f38686d) {
            return;
        }
        this.f38686d = true;
        this.f38684b.close();
        this.f38685c.a();
    }

    @Override // ia.g
    public final String d0(Charset charset) throws IOException {
        C4468d c4468d = this.f38685c;
        c4468d.X(this.f38684b);
        return c4468d.m0(c4468d.f38643c, charset);
    }

    @Override // ia.g
    public final h g(long j4) throws EOFException {
        F0(j4);
        return this.f38685c.g(j4);
    }

    @Override // ia.g
    public final h h0() throws IOException {
        C c10 = this.f38684b;
        C4468d c4468d = this.f38685c;
        c4468d.X(c10);
        return c4468d.g(c4468d.f38643c);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f38686d;
    }

    @Override // ia.g
    public final boolean l0(long j4) {
        C4468d c4468d;
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
        }
        if (this.f38686d) {
            throw new IllegalStateException("closed");
        }
        do {
            c4468d = this.f38685c;
            if (c4468d.f38643c >= j4) {
                return true;
            }
        } while (this.f38684b.read(c4468d, 8192L) != -1);
        return false;
    }

    @Override // ia.g
    public final long o(C4468d c4468d) {
        C4468d c4468d2;
        long j4 = 0;
        while (true) {
            C c10 = this.f38684b;
            c4468d2 = this.f38685c;
            if (c10.read(c4468d2, 8192L) == -1) {
                break;
            }
            long jE = c4468d2.e();
            if (jE > 0) {
                j4 += jE;
                c4468d.write(c4468d2, jE);
            }
        }
        long j10 = c4468d2.f38643c;
        if (j10 <= 0) {
            return j4;
        }
        long j11 = j4 + j10;
        c4468d.write(c4468d2, j10);
        return j11;
    }

    @Override // ia.g
    public final String o0() {
        return S(Long.MAX_VALUE);
    }

    @Override // ia.g, ia.f
    public final C4468d q() {
        return this.f38685c;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.l.f(sink, "sink");
        C4468d c4468d = this.f38685c;
        if (c4468d.f38643c == 0 && this.f38684b.read(c4468d, 8192L) == -1) {
            return -1;
        }
        return c4468d.read(sink);
    }

    @Override // ia.g
    public final byte readByte() throws EOFException {
        F0(1L);
        return this.f38685c.readByte();
    }

    @Override // ia.g
    public final int readInt() throws EOFException {
        F0(4L);
        return this.f38685c.readInt();
    }

    @Override // ia.g
    public final short readShort() throws EOFException {
        F0(2L);
        return this.f38685c.readShort();
    }

    @Override // ia.g
    public final void skip(long j4) throws EOFException {
        if (this.f38686d) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            C4468d c4468d = this.f38685c;
            if (c4468d.f38643c == 0 && this.f38684b.read(c4468d, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j4, c4468d.f38643c);
            c4468d.skip(jMin);
            j4 -= jMin;
        }
    }

    @Override // ia.C
    public final D timeout() {
        return this.f38684b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f38684b + ')';
    }

    @Override // ia.g
    public final int x0(s options) throws EOFException {
        kotlin.jvm.internal.l.f(options, "options");
        if (this.f38686d) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C4468d c4468d = this.f38685c;
            int iB = ja.a.b(c4468d, options, true);
            if (iB != -2) {
                if (iB != -1) {
                    c4468d.skip(options.f38671b[iB].c());
                    return iB;
                }
            } else if (this.f38684b.read(c4468d, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // ia.C
    public final long read(C4468d sink, long j4) {
        kotlin.jvm.internal.l.f(sink, "sink");
        if (j4 >= 0) {
            if (!this.f38686d) {
                C4468d c4468d = this.f38685c;
                if (c4468d.f38643c == 0 && this.f38684b.read(c4468d, 8192L) == -1) {
                    return -1L;
                }
                return c4468d.read(sink, Math.min(j4, c4468d.f38643c));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            w wVar = w.this;
            if (wVar.f38686d) {
                throw new IOException("closed");
            }
            return (int) Math.min(wVar.f38685c.f38643c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            w.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            w wVar = w.this;
            if (wVar.f38686d) {
                throw new IOException("closed");
            }
            C4468d c4468d = wVar.f38685c;
            if (c4468d.f38643c == 0 && wVar.f38684b.read(c4468d, 8192L) == -1) {
                return -1;
            }
            return c4468d.readByte() & 255;
        }

        public final String toString() {
            return w.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] data, int i, int i10) throws IOException {
            kotlin.jvm.internal.l.f(data, "data");
            w wVar = w.this;
            if (!wVar.f38686d) {
                I.m(data.length, i, i10);
                C4468d c4468d = wVar.f38685c;
                if (c4468d.f38643c == 0 && wVar.f38684b.read(c4468d, 8192L) == -1) {
                    return -1;
                }
                return c4468d.read(data, i, i10);
            }
            throw new IOException("closed");
        }
    }
}
