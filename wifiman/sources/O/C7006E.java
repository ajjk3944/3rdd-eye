package o;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;

/* renamed from: o.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7006E extends K {

    /* renamed from: f, reason: collision with root package name */
    private int f54879f;

    public /* synthetic */ C7006E(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f54907d <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f54908e) * 32), Yg.E.b(Yg.E.b(this.f54907d) * 25)) > 0) {
            q(S.e(this.f54907d));
        } else {
            i();
        }
    }

    private final void i() {
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr = this.f54904a;
        int i12 = this.f54907d;
        Object[] objArr2 = this.f54905b;
        int[] iArr = this.f54906c;
        S.a(jArr, i12);
        int i13 = 0;
        int i14 = 0;
        int iB = -1;
        while (i14 != i12) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j10 = (jArr[i15] >> i16) & 255;
            if (j10 == 128) {
                iB = i14;
                i14++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr2[i14];
                    int iHashCode = (obj != null ? obj.hashCode() : i13) * (-862048943);
                    int i17 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                    int iJ = j(i17);
                    int i18 = i17 & i12;
                    if (((iJ - i18) & i12) / 8 == ((i14 - i18) & i12) / 8) {
                        jArr[i15] = ((r10 & BER.MAX_OID_LENGTH) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[i13] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iJ >> 3;
                        long j11 = jArr[i19];
                        int i20 = (iJ & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i14;
                            objArr = objArr2;
                            jArr[i19] = (j11 & (~(255 << i20))) | ((r10 & BER.MAX_OID_LENGTH) << i20);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            objArr[iJ] = objArr[i21];
                            objArr[i21] = null;
                            iArr[iJ] = iArr[i21];
                            iArr[i21] = 0;
                            i11 = i21;
                            iB = i11;
                            i10 = i12;
                        } else {
                            int i22 = i12;
                            objArr = objArr2;
                            int i23 = i14;
                            jArr[i19] = ((r10 & BER.MAX_OID_LENGTH) << i20) | (j11 & (~(255 << i20)));
                            if (iB == -1) {
                                i10 = i22;
                                iB = S.b(jArr, i23 + 1, i10);
                            } else {
                                i10 = i22;
                            }
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            iArr[iB] = iArr[iJ];
                            iArr[iJ] = iArr[i23];
                            iArr[i23] = iArr[iB];
                            i11 = i23 - 1;
                        }
                        i13 = 0;
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i14 = i11 + 1;
                        i12 = i10;
                        objArr2 = objArr;
                    }
                }
                i14++;
            }
        }
        l();
    }

    private final int j(int i10) {
        int i11 = this.f54907d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54904a;
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

    private final int k(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = this.f54907d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f54904a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC6492s.d(this.f54905b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.f54879f == 0 && ((this.f54904a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    h();
                    iJ = j(i11);
                }
                this.f54908e++;
                int i19 = this.f54879f;
                long[] jArr2 = this.f54904a;
                int i20 = iJ >> 3;
                long j14 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.f54879f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f54907d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iJ;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void l() {
        this.f54879f = S.c(c()) - this.f54908e;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54904a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    private final void n(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54907d = iMax;
        m(iMax);
        this.f54905b = new Object[iMax];
        this.f54906c = new int[iMax];
    }

    private final void q(int i10) {
        int i11;
        long[] jArr = this.f54904a;
        Object[] objArr = this.f54905b;
        int[] iArr = this.f54906c;
        int i12 = this.f54907d;
        n(i10);
        long[] jArr2 = this.f54904a;
        Object[] objArr2 = this.f54905b;
        int[] iArr2 = this.f54906c;
        int i13 = this.f54907d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iJ = j(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & BER.MAX_OID_LENGTH;
                int i16 = iJ >> 3;
                int i17 = (iJ & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iJ - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[iJ] = obj;
                iArr2[iJ] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final int o(Object obj, int i10, int i11) {
        int iK = k(obj);
        if (iK < 0) {
            iK = ~iK;
        } else {
            i11 = this.f54906c[iK];
        }
        this.f54905b[iK] = obj;
        this.f54906c[iK] = i10;
        return i11;
    }

    public final void p(int i10) {
        this.f54908e--;
        long[] jArr = this.f54904a;
        int i11 = this.f54907d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f54905b[i10] = null;
    }

    public final void r(Object obj, int i10) {
        int iK = k(obj);
        if (iK < 0) {
            iK = ~iK;
        }
        this.f54905b[iK] = obj;
        this.f54906c[iK] = i10;
    }

    public C7006E(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        n(S.g(i10));
    }
}
