package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeld {
    private final zzdix zza;
    private final zzekq zzb;
    private final zzcvu zzc;

    public zzeld(zzdix zzdixVar, zzdsc zzdscVar) {
        this.zza = zzdixVar;
        final zzekq zzekqVar = new zzekq(zzdscVar);
        this.zzb = zzekqVar;
        final zzbmw zzbmwVarZzg = zzdixVar.zzg();
        this.zzc = new zzcvu() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzcvu
            public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzekqVar.zzdD(zzeVar);
                zzbmw zzbmwVar = zzbmwVarZzg;
                if (zzbmwVar != null) {
                    try {
                        zzbmwVar.zzf(zzeVar);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
                if (zzbmwVar != null) {
                    try {
                        zzbmwVar.zze(zzeVar.zza);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final zzcvu zza() {
        return this.zzc;
    }

    public final zzcxf zzb() {
        return this.zzb;
    }

    public final zzdgp zzc() {
        return new zzdgp(this.zza, this.zzb.zzg());
    }

    public final zzekq zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzb.zzj(zzbkVar);
    }
}
