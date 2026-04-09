package com.facebook.ads.redexgen.core;

import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.hF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3508hF extends AbstractRunnableC2946Vg {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC3506hD A01;

    public C3508hF(AbstractC3506hD abstractC3506hD, Message message) {
        this.A01 = abstractC3506hD;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2946Vg
    public final void A01() {
        this.A01.A05.A9b(this.A00);
    }
}
