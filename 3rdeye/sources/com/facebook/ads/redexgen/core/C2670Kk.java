package com.facebook.ads.redexgen.core;

import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2670Kk extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C3051Zj A00;

    public C2670Kk(C3051Zj c3051Zj) {
        this.A00 = c3051Zj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() throws JSONException {
        if (this.A00.A01) {
            return;
        }
        this.A00.A04(-1, null);
    }
}
