package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1020Zy implements View.OnClickListener {
    public final /* synthetic */ C1003Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC1020Zy(MC mc2, C1003Zh c1003Zh) {
        this.A01 = mc2;
        this.A00 = c1003Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC0728Oi.A06);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
