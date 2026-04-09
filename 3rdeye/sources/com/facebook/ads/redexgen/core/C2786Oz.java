package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2786Oz extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C2969Wd A00;

    public C2786Oz(C2969Wd c2969Wd) {
        this.A00 = c2969Wd;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
