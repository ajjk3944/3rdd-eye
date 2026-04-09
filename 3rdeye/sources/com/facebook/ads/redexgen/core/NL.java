package com.facebook.ads.redexgen.core;

import android.R;

/* loaded from: assets/audience_network.dex */
public class NL extends AbstractRunnableC2959Vt {
    public final /* synthetic */ Y0 A00;

    public NL(Y0 y02) {
        this.A00 = y02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
