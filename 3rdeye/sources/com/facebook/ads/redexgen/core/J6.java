package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C2626Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C2626Is c2626Is, boolean z10) {
        this.A00 = c2626Is;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        AbstractC3002Xm abstractC3002XmA0C = this.A00.A0c.A0C();
        if (abstractC3002XmA0C == null) {
            return;
        }
        abstractC3002XmA0C.setPageDetailsVisible((this.A01 || abstractC3002XmA0C.A0B()) ? false : true);
        abstractC3002XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
