package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class FJ implements InterfaceC3162bY {
    public final /* synthetic */ FH A00;

    public FJ(FH fh) {
        this.A00 = fh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3162bY
    public final void AFc(int i) {
        this.A00.A0C(i, true);
        if (this.A00.A0H()) {
            this.A00.A07();
        } else {
            this.A00.A09(i);
        }
    }
}
