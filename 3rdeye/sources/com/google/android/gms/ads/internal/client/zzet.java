package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
final class zzet extends zzcd {
    final /* synthetic */ PreloadCallback zza;

    public zzet(zzey zzeyVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzfv zzfvVar) {
        PreloadConfiguration preloadConfigurationZzh = com.google.android.gms.ads.internal.util.client.zzf.zzh(zzfvVar);
        if (preloadConfigurationZzh != null) {
            this.zza.onAdsAvailable(preloadConfigurationZzh);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzfv zzfvVar) {
        PreloadConfiguration preloadConfigurationZzh = com.google.android.gms.ads.internal.util.client.zzf.zzh(zzfvVar);
        if (preloadConfigurationZzh != null) {
            this.zza.onAdsExhausted(preloadConfigurationZzh);
        }
    }
}
