package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1465hB {
    public InterfaceC1308ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1436gi c1436gi, NativeAd nativeAd, C0900Vd c0900Vd) {
        C1130bk c1130bk = new C1130bk(c1436gi);
        MediaView mediaView = new MediaView(c1436gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1436gi, nativeAd, nativeAdLayout);
        c0900Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1436gi, nativeAd, c0900Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1130bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c0900Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1130bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C0806Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
