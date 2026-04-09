package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbhi;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class e extends AdListener implements zzi, zzg, zzf {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractAdViewAdapter f22425b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationNativeListener f22426c;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f22425b = abstractAdViewAdapter;
        this.f22426c = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f22426c.onAdClicked(this.f22425b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f22426c.onAdClosed(this.f22425b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f22426c.onAdFailedToLoad(this.f22425b, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f22426c.onAdImpression(this.f22425b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f22426c.onAdOpened(this.f22425b);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        a aVar = new a();
        aVar.setHeadline(unifiedNativeAd.zzh());
        aVar.setImages(unifiedNativeAd.zzk());
        aVar.setBody(unifiedNativeAd.zzf());
        aVar.setIcon(unifiedNativeAd.zzb());
        aVar.setCallToAction(unifiedNativeAd.zzg());
        aVar.setAdvertiser(unifiedNativeAd.zze());
        aVar.setStarRating(unifiedNativeAd.zzc());
        aVar.setStore(unifiedNativeAd.zzj());
        aVar.setPrice(unifiedNativeAd.zzi());
        aVar.zzd(unifiedNativeAd.zzd());
        aVar.setOverrideImpressionRecording(true);
        aVar.setOverrideClickHandling(true);
        aVar.zze(unifiedNativeAd.zza());
        this.f22426c.onAdLoaded(this.f22425b, aVar);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(zzbhi zzbhiVar, String str) {
        this.f22426c.zze(this.f22425b, zzbhiVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(zzbhi zzbhiVar) {
        this.f22426c.zzd(this.f22425b, zzbhiVar);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
