package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1176cU extends RelativeLayout {
    public final View A00;
    public final C1131bl A01;

    public C1176cU(C1436gi c1436gi, View view) {
        super(c1436gi);
        this.A00 = view;
        this.A01 = new C1131bl(c1436gi);
        YB.A0K(this.A01);
    }

    public final void A00(int i4) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4));
    }

    public final void A01(C1136bq c1136bq, boolean z3) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c1136bq != null) {
            if (z3) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c1136bq.setAlignment(3);
                layoutParams2.setMargins(AbstractC1149c3.A08 / 2, AbstractC1149c3.A08 / 2, AbstractC1149c3.A08 / 2, AbstractC1149c3.A08 / 2);
                linearLayout.addView(c1136bq, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                YB.A0V(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, AbstractC1149c3.A08, 0, 0);
                c1136bq.setAlignment(17);
                addView(c1136bq, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
