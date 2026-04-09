package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class FN implements InterfaceC3230ce {
    public final /* synthetic */ C22523r A00;

    public FN(C22523r c22523r) {
        this.A00 = c22523r;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3230ce
    public final void A9d() {
        if (this.A00.A03 instanceof C22905d) {
            ((C22905d) this.A00.A03).A1W();
            C2915Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3230ce
    public final void AJF() {
        if (this.A00.A03 instanceof C22905d) {
            ((C22905d) this.A00.A03).A1a(this.A00.A0M);
            C2915Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
        this.A00.A0k();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3230ce
    public final void AJT() {
        this.A00.A0c();
        if (this.A00.A03 instanceof C22905d) {
            ((C22905d) this.A00.A03).getAdDetailsView().setVisibility(8);
        }
    }
}
