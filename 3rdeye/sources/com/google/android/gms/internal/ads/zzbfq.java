package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbfq {
    public static final zzbem zza = zzbem.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbem zzb;

    static {
        zzbem.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbem.zzd("gms:expose_token_for_gma:enabled", true);
        zzbem.zzd("gads:referesh_rate_limit", false);
        zzb = zzbem.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbem.zzd("gads:token_anonymization:enabled", true);
        zzbem.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
