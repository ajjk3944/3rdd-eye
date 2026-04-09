package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0477Eo {
    public final int A00;
    public final C1826nW A01;
    public final int[] A02;
    public final int[] A03;
    public final C1826nW[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public C0477Eo(String[] strArr, int[] iArr, C1826nW[] c1826nWArr, int[] iArr2, int[][][] iArr3, C1826nW c1826nW) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c1826nWArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c1826nW;
        this.A00 = iArr.length;
    }

    private final int A00(int i4, int i10, int i11) {
        return this.A06[i4][i10][i11];
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A01(int r8, int r9, int[] r10) {
        /*
            r7 = this;
            r6 = 0
            r2 = 16
            r5 = 0
            r4 = 0
            r3 = 0
        L6:
            int r0 = r10.length
            if (r3 >= r0) goto L3b
            r1 = r10[r3]
            com.facebook.ads.redexgen.X.nW[] r0 = r7.A04
            r0 = r0[r8]
            com.facebook.ads.redexgen.X.pg r0 = r0.A05(r9)
            com.facebook.ads.redexgen.X.qI r0 = r0.A08(r1)
            java.lang.String r0 = r0.A0W
            int r1 = r6 + 1
            if (r6 != 0) goto L32
            r4 = r0
        L1e:
            int[][][] r0 = r7.A06
            r0 = r0[r8]
            r0 = r0[r9]
            r0 = r0[r3]
            int r0 = com.instagram.common.viewpoint.core.AbstractC03087i.A01(r0)
            int r2 = java.lang.Math.min(r2, r0)
            int r3 = r3 + 1
            r6 = r1
            goto L6
        L32:
            boolean r0 = com.instagram.common.viewpoint.core.C5C.A1E(r4, r0)
            r0 = r0 ^ 1
            r0 = r0 | r5
            r5 = r0
            goto L1e
        L3b:
            if (r5 == 0) goto L45
            int[] r0 = r7.A02
            r0 = r0[r8]
            int r2 = java.lang.Math.min(r2, r0)
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0477Eo.A01(int, int, int[]):int");
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i4) {
        return this.A03[i4];
    }

    public final int A04(int i4, int i10, int i11) {
        return AbstractC03087i.A03(A00(i4, i10, i11));
    }

    public final int A05(int i4, int i10, boolean z3) {
        int i11 = this.A04[i4].A05(i10).A01;
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i11; trackIndexCount++) {
            int iA04 = A04(i4, i10, trackIndexCount);
            if (iA04 == 4 || (z3 && iA04 == 3)) {
                int trackCount = i12 + 1;
                iArr[i12] = trackIndexCount;
                i12 = trackCount;
            }
        }
        int trackCount2 = A01(i4, i10, Arrays.copyOf(iArr, i12));
        return trackCount2;
    }

    public final C1826nW A06() {
        return this.A01;
    }

    public final C1826nW A07(int i4) {
        return this.A04[i4];
    }
}
