package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.client.zzfc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class RewardedAdPreloader {
    private RewardedAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return false;
        }
        return zzfcVarZza.zzg(str);
    }

    public static void destroyAll() {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza != null) {
            zzfcVarZza.zzf();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return null;
        }
        return zzfcVarZza.zzd(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzfc zzfcVarZza = zza();
        return zzfcVarZza == null ? new HashMap() : zzfcVarZza.zze();
    }

    public static int getNumAdsAvailable(String str) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return 0;
        }
        return zzfcVarZza.zzb(str);
    }

    public static boolean isAdAvailable(String str) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return false;
        }
        return zzfcVarZza.zzh(str);
    }

    public static RewardedAd pollAd(String str) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return null;
        }
        return zzfcVarZza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return false;
        }
        return zzfcVarZza.zzi(str, preloadConfiguration);
    }

    private static zzfc zza() {
        zzfc zzfcVar = (zzfc) zzey.zzf().zzg(AdFormat.REWARDED);
        if (zzfcVar == null) {
            zzo.zzl("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.", null);
        }
        return zzfcVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzfc zzfcVarZza = zza();
        if (zzfcVarZza == null) {
            return false;
        }
        return zzfcVarZza.zzj(str, preloadConfiguration, preloadCallbackV2);
    }
}
