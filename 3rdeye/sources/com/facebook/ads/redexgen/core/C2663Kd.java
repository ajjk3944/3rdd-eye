package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2663Kd extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C3054Zm A00;

    public C2663Kd(C3054Zm c3054Zm) {
        this.A00 = c3054Zm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
