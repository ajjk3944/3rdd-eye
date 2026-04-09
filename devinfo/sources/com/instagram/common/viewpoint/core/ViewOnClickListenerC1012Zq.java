package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1012Zq implements View.OnClickListener {
    public final /* synthetic */ MD A00;

    public ViewOnClickListenerC1012Zq(MD md2) {
        this.A00 = md2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
