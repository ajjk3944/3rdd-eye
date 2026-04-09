package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3441g7 implements QI {
    public final /* synthetic */ C23196g A00;

    public C3441g7(C23196g c23196g) {
        this.A00 = c23196g;
    }

    @Override // com.facebook.ads.redexgen.core.QI
    public final void ACK(AbstractC2819Qg abstractC2819Qg) {
        abstractC2819Qg.A0d(true);
        if (abstractC2819Qg.A06 != null && abstractC2819Qg.A07 == null) {
            abstractC2819Qg.A06 = null;
        }
        abstractC2819Qg.A07 = null;
        if (!abstractC2819Qg.A0G() && !this.A00.A1x(abstractC2819Qg.A0H) && abstractC2819Qg.A0i()) {
            this.A00.removeDetachedView(abstractC2819Qg.A0H, false);
        }
    }
}
