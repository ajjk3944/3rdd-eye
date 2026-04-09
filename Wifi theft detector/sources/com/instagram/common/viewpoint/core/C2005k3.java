package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2005k3 extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C2004k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2005k3(C2004k2 c2004k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2004k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
