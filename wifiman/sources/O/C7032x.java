package o;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;

/* renamed from: o.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7032x extends AbstractC7018i {

    /* renamed from: f, reason: collision with root package name */
    private int f55019f;

    public /* synthetic */ C7032x(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f54975d <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f54976e) * 32), Yg.E.b(Yg.E.b(this.f54975d) * 25)) > 0) {
            p(S.e(this.f54975d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.f54972a;
        int i12 = this.f54975d;
        int[] iArr2 = this.f54973b;
        int[] iArr3 = this.f54974c;
        S.a(jArr, i12);
        char c10 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i12) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j10 = (jArr[i14] >> i15) & 255;
            if (j10 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int iHashCode = Integer.hashCode(iArr2[i13]) * (-862048943);
                    int i16 = iHashCode ^ (iHashCode << 16);
                    int i17 = i16 >>> 7;
                    int iK = k(i17);
                    int i18 = i17 & i12;
                    if (((iK - i18) & i12) / 8 == ((i13 - i18) & i12) / 8) {
                        jArr[i14] = ((i16 & BER.MAX_OID_LENGTH) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iK >> 3;
                        long j11 = jArr[i19];
                        int i20 = (iK & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i13;
                            iArr = iArr2;
                            jArr[i19] = (j11 & (~(255 << i20))) | ((i16 & BER.MAX_OID_LENGTH) << i20);
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            iArr[iK] = iArr[i21];
                            iArr[i21] = 0;
                            iArr3[iK] = iArr3[i21];
                            iArr3[i21] = 0;
                            i11 = i21;
                            iB = i11;
                            i10 = i12;
                        } else {
                            int i22 = i12;
                            iArr = iArr2;
                            int i23 = i13;
                            jArr[i19] = ((i16 & BER.MAX_OID_LENGTH) << i20) | (j11 & (~(255 << i20)));
                            if (iB == -1) {
                                i10 = i22;
                                iB = S.b(jArr, i23 + 1, i10);
                            } else {
                                i10 = i22;
                            }
                            iArr[iB] = iArr[iK];
                            iArr[iK] = iArr[i23];
                            iArr[i23] = iArr[iB];
                            iArr3[iB] = iArr3[iK];
                            iArr3[iK] = iArr3[i23];
                            iArr3[i23] = iArr3[iB];
                            i11 = i23 - 1;
                        }
                        c10 = 0;
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i11 + 1;
                        i12 = i10;
                        iArr2 = iArr;
                    }
                }
                i13++;
            }
        }
        m();
    }

    private final int k(int i10) {
        int i11 = this.f54975d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54972a;
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

    private final int l(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & BER.MAX_OID_LENGTH;
        int i14 = this.f54975d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f54972a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i19 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f54973b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.f55019f == 0 && ((this.f54972a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i12);
                }
                this.f54976e++;
                int i20 = this.f55019f;
                long[] jArr2 = this.f54972a;
                int i21 = iK >> 3;
                long j14 = jArr2[i21];
                int i22 = (iK & 7) << 3;
                this.f55019f = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this.f54975d;
                long j15 = ((~(255 << i22)) & j14) | (j11 << i22);
                jArr2[i21] = j15;
                jArr2[(((iK - 7) & i23) + (i23 & 7)) >> 3] = j15;
                return ~iK;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void m() {
        this.f55019f = S.c(d()) - this.f54976e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54972a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54975d = iMax;
        n(iMax);
        this.f54973b = new int[iMax];
        this.f54974c = new int[iMax];
    }

    private final void p(int i10) {
        long[] jArr;
        C7032x c7032x = this;
        long[] jArr2 = c7032x.f54972a;
        int[] iArr = c7032x.f54973b;
        int[] iArr2 = c7032x.f54974c;
        int i11 = c7032x.f54975d;
        o(i10);
        long[] jArr3 = c7032x.f54972a;
        int[] iArr3 = c7032x.f54973b;
        int[] iArr4 = c7032x.f54974c;
        int i12 = c7032x.f54975d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = c7032x.k(i15 >>> 7);
                long j10 = i15 & BER.MAX_OID_LENGTH;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[iK] = i14;
                iArr4[iK] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c7032x = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
        this.f54976e = 0;
        long[] jArr = this.f54972a;
        if (jArr != S.f54926a) {
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f54972a;
            int i10 = this.f54975d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m();
    }

    public final void q(int i10, int i11) {
        int iL = l(i10);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f54973b[iL] = i10;
        this.f54974c[iL] = i11;
    }

    public C7032x(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        o(S.g(i10));
    }
}
