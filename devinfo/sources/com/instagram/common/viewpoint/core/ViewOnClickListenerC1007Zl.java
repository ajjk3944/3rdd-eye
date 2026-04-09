package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1007Zl implements View.OnClickListener {
    public final /* synthetic */ ME A00;

    public ViewOnClickListenerC1007Zl(ME me2) {
        this.A00 = me2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AAq();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
