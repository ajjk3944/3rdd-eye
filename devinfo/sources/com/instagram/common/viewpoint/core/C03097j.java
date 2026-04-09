package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03097j extends AbstractC1571j0 {
    public C03097j(C1436gi c1436gi, O7 o72) {
        super(c1436gi, o72);
    }

    private C1569iy A00(Runnable runnable) {
        return new C1569iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1571j0
    public final NQ A0I() {
        C1623jz successfullyLoadedAdapter = (C1623jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1571j0
    public final void A0P() {
        C1623jz interstitialAdapter = (C1623jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1571j0
    public final void A0R(N1 n12, C0867Tw c0867Tw, C0865Tu c0865Tu, O8 o82) {
        C1623jz c1623jz = (C1623jz) n12;
        C1570iz c1570iz = new C1570iz(this, o82, c1623jz);
        A0H().postDelayed(c1570iz, c0867Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1623jz.A0A(this.A0B, A00(c1570iz), o82, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
