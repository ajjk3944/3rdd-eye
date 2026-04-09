package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06877j extends AbstractC1949j0 {
    public C06877j(C1814gi c1814gi, O7 o72) {
        super(c1814gi, o72);
    }

    private C1947iy A00(Runnable runnable) {
        return new C1947iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final NQ A0I() {
        C2001jz successfullyLoadedAdapter = (C2001jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0P() {
        C2001jz interstitialAdapter = (C2001jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0R(N1 n12, C1245Tw c1245Tw, C1243Tu c1243Tu, O8 o82) {
        C2001jz c2001jz = (C2001jz) n12;
        C1948iz c1948iz = new C1948iz(this, o82, c2001jz);
        A0H().postDelayed(c1948iz, c1245Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2001jz.A0A(this.A0B, A00(c1948iz), o82, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
