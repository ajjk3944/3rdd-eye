package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C0599Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C0599Ji c0599Ji, boolean z3) {
        this.A00 = c0599Ji;
        this.A01 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        AbstractC0971Yb abstractC0971YbA0B = this.A00.A0b.A0B();
        if (abstractC0971YbA0B == null) {
            return;
        }
        abstractC0971YbA0B.setPageDetailsVisible((this.A01 || abstractC0971YbA0B.A0E()) ? false : true);
        abstractC0971YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
