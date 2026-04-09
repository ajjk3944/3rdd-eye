package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3147bJ extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final KE A02;
    public static final int A05 = (int) (AbstractC2975Wl.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC2975Wl.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC2975Wl.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC2975Wl.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC2975Wl.A02 * 4.0f);

    public C3147bJ(C3272dL c3272dL, KE ke, AbstractC3547hy abstractC3547hy, US us, InterfaceC3003Xn interfaceC3003Xn, C3345eX c3345eX, XH xh, C2735My c2735My, InterfaceC3072a4 interfaceC3072a4) {
        super(c3272dL);
        this.A00 = c2735My.A09(true);
        this.A01 = new RelativeLayout(c3272dL);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c3272dL, abstractC3547hy.A20().A0J().A04());
        if (ke == null) {
            this.A02 = new KE(c3272dL, abstractC3547hy.A0r(), (C2735My) null, us, interfaceC3003Xn, c3345eX, xh, abstractC3547hy.A21());
        } else {
            this.A02 = ke;
        }
        A03();
        this.A02.setCta(abstractC3547hy.A20().A0J(), abstractC3547hy.A25(), new HashMap(), interfaceC3072a4);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C3272dL c3272dL, View view) {
        ImageView imageView = new ImageView(c3272dL);
        imageView.setImageBitmap(XY.A01(XX.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C3272dL c3272dL, String str) {
        Button button = new Button(c3272dL);
        XP.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        XP.A0M(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c3272dL, button);
    }

    public final ME A02(String str) {
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

    public void setAutoClickTime(AbstractC3547hy abstractC3547hy, AbstractC3002Xm abstractC3002Xm) {
        this.A02.A0F(abstractC3547hy, abstractC3002Xm);
    }

    public void setCta(C2736Mz c2736Mz, String str, HashMap<String, String> extras, InterfaceC3072a4 interfaceC3072a4) {
        this.A02.setCta(c2736Mz, str, extras, interfaceC3072a4);
    }
}
