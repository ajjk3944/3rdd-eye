package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbfa {
    public static final zzbem zza = zzbem.zzd("gads:init:init_on_bg_thread", true);
    public static final zzbem zzb = zzbem.zzd("gads:init:init_on_single_bg_thread", false);
    public static final zzbem zzc = zzbem.zzd("gads:adloader_load_bg_thread", true);
    public static final zzbem zzd = zzbem.zzd("gads:appopen_load_on_bg_thread", true);
    public static final zzbem zze = zzbem.zzd("gads:banner_destroy_bg_thread", false);
    public static final zzbem zzf = zzbem.zzd("gads:banner_load_bg_thread", true);
    public static final zzbem zzg = zzbem.zzd("gads:banner_pause_bg_thread", false);
    public static final zzbem zzh = zzbem.zzd("gads:banner_resume_bg_thread", false);
    public static final zzbem zzi = zzbem.zzd("gads:interstitial_load_on_bg_thread", true);
    public static final zzbem zzj;
    public static final zzbem zzk;

    static {
        zzbem.zzd("gads:persist_flags_on_bg_thread", true);
        zzj = zzbem.zzd("gads:query_info_bg_thread", true);
        zzk = zzbem.zzd("gads:rewarded_load_bg_thread", true);
    }
}
