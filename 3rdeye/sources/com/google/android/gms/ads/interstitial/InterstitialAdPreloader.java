package com.google.android.gms.ads.interstitial;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class InterstitialAdPreloader {
    private InterstitialAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzg(str);
    }

    public static void destroyAll() {
        zzep zzepVarZza = zza();
        if (zzepVarZza != null) {
            zzepVarZza.zzf();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return null;
        }
        return zzepVarZza.zzd(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzep zzepVarZza = zza();
        return zzepVarZza == null ? new HashMap() : zzepVarZza.zze();
    }

    public static int getNumAdsAvailable(String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return 0;
        }
        return zzepVarZza.zzb(str);
    }

    public static boolean isAdAvailable(String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzh(str);
    }

    public static InterstitialAd pollAd(String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return null;
        }
        return zzepVarZza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzi(str, preloadConfiguration);
    }

    private static zzep zza() {
        zzep zzepVar = (zzep) zzey.zzf().zzg(AdFormat.INTERSTITIAL);
        if (zzepVar == null) {
            zzo.zzj("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzepVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzj(str, preloadConfiguration, preloadCallbackV2);
    }
}
