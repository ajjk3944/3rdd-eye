package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcqn {
    private final zzcyo zza;
    private final zzdau zzb;

    public zzcqn(zzcyo zzcyoVar, zzdau zzdauVar) {
        this.zza = zzcyoVar;
        this.zzb = zzdauVar;
    }

    public final zzcyo zza() {
        return this.zza;
    }

    public final zzdau zzb() {
        return this.zzb;
    }

    public final zzddo zzc() {
        zzdau zzdauVar = this.zzb;
        return zzdauVar != null ? new zzddo(zzdauVar, zzcad.zzg) : new zzddo(new zzcqm(this), zzcad.zzg);
    }
}
