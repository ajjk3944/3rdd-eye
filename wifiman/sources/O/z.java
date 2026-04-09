package o;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;

/* loaded from: classes.dex */
public final class z extends AbstractC7022m {

    /* renamed from: f, reason: collision with root package name */
    private int f55020f;

    public /* synthetic */ z(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f54984d <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f54985e) * 32), Yg.E.b(Yg.E.b(this.f54984d) * 25)) > 0) {
            s(S.e(this.f54984d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.f54981a;
        int i12 = this.f54984d;
        int[] iArr2 = this.f54982b;
        Object[] objArr = this.f54983c;
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
                    int iL = l(i17);
                    int i18 = i17 & i12;
                    if (((iL - i18) & i12) / 8 == ((i13 - i18) & i12) / 8) {
                        jArr[i14] = ((i16 & BER.MAX_OID_LENGTH) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iL >> 3;
                        long j11 = jArr[i19];
                        int i20 = (iL & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i13;
                            iArr = iArr2;
                            jArr[i19] = (j11 & (~(255 << i20))) | ((i16 & BER.MAX_OID_LENGTH) << i20);
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            iArr[iL] = iArr[i21];
                            iArr[i21] = 0;
                            objArr[iL] = objArr[i21];
                            objArr[i21] = null;
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
                            iArr[iB] = iArr[iL];
                            iArr[iL] = iArr[i23];
                            iArr[i23] = iArr[iB];
                            objArr[iB] = objArr[iL];
                            objArr[iL] = objArr[i23];
                            objArr[i23] = objArr[iB];
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
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & BER.MAX_OID_LENGTH;
        int i14 = this.f54984d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f54981a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i19 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f54982b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iL = l(i12);
                if (this.f55020f == 0 && ((this.f54981a[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    h();
                    iL = l(i12);
                }
                this.f54985e++;
                int i20 = this.f55020f;
                long[] jArr2 = this.f54981a;
                int i21 = iL >> 3;
                long j14 = jArr2[i21];
                int i22 = (iL & 7) << 3;
                this.f55020f = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this.f54984d;
                long j15 = ((~(255 << i22)) & j14) | (j11 << i22);
                jArr2[i21] = j15;
                jArr2[(((iL - 7) & i23) + (i23 & 7)) >> 3] = j15;
                return iL;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int l(int i10) {
        int i11 = this.f54984d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54981a;
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
        this.f55020f = S.c(d()) - this.f54985e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54981a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54984d = iMax;
        n(iMax);
        this.f54982b = new int[iMax];
        this.f54983c = new Object[iMax];
    }

    private final void s(int i10) {
        long[] jArr;
        z zVar = this;
        long[] jArr2 = zVar.f54981a;
        int[] iArr = zVar.f54982b;
        Object[] objArr = zVar.f54983c;
        int i11 = zVar.f54984d;
        o(i10);
        long[] jArr3 = zVar.f54981a;
        int[] iArr2 = zVar.f54982b;
        Object[] objArr2 = zVar.f54983c;
        int i12 = zVar.f54984d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iL = zVar.l(i15 >>> 7);
                long j10 = i15 & BER.MAX_OID_LENGTH;
                int i16 = iL >> 3;
                int i17 = (iL & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iL - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[iL] = i14;
                objArr2[iL] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            zVar = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
        this.f54985e = 0;
        long[] jArr = this.f54981a;
        if (jArr != S.f54926a) {
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f54981a;
            int i10 = this.f54984d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC3682n.v(this.f54983c, null, 0, this.f54984d);
        m();
    }

    public final Object p(int i10, Object obj) {
        int iK = k(i10);
        Object[] objArr = this.f54983c;
        Object obj2 = objArr[iK];
        this.f54982b[iK] = i10;
        objArr[iK] = obj;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f54984d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f54981a
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f54982b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.r(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.q(int):java.lang.Object");
    }

    public final Object r(int i10) {
        this.f54985e--;
        long[] jArr = this.f54981a;
        int i11 = this.f54984d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f54983c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void t(int i10, Object obj) {
        int iK = k(i10);
        this.f54982b[iK] = i10;
        this.f54983c[iK] = obj;
    }

    public z(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        o(S.g(i10));
    }
}
