package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3146bI extends AbstractRunnableC2959Vt {
    public final /* synthetic */ C3246cu A00;

    public C3146bI(C3246cu c3246cu) {
        this.A00 = c3246cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        for (C2880Sq c2880Sq : C2879Sp.A02()) {
            C2879Sp.A0A(this.A00, c2880Sq.A02(), c2880Sq.A00(), c2880Sq.A01(), false);
        }
        C2879Sp.A02().clear();
    }
}
