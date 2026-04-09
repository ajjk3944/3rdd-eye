package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ii, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3587ii extends AbstractRunnableC2959Vt {
    public final /* synthetic */ MW A00;

    public C3587ii(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
