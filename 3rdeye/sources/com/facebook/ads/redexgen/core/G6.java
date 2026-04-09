package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC2968Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC2959Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C2475Cw A03;

    public G6(G2 g22, int i, C2475Cw c2475Cw, AbstractRunnableC2959Vt abstractRunnableC2959Vt) {
        this.A02 = g22;
        this.A00 = i;
        this.A03 = c2475Cw;
        this.A01 = abstractRunnableC2959Vt;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void ACp() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void AEn(float f10) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            C2475Cw c2475Cw = this.A03;
            float percentage = this.A00;
            c2475Cw.A07((int) ((percentage - f10) * 1000.0f));
        }
    }
}
