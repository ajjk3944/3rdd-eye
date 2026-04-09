package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfnd {
    private JSONObject zza;
    private final zzfnm zzb;

    public zzfnd(zzfnm zzfnmVar) {
        this.zzb = zzfnmVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfnn(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j4) {
        this.zzb.zzb(new zzfno(this, hashSet, jSONObject, j4));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j4) {
        this.zzb.zzb(new zzfnp(this, hashSet, jSONObject, j4));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
