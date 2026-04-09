package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0513Fz implements InterfaceC1200cs {
    public final /* synthetic */ C0512Fy A00;

    public C0513Fz(C0512Fy c0512Fy) {
        this.A00 = c0512Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1200cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1200cs
    public final void AGY(View view) {
        AbstractC0597Jg abstractC0597Jg = (AbstractC0597Jg) view;
        abstractC0597Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0597Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
