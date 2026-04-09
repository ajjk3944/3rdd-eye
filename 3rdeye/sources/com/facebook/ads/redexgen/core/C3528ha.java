package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3528ha implements InterfaceC2843Re {
    public final /* synthetic */ NH A00;

    public C3528ha(NH nh) {
        this.A00 = nh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843Re
    public final void ACM() {
        this.A00.A04.ACG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843Re
    public final void ACN() {
        this.A00.A04.ACF(AdError.CACHE_ERROR);
    }
}
