package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3534hi implements InterfaceC2843Re {
    public final /* synthetic */ AbstractC3547hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C3272dL A03;
    public final /* synthetic */ boolean A04;

    public C3534hi(NH nh, C3272dL c3272dL, boolean z10, AbstractC3547hy abstractC3547hy, NG ng) {
        this.A02 = nh;
        this.A03 = c3272dL;
        this.A04 = z10;
        this.A00 = abstractC3547hy;
        this.A01 = ng;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843Re
    public final void ACM() {
        if (U7.A1l(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC3184bu.A01(this.A03, this.A00, 1, new C3535hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
