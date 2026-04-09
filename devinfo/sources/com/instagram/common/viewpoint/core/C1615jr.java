package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1615jr implements SM {
    public final /* synthetic */ C03227w A00;
    public final /* synthetic */ boolean A01;

    public C1615jr(C03227w c03227w, boolean z3) {
        this.A00 = c03227w;
        this.A01 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        if (!C0886Up.A1t(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        } else {
            this.A00.A06 = AbstractC1221dD.A01(this.A00.A04, (C03117l) this.A00.A03, 0, new C1616js(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
