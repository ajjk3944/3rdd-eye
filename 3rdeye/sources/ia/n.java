package ia;

import A9.I;
import N7.G8;
import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes3.dex */
public final class n implements C {

    /* renamed from: b, reason: collision with root package name */
    public byte f38659b;

    /* renamed from: c, reason: collision with root package name */
    public final w f38660c;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f38661d;

    /* renamed from: e, reason: collision with root package name */
    public final o f38662e;

    /* renamed from: f, reason: collision with root package name */
    public final CRC32 f38663f;

    public n(C source) {
        kotlin.jvm.internal.l.f(source, "source");
        w wVar = new w(source);
        this.f38660c = wVar;
        Inflater inflater = new Inflater(true);
        this.f38661d = inflater;
        this.f38662e = new o(wVar, inflater);
        this.f38663f = new CRC32();
    }

    public static void a(int i, int i10, String str) throws IOException {
        if (i10 == i) {
            return;
        }
        StringBuilder sbV = G8.v(str, ": actual 0x");
        sbV.append(y9.q.l0(8, I.H(i10)));
        sbV.append(" != expected 0x");
        sbV.append(y9.q.l0(8, I.H(i)));
        throw new IOException(sbV.toString());
    }

    public final void c(C4468d c4468d, long j4, long j10) {
        x xVar = c4468d.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        while (true) {
            int i = xVar.f38690c;
            int i10 = xVar.f38689b;
            if (j4 < i - i10) {
                break;
            }
            j4 -= i - i10;
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
        }
        while (j10 > 0) {
            int iMin = (int) Math.min(xVar.f38690c - r6, j10);
            this.f38663f.update(xVar.f38688a, (int) (xVar.f38689b + j4), iMin);
            j10 -= iMin;
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
            j4 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38662e.close();
    }

    @Override // ia.C
    public final long read(C4468d sink, long j4) throws IOException {
        long j10;
        long j11;
        C4468d c4468d;
        n nVar = this;
        kotlin.jvm.internal.l.f(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
        }
        if (j4 == 0) {
            return 0L;
        }
        byte b10 = nVar.f38659b;
        CRC32 crc32 = nVar.f38663f;
        w wVar = nVar.f38660c;
        if (b10 == 0) {
            wVar.F0(10L);
            C4468d c4468d2 = wVar.f38685c;
            byte bL = c4468d2.l(3L);
            boolean z10 = ((bL >> 1) & 1) == 1;
            if (z10) {
                nVar.c(wVar.f38685c, 0L, 10L);
            }
            a(8075, wVar.readShort(), "ID1ID2");
            wVar.skip(8L);
            if (((bL >> 2) & 1) == 1) {
                wVar.F0(2L);
                if (z10) {
                    j10 = -1;
                    j11 = 2;
                    c(wVar.f38685c, 0L, 2L);
                } else {
                    j11 = 2;
                    j10 = -1;
                }
                short s10 = c4468d2.readShort();
                long j12 = ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535;
                wVar.F0(j12);
                if (z10) {
                    c(wVar.f38685c, 0L, j12);
                }
                wVar.skip(j12);
            } else {
                j11 = 2;
                j10 = -1;
            }
            if (((bL >> 3) & 1) == 1) {
                c4468d = c4468d2;
                long jA = wVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == j10) {
                    throw new EOFException();
                }
                if (z10) {
                    c(wVar.f38685c, 0L, jA + 1);
                }
                wVar.skip(jA + 1);
            } else {
                c4468d = c4468d2;
            }
            if (((bL >> 4) & 1) == 1) {
                long jA2 = wVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == j10) {
                    throw new EOFException();
                }
                if (z10) {
                    nVar = this;
                    nVar.c(wVar.f38685c, 0L, jA2 + 1);
                } else {
                    nVar = this;
                }
                wVar.skip(jA2 + 1);
            } else {
                nVar = this;
            }
            if (z10) {
                wVar.F0(j11);
                short s11 = c4468d.readShort();
                a((short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            nVar.f38659b = (byte) 1;
        } else {
            j10 = -1;
        }
        if (nVar.f38659b == 1) {
            long j13 = sink.f38643c;
            long j14 = nVar.f38662e.read(sink, j4);
            if (j14 != j10) {
                nVar.c(sink, j13, j14);
                return j14;
            }
            nVar.f38659b = (byte) 2;
        }
        if (nVar.f38659b == 2) {
            wVar.F0(4L);
            C4468d c4468d3 = wVar.f38685c;
            a(I.z(c4468d3.readInt()), (int) crc32.getValue(), "CRC");
            wVar.F0(4L);
            a(I.z(c4468d3.readInt()), (int) nVar.f38661d.getBytesWritten(), "ISIZE");
            nVar.f38659b = (byte) 3;
            if (!wVar.K()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j10;
    }

    @Override // ia.C
    public final D timeout() {
        return this.f38660c.f38684b.timeout();
    }
}
