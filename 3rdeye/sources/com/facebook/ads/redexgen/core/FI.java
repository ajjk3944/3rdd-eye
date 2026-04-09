package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class FI implements InterfaceC3163bZ {
    public final /* synthetic */ FH A00;

    public FI(FH fh) {
        this.A00 = fh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3163bZ
    public final void AFm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3163bZ
    public final void AFo(View view) {
        AbstractC2625Ir abstractC2625Ir = (AbstractC2625Ir) view;
        abstractC2625Ir.A1R();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC2625Ir.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
