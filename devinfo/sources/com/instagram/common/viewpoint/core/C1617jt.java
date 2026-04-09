package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1617jt implements InterfaceC0834Sp {
    public final /* synthetic */ C03227w A00;

    public C1617jt(C03227w c03227w) {
        this.A00 = c03227w;
    }

    private void A00(boolean z3) {
        if (!z3) {
            this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0834Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0834Sp
    public final void ADT() {
        A00(true);
    }
}
