package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0650Lh extends AbstractRunnableC0923Wc {
    public final WeakReference<C1381fp> A00;

    public C0650Lh(C1381fp c1381fp) {
        this.A00 = new WeakReference<>(c1381fp);
    }

    public C0650Lh(WeakReference<C1381fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        C1381fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
