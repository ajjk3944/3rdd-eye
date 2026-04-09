package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzelm implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzdgu zzd;
    final /* synthetic */ zzeln zze;

    public zzelm(zzeln zzelnVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzdgu zzdguVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzdguVar;
        this.zze = zzelnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhm zzfhmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdgu zzdguVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = zzdguVar.zza().zza(th);
        zzdguVar.zzb().zzdD(zzeVarZza);
        zzeln zzelnVar = this.zze;
        zzelnVar.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdD(zzeVarZza);
            }
        });
        zzfdl.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
            zzfhp zzfhpVar = zzelnVar.zze;
            zzfhb zzfhbVar = this.zzc;
            zzfhbVar.zza(zzeVarZza);
            zzfhbVar.zzh(th);
            zzfhbVar.zzg(false);
            zzfhpVar.zzc(zzfhbVar.zzm());
            return;
        }
        zzfhmVar.zzc(zzeVarZza);
        zzfhb zzfhbVar2 = this.zzc;
        zzfhbVar2.zzh(th);
        zzfhbVar2.zzg(false);
        zzfhmVar.zza(zzfhbVar2);
        zzfhmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhm zzfhmVar;
        zzeln zzelnVar = this.zze;
        zzcqv zzcqvVar = (zzcqv) obj;
        synchronized (zzelnVar) {
            try {
                zzcqvVar.zzn().zza(zzelnVar.zzd.zzd());
                this.zza.zzb(zzcqvVar);
                zzelnVar.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzb().zzt();
                    }
                });
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzelnVar.zze;
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
