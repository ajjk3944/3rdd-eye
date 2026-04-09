package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1393Zt implements View.OnClickListener {
    public final /* synthetic */ C1395Zv A00;

    public ViewOnClickListenerC1393Zt(C1395Zv c1395Zv) {
        this.A00 = c1395Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
