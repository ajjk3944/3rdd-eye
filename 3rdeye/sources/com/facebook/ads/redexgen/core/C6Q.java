package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q extends C3415fg {
    public InterfaceC3273dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C3272dL c3272dL, NativeAd nativeAd, C2932Ur c2932Ur) {
        C3086aK c3086aK = new C3086aK(c3272dL);
        MediaView mediaView = new MediaView(c3272dL);
        AdOptionsView adOptionsView = new AdOptionsView(c3272dL, nativeAd, nativeAdLayout);
        c2932Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c3272dL, nativeAd, c2932Ur, C2815Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c3086aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c2932Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c3086aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
