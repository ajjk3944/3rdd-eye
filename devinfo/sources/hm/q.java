package hm;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements g {

    /* renamed from: a, reason: collision with root package name */
    public final w f25203a;

    /* renamed from: b, reason: collision with root package name */
    public final e f25204b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25205c;

    public q(w wVar) {
        nk.k.e(wVar, "source");
        this.f25203a = wVar;
        this.f25204b = new e();
    }

    @Override // hm.g
    public final int C(n nVar) throws EOFException {
        nk.k.e(nVar, "options");
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            e eVar = this.f25204b;
            int iB = im.a.b(eVar, nVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    eVar.skip(nVar.f25192a[iB].a());
                    return iB;
                }
            } else if (this.f25203a.n(eVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final long c(h hVar) {
        int i4;
        int i10;
        long j;
        int i11;
        int i12;
        nk.k.e(hVar, "targetBytes");
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            e eVar = this.f25204b;
            eVar.getClass();
            nk.k.e(hVar, "targetBytes");
            long j8 = 0;
            if (jMax < 0) {
                throw new IllegalArgumentException(a0.g.j(jMax, "fromIndex < 0: ").toString());
            }
            r rVar = eVar.f25173a;
            if (rVar == null) {
                j = -1;
            } else {
                long j9 = eVar.f25174b;
                int i13 = 0;
                if (j9 - jMax < jMax) {
                    while (j9 > jMax) {
                        rVar = rVar.g;
                        nk.k.b(rVar);
                        j9 -= rVar.f25208c - rVar.f25207b;
                    }
                    if (hVar.a() == 2) {
                        byte bD = hVar.d(0);
                        byte bD2 = hVar.d(1);
                        long j10 = jMax;
                        while (j9 < eVar.f25174b) {
                            byte[] bArr = rVar.f25206a;
                            i11 = (int) ((rVar.f25207b + j10) - j9);
                            int i14 = rVar.f25208c;
                            while (i11 < i14) {
                                byte b10 = bArr[i11];
                                if (b10 == bD || b10 == bD2) {
                                    i12 = rVar.f25207b;
                                    j = (i11 - i12) + j9;
                                    break;
                                }
                                i11++;
                            }
                            j10 = j9 + (rVar.f25208c - rVar.f25207b);
                            rVar = rVar.f25211f;
                            nk.k.b(rVar);
                            j9 = j10;
                        }
                        j = -1;
                    } else {
                        byte[] bArrC = hVar.c();
                        long j11 = jMax;
                        while (j9 < eVar.f25174b) {
                            byte[] bArr2 = rVar.f25206a;
                            i11 = (int) ((rVar.f25207b + j11) - j9);
                            int i15 = rVar.f25208c;
                            while (i11 < i15) {
                                byte b11 = bArr2[i11];
                                int length = bArrC.length;
                                for (int i16 = i13; i16 < length; i16++) {
                                    if (b11 == bArrC[i16]) {
                                        i12 = rVar.f25207b;
                                        j = (i11 - i12) + j9;
                                        break;
                                    }
                                }
                                i11++;
                                i13 = 0;
                            }
                            j11 = (rVar.f25208c - rVar.f25207b) + j9;
                            rVar = rVar.f25211f;
                            nk.k.b(rVar);
                            j9 = j11;
                            i13 = 0;
                        }
                        j = -1;
                    }
                } else {
                    while (true) {
                        long j12 = (rVar.f25208c - rVar.f25207b) + j8;
                        if (j12 > jMax) {
                            break;
                        }
                        rVar = rVar.f25211f;
                        nk.k.b(rVar);
                        j8 = j12;
                    }
                    if (hVar.a() == 2) {
                        byte bD3 = hVar.d(0);
                        byte bD4 = hVar.d(1);
                        long j13 = jMax;
                        while (j8 < eVar.f25174b) {
                            byte[] bArr3 = rVar.f25206a;
                            i4 = (int) ((rVar.f25207b + j13) - j8);
                            int i17 = rVar.f25208c;
                            while (i4 < i17) {
                                byte b12 = bArr3[i4];
                                if (b12 == bD3 || b12 == bD4) {
                                    i10 = rVar.f25207b;
                                    j = j8 + (i4 - i10);
                                    break;
                                }
                                i4++;
                            }
                            j13 = (rVar.f25208c - rVar.f25207b) + j8;
                            rVar = rVar.f25211f;
                            nk.k.b(rVar);
                            j8 = j13;
                        }
                        j = -1;
                    } else {
                        int i18 = 0;
                        byte[] bArrC2 = hVar.c();
                        long j14 = jMax;
                        while (j8 < eVar.f25174b) {
                            byte[] bArr4 = rVar.f25206a;
                            i4 = (int) ((rVar.f25207b + j14) - j8);
                            int i19 = rVar.f25208c;
                            while (i4 < i19) {
                                byte b13 = bArr4[i4];
                                int length2 = bArrC2.length;
                                for (int i20 = i18; i20 < length2; i20++) {
                                    if (b13 == bArrC2[i20]) {
                                        i10 = rVar.f25207b;
                                        j = j8 + (i4 - i10);
                                        break;
                                    }
                                }
                                i4++;
                                i18 = 0;
                            }
                            j14 = (rVar.f25208c - rVar.f25207b) + j8;
                            rVar = rVar.f25211f;
                            nk.k.b(rVar);
                            j8 = j14;
                            i18 = 0;
                        }
                        j = -1;
                    }
                }
            }
            if (j != -1) {
                return j;
            }
            long j15 = eVar.f25174b;
            if (this.f25203a.n(eVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j15);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f25205c) {
            return;
        }
        this.f25205c = true;
        this.f25203a.close();
        this.f25204b.e();
    }

    public final boolean exhausted() {
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f25204b;
        return eVar.exhausted() && this.f25203a.n(eVar, 8192L) == -1;
    }

    @Override // hm.g, hm.f
    public final e getBuffer() {
        return this.f25204b;
    }

    @Override // hm.g
    public final long i(e eVar) {
        e eVar2;
        long j = 0;
        while (true) {
            w wVar = this.f25203a;
            eVar2 = this.f25204b;
            if (wVar.n(eVar2, 8192L) == -1) {
                break;
            }
            long jG = eVar2.g();
            if (jG > 0) {
                j += jG;
                eVar.Q(eVar2, jG);
            }
        }
        long j8 = eVar2.f25174b;
        if (j8 <= 0) {
            return j;
        }
        long j9 = j + j8;
        eVar.Q(eVar2, j8);
        return j9;
    }

    public final long indexOf(byte b10, long j, long j8) {
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j8) {
            throw new IllegalArgumentException(a0.g.j(j8, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j8) {
            e eVar = this.f25204b;
            byte b11 = b10;
            long j9 = j8;
            long jIndexOf = eVar.indexOf(b11, jMax, j9);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j10 = eVar.f25174b;
            if (j10 >= j9 || this.f25203a.n(eVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j10);
            b10 = b11;
            j8 = j9;
        }
        return -1L;
    }

    @Override // hm.g
    public final InputStream inputStream() {
        return new c(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f25205c;
    }

    @Override // hm.w
    public final long n(e eVar, long j) {
        nk.k.e(eVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "byteCount < 0: ").toString());
        }
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        e eVar2 = this.f25204b;
        if (eVar2.f25174b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f25203a.n(eVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return eVar2.n(eVar, Math.min(j, eVar2.f25174b));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        nk.k.e(byteBuffer, "sink");
        e eVar = this.f25204b;
        if (eVar.f25174b == 0 && this.f25203a.n(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    @Override // hm.g
    public final byte readByte() throws EOFException {
        require(1L);
        return this.f25204b.readByte();
    }

    @Override // hm.g
    public final h readByteString(long j) throws EOFException {
        require(j);
        return this.f25204b.readByteString(j);
    }

    @Override // hm.g
    public final int readInt() throws EOFException {
        require(4L);
        return this.f25204b.readInt();
    }

    public final int readIntLe() throws EOFException {
        require(4L);
        int i4 = this.f25204b.readInt();
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    @Override // hm.g
    public final short readShort() throws EOFException {
        require(2L);
        return this.f25204b.readShort();
    }

    @Override // hm.g
    public final String readString(Charset charset) {
        nk.k.e(charset, "charset");
        w wVar = this.f25203a;
        e eVar = this.f25204b;
        eVar.A(wVar);
        return eVar.readString(charset);
    }

    @Override // hm.g
    public final String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "limit < 0: ").toString());
        }
        long j8 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j8);
        e eVar = this.f25204b;
        if (jIndexOf != -1) {
            return im.a.a(eVar, jIndexOf);
        }
        if (j8 < Long.MAX_VALUE && request(j8) && eVar.p(j8 - 1) == 13 && request(j8 + 1) && eVar.p(j8) == 10) {
            return im.a.a(eVar, j8);
        }
        e eVar2 = new e();
        eVar.m(eVar2, 0L, Math.min(32, eVar.f25174b));
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f25174b, j) + " content=" + eVar2.readByteString(eVar2.f25174b).b() + (char) 8230);
    }

    @Override // hm.g
    public final boolean request(long j) {
        e eVar;
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "byteCount < 0: ").toString());
        }
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f25204b;
            if (eVar.f25174b >= j) {
                return true;
            }
        } while (this.f25203a.n(eVar, 8192L) != -1);
        return false;
    }

    @Override // hm.g
    public final void require(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // hm.g
    public final void skip(long j) throws EOFException {
        if (this.f25205c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            e eVar = this.f25204b;
            if (eVar.f25174b == 0 && this.f25203a.n(eVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, eVar.f25174b);
            eVar.skip(jMin);
            j -= jMin;
        }
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f25203a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f25203a + ')';
    }
}
