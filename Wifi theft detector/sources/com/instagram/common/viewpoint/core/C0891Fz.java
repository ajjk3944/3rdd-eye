package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0891Fz implements InterfaceC1578cs {
    public final /* synthetic */ C0890Fy A00;

    public C0891Fz(C0890Fy c0890Fy) {
        this.A00 = c0890Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1578cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1578cs
    public final void AGY(View view) {
        AbstractC0975Jg abstractC0975Jg = (AbstractC0975Jg) view;
        abstractC0975Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0975Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
