package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3422fn extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C3421fm A00;
    public final /* synthetic */ C5G A01;

    public C3422fn(C3421fm c3421fm, C5G c5g) {
        this.A00 = c3421fm;
        this.A01 = c5g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1B());
        this.A00.A02.A1f(true, true);
    }
}
