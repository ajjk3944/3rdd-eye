package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C01812j extends Q9<C1381fp> implements T4 {
    public C1436gi A00;
    public boolean A01;

    public C01812j(C1381fp c1381fp, C1436gi c1436gi) {
        super(c1381fp);
        this.A00 = c1436gi;
        this.A01 = false;
    }

    private void A00(int i4) {
        if (!this.A01) {
            this.A00.A0F().A3v(i4);
        }
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        C1381fp c1381fpA08 = A08();
        int iIntValue = 0;
        if (c1381fpA08 == null) {
            A00(0);
            return;
        }
        View view = c1381fpA08.A0C;
        AbstractC1380fo abstractC1380fo = (AbstractC1380fo) c1381fpA08.A0E.get();
        int i4 = 1;
        boolean z3 = view == null;
        if (!z3 && abstractC1380fo != null) {
            C1382fq c1382fqA0E = C1381fp.A0E(view, c1381fpA08.A0A, this.A00);
            if (c1382fqA0E.A04()) {
                C1381fp.A05(c1381fpA08);
            } else {
                c1381fpA08.A00 = 0;
            }
            boolean z10 = c1381fpA08.A00 > c1381fpA08.A09;
            boolean wasViewable = c1381fpA08.A05 != null && c1381fpA08.A05.A04();
            if (z10 || !c1382fqA0E.A04()) {
                c1381fpA08.A05 = c1382fqA0E;
            }
            String strValueOf = String.valueOf(c1382fqA0E.A01());
            synchronized (c1381fpA08) {
                if (c1381fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c1381fpA08.A06.get(strValueOf)).intValue();
                }
                c1381fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z10 && !wasViewable) {
                this.A01 = true;
                c1381fpA08.A03 = System.currentTimeMillis();
                if (c1381fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC1380fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c1381fpA08.A0F) {
                    return;
                }
            } else if (!z10 && wasViewable) {
                this.A01 = true;
                if (c1381fpA08.A07) {
                    this.A00.A0F().A3S(c1382fqA0E.A02());
                }
                abstractC1380fo.A00();
            } else {
                abstractC1380fo.A02();
                if (!this.A01 && c1381fpA08.A07) {
                    this.A00.A0F().A3u(c1382fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c1381fpA08.A08 && c1381fpA08.A04 != null) {
                c1381fpA08.A0B.postDelayed(c1381fpA08.A04, c1381fpA08.A02);
                return;
            }
            return;
        }
        if (c1381fpA08.A07) {
            if (!z3) {
                i4 = 2;
            }
            A00(i4);
        }
    }

    @Override // com.instagram.common.viewpoint.core.T4
    public final C1436gi A6m() {
        return this.A00;
    }
}
