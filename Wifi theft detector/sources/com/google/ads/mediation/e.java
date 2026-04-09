package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;

/* loaded from: classes.dex */
public final class e extends AdListener implements zzg, zze, zzd {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f9515a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationNativeListener f9516b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f9515a = abstractAdViewAdapter;
        this.f9516b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f9516b.onAdClicked(this.f9515a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f9516b.onAdClosed(this.f9515a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f9516b.onAdFailedToLoad(this.f9515a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f9516b.onAdImpression(this.f9515a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f9516b.onAdOpened(this.f9515a);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f9516b.onAdLoaded(this.f9515a, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbln zzblnVar) {
        this.f9516b.zzc(this.f9515a, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbln zzblnVar, String str) {
        this.f9516b.zzd(this.f9515a, zzblnVar, str);
    }
}
