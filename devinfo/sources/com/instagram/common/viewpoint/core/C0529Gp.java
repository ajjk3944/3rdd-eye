package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0529Gp implements InterfaceC0975Yf {
    public final /* synthetic */ AbstractC0523Gj A00;

    public C0529Gp(AbstractC0523Gj abstractC0523Gj) {
        this.A00 = abstractC0523Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0975Yf
    public final void AEZ(int i4) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i4;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
