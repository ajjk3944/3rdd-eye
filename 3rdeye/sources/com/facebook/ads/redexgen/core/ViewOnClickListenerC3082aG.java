package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3082aG implements View.OnClickListener {
    public final /* synthetic */ C3084aI A00;

    public ViewOnClickListenerC3082aG(C3084aI c3084aI) {
        this.A00 = c3084aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
