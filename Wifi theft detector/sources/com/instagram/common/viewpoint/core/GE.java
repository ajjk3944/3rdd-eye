package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements InterfaceC1644dx {
    public final /* synthetic */ C4V A00;

    public GE(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1644dx
    public final void A9l() {
        if (this.A00.A02 instanceof C6H) {
            ((C6H) this.A00.A02).A1X();
            VI.A02(VH.A0e, null, ((AbstractC0901Gj) this.A00).A03.A2E(), ((AbstractC0901Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1644dx
    public final void AJz() {
        if (this.A00.A02 instanceof C6H) {
            ((C6H) this.A00.A02).A1b(this.A00.A0N);
            VI.A02(VH.A0e, null, ((AbstractC0901Gj) this.A00).A03.A2E(), ((AbstractC0901Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1644dx
    public final void AKE() {
        this.A00.A0e();
        if (this.A00.A02 instanceof C6H) {
            ((C6H) this.A00.A02).getAdDetailsView().setVisibility(8);
        }
    }
}
