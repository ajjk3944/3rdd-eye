package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1669eM {
    public ViewOnClickListenerC1012Kr A00;
    public final NN A01;
    public final NY A02;
    public final C1075Nd A03;
    public final C1084Nm A04;
    public final C1814gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1669eM(C1814gi c1814gi, VA va, AbstractC1979jd abstractC1979jd) {
        this.A05 = c1814gi;
        this.A06 = new VI(abstractC1979jd.A2E(), va);
        this.A01 = abstractC1979jd.A28();
        this.A02 = abstractC1979jd.A29().A0I();
        this.A04 = abstractC1979jd.A2C();
        this.A03 = abstractC1979jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr) {
        C1514bq c1514bq = new C1514bq(this.A05, this.A01.A01(), true, false, false);
        c1514bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1514bq.setAlignment(17);
        C1508bk c1508bk = new C1508bk(this.A05);
        YB.A0N(c1508bk, 0);
        c1508bk.setRadius(50);
        new LM(c1508bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1508bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1514bq, layoutParams);
        if (viewOnClickListenerC1012Kr != null) {
            YB.A0J(viewOnClickListenerC1012Kr);
            linearLayout.addView(viewOnClickListenerC1012Kr, layoutParams);
            viewOnClickListenerC1012Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC1012Kr.getText())) {
                YB.A0H(viewOnClickListenerC1012Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C1884hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1668eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1668eL.A03;
        }
        return EnumC1668eL.A02;
    }

    public final Pair<EnumC1668eL, View> A03(ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC1012Kr;
        EnumC1668eL enumC1668eLA02 = A02();
        switch (enumC1668eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        VK.A04(viewA01, this.A06, VH.A0S);
        return new Pair<>(enumC1668eLA02, viewA01);
    }
}
