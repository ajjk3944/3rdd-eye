package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1655e8 extends FrameLayout {
    public static final int A08 = XV.A0b;
    public C06566e A00;
    public C0861Eu A01;
    public C4L A02;
    public C0820Df A03;
    public C3S A04;
    public AnonymousClass34 A05;
    public final C1814gi A06;
    public final VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(VA va, String str, Map<String, String> map) {
        A02();
        this.A02 = new C4L(this.A06, va, this.A00, str, null, map);
        if (C1264Up.A20(this.A06)) {
            this.A01 = new C0861Eu(this.A06, va, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1655e8(C1814gi c1814gi, VI vi) {
        super(c1814gi);
        this.A07 = vi;
        this.A06 = c1814gi;
        setUpView(c1814gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(UN un) {
        getEventBus().A05(un);
    }

    public final void A05(EnumC1701et enumC1701et) {
        A0e(enumC1701et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C0851Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1814gi c1814gi) {
        A0Y();
        this.A04 = new C3S(c1814gi);
        A0f(this.A04);
        this.A03 = new C0820Df(c1814gi, this.A07);
        A0f(new C05903q(c1814gi));
        A0f(this.A03);
        this.A05 = new AnonymousClass34(c1814gi, true, this.A07);
        A0f(this.A05);
        A0f(new C0822Dh(this.A05, EnumC1717f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final C1814gi c1814gi) {
        this.A00 = new C0851Ek(c1814gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                int newWidthSpec = View.MeasureSpec.getMode(i10);
                if (newWidthSpec == 1073741824) {
                    i11 = i10;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i11);
                    if (newWidthSpec2 == 1073741824) {
                        i10 = i11;
                    }
                }
                super.onMeasure(i10, i11);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC1654e7(this));
    }

    private void setUpView(C1814gi c1814gi) {
        setUpVideo(c1814gi);
        setUpPlugins(c1814gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
