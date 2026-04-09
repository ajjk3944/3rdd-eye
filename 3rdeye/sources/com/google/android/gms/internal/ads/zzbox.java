package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbox implements zzbks {
    final /* synthetic */ zzboy zza;
    private final zzboa zzb;
    private final zzcai zzc;

    public zzbox(zzboy zzboyVar, zzboa zzboaVar, zzcai zzcaiVar) {
        this.zza = zzboyVar;
        this.zzb = zzboaVar;
        this.zzc = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzboj());
            } else {
                this.zzc.zzd(new zzboj(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e4) {
                this.zzc.zzd(e4);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
