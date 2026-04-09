package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1570iz extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C1623jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C03097j A02;

    public C1570iz(C03097j c03097j, O8 o82, C1623jz c1623jz) {
        this.A02 = c03097j;
        this.A01 = o82;
        this.A00 = c1623jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C0908Vm c0908VmA00 = C0908Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c0908VmA00.A03().getErrorCode(), c0908VmA00.A04());
        this.A02.A07.A0G(c0908VmA00);
    }
}
