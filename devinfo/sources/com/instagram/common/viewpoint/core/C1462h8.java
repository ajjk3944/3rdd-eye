package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1462h8 extends WP {
    public final /* synthetic */ C1459h5 A00;
    public final /* synthetic */ C0908Vm A01;

    public C1462h8(C1459h5 c1459h5, C0908Vm c0908Vm) {
        this.A00 = c1459h5;
        this.A01 = c0908Vm;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(XE.A00(this.A01));
        }
    }
}
