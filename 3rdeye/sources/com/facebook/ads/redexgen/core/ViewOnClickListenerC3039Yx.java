package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3039Yx implements View.OnClickListener {
    public final /* synthetic */ C3023Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC3039Yx(LS ls, C3023Yh c3023Yh) {
        this.A01 = ls;
        this.A00 = c3023Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AEC(O4.A04);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
