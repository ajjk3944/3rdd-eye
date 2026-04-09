package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class EV implements InterfaceC3370ew {
    public final /* synthetic */ C3269dI A00;

    public EV(C3269dI c3269dI) {
        this.A00 = c3269dI;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3370ew
    public final void AGQ() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3370ew
    public final void AGS(C3372ey c3372ey) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c3372ey != null && c3372ey.A00()) {
            this.A00.A02.A4b(this.A00.A03.A8x());
        } else {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }
}
