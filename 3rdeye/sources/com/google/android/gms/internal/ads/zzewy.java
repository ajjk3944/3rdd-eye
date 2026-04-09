package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzewy implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzewz zzd;
    final /* synthetic */ zzexb zze;

    public zzewy(zzexb zzexbVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzewz zzewzVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzewzVar;
        this.zze = zzexbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhm zzfhmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzexb zzexbVar = this.zze;
        zzcnx zzcnxVar = (zzcnx) zzexbVar.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcnxVar == null ? zzfdp.zzb(th, null) : zzcnxVar.zzb().zza(th);
        synchronized (zzexbVar) {
            try {
                zzexbVar.zzj = null;
                if (zzcnxVar != null) {
                    zzcnxVar.zzc().zzdD(zzeVarZzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzit)).booleanValue()) {
                        zzexbVar.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewx
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zze.zzd.zzdD(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    zzexbVar.zzd.zzdD(zzeVarZzb);
                    ((zzcnx) zzexbVar.zzm(this.zzd).zzh()).zzb().zzc().zzh();
                }
                zzfdl.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzexbVar.zzh;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zza(zzeVarZzb);
                    zzfhbVar.zzh(th);
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzc(zzeVarZzb);
                    zzfhb zzfhbVar2 = this.zzc;
                    zzfhbVar2.zzh(th);
                    zzfhbVar2.zzg(false);
                    zzfhmVar.zza(zzfhbVar2);
                    zzfhmVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhm zzfhmVar;
        zzcqv zzcqvVar = (zzcqv) obj;
        zzexb zzexbVar = this.zze;
        synchronized (zzexbVar) {
            try {
                zzexbVar.zzj = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzit)).booleanValue()) {
                    zzcqvVar.zzn().zzb(zzexbVar.zzd);
                }
                this.zza.zzb(zzcqvVar);
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzexbVar.zzh;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zzb(zzcqvVar.zzp().zzb);
                    zzfhbVar.zzd(zzcqvVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzcqvVar.zzp().zzb);
                    zzfhmVar.zze(zzcqvVar.zzl().zzg());
                    zzfhb zzfhbVar2 = this.zzc;
                    zzfhbVar2.zzg(true);
                    zzfhmVar.zza(zzfhbVar2);
                    zzfhmVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
