package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f9513a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialListener f9514b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f9513a = abstractAdViewAdapter;
        this.f9514b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f9514b.onAdClosed(this.f9513a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f9514b.onAdOpened(this.f9513a);
    }
}
