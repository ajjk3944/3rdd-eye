package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1015Zt implements View.OnClickListener {
    public final /* synthetic */ C1017Zv A00;

    public ViewOnClickListenerC1015Zt(C1017Zv c1017Zv) {
        this.A00 = c1017Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9c();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
