package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1479hP extends WP {
    public final /* synthetic */ C1476hM A00;

    public C1479hP(C1476hM c1476hM) {
        this.A00 = c1476hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
