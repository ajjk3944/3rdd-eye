package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2015kD extends AbstractRunnableC1301Wc {
    public final /* synthetic */ N8 A00;

    public C2015kD(N8 n82) {
        this.A00 = n82;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
