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
public final class C1563cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1012Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1563cd(C1814gi c1814gi, ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr, AbstractC1979jd abstractC1979jd, VA va, InterfaceC1355Yh interfaceC1355Yh, C1759fp c1759fp, Y2 y22, C1072Na c1072Na, InterfaceC1492bU interfaceC1492bU) {
        super(c1814gi);
        this.A00 = c1072Na.A09(true);
        this.A01 = new RelativeLayout(c1814gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1814gi, abstractC1979jd.A29().A0J().A04());
        if (viewOnClickListenerC1012Kr == null) {
            this.A02 = new ViewOnClickListenerC1012Kr(c1814gi, abstractC1979jd.A0w(), (C1072Na) null, va, interfaceC1355Yh, c1759fp, y22, abstractC1979jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC1012Kr;
        }
        A03();
        this.A02.setCta(abstractC1979jd.A29().A0J(), abstractC1979jd.A2E(), new HashMap(), interfaceC1492bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1814gi c1814gi, View view) {
        ImageView imageView = new ImageView(c1814gi);
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

    private void A01(C1814gi c1814gi, String str) {
        Button button = new Button(c1814gi);
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
        A00(c1814gi, button);
    }

    public final EnumC1063Mq A02(String str) {
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

    public void setAutoClickTime(AbstractC1979jd abstractC1979jd, AbstractC1349Yb abstractC1349Yb) {
        this.A02.A0F(abstractC1979jd, abstractC1349Yb);
    }

    public void setCta(C1074Nc c1074Nc, String str, HashMap<String, String> extras, InterfaceC1492bU interfaceC1492bU) {
        this.A02.setCta(c1074Nc, str, extras, interfaceC1492bU);
    }
}
