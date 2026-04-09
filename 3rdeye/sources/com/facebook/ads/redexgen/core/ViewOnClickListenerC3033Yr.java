package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3033Yr implements View.OnClickListener {
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C3023Yh A01;
    public final /* synthetic */ LU A02;

    public ViewOnClickListenerC3033Yr(LU lu, C3023Yh c3023Yh, O6 o62) {
        this.A02 = lu;
        this.A01 = c3023Yh;
        this.A00 = o62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEP(this.A00);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
