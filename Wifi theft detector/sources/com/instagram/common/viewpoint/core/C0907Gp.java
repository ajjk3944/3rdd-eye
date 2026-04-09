package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0907Gp implements InterfaceC1353Yf {
    public final /* synthetic */ AbstractC0901Gj A00;

    public C0907Gp(AbstractC0901Gj abstractC0901Gj) {
        this.A00 = abstractC0901Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1353Yf
    public final void AEZ(int i10) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i10;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
