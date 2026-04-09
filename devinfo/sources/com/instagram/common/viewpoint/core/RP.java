package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class RP {
    public RM A00 = new RM();
    public final RN A01;

    public RP(RN rn) {
        this.A01 = rn;
    }

    public final View A00(int i4, int i10, int i11, int i12) {
        int iA8h = this.A01.A8h();
        int next = this.A01.A8g();
        int childEnd = i10 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i10) {
            View viewA7H = this.A01.A7H(i4);
            int iA7K = this.A01.A7K(viewA7H);
            int i13 = this.A01.A7J(viewA7H);
            this.A00.A03(iA8h, next, iA7K, i13);
            if (i11 != 0) {
                this.A00.A01();
                this.A00.A02(i11);
                if (this.A00.A04()) {
                    return viewA7H;
                }
            }
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    view = viewA7H;
                }
            }
            i4 += childEnd;
        }
        return view;
    }
}
