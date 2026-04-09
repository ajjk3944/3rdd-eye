package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbct {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbct(int i, String str, Object obj, Object obj2, zzbcs zzbcsVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zza().zzd(this);
    }

    public static zzbct zzf(int i, String str, float f10, float f11) {
        return new zzbcq(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbct zzg(int i, String str, int i10, int i11) {
        return new zzbco(1, str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static zzbct zzh(int i, String str, long j4, long j10) {
        return new zzbcp(1, str, Long.valueOf(j4), Long.valueOf(j10));
    }

    public static zzbct zzi(int i, String str) {
        zzbcr zzbcrVar = new zzbcr(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zza().zzc(zzbcrVar);
        return zzbcrVar;
    }

    public static zzbct zzj(int i, String str) {
        zzbcr zzbcrVar = new zzbcr(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zza().zze(zzbcrVar);
        return zzbcrVar;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzk() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(this);
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzf() ? this.zzd : this.zzc;
    }

    public final String zzm() {
        return this.zzb;
    }
}
