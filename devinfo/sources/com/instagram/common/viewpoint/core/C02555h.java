package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02555h extends AbstractC0575Ij {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public XO A00;
    public AbstractC1149c3 A01;
    public DZ A02;
    public final int A03;
    public final ImageView A04;
    public final VI A05;
    public final AbstractC0971Yb A06;
    public final InterfaceC1256dm A07;
    public final AtomicBoolean A08;

    public C02555h(C1436gi c1436gi, ZU zu, int i4, VA va2, AbstractC1601jd abstractC1601jd, InterfaceC0977Yh interfaceC0977Yh, AbstractC0971Yb abstractC0971Yb, VI vi2, boolean z3, boolean z10, InterfaceC1256dm interfaceC1256dm, int i10, int i11) {
        super(c1436gi, zu, va2, abstractC1601jd, i4, z3, z10, interfaceC0977Yh, i11);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i10;
        this.A07 = interfaceC1256dm;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC0971Yb;
        this.A05 = vi2;
        if (abstractC1601jd.A1c()) {
            this.A02 = new DZ(c1436gi, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new LM(this.A04, c1436gi).A05(abstractC1601jd.A29().A0H().A00(), abstractC1601jd.A29().A0H().A01()).A06(new C0573Ih(this)).A07(abstractC1601jd.A29().A0H().A08());
        A08(c1436gi.getResources().getConfiguration().orientation);
    }

    private AbstractC1149c3 A02(int i4) {
        if (this.A04.getParent() != null) {
            YB.A0J(this.A04);
        }
        boolean z3 = i4 != 2;
        C1152c6 c1152c6 = new C1152c6(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        C1152c6 interstitialLayoutParamsBuilder = c1152c6.A0J(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0P(this.A06).A0I(i4).A0T(z3).A0S(super.A00).A0M(this.A05);
        if (this.A02 != null) {
            c1152c6.A0R(this.A02);
        }
        c1152c6.A0L(C0689Mu.A00(super.A07, super.A08, "", XB.A00(super.A06.A29().A0J().A05()), new HashMap(), super.A06.A2A()));
        c1152c6.A0Q(this.A07);
        return AbstractC1150c4.A00(c1152c6.A0U(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1F();
        }
    }

    private void A08(int i4) {
        YB.A0J(this.A01);
        this.A01 = A02(i4);
        if (this.A01 instanceof KE) {
            ((KE) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof C0599Ji) {
            AbstractC1149c3 abstractC1149c3 = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C0599Ji) abstractC1149c3).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final EnumC0685Mq A1D(String str) {
        return this.A01.A1B(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final void A1E() {
        if (C0886Up.A1z(super.A07)) {
            super.A07.A0B().AKU(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1C();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final void A1G() {
        if (this.A01 instanceof C0619Kc) {
            AbstractC1149c3 abstractC1149c3 = this.A01;
            String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A09[3] = "fHRV";
            ((C0619Kc) abstractC1149c3).A1Q();
            return;
        }
        if (this.A01 instanceof C0599Ji) {
            ((C0599Ji) this.A01).A1Q(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final void A1H() {
        int iA02 = super.A06.A29().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new XO(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C0571If(this));
            this.A00.A07();
            if (iA02 >= 0) {
                this.A06.setProgressSpinnerInvisible(true);
            }
            if (iA02 != 0) {
                int secondsForNextCta2 = this.A03;
                if (iA02 < secondsForNextCta2) {
                    if (iA02 <= 0) {
                        return;
                    }
                    new XO(iA02, new C0569Id(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFw(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final void A1I(boolean z3) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z3);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final void A1J(boolean z3) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
        if (this.A01 != null) {
            this.A01.A1L(z3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final void A1K(boolean z3) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final boolean A1L() {
        if (this.A01.A1M()) {
            if (!(this.A01 instanceof C0619Kc) || ((C0619Kc) this.A01).A1R()) {
                return (this.A01 instanceof C0599Ji) && !((C0599Ji) this.A01).A1S();
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final boolean A1M() {
        if (this.A01 instanceof C0619Kc) {
            return ((C0619Kc) this.A01).A1R();
        }
        boolean z3 = this.A01 instanceof C0599Ji;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z3) {
            return ((C0599Ji) this.A01).A1S();
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public final boolean A1N() {
        if (this.A01 instanceof C0619Kc) {
            return ((C0619Kc) this.A01).A1S();
        }
        if (this.A01 instanceof C0599Ji) {
            return ((C0599Ji) this.A01).A1T();
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij
    public C1254dk getFullScreenAdStyle() {
        C0694Na colors = this.A01.getColors();
        return new C1254dk(this.A01.A1O(), C1254dk.A07, colors, ViewOnClickListenerC0634Kr.A05(super.A06), colors.A08(this.A01.A1O() || (this.A01 instanceof AbstractC0617Ka)), null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0575Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C0619Kc) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A29().A0T()) {
            A08(configuration.orientation);
        }
    }
}
