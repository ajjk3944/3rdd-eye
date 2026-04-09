package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1995jt implements InterfaceC1212Sp {
    public final /* synthetic */ C07007w A00;

    public C1995jt(C07007w c07007w) {
        this.A00 = c07007w;
    }

    private void A00(boolean z10) {
        if (!z10) {
            this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADT() {
        A00(true);
    }
}
