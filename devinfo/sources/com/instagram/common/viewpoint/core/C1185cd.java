package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1185cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0634Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1185cd(C1436gi c1436gi, ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr, AbstractC1601jd abstractC1601jd, VA va2, InterfaceC0977Yh interfaceC0977Yh, C1381fp c1381fp, Y2 y22, C0694Na c0694Na, InterfaceC1114bU interfaceC1114bU) {
        super(c1436gi);
        this.A00 = c0694Na.A09(true);
        this.A01 = new RelativeLayout(c1436gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1436gi, abstractC1601jd.A29().A0J().A04());
        if (viewOnClickListenerC0634Kr == null) {
            this.A02 = new ViewOnClickListenerC0634Kr(c1436gi, abstractC1601jd.A0w(), (C0694Na) null, va2, interfaceC0977Yh, c1381fp, y22, abstractC1601jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC0634Kr;
        }
        A03();
        this.A02.setCta(abstractC1601jd.A29().A0J(), abstractC1601jd.A2E(), new HashMap(), interfaceC1114bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1436gi c1436gi, View view) {
        ImageView imageView = new ImageView(c1436gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1436gi c1436gi, String str) {
        Button button = new Button(c1436gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1436gi, button);
    }

    public final EnumC0685Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1601jd abstractC1601jd, AbstractC0971Yb abstractC0971Yb) {
        this.A02.A0F(abstractC1601jd, abstractC0971Yb);
    }

    public void setCta(C0696Nc c0696Nc, String str, HashMap<String, String> extras, InterfaceC1114bU interfaceC1114bU) {
        this.A02.setCta(c0696Nc, str, extras, interfaceC1114bU);
    }
}
