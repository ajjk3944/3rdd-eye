package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1993jr implements SM {
    public final /* synthetic */ C07007w A00;
    public final /* synthetic */ boolean A01;

    public C1993jr(C07007w c07007w, boolean z10) {
        this.A00 = c07007w;
        this.A01 = z10;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        if (!C1264Up.A1t(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        } else {
            this.A00.A06 = AbstractC1599dD.A01(this.A00.A04, (C06897l) this.A00.A03, 0, new C1994js(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
