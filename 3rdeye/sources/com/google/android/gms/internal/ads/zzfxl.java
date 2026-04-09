package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfxl extends zzfwy {
    final /* synthetic */ zzfxo zza;
    private final Object zzb;
    private int zzc;

    public zzfxl(zzfxo zzfxoVar, int i) {
        this.zza = zzfxoVar;
        this.zzb = zzfxo.zzg(zzfxoVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzfxo zzfxoVar = this.zza;
            if (i < zzfxoVar.size() && zzfvb.zza(this.zzb, zzfxo.zzg(zzfxoVar, this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzw(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, java.util.Map.Entry
    public final Object getValue() {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfxo.zzj(zzfxoVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzfxoVar.put(this.zzb, obj);
            return null;
        }
        Object objZzj = zzfxo.zzj(zzfxoVar, i);
        zzfxo.zzn(zzfxoVar, this.zzc, obj);
        return objZzj;
    }
}
