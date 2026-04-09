package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class mn<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final h61 f30456a;

    /* renamed from: b, reason: collision with root package name */
    private final a41 f30457b;

    public mn(h61 nativeAd, a41 nativeAdAssetViewProvider) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f30456a = nativeAd;
        this.f30457b = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f30457b.getClass();
        TextView textView = (TextView) container.findViewById(R.id.call_to_action);
        ar1 adType = this.f30456a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == ar1.f24800d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
