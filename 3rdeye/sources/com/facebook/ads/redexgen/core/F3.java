package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class F3 extends AbstractC3344eW {
    public final /* synthetic */ C22513q A00;

    public F3(C22513q c22513q) {
        this.A00 = c22513q;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3344eW
    public final void A03() {
        if (!this.A00.A0E.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A0E);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((NI) ((NI) this.A00)).A0C.AB5(this.A00.A0A, new C3057Zp().A03(this.A00.A09).A02(this.A00.A0E).A04(((NI) ((NI) this.A00)).A0A.A0u()).A05());
                N3.A07(((NI) ((NI) this.A00)).A0A.A21(), this.A00.A0D);
                this.A00.A0D.A0F().A3D();
                AbstractC2759Nw.A02(this.A00.A03.A0t(), X0.A00(((NI) ((NI) this.A00)).A0A.A0v()));
            }
        }
    }
}
