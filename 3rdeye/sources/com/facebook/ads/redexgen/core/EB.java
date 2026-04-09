package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class EB extends AbstractRunnableC2959Vt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ E1 A02;

    public EB(E1 e12, int i, int i10) {
        this.A02 = e12;
        this.A00 = i;
        this.A01 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A02.A0C.A02(new DL(this.A00, this.A01));
    }
}
