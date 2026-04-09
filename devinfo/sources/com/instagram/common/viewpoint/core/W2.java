package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1092b8 {
    public final /* synthetic */ C0920Vz A00;

    public W2(C0920Vz c0920Vz) {
        this.A00 = c0920Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1092b8
    public final void AE7(C1091b7 c1091b7) {
        this.A00.A0G.set(c1091b7.A00() != null);
        if (this.A00.A0H.get() && this.A00.A05 != null) {
            this.A00.A05.AFB(c1091b7.A00() != null);
        }
    }
}
