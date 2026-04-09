package hm;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements w {

    /* renamed from: a, reason: collision with root package name */
    public byte f25181a;

    /* renamed from: b, reason: collision with root package name */
    public final q f25182b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f25183c;

    /* renamed from: d, reason: collision with root package name */
    public final l f25184d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f25185e;

    public k(g gVar) {
        nk.k.e(gVar, "source");
        q qVar = new q(gVar);
        this.f25182b = qVar;
        Inflater inflater = new Inflater(true);
        this.f25183c = inflater;
        this.f25184d = new l(qVar, inflater);
        this.f25185e = new CRC32();
    }

    public static void c(String str, int i4, int i10) throws IOException {
        if (i10 == i4) {
            return;
        }
        StringBuilder sbB = i3.e.b(str, ": actual 0x");
        sbB.append(vk.i.L0(8, i0.w(i10)));
        sbB.append(" != expected 0x");
        sbB.append(vk.i.L0(8, i0.w(i4)));
        throw new IOException(sbB.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25184d.close();
    }

    public final void e(e eVar, long j, long j8) {
        r rVar = eVar.f25173a;
        nk.k.b(rVar);
        while (true) {
            int i4 = rVar.f25208c;
            int i10 = rVar.f25207b;
            if (j < i4 - i10) {
                break;
            }
            j -= i4 - i10;
            rVar = rVar.f25211f;
            nk.k.b(rVar);
        }
        while (j8 > 0) {
            int iMin = (int) Math.min(rVar.f25208c - r6, j8);
            this.f25185e.update(rVar.f25206a, (int) (rVar.f25207b + j), iMin);
            j8 -= iMin;
            rVar = rVar.f25211f;
            nk.k.b(rVar);
            j = 0;
        }
    }

    @Override // hm.w
    public final long n(e eVar, long j) throws DataFormatException, IOException {
        long j8;
        k kVar = this;
        nk.k.e(eVar, "sink");
        byte b10 = kVar.f25181a;
        CRC32 crc32 = kVar.f25185e;
        q qVar = kVar.f25182b;
        if (b10 == 0) {
            qVar.require(10L);
            e eVar2 = qVar.f25204b;
            byte bP = eVar2.p(3L);
            boolean z3 = ((bP >> 1) & 1) == 1;
            if (z3) {
                kVar.e(eVar2, 0L, 10L);
            }
            c("ID1ID2", 8075, qVar.readShort());
            qVar.skip(8L);
            if (((bP >> 2) & 1) == 1) {
                qVar.require(2L);
                if (z3) {
                    e(eVar2, 0L, 2L);
                }
                short s10 = eVar2.readShort();
                long j9 = ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535;
                qVar.require(j9);
                if (z3) {
                    e(eVar2, 0L, j9);
                }
                qVar.skip(j9);
            }
            if (((bP >> 3) & 1) == 1) {
                long jIndexOf = qVar.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    j8 = 2;
                    e(eVar2, 0L, jIndexOf + 1);
                } else {
                    j8 = 2;
                }
                qVar.skip(jIndexOf + 1);
            } else {
                j8 = 2;
            }
            if (((bP >> 4) & 1) == 1) {
                long j10 = j8;
                long jIndexOf2 = qVar.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    j8 = j10;
                    kVar = this;
                    kVar.e(eVar2, 0L, jIndexOf2 + 1);
                } else {
                    kVar = this;
                    j8 = j10;
                }
                qVar.skip(jIndexOf2 + 1);
            } else {
                kVar = this;
            }
            if (z3) {
                qVar.require(j8);
                short s11 = eVar2.readShort();
                c("FHCRC", (short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            kVar.f25181a = (byte) 1;
        }
        if (kVar.f25181a == 1) {
            long j11 = eVar.f25174b;
            long jN = kVar.f25184d.n(eVar, 8192L);
            if (jN != -1) {
                kVar.e(eVar, j11, jN);
                return jN;
            }
            kVar.f25181a = (byte) 2;
        }
        if (kVar.f25181a == 2) {
            c("CRC", qVar.readIntLe(), (int) crc32.getValue());
            c("ISIZE", qVar.readIntLe(), (int) kVar.f25183c.getBytesWritten());
            kVar.f25181a = (byte) 3;
            if (!qVar.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f25182b.f25203a.timeout();
    }
}
