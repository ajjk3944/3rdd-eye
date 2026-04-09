package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1397Zx implements View.OnClickListener {
    public final /* synthetic */ C1381Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC1397Zx(MC mc, C1381Zh c1381Zh) {
        this.A01 = mc;
        this.A00 = c1381Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC1106Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
