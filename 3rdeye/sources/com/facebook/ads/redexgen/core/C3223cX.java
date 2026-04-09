package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3223cX extends LinearLayout {
    public LinearLayout A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final C3272dL A04;
    public final C3086aK A05;
    public final C3092aQ A06;
    public static String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (AbstractC2975Wl.A02 * 16.0f);
    public static final int A0B = (int) (AbstractC2975Wl.A02 * 32.0f);
    public static final int A0C = (int) (AbstractC2975Wl.A02 * 16.0f);
    public static final int A09 = (int) (AbstractC2975Wl.A02 * 4.0f);
    public static final int A08 = (int) (AbstractC2975Wl.A02 * 72.0f);

    public C3223cX(C3221cV c3221cV) {
        super(c3221cV.A08);
        this.A02 = false;
        this.A01 = "";
        this.A04 = c3221cV.A08;
        this.A05 = new C3086aK(this.A04);
        this.A06 = new C3092aQ(this.A04, c3221cV.A01, true, false, true);
        this.A03 = c3221cV.A00;
        this.A02 = c3221cV.A05;
        this.A01 = c3221cV.A04;
        A03(c3221cV);
    }

    public /* synthetic */ C3223cX(C3221cV c3221cV, C2548Fr c2548Fr) {
        this(c3221cV);
    }

    private void A00() {
        A01(this.A05, 150);
        A01(this.A06, 170);
        if (this.A00 != null) {
            A01(this.A00, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C3221cV c3221cV) {
        if (!TextUtils.isEmpty(c3221cV.A03)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            int i = A0C / 2;
            if (this.A02) {
                i = 0;
            }
            LinearLayout linearLayout = this.A00;
            int i10 = A0C;
            int i11 = A0C;
            int marginTop = A0C;
            linearLayout.setPadding(i10, i, i11, marginTop / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, i, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            XP.A0W(textView, false, 16);
            textView.setText(c3221cV.A03);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new KZ(imageView, this.A04).A04().A07(c3221cV.A02);
            int i12 = A0A;
            int marginTop2 = A0A;
            LinearLayout.LayoutParams informativeContainerParams = new LinearLayout.LayoutParams(i12, marginTop2);
            int marginTop3 = A0C;
            informativeContainerParams.setMargins(0, 0, marginTop3 / 2, 0);
            if (this.A02) {
                C3080aE c3080aE = new C3080aE(getContext(), 0, -1, XX.PLAYABLE_ICON);
                c3080aE.setLayoutParams(new LinearLayout.LayoutParams(A0B, A0B));
                this.A00.addView(c3080aE);
            } else {
                this.A00.addView(imageView, informativeContainerParams);
                this.A00.addView(textView, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(100.0f);
                gradientDrawable.setColor(469762047);
                XP.A0Q(this.A00, gradientDrawable);
            }
            View view = this.A00;
            String[] strArr = A07;
            String str = strArr[5];
            String str2 = strArr[7];
            int length = str.length();
            int marginTop4 = str2.length();
            if (length != marginTop4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
            strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
            addView(view, layoutParams);
        }
    }

    private void A03(C3221cV c3221cV) {
        XP.A0K(this.A05, 0);
        this.A05.setRadius(50);
        if (!this.A02) {
            if (c3221cV.A06.A00() == EnumC2731Mu.A05) {
                this.A05.setFullCircleCorners(true);
            } else {
                C3086aK c3086aK = this.A05;
                int i = A09;
                String[] strArr = A07;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
                c3086aK.setRadius(i);
            }
        } else {
            this.A05.setRadius(A09);
        }
        new KZ(this.A05, this.A04).A04().A07(c3221cV.A07.A01());
        this.A06.A04(c3221cV.A06.A0F(), c3221cV.A07.A03(), null, false, true);
        if (!this.A02) {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        } else {
            this.A06.getDescriptionTextView().setText(this.A01);
        }
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        View view = this.A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(A08, A08);
        addView(view, titleAndDescriptionParams);
        addView(this.A06, layoutParams);
        A02(c3221cV);
        XP.A0K(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC3222cW interfaceC3222cW) {
        A00();
        postDelayed(new C2548Fr(this, interfaceC3222cW), this.A03);
    }
}
