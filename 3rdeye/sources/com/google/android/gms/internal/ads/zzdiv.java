package com.google.android.gms.internal.ads;

import m0.C5316i;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdiv {
    zzbho zza;
    zzbhl zzb;
    zzbib zzc;
    zzbhy zzd;
    zzbmw zze;
    final C5316i zzf = new C5316i();
    final C5316i zzg = new C5316i();

    public final zzdiv zza(zzbhl zzbhlVar) {
        this.zzb = zzbhlVar;
        return this;
    }

    public final zzdiv zzb(zzbho zzbhoVar) {
        this.zza = zzbhoVar;
        return this;
    }

    public final zzdiv zzc(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) {
        this.zzf.put(str, zzbhuVar);
        if (zzbhrVar != null) {
            this.zzg.put(str, zzbhrVar);
        }
        return this;
    }

    public final zzdiv zzd(zzbmw zzbmwVar) {
        this.zze = zzbmwVar;
        return this;
    }

    public final zzdiv zze(zzbhy zzbhyVar) {
        this.zzd = zzbhyVar;
        return this;
    }

    public final zzdiv zzf(zzbib zzbibVar) {
        this.zzc = zzbibVar;
        return this;
    }

    public final zzdix zzg() {
        return new zzdix(this);
    }
}
