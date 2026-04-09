package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes.dex */
public final class b extends AdListener implements AppEventListener, zza {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f9509a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationBannerListener f9510b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f9509a = abstractAdViewAdapter;
        this.f9510b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f9510b.onAdClicked(this.f9509a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f9510b.onAdClosed(this.f9509a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f9510b.onAdFailedToLoad(this.f9509a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f9510b.onAdLoaded(this.f9509a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f9510b.onAdOpened(this.f9509a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f9510b.zza(this.f9509a, str, str2);
    }
}
