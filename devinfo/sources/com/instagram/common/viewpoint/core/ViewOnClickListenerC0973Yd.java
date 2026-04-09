package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC0973Yd implements View.OnClickListener {
    public final /* synthetic */ C0750Pe A00;

    public ViewOnClickListenerC0973Yd(C0750Pe c0750Pe) {
        this.A00 = c0750Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
