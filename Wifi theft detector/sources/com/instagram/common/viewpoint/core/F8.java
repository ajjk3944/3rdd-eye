package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC1784gE {
    public final /* synthetic */ C1682ea A00;

    public F8(C1682ea c1682ea) {
        this.A00 = c1682ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1784gE
    public final void AHA() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4j(this.A00.A03.A94());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1784gE
    public final void AHC(C1786gG c1786gG) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c1786gG == null || !c1786gG.A00()) {
            this.A00.A01.A0F().ABv();
            this.A00.A02.A4j(this.A00.A03.A94());
        } else {
            this.A00.A01.A0F().ABw();
            this.A00.A02.A4j(this.A00.A03.A95());
        }
    }
}
