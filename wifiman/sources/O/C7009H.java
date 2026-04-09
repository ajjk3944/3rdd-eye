package o;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;

/* renamed from: o.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7009H extends Q {

    /* renamed from: f, reason: collision with root package name */
    private int f54881f;

    public /* synthetic */ C7009H(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f54924d <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f54925e) * 32), Yg.E.b(Yg.E.b(this.f54924d) * 25)) > 0) {
            r(S.e(this.f54924d));
        } else {
            j();
        }
    }

    private final void j() {
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr = this.f54921a;
        int i12 = this.f54924d;
        Object[] objArr2 = this.f54922b;
        Object[] objArr3 = this.f54923c;
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
                    int iK = k(i17);
                    int i18 = i17 & i12;
                    if (((iK - i18) & i12) / 8 == ((i14 - i18) & i12) / 8) {
                        jArr[i15] = ((r10 & BER.MAX_OID_LENGTH) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[AbstractC3682n.f0(jArr)] = jArr[i13];
                    } else {
                        int i19 = iK >> 3;
                        long j11 = jArr[i19];
                        int i20 = (iK & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i14;
                            objArr = objArr2;
                            jArr[i19] = (j11 & (~(255 << i20))) | ((r10 & BER.MAX_OID_LENGTH) << i20);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            objArr[iK] = objArr[i21];
                            objArr[i21] = null;
                            objArr3[iK] = objArr3[i21];
                            objArr3[i21] = null;
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
                            objArr[iB] = objArr[iK];
                            objArr[iK] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            objArr3[iB] = objArr3[iK];
                            objArr3[iK] = objArr3[i23];
                            objArr3[i23] = objArr3[iB];
                            i11 = i23 - 1;
                        }
                        i13 = 0;
                        jArr[AbstractC3682n.f0(jArr)] = jArr[0];
                        i14 = i11 + 1;
                        i12 = i10;
                        objArr2 = objArr;
                    }
                }
                i14++;
            }
        }
        m();
    }

    private final int k(int i10) {
        int i11 = this.f54924d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54921a;
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

    private final void m() {
        this.f54881f = S.c(d()) - this.f54925e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54921a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54924d = iMax;
        n(iMax);
        this.f54922b = new Object[iMax];
        this.f54923c = new Object[iMax];
    }

    private final void r(int i10) {
        int i11;
        long[] jArr = this.f54921a;
        Object[] objArr = this.f54922b;
        Object[] objArr2 = this.f54923c;
        int i12 = this.f54924d;
        o(i10);
        long[] jArr2 = this.f54921a;
        Object[] objArr3 = this.f54922b;
        Object[] objArr4 = this.f54923c;
        int i13 = this.f54924d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = k(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & BER.MAX_OID_LENGTH;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iK - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iK] = obj;
                objArr4[iK] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void i() {
        this.f54925e = 0;
        long[] jArr = this.f54921a;
        if (jArr != S.f54926a) {
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f54921a;
            int i10 = this.f54924d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC3682n.v(this.f54923c, null, 0, this.f54924d);
        AbstractC3682n.v(this.f54922b, null, 0, this.f54924d);
        m();
    }

    public final int l(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = this.f54924d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f54921a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC6492s.d(this.f54922b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i11);
                if (this.f54881f == 0 && ((this.f54921a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i11);
                }
                this.f54925e++;
                int i19 = this.f54881f;
                long[] jArr2 = this.f54921a;
                int i20 = iK >> 3;
                long j14 = jArr2[i20];
                int i21 = (iK & 7) << 3;
                this.f54881f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f54924d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iK - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iK;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f54924d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f54921a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f54922b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC6492s.d(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.q(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7009H.p(java.lang.Object):java.lang.Object");
    }

    public final Object q(int i10) {
        this.f54925e--;
        long[] jArr = this.f54921a;
        int i11 = this.f54924d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f54922b[i10] = null;
        Object[] objArr = this.f54923c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void s(Object obj, Object obj2) {
        int iL = l(obj);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f54922b[iL] = obj;
        this.f54923c[iL] = obj2;
    }

    public C7009H(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        o(S.g(i10));
    }
}
