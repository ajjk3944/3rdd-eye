package o;

import Zg.AbstractC3682n;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;

/* renamed from: o.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7003B extends AbstractC7026q {

    /* renamed from: f, reason: collision with root package name */
    private int f54876f;

    public C7003B(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        m(S.g(i10));
    }

    private final void f() {
        if (this.f54996d <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f54997e) * 32), Yg.E.b(Yg.E.b(this.f54996d) * 25)) > 0) {
            n(S.e(this.f54996d));
        } else {
            h();
        }
    }

    private final void h() {
        long[] jArr;
        int i10;
        int i11;
        long[] jArr2 = this.f54993a;
        int i12 = this.f54996d;
        long[] jArr3 = this.f54994b;
        Object[] objArr = this.f54995c;
        S.a(jArr2, i12);
        char c10 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i12) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j10 = (jArr2[i14] >> i15) & 255;
            if (j10 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int iHashCode = Long.hashCode(jArr3[i13]) * (-862048943);
                    int i16 = iHashCode ^ (iHashCode << 16);
                    int i17 = i16 >>> 7;
                    int iJ = j(i17);
                    int i18 = i17 & i12;
                    if (((iJ - i18) & i12) / 8 == ((i13 - i18) & i12) / 8) {
                        jArr2[i14] = ((i16 & BER.MAX_OID_LENGTH) << i15) | ((~(255 << i15)) & jArr2[i14]);
                        jArr2[AbstractC3682n.f0(jArr2)] = (jArr2[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iJ >> 3;
                        long j11 = jArr2[i19];
                        int i20 = (iJ & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i13;
                            jArr = jArr3;
                            jArr2[i19] = (j11 & (~(255 << i20))) | ((i16 & BER.MAX_OID_LENGTH) << i20);
                            jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (128 << i15);
                            jArr[iJ] = jArr[i21];
                            jArr[i21] = 0;
                            objArr[iJ] = objArr[i21];
                            objArr[i21] = null;
                            i11 = i21;
                            iB = i11;
                            i10 = i12;
                        } else {
                            int i22 = i12;
                            jArr = jArr3;
                            int i23 = i13;
                            jArr2[i19] = ((i16 & BER.MAX_OID_LENGTH) << i20) | (j11 & (~(255 << i20)));
                            if (iB == -1) {
                                i10 = i22;
                                iB = S.b(jArr2, i23 + 1, i10);
                            } else {
                                i10 = i22;
                            }
                            jArr[iB] = jArr[iJ];
                            jArr[iJ] = jArr[i23];
                            jArr[i23] = jArr[iB];
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            i11 = i23 - 1;
                        }
                        c10 = 0;
                        jArr2[AbstractC3682n.f0(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i11 + 1;
                        i12 = i10;
                        jArr3 = jArr;
                    }
                }
                i13++;
            }
        }
        k();
    }

    private final int i(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = this.f54996d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f54993a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f54994b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.f54876f == 0 && ((this.f54993a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i11);
                }
                this.f54997e++;
                int i19 = this.f54876f;
                long[] jArr2 = this.f54993a;
                int i20 = iJ >> 3;
                long j15 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.f54876f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f54996d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iJ;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int j(int i10) {
        int i11 = this.f54996d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54993a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void k() {
        this.f54876f = S.c(c()) - this.f54997e;
    }

    private final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54993a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        k();
    }

    private final void m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54996d = iMax;
        l(iMax);
        this.f54994b = new long[iMax];
        this.f54995c = new Object[iMax];
    }

    private final void n(int i10) {
        long[] jArr;
        C7003B c7003b = this;
        long[] jArr2 = c7003b.f54993a;
        long[] jArr3 = c7003b.f54994b;
        Object[] objArr = c7003b.f54995c;
        int i11 = c7003b.f54996d;
        m(i10);
        long[] jArr4 = c7003b.f54993a;
        long[] jArr5 = c7003b.f54994b;
        Object[] objArr2 = c7003b.f54995c;
        int i12 = c7003b.f54996d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iJ = c7003b.j(i14 >>> 7);
                long j11 = i14 & BER.MAX_OID_LENGTH;
                int i15 = iJ >> 3;
                int i16 = (iJ & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                jArr4[i15] = j12;
                jArr4[(((iJ - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr5[iJ] = j10;
                objArr2[iJ] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c7003b = this;
            jArr2 = jArr;
        }
    }

    public final void g() {
        this.f54997e = 0;
        long[] jArr = this.f54993a;
        if (jArr != S.f54926a) {
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f54993a;
            int i10 = this.f54996d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC3682n.v(this.f54995c, null, 0, this.f54996d);
        k();
    }

    public final void o(long j10, Object obj) {
        int i10 = i(j10);
        this.f54994b[i10] = j10;
        this.f54995c[i10] = obj;
    }
}
