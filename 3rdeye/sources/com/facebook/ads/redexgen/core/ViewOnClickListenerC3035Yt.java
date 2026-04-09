package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3035Yt implements View.OnClickListener {
    public final /* synthetic */ C3037Yv A00;

    public ViewOnClickListenerC3035Yt(C3037Yv c3037Yv) {
        this.A00 = c3037Yv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9U();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
