package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1991jp implements SM {
    public final /* synthetic */ C07007w A00;

    public C1991jp(C07007w c07007w) {
        this.A00 = c07007w;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        this.A00.A0C.set(true);
        this.A00.A01.AFm(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
