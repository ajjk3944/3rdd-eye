package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3256d4 {
    public KE A00;
    public final C2723Ml A01;
    public final C2733Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C3272dL A05;
    public final C2915Ua A06;
    public static final int A09 = (int) (AbstractC2975Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC2975Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC2975Wl.A02 * 8.0f);

    public C3256d4(C3272dL c3272dL, US us, AbstractC3547hy abstractC3547hy) {
        this.A05 = c3272dL;
        this.A06 = new C2915Ua(abstractC3547hy.A25(), us);
        this.A01 = abstractC3547hy.A1z();
        this.A02 = abstractC3547hy.A20().A0I();
        this.A04 = abstractC3547hy.A23();
        this.A03 = abstractC3547hy.A20().A0K();
    }

    private View A00(KE ke) {
        C3092aQ c3092aQ = new C3092aQ(this.A05, this.A01.A01(), true, false, false);
        c3092aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c3092aQ.setAlignment(17);
        C3086aK c3086aK = new C3086aK(this.A05);
        XP.A0K(c3086aK, 0);
        c3086aK.setRadius(50);
        new KZ(c3086aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c3086aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c3092aQ, layoutParams);
        if (ke != null) {
            XP.A0H(ke);
            linearLayout.addView(ke, layoutParams);
            if (TextUtils.isEmpty(ke.getText())) {
                XP.A0F(ke);
            }
        }
        return linearLayout;
    }

    private C23196g A01() {
        C23196g c23196g = new C23196g(this.A05);
        c23196g.setLayoutManager(new C3452gI(this.A05, 0, false));
        c23196g.setAdapter(new C2506Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c23196g;
    }

    private final EnumC3255d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC3255d3.A03;
        }
        return EnumC3255d3.A02;
    }

    public final Pair<EnumC3255d3, View> A03(KE ke) {
        View viewA01;
        this.A00 = ke;
        EnumC3255d3 enumC3255d3A02 = A02();
        switch (C3254d2.A00[enumC3255d3A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC2917Uc.A04(viewA01, this.A06, UZ.A0S);
        return new Pair<>(enumC3255d3A02, viewA01);
    }
}
