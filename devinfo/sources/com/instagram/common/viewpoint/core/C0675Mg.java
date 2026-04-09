package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0675Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C1646kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C0674Mf> A03;
    public final TreeSet<C1644kL> A04;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C0675Mg(int i4, String str) {
        this(i4, str, C1646kN.A03);
    }

    public C0675Mg(int i4, String str, C1646kN c1646kN) {
        this.A01 = i4;
        this.A02 = str;
        this.A00 = c1646kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j, long j8) {
        boolean z3 = true;
        AbstractC02203y.A07(j >= 0);
        if (j8 < 0) {
            z3 = false;
        }
        AbstractC02203y.A07(z3);
        C1644kL c1644kLA04 = A04(j, j8);
        if (c1644kLA04.A03()) {
            return -Math.min(c1644kLA04.A04() ? Long.MAX_VALUE : c1644kLA04.A01, j8);
        }
        long j9 = j + j8;
        if (j9 < 0) {
            j9 = Long.MAX_VALUE;
        }
        long currentEndPosition = c1644kLA04.A02 + c1644kLA04.A01;
        if (currentEndPosition < j9) {
            TreeSet<C1644kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C1644kL c1644kL : treeSet.tailSet(c1644kLA04, false)) {
                if (c1644kL.A02 > currentEndPosition) {
                    break;
                }
                long j10 = c1644kL.A02;
                long queryEndPosition = c1644kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j10 + queryEndPosition);
                if (currentEndPosition >= j9) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j, j8);
    }

    public final C1646kN A03() {
        return this.A00;
    }

    public final C1644kL A04(long j, long j8) {
        C1644kL c1644kLA03 = C1644kL.A03(this.A02, j);
        C1644kL c1644kLFloor = this.A04.floor(c1644kLA03);
        if (c1644kLFloor != null && c1644kLFloor.A02 + c1644kLFloor.A01 > j) {
            return c1644kLFloor;
        }
        C1644kL lookupSpan = this.A04.ceiling(c1644kLA03);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j;
            if (j8 != -1) {
                jMin = Math.min(jMin, j8);
            }
            j8 = jMin;
        }
        return C1644kL.A04(this.A02, j, j8);
    }

    public final C1644kL A05(C1644kL c1644kL, long j, boolean z3) {
        AbstractC02203y.A08(this.A04.remove(c1644kL));
        File file = (File) AbstractC02203y.A01(c1644kL.A03);
        if (z3) {
            File file2 = file.getParentFile();
            File fileA05 = C1644kL.A05((File) AbstractC02203y.A01(file2), this.A01, c1644kL.A02, j);
            if (file.renameTo(fileA05)) {
                file = fileA05;
            } else {
                AbstractC02284g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + fileA05);
            }
        }
        C1644kL newCacheSpan = c1644kL.A09(file, j);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C1644kL> A06() {
        return this.A04;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(long r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r4.A03
            int r0 = r0.size()
            if (r3 >= r0) goto L20
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r4.A03
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.Mf r0 = (com.instagram.common.viewpoint.core.C0674Mf) r0
            long r1 = r0.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L1d
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r4.A03
            r0.remove(r3)
            return
        L1d:
            int r3 = r3 + 1
            goto L1
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0675Mg.A07(long):void");
    }

    public final void A08(C1644kL c1644kL) {
        this.A04.add(c1644kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(long r3, long r5) {
        /*
            r2 = this;
            r1 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r2.A03
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Mf r0 = (com.instagram.common.viewpoint.core.C0674Mf) r0
            boolean r0 = r0.A00(r3, r5)
            if (r0 == 0) goto L19
            r0 = 1
            return r0
        L19:
            int r1 = r1 + 1
            goto L1
        L1c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0675Mg.A0B(long, long):boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0C(long r3, long r5) {
        /*
            r2 = this;
            r1 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r2.A03
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Mf r0 = (com.instagram.common.viewpoint.core.C0674Mf) r0
            boolean r0 = r0.A01(r3, r5)
            if (r0 == 0) goto L19
            r0 = 0
            return r0
        L19:
            int r1 = r1 + 1
            goto L1
        L1c:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Mf> r1 = r2.A03
            com.facebook.ads.redexgen.X.Mf r0 = new com.facebook.ads.redexgen.X.Mf
            r0.<init>(r3, r5)
            r1.add(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0675Mg.A0C(long, long):boolean");
    }

    public final boolean A0D(MZ mz) {
        if (this.A04.remove(mz)) {
            if (mz.A03 != null) {
                mz.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(C0680Ml c0680Ml) {
        C1646kN c1646kN = this.A00;
        C1646kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c0680Ml);
        C1646kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c1646kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0675Mg c0675Mg = (C0675Mg) obj;
        if (this.A01 == c0675Mg.A01 && this.A02.equals(c0675Mg.A02) && this.A04.equals(c0675Mg.A04) && this.A00.equals(c0675Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i4 = result * 31;
        int result2 = this.A02.hashCode();
        return ((i4 + result2) * 31) + this.A00.hashCode();
    }
}
