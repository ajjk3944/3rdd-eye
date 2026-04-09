package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2650Jq implements InterfaceC2968Wc {
    public final /* synthetic */ C22905d A00;

    public C2650Jq(C22905d c22905d) {
        this.A00 = c22905d;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void ACp() {
        this.A00.A0B = false;
        if (this.A00.A06 != null) {
            this.A00.A06.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void AEn(float f10) {
        if (this.A00.A06 != null) {
            this.A00.A06.setProgressImmediate(100.0f * (1.0f - (f10 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
