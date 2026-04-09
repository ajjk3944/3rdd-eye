package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class R9 {
    public SparseArray<R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j8) {
        if (j == 0) {
            return j8;
        }
        return ((j / 4) * 3) + (j8 / 4);
    }

    private R8 A01(int i4) {
        R8 r82 = this.A00.get(i4);
        if (r82 == null) {
            R8 r83 = new R8();
            this.A00.put(i4, r83);
            return r83;
        }
        return r82;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.R8> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.R8> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.R8 r0 = (com.instagram.common.viewpoint.core.R8) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.RK> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.R9.A02():void");
    }

    public final RK A03(int i4) {
        R8 r82 = this.A00.get(i4);
        if (r82 != null && !r82.A03.isEmpty()) {
            return r82.A03.remove(r1.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i4, long j) {
        R8 r8A01 = A01(i4);
        r8A01.A01 = A00(r8A01.A01, j);
    }

    public final void A06(int i4, long j) {
        R8 r8A01 = A01(i4);
        r8A01.A02 = A00(r8A01.A02, j);
    }

    public final void A07(AbstractC0784Qq abstractC0784Qq) {
        this.A01++;
    }

    public final void A08(AbstractC0784Qq abstractC0784Qq, AbstractC0784Qq abstractC0784Qq2, boolean z3) {
        if (abstractC0784Qq != null) {
            A04();
        }
        if (!z3 && this.A01 == 0) {
            A02();
        }
        if (abstractC0784Qq2 != null) {
            A07(abstractC0784Qq2);
        }
    }

    public final void A09(RK rk2) {
        int iA0N = rk2.A0N();
        ArrayList<RK> arrayList = A01(iA0N).A03;
        int i4 = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i4 <= viewType) {
            return;
        }
        rk2.A0W();
        arrayList.add(rk2);
    }

    public final boolean A0A(int i4, long j, long j8) {
        long j9 = A01(i4).A01;
        return j9 == 0 || j + j9 < j8;
    }

    public final boolean A0B(int i4, long j, long j8) {
        long j9 = A01(i4).A02;
        return j9 == 0 || j + j9 < j8;
    }
}
