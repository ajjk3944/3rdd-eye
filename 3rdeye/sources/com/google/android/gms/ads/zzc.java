package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzc {
    public static int zza(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzb(AdSize adSize) {
        return adSize.zza();
    }

    public static AdSize zzc(int i, int i10, String str) {
        return new AdSize(i, i10, str);
    }

    public static AdSize zzd(int i, int i10) {
        AdSize adSize = new AdSize(i, i10);
        adSize.zze(true);
        adSize.zzc(i10);
        return adSize;
    }

    public static AdSize zze(int i, int i10) {
        AdSize adSize = new AdSize(i, i10);
        adSize.zzf(true);
        adSize.zzd(i10);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zzg();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.zzi();
    }
}
