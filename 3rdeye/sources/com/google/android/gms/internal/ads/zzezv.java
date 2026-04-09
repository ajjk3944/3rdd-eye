package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzezv implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzdfy zzd;
    final /* synthetic */ zzezw zze;

    public zzezv(zzezw zzezwVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzdfy zzdfyVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzdfyVar;
        this.zze = zzezwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhm zzfhmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdfy zzdfyVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = zzdfyVar.zza().zza(th);
        zzezw zzezwVar = this.zze;
        synchronized (zzezwVar) {
            try {
                zzezwVar.zzi = null;
                zzdfyVar.zzb().zzdD(zzeVarZza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziu)).booleanValue()) {
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdD(zzeVarZza);
                        }
                    });
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzdD(zzeVarZza);
                        }
                    });
                }
                zzfdl.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzezwVar.zzg;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zza(zzeVarZza);
                    zzfhbVar.zzh(th);
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzc(zzeVarZza);
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
        zzdeu zzdeuVar = (zzdeu) obj;
        zzezw zzezwVar = this.zze;
        synchronized (zzezwVar) {
            try {
                zzezwVar.zzi = null;
                zzbct zzbctVar = zzbdc.zziu;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
                    zzdac zzdacVarZzn = zzdeuVar.zzn();
                    zzdacVarZzn.zza(zzezwVar.zzd);
                    zzdacVarZzn.zzd(zzezwVar.zze);
                }
                this.zza.zzb(zzdeuVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzt();
                        }
                    });
                    zzezwVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezu
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzt();
                        }
                    });
                }
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzezwVar.zzg;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zzb(zzdeuVar.zzp().zzb);
                    zzfhbVar.zzd(zzdeuVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzdeuVar.zzp().zzb);
                    zzfhmVar.zze(zzdeuVar.zzl().zzg());
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
