package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1470b8 {
    public final /* synthetic */ C1298Vz A00;

    public W2(C1298Vz c1298Vz) {
        this.A00 = c1298Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1470b8
    public final void AE7(C1469b7 c1469b7) {
        this.A00.A0G.set(c1469b7.A00() != null);
        if (this.A00.A0H.get() && this.A00.A05 != null) {
            this.A00.A05.AFB(c1469b7.A00() != null);
        }
    }
}
