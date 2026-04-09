package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2892Tc implements InterfaceC2925Uk {
    public WeakReference<C2815Qc> A00;

    public C2892Tc(C2815Qc c2815Qc) {
        this.A00 = new WeakReference<>(c2815Qc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2925Uk
    public final void AEW(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
