package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05592j extends Q9<C1759fp> implements T4 {
    public C1814gi A00;
    public boolean A01;

    public C05592j(C1759fp c1759fp, C1814gi c1814gi) {
        super(c1759fp);
        this.A00 = c1814gi;
        this.A01 = false;
    }

    private void A00(int i10) {
        if (!this.A01) {
            this.A00.A0F().A3v(i10);
        }
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        C1759fp c1759fpA08 = A08();
        int iIntValue = 0;
        if (c1759fpA08 == null) {
            A00(0);
            return;
        }
        View view = c1759fpA08.A0C;
        AbstractC1758fo abstractC1758fo = (AbstractC1758fo) c1759fpA08.A0E.get();
        int i10 = 1;
        boolean z10 = view == null;
        if (!z10 && abstractC1758fo != null) {
            C1760fq c1760fqA0E = C1759fp.A0E(view, c1759fpA08.A0A, this.A00);
            if (c1760fqA0E.A04()) {
                C1759fp.A05(c1759fpA08);
            } else {
                c1759fpA08.A00 = 0;
            }
            boolean z11 = c1759fpA08.A00 > c1759fpA08.A09;
            boolean wasViewable = c1759fpA08.A05 != null && c1759fpA08.A05.A04();
            if (z11 || !c1760fqA0E.A04()) {
                c1759fpA08.A05 = c1760fqA0E;
            }
            String strValueOf = String.valueOf(c1760fqA0E.A01());
            synchronized (c1759fpA08) {
                if (c1759fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c1759fpA08.A06.get(strValueOf)).intValue();
                }
                c1759fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z11 && !wasViewable) {
                this.A01 = true;
                c1759fpA08.A03 = System.currentTimeMillis();
                if (c1759fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC1758fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c1759fpA08.A0F) {
                    return;
                }
            } else if (!z11 && wasViewable) {
                this.A01 = true;
                if (c1759fpA08.A07) {
                    this.A00.A0F().A3S(c1760fqA0E.A02());
                }
                abstractC1758fo.A00();
            } else {
                abstractC1758fo.A02();
                if (!this.A01 && c1759fpA08.A07) {
                    this.A00.A0F().A3u(c1760fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c1759fpA08.A08 && c1759fpA08.A04 != null) {
                c1759fpA08.A0B.postDelayed(c1759fpA08.A04, c1759fpA08.A02);
                return;
            }
            return;
        }
        if (c1759fpA08.A07) {
            if (!z10) {
                i10 = 2;
            }
            A00(i10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.T4
    public final C1814gi A6m() {
        return this.A00;
    }
}
