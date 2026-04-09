package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class R9 {
    public SparseArray<R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        return ((j10 / 4) * 3) + (j11 / 4);
    }

    private R8 A01(int i10) {
        R8 r82 = this.A00.get(i10);
        if (r82 == null) {
            R8 r83 = new R8();
            this.A00.put(i10, r83);
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

    public final RK A03(int i10) {
        R8 r82 = this.A00.get(i10);
        if (r82 != null && !r82.A03.isEmpty()) {
            return r82.A03.remove(r1.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        R8 r8A01 = A01(i10);
        r8A01.A01 = A00(r8A01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        R8 r8A01 = A01(i10);
        r8A01.A02 = A00(r8A01.A02, j10);
    }

    public final void A07(AbstractC1162Qq abstractC1162Qq) {
        this.A01++;
    }

    public final void A08(AbstractC1162Qq abstractC1162Qq, AbstractC1162Qq abstractC1162Qq2, boolean z10) {
        if (abstractC1162Qq != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (abstractC1162Qq2 != null) {
            A07(abstractC1162Qq2);
        }
    }

    public final void A09(RK rk) {
        int iA0N = rk.A0N();
        ArrayList<RK> arrayList = A01(iA0N).A03;
        int i10 = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        rk.A0W();
        arrayList.add(rk);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
