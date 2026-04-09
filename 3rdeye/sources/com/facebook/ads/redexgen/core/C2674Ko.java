package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2674Ko extends AbstractRunnableC2959Vt {
    public final WeakReference<C3345eX> A00;

    public C2674Ko(C3345eX c3345eX) {
        this.A00 = new WeakReference<>(c3345eX);
    }

    public C2674Ko(WeakReference<C3345eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        C3345eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
