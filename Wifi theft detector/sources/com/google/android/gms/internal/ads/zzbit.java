package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes2.dex */
public final class zzbit {
    public static final zzbio zza = zzbio.zzb("gads:app_permissions_caching_expiry_ms:expiry", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    public static final zzbio zzb = zzbio.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbio zzc = zzbio.zzb("gads:battery_caching_expiry_ms:expiry", 10000);
    public static final zzbio zzd = zzbio.zzb("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzbio zze = zzbio.zzb("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbio zzf = zzbio.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbio zzg = zzbio.zzb("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbio zzh = zzbio.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
