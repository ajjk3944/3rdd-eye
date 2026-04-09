package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1855hN extends WP {
    public final /* synthetic */ C1854hM A00;

    public C1855hN(C1854hM c1854hM) {
        this.A00 = c1854hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
