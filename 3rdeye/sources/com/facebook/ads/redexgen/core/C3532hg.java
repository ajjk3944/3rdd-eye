package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3532hg implements S7 {
    public final /* synthetic */ AbstractC3547hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C3272dL A03;
    public final /* synthetic */ boolean A04;

    public C3532hg(NH nh, C3272dL c3272dL, boolean z10, AbstractC3547hy abstractC3547hy, NG ng) {
        this.A02 = nh;
        this.A03 = c3272dL;
        this.A04 = z10;
        this.A00 = abstractC3547hy;
        this.A01 = ng;
    }

    private void A00(boolean z10) {
        if (z10) {
            if (U7.A1l(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC3184bu.A01(this.A03, this.A00, 1, new C3533hh(this)));
                return;
            } else {
                this.A01.ACG();
                return;
            }
        }
        this.A01.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00(true);
    }
}
