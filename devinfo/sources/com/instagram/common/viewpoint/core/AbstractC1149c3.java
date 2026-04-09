package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.c3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1149c3 extends RelativeLayout {
    public static final int A08 = XV.A0b;
    public static final int A09 = (int) (XX.A02 * 28.0f);
    public static final int A0A = (int) (XX.A02 * 32.0f);
    public C0694Na A00;
    public boolean A01;
    public C1041aJ A02;
    public final C1436gi A03;
    public final VA A04;
    public final ViewOnClickListenerC0634Kr A05;
    public final C1136bq A06;
    public final C1153c7 A07;

    public abstract boolean A1O();

    public AbstractC1149c3(C1153c7 c1153c7, boolean z3) {
        C0694Na c0694NaA00;
        super(c1153c7.A06());
        this.A07 = c1153c7;
        this.A03 = c1153c7.A06();
        this.A04 = c1153c7.A07();
        if (c1153c7.A00() == 1) {
            c0694NaA00 = c1153c7.A05().A28().A01();
        } else {
            c0694NaA00 = c1153c7.A05().A28().A00();
        }
        this.A00 = c0694NaA00;
        this.A01 = z3;
        this.A05 = new ViewOnClickListenerC0634Kr(c1153c7.A06(), c1153c7.A05(), this.A00, c1153c7.A07(), c1153c7.A0C(), c1153c7.A0F(), c1153c7.A0A(), c1153c7.A09());
        this.A05.setRoundedCornersEnabled(A02());
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setV2Design(A04());
        YB.A0G(1001, this.A05);
        this.A06 = new C1136bq(this.A03, this.A00, this.A01, A03(), A0B());
        YB.A0K(this.A06);
    }

    public final C1041aJ A00(C1436gi c1436gi, AbstractC1601jd abstractC1601jd, VI vi2, EnumC1044aM enumC1044aM, InterfaceC0977Yh interfaceC0977Yh) {
        this.A02 = AbstractC1046aO.A01(c1436gi, true, abstractC1601jd, vi2, interfaceC0977Yh, enumC1044aM, AbstractC1043aL.A00(abstractC1601jd));
        YB.A0K(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (abstractC1601jd.A2U()) {
            layoutParams.setMargins(XV.A0b, XV.A0r, 0, 0);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else {
            layoutParams.setMargins(XV.A0b, 0, 0, XV.A0b);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
        this.A02.setLayoutParams(layoutParams);
        return this.A02;
    }

    public final C1045aN A01(C1436gi c1436gi, EnumC1044aM enumC1044aM) {
        C1045aN c1045aNA02 = AbstractC1046aO.A02(c1436gi, enumC1044aM, this.A07.A05());
        YB.A0K(c1045aNA02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(XV.A0b, 0, 0, XV.A0b);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        c1045aNA02.setLayoutParams(layoutParams);
        return c1045aNA02;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }

    public final boolean A04() {
        if (this.A07.A05().A29().A0H().A07() == null) {
            return this.A07.A05().A1w() || this.A07.A05().A1y();
        }
        return this.A07.A05().A1n();
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        return true;
    }

    public EnumC0685Mq A1B(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1C() {
        if (this.A02 != null) {
            this.A02.A0O();
        }
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G() {
    }

    public void A1H(NR nr, String str, double d10, Bundle bundle) {
        this.A06.A04(nr.A0I().A0F(), nr.A0I().A04(), null, false, !A1O() && d10 > 0.0d && d10 < 1.0d);
        this.A05.setCta(nr.A0J(), str, new HashMap());
    }

    public void A1I(C4K c4k) {
    }

    public void A1J(E1 e12) {
    }

    public void A1K(C4A c4a, int i4) {
    }

    public void A1L(boolean z3) {
        if (!z3 && this.A02 != null) {
            this.A02.A0P();
        }
    }

    public boolean A1M() {
        return false;
    }

    public boolean A1N() {
        return true;
    }

    public boolean A1P(boolean z3) {
        return false;
    }

    public C1436gi getAdContextWrapper() {
        return this.A03;
    }

    public VA getAdEventManager() {
        return this.A04;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C0694Na getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC0634Kr getCtaButton() {
        return this.A05;
    }

    public C1136bq getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C0694Na c0694NaA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c0694NaA00 = this.A07.A05().A28().A01();
        } else {
            c0694NaA00 = this.A07.A05().A28().A00();
        }
        this.A00 = c0694NaA00;
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(InterfaceC0686Mr interfaceC0686Mr) {
        getCtaButton().getCtaActionHelper().A07(interfaceC0686Mr);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z3) {
    }
}
