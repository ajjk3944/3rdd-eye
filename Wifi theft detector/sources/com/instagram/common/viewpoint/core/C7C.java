package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1843hB {
    public InterfaceC1686ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1814gi c1814gi, NativeAd nativeAd, C1278Vd c1278Vd) {
        C1508bk c1508bk = new C1508bk(c1814gi);
        MediaView mediaView = new MediaView(c1814gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1814gi, nativeAd, nativeAdLayout);
        c1278Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1814gi, nativeAd, c1278Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1508bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1278Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1508bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1184Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
