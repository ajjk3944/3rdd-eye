package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1490ha extends AbstractC0792Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(RK rk2);

    public abstract boolean A0Y(RK rk2);

    public abstract boolean A0Z(RK rk2, int i4, int i10, int i11, int i12);

    public abstract boolean A0a(RK rk2, RK rk3, int i4, int i10, int i11, int i12);

    @Override // com.instagram.common.viewpoint.core.AbstractC0792Qy
    public final boolean A0N(RK rk2) {
        return !this.A00 || rk2.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0792Qy
    public final boolean A0O(RK rk2, C0791Qx c0791Qx, C0791Qx c0791Qx2) {
        if (c0791Qx != null && (c0791Qx.A01 != c0791Qx2.A01 || c0791Qx.A03 != c0791Qx2.A03)) {
            return A0Z(rk2, c0791Qx.A01, c0791Qx.A03, c0791Qx2.A01, c0791Qx2.A03);
        }
        return A0X(rk2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0792Qy
    public final boolean A0P(RK rk2, C0791Qx c0791Qx, C0791Qx c0791Qx2) {
        int i4 = c0791Qx.A01;
        int oldLeft = c0791Qx.A03;
        View view = rk2.A0H;
        int oldTop = c0791Qx2 == null ? view.getLeft() : c0791Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c0791Qx2 == null ? view.getTop() : c0791Qx2.A03;
        if (!rk2.A0g() && (i4 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(rk2, i4, oldLeft, oldTop, top);
        }
        return A0Y(rk2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0792Qy
    public final boolean A0Q(RK rk2, C0791Qx c0791Qx, C0791Qx c0791Qx2) {
        if (c0791Qx.A01 != c0791Qx2.A01 || c0791Qx.A03 != c0791Qx2.A03) {
            return A0Z(rk2, c0791Qx.A01, c0791Qx.A03, c0791Qx2.A01, c0791Qx2.A03);
        }
        A0U(rk2);
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0792Qy
    public final boolean A0R(RK rk2, RK rk3, C0791Qx c0791Qx, C0791Qx c0791Qx2) {
        int i4;
        int i10;
        int i11 = c0791Qx.A01;
        int i12 = c0791Qx.A03;
        if (rk3.A0l()) {
            i4 = c0791Qx.A01;
            i10 = c0791Qx.A03;
        } else {
            i4 = c0791Qx2.A01;
            i10 = c0791Qx2.A03;
        }
        return A0a(rk2, rk3, i11, i12, i4, i10);
    }

    public final void A0T(RK rk2) {
        A0K(rk2);
    }

    public final void A0U(RK rk2) {
        A0K(rk2);
    }

    public final void A0V(RK rk2) {
        A0K(rk2);
    }

    public final void A0W(RK rk2, boolean z3) {
        A0K(rk2);
    }
}
