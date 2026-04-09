package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class EQ extends LinearLayout implements InterfaceC3273dM {
    public final NativeBannerAd A00;
    public final C3272dL A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC2975Wl.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC2975Wl.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC2975Wl.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC2975Wl.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC2975Wl.A02 * 8.0f);

    public EQ(C3272dL c3272dL, NativeBannerAd nativeBannerAd, C2932Ur c2932Ur, EnumC2933Us enumC2933Us, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams ctaButtonParams;
        super(c3272dL);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c3272dL;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC2933Us);
        C3087aL c3087aL = new C3087aL(this.A01);
        c3087aL.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams2.gravity = 16;
        c3087aL.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c3087aL, layoutParams2);
        C3270dJ c3270dJ = new C3270dJ(c3272dL, this.A00, enumC2933Us, c2932Ur, adOptionsView);
        c3270dJ.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c3270dJ, layoutParams3);
        if (enumC2933Us == EnumC2933Us.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView ctaButton = new TextView(getContext());
        ctaButton.setPadding(A06, A07, A06, A07);
        c2932Ur.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(EnumC2933Us enumC2933Us) {
        switch (enumC2933Us) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3273dM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3273dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3273dM
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
