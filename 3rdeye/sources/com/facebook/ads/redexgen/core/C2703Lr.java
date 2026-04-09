package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2703Lr implements InterfaceC3083aH {
    public final /* synthetic */ C2688Lc A00;

    public C2703Lr(C2688Lc c2688Lc) {
        this.A00 = c2688Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3083aH
    public final void ACI() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3083aH
    public final void AE7() {
        this.A00.A0F = false;
        this.A00.A0O.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3083aH
    public final void AE8() {
        this.A00.A0F = true;
        this.A00.A0O.A06();
    }
}
