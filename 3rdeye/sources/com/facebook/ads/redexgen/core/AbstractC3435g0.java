package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3435g0 extends QK {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC2819Qg abstractC2819Qg);

    public abstract boolean A0Y(AbstractC2819Qg abstractC2819Qg);

    public abstract boolean A0Z(AbstractC2819Qg abstractC2819Qg, int i, int i10, int i11, int i12);

    public abstract boolean A0a(AbstractC2819Qg abstractC2819Qg, AbstractC2819Qg abstractC2819Qg2, int i, int i10, int i11, int i12);

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0N(AbstractC2819Qg abstractC2819Qg) {
        return !this.A00 || abstractC2819Qg.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0O(AbstractC2819Qg abstractC2819Qg, QJ qj, QJ qj2) {
        if (qj != null && (qj.A01 != qj2.A01 || qj.A03 != qj2.A03)) {
            return A0Z(abstractC2819Qg, qj.A01, qj.A03, qj2.A01, qj2.A03);
        }
        return A0X(abstractC2819Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0P(AbstractC2819Qg abstractC2819Qg, QJ qj, QJ qj2) {
        int i = qj.A01;
        int oldLeft = qj.A03;
        View view = abstractC2819Qg.A0H;
        int oldTop = qj2 == null ? view.getLeft() : qj2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = qj2 == null ? view.getTop() : qj2.A03;
        if (!abstractC2819Qg.A0g() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(abstractC2819Qg, i, oldLeft, oldTop, top);
        }
        return A0Y(abstractC2819Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0Q(AbstractC2819Qg abstractC2819Qg, QJ qj, QJ qj2) {
        if (qj.A01 != qj2.A01 || qj.A03 != qj2.A03) {
            return A0Z(abstractC2819Qg, qj.A01, qj.A03, qj2.A01, qj2.A03);
        }
        A0U(abstractC2819Qg);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0R(AbstractC2819Qg abstractC2819Qg, AbstractC2819Qg abstractC2819Qg2, QJ qj, QJ qj2) {
        int i;
        int i10;
        int i11 = qj.A01;
        int i12 = qj.A03;
        if (abstractC2819Qg2.A0l()) {
            i = qj.A01;
            i10 = qj.A03;
        } else {
            i = qj2.A01;
            i10 = qj2.A03;
        }
        return A0a(abstractC2819Qg, abstractC2819Qg2, i11, i12, i, i10);
    }

    public final void A0T(AbstractC2819Qg abstractC2819Qg) {
        A0K(abstractC2819Qg);
    }

    public final void A0U(AbstractC2819Qg abstractC2819Qg) {
        A0K(abstractC2819Qg);
    }

    public final void A0V(AbstractC2819Qg abstractC2819Qg) {
        A0K(abstractC2819Qg);
    }

    public final void A0W(AbstractC2819Qg abstractC2819Qg, boolean z10) {
        A0K(abstractC2819Qg);
    }
}
