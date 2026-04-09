package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3517hP extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C3573iS A00;
    public final /* synthetic */ NU A01;
    public final /* synthetic */ C23376y A02;

    public C3517hP(C23376y c23376y, NU nu, C3573iS c3573iS) {
        this.A02 = c23376y;
        this.A01 = nu;
        this.A00 = c3573iS;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        V1 v1A00 = V1.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5Y(v1A00.A03().getErrorCode(), v1A00.A04());
        this.A02.A07.A0G(v1A00);
    }
}
