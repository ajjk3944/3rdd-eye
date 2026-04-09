package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1473hJ extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C1472hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1473hJ(C1472hI c1472hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c1472hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
