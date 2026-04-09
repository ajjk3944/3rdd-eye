package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1277e8 extends FrameLayout {
    public static final int A08 = XV.A0b;
    public C02786e A00;
    public C0483Eu A01;
    public C4L A02;
    public C0442Df A03;
    public C3S A04;
    public AnonymousClass34 A05;
    public final C1436gi A06;
    public final VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(VA va2, String str, Map<String, String> map) {
        A02();
        this.A02 = new C4L(this.A06, va2, this.A00, str, null, map);
        if (C0886Up.A20(this.A06)) {
            this.A01 = new C0483Eu(this.A06, va2, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1277e8(C1436gi c1436gi, VI vi2) {
        super(c1436gi);
        this.A07 = vi2;
        this.A06 = c1436gi;
        setUpView(c1436gi);
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

    public final void A05(EnumC1323et enumC1323et) {
        A0e(enumC1323et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C0473Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1436gi c1436gi) {
        A0Y();
        this.A04 = new C3S(c1436gi);
        A0f(this.A04);
        this.A03 = new C0442Df(c1436gi, this.A07);
        A0f(new C02123q(c1436gi));
        A0f(this.A03);
        this.A05 = new AnonymousClass34(c1436gi, true, this.A07);
        A0f(this.A05);
        A0f(new C0444Dh(this.A05, EnumC1339f9.A02, true, true));
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
    private void setUpVideo(final C1436gi c1436gi) {
        this.A00 = new C0473Ek(c1436gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i4, int i10) {
                int newWidthSpec = View.MeasureSpec.getMode(i4);
                if (newWidthSpec == 1073741824) {
                    i10 = i4;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i10);
                    if (newWidthSpec2 == 1073741824) {
                        i4 = i10;
                    }
                }
                super.onMeasure(i4, i10);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC1276e7(this));
    }

    private void setUpView(C1436gi c1436gi) {
        setUpVideo(c1436gi);
        setUpPlugins(c1436gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
