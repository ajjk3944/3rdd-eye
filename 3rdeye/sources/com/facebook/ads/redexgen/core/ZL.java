package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZL implements View.OnClickListener {
    public final /* synthetic */ ZO A00;

    public ZL(ZO zo) {
        this.A00 = zo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A09.canGoForward()) {
                return;
            }
            this.A00.A09.goForward();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
