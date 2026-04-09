package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6P extends C3431fw {
    public C6P(R0 r02) {
        super(r02);
    }

    @Override // com.facebook.ads.redexgen.core.C3431fw, com.facebook.ads.redexgen.core.InterfaceC3003Xn
    public final /* bridge */ /* synthetic */ void A3w(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        super.A3w(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C3431fw, com.facebook.ads.redexgen.core.InterfaceC3003Xn
    public final /* bridge */ /* synthetic */ void A3x(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A3x(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C3431fw, com.facebook.ads.redexgen.core.InterfaceC3003Xn
    public final void A4b(String str) {
        super.A4b(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC3294dh.A08.A03();
        String rewardedVideoError = EnumC3294dh.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C3431fw, com.facebook.ads.redexgen.core.InterfaceC3003Xn
    public final /* bridge */ /* synthetic */ void A4c(String str, C2893Td c2893Td) {
        super.A4c(str, c2893Td);
    }

    @Override // com.facebook.ads.redexgen.core.C3431fw, com.facebook.ads.redexgen.core.InterfaceC3003Xn
    public final /* bridge */ /* synthetic */ void AAf(String str, N9 n9) {
        super.AAf(str, n9);
    }

    @Override // com.facebook.ads.redexgen.core.C3431fw, com.facebook.ads.redexgen.core.InterfaceC3003Xn
    public final /* bridge */ /* synthetic */ void ACf(int i) {
        super.ACf(i);
    }
}
