package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23376y extends AbstractC3518hQ {
    public C23376y(C3272dL c3272dL, NT nt) {
        super(c3272dL, nt);
    }

    private C3516hO A00(Runnable runnable) {
        return new C3516hO(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3518hQ
    public final AbstractC2725Mo A0I() {
        C3573iS successfullyLoadedAdapter = (C3573iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3518hQ
    public final void A0P() {
        C3573iS interstitialAdapter = (C3573iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3518hQ
    public final void A0R(MP mp, TE te, TC tc, NU nu) {
        C3573iS c3573iS = (C3573iS) mp;
        C3517hP c3517hP = new C3517hP(this, nu, c3573iS);
        A0H().postDelayed(c3517hP, te.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c3573iS.A0A(this.A0B, A00(c3517hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
