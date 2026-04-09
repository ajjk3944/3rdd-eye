package cv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class p implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public byte f6726a;

    /* renamed from: d, reason: collision with root package name */
    public final z f6727d;

    /* renamed from: g, reason: collision with root package name */
    public final Inflater f6728g;

    /* renamed from: r, reason: collision with root package name */
    public final q f6729r;

    /* renamed from: x, reason: collision with root package name */
    public final CRC32 f6730x;

    public p(f0 f0Var) {
        br.l.e(f0Var, "source");
        z zVar = new z(f0Var);
        this.f6727d = zVar;
        Inflater inflater = new Inflater(true);
        this.f6728g = inflater;
        this.f6729r = new q(zVar, inflater);
        this.f6730x = new CRC32();
    }

    public static void b(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        StringBuilder sbL = w.g.l(str, ": actual 0x");
        sbL.append(tt.l.H0(8, xu.l.Z(i11)));
        sbL.append(" != expected 0x");
        sbL.append(tt.l.H0(8, xu.l.Z(i10)));
        throw new IOException(sbL.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6729r.close();
    }

    public final void f(g gVar, long j, long j7) {
        a0 a0Var = gVar.f6705a;
        br.l.b(a0Var);
        while (true) {
            int i10 = a0Var.f6680c;
            int i11 = a0Var.f6679b;
            if (j < i10 - i11) {
                break;
            }
            j -= i10 - i11;
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
        }
        while (j7 > 0) {
            int iMin = (int) Math.min(a0Var.f6680c - r6, j7);
            this.f6730x.update(a0Var.f6678a, (int) (a0Var.f6679b + j), iMin);
            j7 -= iMin;
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j = 0;
        }
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f6727d.f6753a.g();
    }

    @Override // cv.f0
    public final long u(g gVar, long j) throws DataFormatException, IOException {
        p pVar = this;
        br.l.e(gVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = pVar.f6726a;
        CRC32 crc32 = pVar.f6730x;
        z zVar = pVar.f6727d;
        if (b2 == 0) {
            zVar.g0(10L);
            g gVar2 = zVar.f6754d;
            byte bQ = gVar2.q(3L);
            boolean z10 = ((bQ >> 1) & 1) == 1;
            if (z10) {
                pVar.f(gVar2, 0L, 10L);
            }
            b("ID1ID2", 8075, zVar.readShort());
            zVar.skip(8L);
            if (((bQ >> 2) & 1) == 1) {
                zVar.g0(2L);
                if (z10) {
                    f(gVar2, 0L, 2L);
                }
                long jR = gVar2.R() & 65535;
                zVar.g0(jR);
                if (z10) {
                    f(gVar2, 0L, jR);
                }
                zVar.skip(jR);
            }
            if (((bQ >> 3) & 1) == 1) {
                long jX = zVar.x((byte) 0, 0L, Long.MAX_VALUE);
                if (jX == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    f(gVar2, 0L, jX + 1);
                }
                zVar.skip(jX + 1);
            }
            if (((bQ >> 4) & 1) == 1) {
                long jX2 = zVar.x((byte) 0, 0L, Long.MAX_VALUE);
                if (jX2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    pVar = this;
                    pVar.f(gVar2, 0L, jX2 + 1);
                } else {
                    pVar = this;
                }
                zVar.skip(jX2 + 1);
            } else {
                pVar = this;
            }
            if (z10) {
                b("FHCRC", zVar.q(), (short) crc32.getValue());
                crc32.reset();
            }
            pVar.f6726a = (byte) 1;
        }
        if (pVar.f6726a == 1) {
            long j7 = gVar.f6706d;
            long jU = pVar.f6729r.u(gVar, j);
            if (jU != -1) {
                pVar.f(gVar, j7, jU);
                return jU;
            }
            pVar.f6726a = (byte) 2;
        }
        if (pVar.f6726a == 2) {
            b("CRC", zVar.h(), (int) crc32.getValue());
            b("ISIZE", zVar.h(), (int) pVar.f6728g.getBytesWritten());
            pVar.f6726a = (byte) 3;
            if (!zVar.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
