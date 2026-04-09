package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class HP implements InterfaceC2968Wc {
    public final /* synthetic */ C22744n A00;

    public HP(C22744n c22744n) {
        this.A00 = c22744n;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void ACp() {
        this.A00.A0M.ACy(this.A00.A0C);
        this.A00.A0M.ACZ();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void AEn(float f10) {
        int i;
        float totalForce = (this.A00.A0C - f10) + (this.A00.A0a ? 0 : this.A00.A0P.getDuration());
        if (this.A00.A0a) {
            i = this.A00.A0C;
        } else {
            i = this.A00.A0B;
        }
        float seenTime = i;
        this.A00.A0M.AJs(totalForce / seenTime);
    }
}
