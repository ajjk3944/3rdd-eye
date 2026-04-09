package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3241cp extends FrameLayout {
    public static final int A08 = (int) (AbstractC2975Wl.A02 * 16.0f);
    public C23115y A00;
    public EG A01;
    public C22433i A02;
    public D1 A03;
    public C22242p A04;
    public C2R A05;
    public final C3272dL A06;
    public final C2915Ua A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(US us, String str, Map<String, String> map) {
        A02();
        this.A02 = new C22433i(this.A06, us, this.A00, str, null, map);
        if (U7.A1v(this.A06)) {
            this.A01 = new EG(this.A06, us, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C3241cp(C3272dL c3272dL, C2915Ua c2915Ua) {
        super(c3272dL);
        this.A07 = c2915Ua;
        this.A06 = c3272dL;
        setUpView(c3272dL);
    }

    public final void A01() {
        A0l(true, 10);
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

    public final void A03(AbstractC2895Tf abstractC2895Tf) {
        getEventBus().A05(abstractC2895Tf);
    }

    public final void A05(EnumC3288db enumC3288db) {
        A0h(enumC3288db, 13);
    }

    public final boolean A06() {
        return A0s();
    }

    public E1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C3272dL c3272dL) {
        A0b();
        this.A04 = new C22242p(c3272dL);
        A0i(this.A04);
        this.A03 = new D1(c3272dL, this.A07);
        A0i(new C3D(c3272dL));
        A0i(this.A03);
        this.A05 = new C2R(c3272dL, true, this.A07);
        A0i(this.A05);
        A0i(new D4(this.A05, EnumC3303dr.A02, true, true));
        if (!A0n()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.5y] */
    private void setUpVideo(final C3272dL c3272dL) {
        this.A00 = new E1(c3272dL) { // from class: com.facebook.ads.redexgen.X.5y
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i10) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i10 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i10);
                    if (newWidthSpec2 == 1073741824) {
                        i = i10;
                    }
                }
                super.onMeasure(i, i10);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        XP.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC3240co(this));
    }

    private void setUpView(C3272dL c3272dL) {
        setUpVideo(c3272dL);
        setUpPlugins(c3272dL);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
