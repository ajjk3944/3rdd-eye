package cv;

import com.google.android.gms.internal.measurement.b4;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class z implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6753a;

    /* renamed from: d, reason: collision with root package name */
    public final g f6754d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6755g;

    public z(f0 f0Var) {
        br.l.e(f0Var, "source");
        this.f6753a = f0Var;
        this.f6754d = new g();
    }

    @Override // cv.i
    public final int D(v vVar) throws EOFException {
        br.l.e(vVar, "options");
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            g gVar = this.f6754d;
            int iC = dv.a.c(gVar, vVar, true);
            if (iC != -2) {
                if (iC != -1) {
                    gVar.skip(vVar.f6740a[iC].d());
                    return iC;
                }
            } else if (this.f6753a.u(gVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // cv.i
    public final String J(Charset charset) {
        f0 f0Var = this.f6753a;
        g gVar = this.f6754d;
        gVar.o0(f0Var);
        return gVar.V(gVar.f6706d, charset);
    }

    @Override // cv.i
    public final long O(j jVar) {
        br.l.e(jVar, "bytes");
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            g gVar = this.f6754d;
            long jW = gVar.w(jMax, jVar);
            if (jW != -1) {
                return jW;
            }
            long j = gVar.f6706d;
            if (this.f6753a.u(gVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j - jVar.d()) + 1);
        }
    }

    @Override // cv.i
    public final boolean S(long j) {
        g gVar;
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        do {
            gVar = this.f6754d;
            if (gVar.f6706d >= j) {
                return true;
            }
        } while (this.f6753a.u(gVar, 8192L) != -1);
        return false;
    }

    @Override // cv.i
    public final String W() {
        return z(Long.MAX_VALUE);
    }

    public final boolean b() {
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f6754d;
        return gVar.i() && this.f6753a.u(gVar, 8192L) == -1;
    }

    @Override // cv.i
    public final long b0(j jVar) {
        br.l.e(jVar, "targetBytes");
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            g gVar = this.f6754d;
            long jY = gVar.y(jMax, jVar);
            if (jY != -1) {
                return jY;
            }
            long j = gVar.f6706d;
            if (this.f6753a.u(gVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f6755g) {
            return;
        }
        this.f6755g = true;
        this.f6753a.close();
        this.f6754d.b();
    }

    @Override // cv.i
    public final long e0(y yVar) {
        g gVar;
        long j = 0;
        while (true) {
            f0 f0Var = this.f6753a;
            gVar = this.f6754d;
            if (f0Var.u(gVar, 8192L) == -1) {
                break;
            }
            long jF = gVar.f();
            if (jF > 0) {
                j += jF;
                yVar.d0(gVar, jF);
            }
        }
        long j7 = gVar.f6706d;
        if (j7 <= 0) {
            return j;
        }
        long j10 = j + j7;
        yVar.d0(gVar, j7);
        return j10;
    }

    public final z f() {
        return a.a.e(new x(this));
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f6753a.g();
    }

    @Override // cv.i
    public final void g0(long j) {
        if (!S(j)) {
            throw new EOFException();
        }
    }

    public final int h() {
        g0(4L);
        int i10 = this.f6754d.readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public final long i() throws EOFException {
        char c4;
        char c10;
        char c11;
        char c12;
        long j;
        g0(8L);
        g gVar = this.f6754d;
        if (gVar.f6706d < 8) {
            throw new EOFException();
        }
        a0 a0Var = gVar.f6705a;
        br.l.b(a0Var);
        int i10 = a0Var.f6679b;
        int i11 = a0Var.f6680c;
        if (i11 - i10 < 8) {
            j = ((gVar.readInt() & 4294967295L) << 32) | (4294967295L & gVar.readInt());
            c11 = '8';
            c12 = '\b';
            c4 = 24;
            c10 = '(';
        } else {
            byte[] bArr = a0Var.f6678a;
            c4 = 24;
            c10 = '(';
            c11 = '8';
            c12 = '\b';
            int i12 = i10 + 7;
            long j7 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j10 = j7 | (bArr[i12] & 255);
            gVar.f6706d -= 8;
            if (i13 == i11) {
                gVar.f6705a = a0Var.a();
                b0.a(a0Var);
            } else {
                a0Var.f6679b = i13;
            }
            j = j10;
        }
        return ((j & 255) << c11) | (((-72057594037927936L) & j) >>> c11) | ((71776119061217280L & j) >>> c10) | ((280375465082880L & j) >>> c4) | ((1095216660480L & j) >>> c12) | ((4278190080L & j) << c12) | ((16711680 & j) << c4) | ((65280 & j) << c10);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6755g;
    }

    @Override // cv.i
    public final j k(long j) {
        g0(j);
        return this.f6754d.k(j);
    }

    @Override // cv.i
    public final long k0() {
        g gVar;
        byte bQ;
        g0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zS = S(i11);
            gVar = this.f6754d;
            if (!zS) {
                break;
            }
            bQ = gVar.q(i10);
            if ((bQ < 48 || bQ > 57) && ((bQ < 97 || bQ > 102) && (bQ < 65 || bQ > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            b4.g(16);
            String string = Integer.toString(bQ, 16);
            br.l.d(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return gVar.k0();
    }

    @Override // cv.i
    public final InputStream l0() {
        return new f(this, 1);
    }

    @Override // cv.i
    public final boolean m0(long j, j jVar) {
        br.l.e(jVar, "bytes");
        int iD = jVar.d();
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0 && iD >= 0 && jVar.d() >= iD) {
            for (int i10 = 0; i10 < iD; i10++) {
                long j7 = i10 + j;
                if (S(1 + j7) && this.f6754d.q(j7) == jVar.i(i10)) {
                }
            }
            return true;
        }
        return false;
    }

    public final short q() {
        g0(2L);
        return this.f6754d.R();
    }

    @Override // cv.i
    public final byte[] r() {
        f0 f0Var = this.f6753a;
        g gVar = this.f6754d;
        gVar.o0(f0Var);
        return gVar.G(gVar.f6706d);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        br.l.e(byteBuffer, "sink");
        g gVar = this.f6754d;
        if (gVar.f6706d == 0 && this.f6753a.u(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(byteBuffer);
    }

    @Override // cv.i
    public final byte readByte() {
        g0(1L);
        return this.f6754d.readByte();
    }

    @Override // cv.i
    public final int readInt() {
        g0(4L);
        return this.f6754d.readInt();
    }

    @Override // cv.i
    public final short readShort() {
        g0(2L);
        return this.f6754d.readShort();
    }

    @Override // cv.i
    public final g s() {
        return this.f6754d;
    }

    @Override // cv.i
    public final void skip(long j) {
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            g gVar = this.f6754d;
            if (gVar.f6706d == 0 && this.f6753a.u(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, gVar.f6706d);
            gVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f6753a + ')';
    }

    @Override // cv.f0
    public final long u(g gVar, long j) {
        br.l.e(gVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        g gVar2 = this.f6754d;
        if (gVar2.f6706d == 0 && this.f6753a.u(gVar2, 8192L) == -1) {
            return -1L;
        }
        return gVar2.u(gVar, Math.min(j, gVar2.f6706d));
    }

    public final String w(long j) {
        g0(j);
        g gVar = this.f6754d;
        gVar.getClass();
        return gVar.V(j, tt.a.f22975a);
    }

    @Override // cv.i
    public final long x(byte b2, long j, long j7) {
        if (this.f6755g) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j7) {
            StringBuilder sbK = w.g.k(j, "fromIndex=", " toIndex=");
            sbK.append(j7);
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        long jMax = j;
        while (jMax < j7) {
            g gVar = this.f6754d;
            byte b10 = b2;
            long j10 = j7;
            long jX = gVar.x(b10, jMax, j10);
            if (jX != -1) {
                return jX;
            }
            long j11 = gVar.f6706d;
            if (j11 >= j10 || this.f6753a.u(gVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j11);
            b2 = b10;
            j7 = j10;
        }
        return -1L;
    }

    @Override // cv.i
    public final String z(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "limit < 0: ").toString());
        }
        long j7 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jX = x((byte) 10, 0L, j7);
        g gVar = this.f6754d;
        if (jX != -1) {
            return dv.a.b(gVar, jX);
        }
        if (j7 < Long.MAX_VALUE && S(j7) && gVar.q(j7 - 1) == 13 && S(j7 + 1) && gVar.q(j7) == 10) {
            return dv.a.b(gVar, j7);
        }
        g gVar2 = new g();
        gVar.h(gVar2, 0L, Math.min(32, gVar.f6706d));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f6706d, j) + " content=" + gVar2.k(gVar2.f6706d).e() + (char) 8230);
    }
}
