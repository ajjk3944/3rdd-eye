package com.google.android.gms.ads.appopen;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class AppOpenAdPreloader {
    private AppOpenAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzg(str);
    }

    public static void destroyAll() {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza != null) {
            zzeoVarZza.zzf();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return null;
        }
        return zzeoVarZza.zzd(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzeo zzeoVarZza = zza();
        return zzeoVarZza == null ? new HashMap() : zzeoVarZza.zze();
    }

    public static int getNumAdsAvailable(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return 0;
        }
        return zzeoVarZza.zzb(str);
    }

    public static boolean isAdAvailable(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzh(str);
    }

    public static AppOpenAd pollAd(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return null;
        }
        return zzeoVarZza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzi(str, preloadConfiguration);
    }

    private static zzeo zza() {
        zzeo zzeoVar = (zzeo) zzey.zzf().zzg(AdFormat.APP_OPEN_AD);
        if (zzeoVar == null) {
            zzo.zzj("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzeoVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzj(str, preloadConfiguration, preloadCallbackV2);
    }
}
