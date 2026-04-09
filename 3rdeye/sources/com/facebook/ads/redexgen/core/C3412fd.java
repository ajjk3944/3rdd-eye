package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3412fd extends AbstractRunnableC2946Vg {
    public final /* synthetic */ C3409fa A00;
    public final /* synthetic */ V1 A01;

    public C3412fd(C3409fa c3409fa, V1 v12) {
        this.A00 = c3409fa;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2946Vg
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(WT.A00(this.A01));
        }
    }
}
