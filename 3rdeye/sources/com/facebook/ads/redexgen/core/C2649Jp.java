package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2649Jp extends AbstractC3106ae implements Wf {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC3547hy A00;
    public final C2971Wh A01;
    public final InterfaceC3003Xn A02;
    public final C3138bA A03;
    public final C3238cm A04;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, 30, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C2649Jp(C3110ai c3110ai, boolean z10) {
        int id;
        int iA01;
        super(c3110ai, z10);
        this.A02 = c3110ai.A0D();
        this.A00 = c3110ai.A05();
        this.A03 = new C3138bA(c3110ai.A06(), c3110ai.A02());
        this.A03.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC3106ae.A07, AbstractC3106ae.A07, AbstractC3106ae.A07, AbstractC3106ae.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c3110ai.A0I()) {
            this.A04 = new C3238cm(c3110ai.A06());
            this.A04.setPageDetails(c3110ai.A05().A23());
            XP.A0E(1007, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC3106ae.A07, AbstractC3106ae.A07 - (AbstractC3106ae.A07 / 2), AbstractC3106ae.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            iA01 = c3110ai.A01() - (AbstractC3106ae.A07 / 2);
        } else {
            id = getCtaButton().getId();
            iA01 = c3110ai.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c3110ai.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, iA01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC3106ae.A07, 0, AbstractC3106ae.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c3110ai.A05(), c3110ai.A0C());
        View viewA02 = c3110ai.A02();
        this.A01 = C2971Wh.A00(c3110ai.A06(), this.A00, this);
        C2970Wg c2970WgA02 = this.A01.A02(this.A00);
        c3110ai.A06().A0H().A00(c2970WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (viewA02 != null && c2970WgA02.A00) {
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ao
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1O(view);
                }
            });
        } else if (viewA02 != null && U7.A1I(getAdContextWrapper())) {
            AbstractC3060Zs.A00(viewA02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC3117ap(this));
        }
        if (U7.A17(c3110ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c3110ai.A0C() != null) {
                c3110ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && U7.A18(c3110ai.A06())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3106ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3106ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3106ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3106ae
    public final void A1G(C2726Mp c2726Mp, String str, double d10, Bundle bundle) {
        super.A1G(c2726Mp, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (AbstractC3106ae.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3106ae
    public final boolean A1M() {
        return false;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
