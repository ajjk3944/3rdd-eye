package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class YZ extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C0726Og A02;
    public final C1436gi A03;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (XX.A02 * 50.0f);
        A05 = (int) (XX.A02 * 10.0f);
        A06 = (int) (XX.A02 * 20.0f);
        A09 = (int) (XX.A02 * 4.0f);
        A07 = (int) (XX.A02 * 12.0f);
    }

    public YZ(C1436gi c1436gi, int i4) {
        super(c1436gi);
        this.A03 = c1436gi;
        this.A02 = AbstractC0727Oh.A00(c1436gi.A02());
        setOrientation(0);
        this.A00 = new ImageView(c1436gi);
        this.A01 = new ImageView(c1436gi);
        A04(i4);
    }

    private void A04(int i4) {
        YM ym;
        A05(this.A00, YM.AD_CHOICES_ICON);
        if (i4 == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            YB.A0a(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i4 == 1) {
            ym = YM.AN_INFO_ICON;
        } else {
            ym = YM.DEFAULT_INFO_ICON;
        }
        A05(this.A01, ym);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, YM ym) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(YN.A01(ym));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C0706Nm c0706Nm, String str, VI vi2, InterfaceC0977Yh interfaceC0977Yh) {
        setOnClickListener(new YY(this, vi2, interfaceC0977Yh, str, c0706Nm));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i4);
        YB.A0V(this, gradientDrawable);
    }

    public void setIconColors(int i4) {
        this.A00.setColorFilter(i4);
        this.A01.setColorFilter(i4);
    }
}
