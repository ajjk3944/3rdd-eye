package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.iK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3565iK implements InterfaceC2843Re {
    public final /* synthetic */ C7B A00;
    public final /* synthetic */ boolean A01;

    public C3565iK(C7B c7b, boolean z10) {
        this.A00 = c7b;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843Re
    public final void ACM() {
        if (!U7.A1o(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AF4(this.A00);
        } else {
            this.A00.A06 = AbstractC3184bu.A01(this.A00.A04, (AnonymousClass73) this.A00.A03, 0, new C3566iL(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2843Re
    public final void ACN() {
        this.A00.A01.AF7(this.A00, AdError.CACHE_ERROR);
    }
}
