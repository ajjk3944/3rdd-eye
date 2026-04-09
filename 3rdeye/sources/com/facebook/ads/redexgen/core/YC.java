package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YC implements View.OnClickListener {
    public final /* synthetic */ C2688Lc A00;

    public YC(C2688Lc c2688Lc) {
        this.A00 = c2688Lc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0N.A04(UZ.A07, null);
            this.A00.A0Q.A4b(this.A00.A0R.A7o());
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
