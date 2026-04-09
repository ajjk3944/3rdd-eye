package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3444gA implements InterfaceC2826Qn {
    public final /* synthetic */ C23196g A00;

    public C3444gA(C23196g c23196g) {
        this.A00 = c23196g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2826Qn
    public final void AGP(AbstractC2819Qg abstractC2819Qg, QJ qj, QJ qj2) {
        this.A00.A1l(abstractC2819Qg, qj, qj2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2826Qn
    public final void AGR(AbstractC2819Qg abstractC2819Qg, QJ qj, QJ qj2) {
        this.A00.A0r.A0Y(abstractC2819Qg);
        this.A00.A1m(abstractC2819Qg, qj, qj2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2826Qn
    public final void AGT(AbstractC2819Qg abstractC2819Qg, QJ qj, QJ qj2) {
        abstractC2819Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC2819Qg, abstractC2819Qg, qj, qj2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC2819Qg, qj, qj2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2826Qn
    public final void AJo(AbstractC2819Qg abstractC2819Qg) {
        this.A00.A06.A1F(abstractC2819Qg.A0H, this.A00.A0r);
    }
}
