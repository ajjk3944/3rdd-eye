package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1291eM {
    public ViewOnClickListenerC0634Kr A00;
    public final NN A01;
    public final NY A02;
    public final C0697Nd A03;
    public final C0706Nm A04;
    public final C1436gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1291eM(C1436gi c1436gi, VA va2, AbstractC1601jd abstractC1601jd) {
        this.A05 = c1436gi;
        this.A06 = new VI(abstractC1601jd.A2E(), va2);
        this.A01 = abstractC1601jd.A28();
        this.A02 = abstractC1601jd.A29().A0I();
        this.A04 = abstractC1601jd.A2C();
        this.A03 = abstractC1601jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
        C1136bq c1136bq = new C1136bq(this.A05, this.A01.A01(), true, false, false);
        c1136bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1136bq.setAlignment(17);
        C1130bk c1130bk = new C1130bk(this.A05);
        YB.A0N(c1130bk, 0);
        c1130bk.setRadius(50);
        new LM(c1130bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1130bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1136bq, layoutParams);
        if (viewOnClickListenerC0634Kr != null) {
            YB.A0J(viewOnClickListenerC0634Kr);
            linearLayout.addView(viewOnClickListenerC0634Kr, layoutParams);
            viewOnClickListenerC0634Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC0634Kr.getText())) {
                YB.A0H(viewOnClickListenerC0634Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C1506hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1290eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1290eL.A03;
        }
        return EnumC1290eL.A02;
    }

    public final Pair<EnumC1290eL, View> A03(ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC0634Kr;
        EnumC1290eL enumC1290eLA02 = A02();
        switch (enumC1290eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        VK.A04(viewA01, this.A06, VH.A0S);
        return new Pair<>(enumC1290eLA02, viewA01);
    }
}
