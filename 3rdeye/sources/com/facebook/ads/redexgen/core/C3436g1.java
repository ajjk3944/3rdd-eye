package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3436g1 extends AbstractC2768Oh {
    public final AbstractC2768Oh A00 = new C3437g2(this);
    public final C23196g A01;

    public C3436g1(C23196g c23196g) {
        this.A01 = c23196g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2768Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C23196g.class.getName());
        if ((view instanceof C23196g) && !A0B()) {
            C23196g c23196g = (C23196g) view;
            if (c23196g.getLayoutManager() != null) {
                c23196g.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2768Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(C23196g.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(ps);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2768Oh
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i, bundle);
        }
        return false;
    }

    public final AbstractC2768Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
