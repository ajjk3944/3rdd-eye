package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbpf implements zzbks {
    private final zzcai zza;

    public zzbpf(zzbpg zzbpgVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzboj());
            } else {
                this.zza.zzd(new zzboj(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e4) {
            this.zza.zzd(e4);
        }
    }
}
