package ej;

import fj.AbstractC5834a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6507a;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
public final class x implements InterfaceC5483g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5476D f46521a;

    /* renamed from: b, reason: collision with root package name */
    public final C5481e f46522b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46523c;

    public x(InterfaceC5476D source) {
        AbstractC6492s.i(source, "source");
        this.f46521a = source;
        this.f46522b = new C5481e();
    }

    @Override // ej.InterfaceC5483g
    public long A() throws EOFException {
        byte bF0;
        g0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            bF0 = this.f46522b.f0(j10);
            if ((bF0 < 48 || bF0 > 57) && !(j10 == 0 && bF0 == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bF0, AbstractC6507a.a(16));
            AbstractC6492s.h(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f46522b.A();
    }

    @Override // ej.InterfaceC5483g
    public String D(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return AbstractC5834a.d(this.f46522b, jA);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && this.f46522b.f0(j11 - 1) == 13 && request(1 + j11) && this.f46522b.f0(j11) == 10) {
            return AbstractC5834a.d(this.f46522b, j11);
        }
        C5481e c5481e = new C5481e();
        C5481e c5481e2 = this.f46522b;
        c5481e2.S(c5481e, 0L, Math.min(32, c5481e2.D0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f46522b.D0(), j10) + " content=" + c5481e.v0().t() + (char) 8230);
    }

    @Override // ej.InterfaceC5483g
    public int E(s options) throws EOFException {
        AbstractC6492s.i(options, "options");
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int iE = AbstractC5834a.e(this.f46522b, options, true);
            if (iE != -2) {
                if (iE != -1) {
                    this.f46522b.d(options.C()[iE].b0());
                    return iE;
                }
            } else if (this.f46521a.U(this.f46522b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // ej.InterfaceC5483g
    public String G(Charset charset) {
        AbstractC6492s.i(charset, "charset");
        this.f46522b.e0(this.f46521a);
        return this.f46522b.G(charset);
    }

    @Override // ej.InterfaceC5483g
    public long M(h targetBytes) {
        AbstractC6492s.i(targetBytes, "targetBytes");
        return h(targetBytes, 0L);
    }

    @Override // ej.InterfaceC5483g
    public String Q() {
        return D(Long.MAX_VALUE);
    }

    @Override // ej.InterfaceC5476D
    public long U(C5481e sink, long j10) {
        AbstractC6492s.i(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        if (this.f46522b.D0() == 0 && this.f46521a.U(this.f46522b, 8192L) == -1) {
            return -1L;
        }
        return this.f46522b.U(sink, Math.min(j10, this.f46522b.D0()));
    }

    @Override // ej.InterfaceC5483g
    public byte[] V(long j10) throws EOFException {
        g0(j10);
        return this.f46522b.V(j10);
    }

    @Override // ej.InterfaceC5483g
    public long W(h bytes) {
        AbstractC6492s.i(bytes, "bytes");
        return g(bytes, 0L);
    }

    public long a(byte b10, long j10, long j11) {
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long jM0 = this.f46522b.m0(b10, j10, j11);
            if (jM0 != -1) {
                return jM0;
            }
            long jD0 = this.f46522b.D0();
            if (jD0 >= j11 || this.f46521a.U(this.f46522b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, jD0);
        }
        return -1L;
    }

    @Override // ej.InterfaceC5483g, ej.InterfaceC5482f
    public C5481e b() {
        return this.f46522b;
    }

    @Override // ej.InterfaceC5476D
    public E c() {
        return this.f46521a.c();
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f46523c) {
            return;
        }
        this.f46523c = true;
        this.f46521a.close();
        this.f46522b.clear();
    }

    @Override // ej.InterfaceC5483g
    public void d(long j10) throws EOFException {
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f46522b.D0() == 0 && this.f46521a.U(this.f46522b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f46522b.D0());
            this.f46522b.d(jMin);
            j10 -= jMin;
        }
    }

    public long g(h bytes, long j10) {
        AbstractC6492s.i(bytes, "bytes");
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jN0 = this.f46522b.n0(bytes, j10);
            if (jN0 != -1) {
                return jN0;
            }
            long jD0 = this.f46522b.D0();
            if (this.f46521a.U(this.f46522b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (jD0 - bytes.b0()) + 1);
        }
    }

    @Override // ej.InterfaceC5483g
    public void g0(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    public long h(h targetBytes, long j10) {
        AbstractC6492s.i(targetBytes, "targetBytes");
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jO0 = this.f46522b.o0(targetBytes, j10);
            if (jO0 != -1) {
                return jO0;
            }
            long jD0 = this.f46522b.D0();
            if (this.f46521a.U(this.f46522b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, jD0);
        }
    }

    @Override // ej.InterfaceC5483g
    public boolean i0(long j10, h bytes) {
        AbstractC6492s.i(bytes, "bytes");
        return j(j10, bytes, 0, bytes.b0());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f46523c;
    }

    public boolean j(long j10, h bytes, int i10, int i11) {
        AbstractC6492s.i(bytes, "bytes");
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.b0() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = i12 + j10;
            if (!request(1 + j11) || this.f46522b.f0(j11) != bytes.l(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // ej.InterfaceC5483g
    public long j0(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    @Override // ej.InterfaceC5483g
    public C5481e k() {
        return this.f46522b;
    }

    @Override // ej.InterfaceC5483g
    public long k0() throws EOFException {
        byte bF0;
        g0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            bF0 = this.f46522b.f0(i10);
            if ((bF0 < 48 || bF0 > 57) && ((bF0 < 97 || bF0 > 102) && (bF0 < 65 || bF0 > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bF0, AbstractC6507a.a(16));
            AbstractC6492s.h(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f46522b.k0();
    }

    @Override // ej.InterfaceC5483g
    public h l(long j10) throws EOFException {
        g0(j10);
        return this.f46522b.l(j10);
    }

    @Override // ej.InterfaceC5483g
    public InputStream l0() {
        return new a();
    }

    public int p() throws EOFException {
        g0(4L);
        return this.f46522b.w0();
    }

    @Override // ej.InterfaceC5483g
    public InterfaceC5483g peek() {
        return p.d(new u(this));
    }

    @Override // ej.InterfaceC5483g
    public long q(InterfaceC5474B sink) {
        AbstractC6492s.i(sink, "sink");
        long j10 = 0;
        while (this.f46521a.U(this.f46522b, 8192L) != -1) {
            long jP = this.f46522b.p();
            if (jP > 0) {
                j10 += jP;
                sink.Z(this.f46522b, jP);
            }
        }
        if (this.f46522b.D0() <= 0) {
            return j10;
        }
        long jD0 = j10 + this.f46522b.D0();
        C5481e c5481e = this.f46522b;
        sink.Z(c5481e, c5481e.D0());
        return jD0;
    }

    @Override // ej.InterfaceC5483g
    public byte[] r() {
        this.f46522b.e0(this.f46521a);
        return this.f46522b.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC6492s.i(sink, "sink");
        if (this.f46522b.D0() == 0 && this.f46521a.U(this.f46522b, 8192L) == -1) {
            return -1;
        }
        return this.f46522b.read(sink);
    }

    @Override // ej.InterfaceC5483g
    public byte readByte() throws EOFException {
        g0(1L);
        return this.f46522b.readByte();
    }

    @Override // ej.InterfaceC5483g
    public void readFully(byte[] sink) throws EOFException {
        AbstractC6492s.i(sink, "sink");
        try {
            g0(sink.length);
            this.f46522b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f46522b.D0() > 0) {
                C5481e c5481e = this.f46522b;
                int iS0 = c5481e.s0(sink, i10, (int) c5481e.D0());
                if (iS0 == -1) {
                    throw new AssertionError();
                }
                i10 += iS0;
            }
            throw e10;
        }
    }

    @Override // ej.InterfaceC5483g
    public int readInt() throws EOFException {
        g0(4L);
        return this.f46522b.readInt();
    }

    @Override // ej.InterfaceC5483g
    public long readLong() throws EOFException {
        g0(8L);
        return this.f46522b.readLong();
    }

    @Override // ej.InterfaceC5483g
    public short readShort() throws EOFException {
        g0(2L);
        return this.f46522b.readShort();
    }

    @Override // ej.InterfaceC5483g
    public boolean request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        while (this.f46522b.D0() < j10) {
            if (this.f46521a.U(this.f46522b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public short s() throws EOFException {
        g0(2L);
        return this.f46522b.x0();
    }

    @Override // ej.InterfaceC5483g
    public boolean t() {
        if (this.f46523c) {
            throw new IllegalStateException("closed");
        }
        return this.f46522b.t() && this.f46521a.U(this.f46522b, 8192L) == -1;
    }

    public String toString() {
        return "buffer(" + this.f46521a + ')';
    }

    @Override // ej.InterfaceC5483g
    public void w(C5481e sink, long j10) throws EOFException {
        AbstractC6492s.i(sink, "sink");
        try {
            g0(j10);
            this.f46522b.w(sink, j10);
        } catch (EOFException e10) {
            sink.e0(this.f46522b);
            throw e10;
        }
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            x xVar = x.this;
            if (xVar.f46523c) {
                throw new IOException("closed");
            }
            return (int) Math.min(xVar.f46522b.D0(), MPv3.MAX_MESSAGE_ID);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            x.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            x xVar = x.this;
            if (xVar.f46523c) {
                throw new IOException("closed");
            }
            if (xVar.f46522b.D0() == 0) {
                x xVar2 = x.this;
                if (xVar2.f46521a.U(xVar2.f46522b, 8192L) == -1) {
                    return -1;
                }
            }
            return x.this.f46522b.readByte() & 255;
        }

        public String toString() {
            return x.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            AbstractC6492s.i(data, "data");
            if (!x.this.f46523c) {
                AbstractC5478b.b(data.length, i10, i11);
                if (x.this.f46522b.D0() == 0) {
                    x xVar = x.this;
                    if (xVar.f46521a.U(xVar.f46522b, 8192L) == -1) {
                        return -1;
                    }
                }
                return x.this.f46522b.s0(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
