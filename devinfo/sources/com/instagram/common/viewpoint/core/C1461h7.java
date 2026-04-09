package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.h7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1461h7 extends WP {
    public final /* synthetic */ C1460h6 A00;

    public C1461h7(C1460h6 c1460h6) {
        this.A00 = c1460h6;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        if (this.A00.A01.A01.A00() != null) {
            this.A00.A01.A01.A00().onAdsLoaded();
        }
    }
}
