package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3138bA extends RelativeLayout {
    public final View A00;
    public final C3087aL A01;

    public C3138bA(C3272dL c3272dL, View view) {
        super(c3272dL);
        this.A00 = view;
        this.A01 = new C3087aL(c3272dL);
        XP.A0I(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(C3092aQ c3092aQ, boolean z10) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c3092aQ != null) {
            if (z10) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c3092aQ.setAlignment(3);
                layoutParams2.setMargins(AbstractC3106ae.A07 / 2, AbstractC3106ae.A07 / 2, AbstractC3106ae.A07 / 2, AbstractC3106ae.A07 / 2);
                linearLayout.addView(c3092aQ, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                XP.A0Q(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, AbstractC3106ae.A07, 0, 0);
                c3092aQ.setAlignment(17);
                addView(c3092aQ, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
