package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbow implements zzbox {
    final /* synthetic */ zzcen zza;

    public zzbow(zzboy zzboyVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzboyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(@Nullable String str) {
        this.zza.zzd(new zzbso(str));
    }
}
