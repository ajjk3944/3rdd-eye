package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbnv implements zzcam {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ zzbog zzc;

    public zzbnv(zzbog zzbogVar, zzbof zzbofVar, zzfhb zzfhbVar) {
        this.zza = zzbofVar;
        this.zzb = zzfhbVar;
        this.zzc = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbog zzbogVar = this.zzc;
        synchronized (zzbogVar.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbogVar.zzi = 0;
                if (zzbogVar.zzh != null && this.zza != zzbogVar.zzh) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbogVar.zzh.zzb();
                }
                zzbogVar.zzh = this.zza;
                if (((Boolean) zzbev.zzd.zze()).booleanValue() && zzbogVar.zze != null) {
                    zzfhp zzfhpVar = zzbogVar.zze;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zzg(true);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
