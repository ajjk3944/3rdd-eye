package com.google.ads.mediation.unity;

import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final BannerView f9590a;

    public d(BannerView bannerView) {
        this.f9590a = bannerView;
    }

    public BannerView a() {
        return this.f9590a;
    }

    public void b(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.f9590a.load(unityAdsLoadOptions);
    }

    public void c(BannerView.IListener iListener) {
        this.f9590a.setListener(iListener);
    }
}
