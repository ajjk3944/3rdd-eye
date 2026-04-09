package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdhi {
    private final JSONObject zza;
    private final zzdnr zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzbxy zzd;

    public zzdhi(JSONObject jSONObject, zzdnr zzdnrVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar) {
        this.zza = jSONObject;
        this.zzb = zzdnrVar;
        this.zzc = zzbVar;
        this.zzd = zzbxyVar;
    }

    public final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    public final zzbxy zzb() {
        return this.zzd;
    }

    public final zzdnr zzc() {
        return this.zzb;
    }

    public final JSONObject zzd() {
        return this.zza;
    }
}
