package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3016Ya implements View.OnClickListener {
    public final /* synthetic */ C3018Yc A00;

    public ViewOnClickListenerC3016Ya(C3018Yc c3018Yc) {
        this.A00 = c3018Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAg();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
