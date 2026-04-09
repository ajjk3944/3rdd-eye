package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3026Yk implements View.OnClickListener {
    public final /* synthetic */ LV A00;

    public ViewOnClickListenerC3026Yk(LV lv) {
        this.A00 = lv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.AEC(O4.A06);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
