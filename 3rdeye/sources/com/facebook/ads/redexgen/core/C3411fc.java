package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3411fc extends AbstractRunnableC2946Vg {
    public final /* synthetic */ C3410fb A00;

    public C3411fc(C3410fb c3410fb) {
        this.A00 = c3410fb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2946Vg
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
