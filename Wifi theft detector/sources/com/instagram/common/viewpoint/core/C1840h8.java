package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1840h8 extends WP {
    public final /* synthetic */ C1837h5 A00;
    public final /* synthetic */ C1286Vm A01;

    public C1840h8(C1837h5 c1837h5, C1286Vm c1286Vm) {
        this.A00 = c1837h5;
        this.A01 = c1286Vm;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(XE.A00(this.A01));
        }
    }
}
