package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class wq implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final kt f35040a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35041b;

    public wq(kt nativeAdAssets, int i) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        this.f35040a = nativeAdAssets;
        this.f35041b = i;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView adView = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(adView, "adView");
        xq xqVar = new xq(this.f35040a, this.f35041b, new x31());
        ImageView imageViewA = xqVar.a(adView);
        ImageView imageViewB = xqVar.b(adView);
        if (imageViewA != null) {
            imageViewA.setId(R.id.favicon);
        }
        if (imageViewB != null) {
            imageViewB.setId(R.id.icon);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
