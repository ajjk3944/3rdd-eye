package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C0977Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C0977Ji c0977Ji, boolean z10) {
        this.A00 = c0977Ji;
        this.A01 = z10;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        AbstractC1349Yb abstractC1349YbA0B = this.A00.A0b.A0B();
        if (abstractC1349YbA0B == null) {
            return;
        }
        abstractC1349YbA0B.setPageDetailsVisible((this.A01 || abstractC1349YbA0B.A0E()) ? false : true);
        abstractC1349YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
