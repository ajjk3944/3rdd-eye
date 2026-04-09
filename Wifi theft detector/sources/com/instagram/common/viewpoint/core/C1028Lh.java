package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1028Lh extends AbstractRunnableC1301Wc {
    public final WeakReference<C1759fp> A00;

    public C1028Lh(C1759fp c1759fp) {
        this.A00 = new WeakReference<>(c1759fp);
    }

    public C1028Lh(WeakReference<C1759fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        C1759fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
