package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ps, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3994ps {
    public InterfaceC3995pt A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A02() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A03(InterfaceC3995pt interfaceC3995pt) {
        this.A00 = interfaceC3995pt;
    }
}
