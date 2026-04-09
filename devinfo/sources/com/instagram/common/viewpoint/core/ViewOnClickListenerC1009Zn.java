package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1009Zn implements View.OnClickListener {
    public final /* synthetic */ C1003Zh A00;
    public final /* synthetic */ MD A01;

    public ViewOnClickListenerC1009Zn(MD md2, C1003Zh c1003Zh) {
        this.A01 = md2;
        this.A00 = c1003Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC0728Oi.A04);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
