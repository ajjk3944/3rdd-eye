package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3426fr extends AbstractRunnableC2946Vg {
    public final /* synthetic */ C3425fq A00;

    public C3426fr(C3425fq c3425fq) {
        this.A00 = c3425fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2946Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
