package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1126bg implements View.OnClickListener {
    public final /* synthetic */ C1128bi A00;

    public ViewOnClickListenerC1126bg(C1128bi c1128bi) {
        this.A00 = c1128bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
