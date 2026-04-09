package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdhk implements zzhfy {
    private final zzdhi zza;

    public zzdhk(zzdhi zzdhiVar) {
        this.zza = zzdhiVar;
    }

    public static JSONObject zza(zzdhi zzdhiVar) {
        JSONObject jSONObjectZzd = zzdhiVar.zzd();
        zzhgg.zzb(jSONObjectZzd);
        return jSONObjectZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zza(this.zza);
    }

    public final JSONObject zzc() {
        return zza(this.zza);
    }
}
