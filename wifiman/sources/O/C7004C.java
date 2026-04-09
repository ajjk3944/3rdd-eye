package o;

import Zg.AbstractC3682n;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;

/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7004C extends r {

    /* renamed from: e, reason: collision with root package name */
    private int f54877e;

    public C7004C(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        k(S.g(i10));
    }

    private final void e() {
        if (this.f55000c <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f55001d) * 32), Yg.E.b(Yg.E.b(this.f55000c) * 25)) > 0) {
            o(S.e(this.f55000c));
        } else {
            f();
        }
    }

    private final void f() {
        int i10;
        long[] jArr = this.f54998a;
        int i11 = this.f55000c;
        long[] jArr2 = this.f54999b;
        S.a(jArr, i11);
        char c10 = 0;
        int i12 = 0;
        int iB = -1;
        while (i12 != i11) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j10 = (jArr[i13] >> i14) & 255;
            if (j10 == 128) {
                iB = i12;
                i12++;
            } else {
                if (j10 == 254) {
                    int iHashCode = Long.hashCode(jArr2[i12]) * (-862048943);
                    int i15 = iHashCode ^ (iHashCode << 16);
                    int i16 = i15 >>> 7;
                    int iH = h(i16);
                    int i17 = i16 & i11;
                    if (((iH - i17) & i11) / 8 == ((i12 - i17) & i11) / 8) {
                        jArr[i13] = ((i15 & BER.MAX_OID_LENGTH) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iH >> 3;
                        long j11 = jArr[i18];
                        int i19 = (iH & 7) << 3;
                        if (((j11 >> i19) & 255) == 128) {
                            int i20 = i12;
                            jArr[i18] = ((i15 & BER.MAX_OID_LENGTH) << i19) | (j11 & (~(255 << i19)));
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            jArr2[iH] = jArr2[i20];
                            jArr2[i20] = 0;
                            i10 = i20;
                            iB = i10;
                        } else {
                            int i21 = i12;
                            jArr[i18] = ((i15 & BER.MAX_OID_LENGTH) << i19) | (j11 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = S.b(jArr, i21 + 1, i11);
                            }
                            jArr2[iB] = jArr2[iH];
                            jArr2[iH] = jArr2[i21];
                            jArr2[i21] = jArr2[iB];
                            i10 = i21 - 1;
                        }
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i12 = i10 + 1;
                        c10 = 0;
                    }
                }
                i12++;
            }
        }
        i();
    }

    private final int g(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = this.f55000c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f54998a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f54999b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iH = h(i11);
                if (this.f54877e == 0 && ((this.f54998a[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    e();
                    iH = h(i11);
                }
                this.f55001d++;
                int i19 = this.f54877e;
                long[] jArr2 = this.f54998a;
                int i20 = iH >> 3;
                long j15 = jArr2[i20];
                int i21 = (iH & 7) << 3;
                this.f54877e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f55000c;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iH - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iH;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int h(int i10) {
        int i11 = this.f55000c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54998a;
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

    private final void i() {
        this.f54877e = S.c(b()) - this.f55001d;
    }

    private final void j(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54998a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        i();
    }

    private final void k(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f55000c = iMax;
        j(iMax);
        this.f54999b = new long[iMax];
    }

    private final void n(int i10) {
        this.f55001d--;
        long[] jArr = this.f54998a;
        int i11 = this.f55000c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    private final void o(int i10) {
        long[] jArr = this.f54998a;
        long[] jArr2 = this.f54999b;
        int i11 = this.f55000c;
        k(i10);
        long[] jArr3 = this.f54998a;
        long[] jArr4 = this.f54999b;
        int i12 = this.f55000c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iH = h(i14 >>> 7);
                long j11 = i14 & BER.MAX_OID_LENGTH;
                int i15 = iH >> 3;
                int i16 = (iH & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((iH - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[iH] = j10;
            }
        }
    }

    public final void l(long j10) {
        this.f54999b[g(j10)] = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f55000c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f54998a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f54999b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.n(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7004C.m(long):boolean");
    }
}
