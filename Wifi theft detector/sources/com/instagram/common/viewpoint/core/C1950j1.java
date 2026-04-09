package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1950j1 extends AbstractRunnableC1301Wc {
    public final /* synthetic */ AbstractC1949j0 A00;
    public final /* synthetic */ C1286Vm A01;

    public C1950j1(AbstractC1949j0 abstractC1949j0, C1286Vm c1286Vm) {
        this.A00 = abstractC1949j0;
        this.A01 = c1286Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
