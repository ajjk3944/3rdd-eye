package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeye implements zzgcx {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ zzcps zzc;
    final /* synthetic */ zzeyf zzd;

    public zzeye(zzeyf zzeyfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzcps zzcpsVar) {
        this.zza = zzfhmVar;
        this.zzb = zzfhbVar;
        this.zzc = zzcpsVar;
        this.zzd = zzeyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhm zzfhmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzeyf zzeyfVar = this.zzd;
        synchronized (zzeyfVar) {
            try {
                zzcps zzcpsVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzeVarZza = zzcpsVar.zzc().zza(th);
                zzeyfVar.zzn = zzeVarZza;
                zzcpsVar.zze().zzdD(zzeVarZza);
                zzfdl.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
                if (zzeyfVar.zzm) {
                    zzeyfVar.zzt();
                    zzeyfVar.zzh.zzd(zzeyfVar.zzj.zzc());
                }
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zza) == null) {
                    zzfhp zzfhpVar = zzeyfVar.zzi;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zza(zzeVarZza);
                    zzfhbVar.zzh(th);
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzc(zzeVarZza);
                    zzfhb zzfhbVar2 = this.zzb;
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
        zzeyf zzeyfVar = this.zzd;
        zzcon zzconVar = (zzcon) obj;
        synchronized (zzeyfVar) {
            try {
                if (zzeyfVar.zzm) {
                    zzeyfVar.zzq();
                }
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zza) == null) {
                    zzfhp zzfhpVar = zzeyfVar.zzi;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zzb(zzconVar.zzp().zzb);
                    zzfhbVar.zzd(zzconVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzconVar.zzp().zzb);
                    zzfhmVar.zze(zzconVar.zzl().zzg());
                    zzfhb zzfhbVar2 = this.zzb;
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
