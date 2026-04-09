package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfbd implements zzgcx {
    final /* synthetic */ zzelf zza;
    final /* synthetic */ zzfhm zzb;
    final /* synthetic */ zzfhb zzc;
    final /* synthetic */ zzfbe zzd;
    final /* synthetic */ zzfbg zze;

    public zzfbd(zzfbg zzfbgVar, zzelf zzelfVar, zzfhm zzfhmVar, zzfhb zzfhbVar, zzfbe zzfbeVar) {
        this.zza = zzelfVar;
        this.zzb = zzfhmVar;
        this.zzc = zzfhbVar;
        this.zzd = zzfbeVar;
        this.zze = zzfbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhm zzfhmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfbg zzfbgVar = this.zze;
        zzdol zzdolVar = (zzdol) zzfbgVar.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdolVar == null ? zzfdp.zzb(th, null) : zzdolVar.zzb().zza(th);
        synchronized (zzfbgVar) {
            try {
                if (zzdolVar != null) {
                    zzdolVar.zza().zzdD(zzeVarZzb);
                    zzfbgVar.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdD(zzeVarZzb);
                        }
                    });
                } else {
                    zzfbgVar.zzd.zzdD(zzeVarZzb);
                    zzfbgVar.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                zzfdl.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzfbgVar.zzg;
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
        zzfbg zzfbgVar = this.zze;
        zzdog zzdogVar = (zzdog) obj;
        synchronized (zzfbgVar) {
            try {
                zzdogVar.zzn().zzd(zzfbgVar.zzd);
                this.zza.zzb(zzdogVar);
                Executor executor = zzfbgVar.zzb;
                final zzfaw zzfawVar = zzfbgVar.zzd;
                Objects.requireNonNull(zzfawVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfawVar.zzt();
                    }
                });
                zzfbgVar.zzd.onAdMetadataChanged();
                if (!((Boolean) zzbev.zzc.zze()).booleanValue() || (zzfhmVar = this.zzb) == null) {
                    zzfhp zzfhpVar = zzfbgVar.zzg;
                    zzfhb zzfhbVar = this.zzc;
                    zzfhbVar.zzb(zzdogVar.zzp().zzb);
                    zzfhbVar.zzd(zzdogVar.zzl().zzg());
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                } else {
                    zzfhmVar.zzg(zzdogVar.zzp().zzb);
                    zzfhmVar.zze(zzdogVar.zzl().zzg());
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
