package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1572j1 extends AbstractRunnableC0923Wc {
    public final /* synthetic */ AbstractC1571j0 A00;
    public final /* synthetic */ C0908Vm A01;

    public C1572j1(AbstractC1571j0 abstractC1571j0, C0908Vm c0908Vm) {
        this.A00 = abstractC1571j0;
        this.A01 = c0908Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
