package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2824Ql {
    public C2821Qi A00 = new C2821Qi();
    public final InterfaceC2822Qj A01;

    public C2824Ql(InterfaceC2822Qj interfaceC2822Qj) {
        this.A01 = interfaceC2822Qj;
    }

    public final View A00(int i, int i10, int i11, int i12) {
        int iA8Z = this.A01.A8Z();
        int next = this.A01.A8Y();
        int childEnd = i10 > i ? 1 : -1;
        View view = null;
        while (i != i10) {
            View viewA79 = this.A01.A79(i);
            int iA7C = this.A01.A7C(viewA79);
            int i13 = this.A01.A7B(viewA79);
            this.A00.A03(iA8Z, next, iA7C, i13);
            if (i11 != 0) {
                this.A00.A01();
                this.A00.A02(i11);
                if (this.A00.A04()) {
                    return viewA79;
                }
            }
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    view = viewA79;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
