package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3582ib extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C3580iZ A00;
    public final /* synthetic */ C5G A01;

    public C3582ib(C3580iZ c3580iZ, C5G c5g) {
        this.A00 = c3580iZ;
        this.A01 = c5g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0C != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0C);
            this.A00.A00.A0C.A0U();
        }
    }
}
