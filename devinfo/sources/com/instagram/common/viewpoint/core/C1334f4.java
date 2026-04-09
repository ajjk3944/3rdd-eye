package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1334f4 extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C1432ge A00;

    public C1334f4(C1432ge c1432ge) {
        this.A00 = c1432ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}
