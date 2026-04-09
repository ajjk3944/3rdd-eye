package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1948iz extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C2001jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C06877j A02;

    public C1948iz(C06877j c06877j, O8 o82, C2001jz c2001jz) {
        this.A02 = c06877j;
        this.A01 = o82;
        this.A00 = c2001jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1286Vm c1286VmA00 = C1286Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c1286VmA00.A03().getErrorCode(), c1286VmA00.A04());
        this.A02.A07.A0G(c1286VmA00);
    }
}
