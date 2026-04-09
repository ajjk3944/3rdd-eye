package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class j implements s {

    /* renamed from: b, reason: collision with root package name */
    private final e f18169b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f18170c;

    /* renamed from: d, reason: collision with root package name */
    private final k f18171d;

    /* renamed from: a, reason: collision with root package name */
    private int f18168a = 0;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f18172e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f18170c = inflater;
        e eVarA = l.a(sVar);
        this.f18169b = eVarA;
        this.f18171d = new k(eVarA, inflater);
    }

    private void a(c cVar, long j10, long j11) {
        o oVar = cVar.f18157a;
        while (true) {
            long j12 = oVar.f18192c - oVar.f18191b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f18195f;
        }
        while (j11 > 0) {
            int iMin = (int) Math.min(oVar.f18192c - r6, j11);
            this.f18172e.update(oVar.f18190a, (int) (oVar.f18191b + j10), iMin);
            j11 -= iMin;
            oVar = oVar.f18195f;
            j10 = 0;
        }
    }

    private void d() throws IOException {
        this.f18169b.e(10L);
        byte bF = this.f18169b.a().f(3L);
        boolean z10 = ((bF >> 1) & 1) == 1;
        if (z10) {
            a(this.f18169b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f18169b.readShort());
        this.f18169b.skip(8L);
        if (((bF >> 2) & 1) == 1) {
            this.f18169b.e(2L);
            if (z10) {
                a(this.f18169b.a(), 0L, 2L);
            }
            long jG = this.f18169b.a().g();
            this.f18169b.e(jG);
            if (z10) {
                a(this.f18169b.a(), 0L, jG);
            }
            this.f18169b.skip(jG);
        }
        if (((bF >> 3) & 1) == 1) {
            long jA = this.f18169b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f18169b.a(), 0L, jA + 1);
            }
            this.f18169b.skip(jA + 1);
        }
        if (((bF >> 4) & 1) == 1) {
            long jA2 = this.f18169b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f18169b.a(), 0L, jA2 + 1);
            }
            this.f18169b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f18169b.g(), (short) this.f18172e.getValue());
            this.f18172e.reset();
        }
    }

    private void h() throws IOException {
        a("CRC", this.f18169b.e(), (int) this.f18172e.getValue());
        a("ISIZE", this.f18169b.e(), (int) this.f18170c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws DataFormatException, IOException {
        j jVar;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f18168a == 0) {
            d();
            this.f18168a = 1;
        }
        if (this.f18168a == 1) {
            long j11 = cVar.f18158b;
            long jB = this.f18171d.b(cVar, j10);
            if (jB != -1) {
                a(cVar, j11, jB);
                return jB;
            }
            jVar = this;
            jVar.f18168a = 2;
        } else {
            jVar = this;
        }
        if (jVar.f18168a == 2) {
            h();
            jVar.f18168a = 3;
            if (!jVar.f18169b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18171d.close();
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f18169b.b();
    }
}
