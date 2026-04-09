package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1107bN implements View.OnClickListener {
    public final /* synthetic */ C0640Kx A00;

    public ViewOnClickListenerC1107bN(C0640Kx c0640Kx) {
        this.A00 = c0640Kx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
