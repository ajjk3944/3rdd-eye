package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.redexgen.X.26, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass26 extends AbstractC2778Or<C3345eX> implements SM {
    public C3272dL A00;
    public boolean A01;

    public AnonymousClass26(C3345eX c3345eX, C3272dL c3272dL) {
        super(c3345eX);
        this.A00 = c3272dL;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3n(i);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        C3345eX c3345eXA08 = A08();
        int iIntValue = 0;
        if (c3345eXA08 == null) {
            A00(0);
            return;
        }
        View view = c3345eXA08.A0C;
        AbstractC3344eW abstractC3344eW = (AbstractC3344eW) c3345eXA08.A0E.get();
        int i = 1;
        boolean z10 = view == null;
        if (!z10 && abstractC3344eW != null) {
            C3346eY c3346eYA0E = C3345eX.A0E(view, c3345eXA08.A0A, this.A00);
            if (c3346eYA0E.A04()) {
                C3345eX.A05(c3345eXA08);
            } else {
                c3345eXA08.A00 = 0;
            }
            boolean z11 = c3345eXA08.A00 > c3345eXA08.A09;
            boolean wasViewable = c3345eXA08.A05 != null && c3345eXA08.A05.A04();
            if (z11 || !c3346eYA0E.A04()) {
                c3345eXA08.A05 = c3346eYA0E;
            }
            String strValueOf = String.valueOf(c3346eYA0E.A01());
            synchronized (c3345eXA08) {
                if (c3345eXA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c3345eXA08.A06.get(strValueOf)).intValue();
                }
                c3345eXA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z11 && !wasViewable) {
                this.A01 = true;
                c3345eXA08.A03 = System.currentTimeMillis();
                if (c3345eXA08.A07) {
                    this.A00.A0F().A3o();
                }
                abstractC3344eW.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c3345eXA08.A0F) {
                    return;
                }
            } else if (!z11 && wasViewable) {
                this.A01 = true;
                if (c3345eXA08.A07) {
                    this.A00.A0F().A3K(c3346eYA0E.A02());
                }
                abstractC3344eW.A00();
            } else {
                abstractC3344eW.A02();
                if (!this.A01 && c3345eXA08.A07) {
                    this.A00.A0F().A3m(c3346eYA0E.A02());
                }
                this.A01 = true;
            }
            if (!c3345eXA08.A08 && c3345eXA08.A04 != null) {
                c3345eXA08.A0B.postDelayed(c3345eXA08.A04, c3345eXA08.A02);
                return;
            }
            return;
        }
        if (c3345eXA08.A07) {
            if (!z10) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final C3272dL A6e() {
        return this.A00;
    }
}
