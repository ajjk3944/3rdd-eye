package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzdoq {
    zzblt zza;
    zzblq zzb;
    zzbmg zzc;
    zzbmd zzd;
    zzbrb zze;
    final r.k zzf = new r.k();
    final r.k zzg = new r.k();

    public final zzdoq zza(zzblt zzbltVar) {
        this.zza = zzbltVar;
        return this;
    }

    public final zzdoq zzb(zzblq zzblqVar) {
        this.zzb = zzblqVar;
        return this;
    }

    public final zzdoq zzc(zzbmg zzbmgVar) {
        this.zzc = zzbmgVar;
        return this;
    }

    public final zzdoq zzd(zzbmd zzbmdVar) {
        this.zzd = zzbmdVar;
        return this;
    }

    public final zzdoq zze(zzbrb zzbrbVar) {
        this.zze = zzbrbVar;
        return this;
    }

    public final zzdoq zzf(String str, zzblz zzblzVar, @Nullable zzblw zzblwVar) {
        this.zzf.put(str, zzblzVar);
        if (zzblwVar != null) {
            this.zzg.put(str, zzblwVar);
        }
        return this;
    }

    public final zzdor zzg() {
        return new zzdor(this, null);
    }
}
