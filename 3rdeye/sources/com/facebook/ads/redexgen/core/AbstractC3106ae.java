package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3106ae extends RelativeLayout {
    public C2735My A00;
    public boolean A01;
    public final C3272dL A02;
    public final US A03;
    public final KE A04;
    public final C3092aQ A05;
    public final C3110ai A06;
    public static final int A07 = (int) (AbstractC2975Wl.A02 * 16.0f);
    public static final int A08 = (int) (AbstractC2975Wl.A02 * 28.0f);
    public static final int A0B = (int) (AbstractC2975Wl.A02 * 2.0f);
    public static final int A0E = (int) (AbstractC2975Wl.A02 * 4.0f);
    public static final int A0I = (int) (AbstractC2975Wl.A02 * 8.0f);
    public static final int A09 = (int) (AbstractC2975Wl.A02 * 12.0f);
    public static final int A0A = (int) (AbstractC2975Wl.A02 * 16.0f);
    public static final int A0C = (int) (AbstractC2975Wl.A02 * 20.0f);
    public static final int A0D = (int) (AbstractC2975Wl.A02 * 24.0f);
    public static final int A0F = (int) (AbstractC2975Wl.A02 * 44.0f);
    public static final int A0G = (int) (AbstractC2975Wl.A02 * 48.0f);
    public static final int A0H = (int) (AbstractC2975Wl.A02 * 64.0f);
    public static final int A0J = (int) (AbstractC2975Wl.A02 * 32.0f);

    public abstract boolean A1M();

    public AbstractC3106ae(C3110ai c3110ai, boolean z10) {
        C2735My c2735MyA00;
        super(c3110ai.A06());
        this.A06 = c3110ai;
        this.A02 = c3110ai.A06();
        this.A03 = c3110ai.A07();
        if (c3110ai.A00() == 1) {
            c2735MyA00 = c3110ai.A05().A1z().A01();
        } else {
            c2735MyA00 = c3110ai.A05().A1z().A00();
        }
        this.A00 = c2735MyA00;
        this.A01 = z10;
        this.A04 = new KE(c3110ai.A06(), c3110ai.A05(), this.A00, c3110ai.A07(), c3110ai.A0D(), c3110ai.A0G(), c3110ai.A0A(), c3110ai.A09());
        this.A04.setRoundedCornersEnabled(A01());
        this.A04.setViewShowsOverMedia(A0C());
        XP.A0E(1001, this.A04);
        this.A05 = new C3092aQ(this.A02, this.A00, this.A01, A02(), A0D());
        XP.A0I(this.A05);
    }

    public final ImageView A00(C3272dL c3272dL, AbstractC3547hy abstractC3547hy, C2915Ua c2915Ua, Z5 z52, InterfaceC3003Xn interfaceC3003Xn, Handler handler) {
        ImageView imageViewA01 = Z9.A01(c3272dL, c2915Ua, abstractC3547hy, z52, interfaceC3003Xn, handler);
        XP.A0I(imageViewA01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0A, 0, 0, A0A);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        imageViewA01.setLayoutParams(layoutParams);
        return imageViewA01;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public final boolean A03() {
        return this.A06.A05().A1m() || this.A06.A05().A1o();
    }

    public boolean A0C() {
        return true;
    }

    public boolean A0D() {
        return true;
    }

    public ME A1A(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1B() {
    }

    public void A1C() {
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G(C2726Mp c2726Mp, String str, double d10, Bundle bundle) {
        this.A05.A04(c2726Mp.A0I().A0E(), c2726Mp.A0I().A04(), null, false, !A1M() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c2726Mp.A0J(), str, new HashMap());
    }

    public void A1H(C22383d c22383d) {
    }

    public void A1I(DO r12) {
    }

    public void A1J(C3Q c3q, int i) {
    }

    public boolean A1K() {
        return false;
    }

    public boolean A1L() {
        return true;
    }

    public boolean A1N(boolean z10) {
        return false;
    }

    public C3272dL getAdContextWrapper() {
        return this.A02;
    }

    public US getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C2735My getColors() {
        return this.A00;
    }

    public KE getCtaButton() {
        return this.A04;
    }

    public C3092aQ getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C2735My c2735MyA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c2735MyA00 = this.A06.A05().A1z().A01();
        } else {
            c2735MyA00 = this.A06.A05().A1z().A00();
        }
        this.A00 = c2735MyA00;
        this.A04.setViewShowsOverMedia(A0C());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(MF mf) {
        getCtaButton().getCtaActionHelper().A07(mf);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z10) {
    }
}
