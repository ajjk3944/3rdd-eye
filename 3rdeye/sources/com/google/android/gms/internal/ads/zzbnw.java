package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbnw implements zzcak {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzfhb zzb;
    final /* synthetic */ zzbog zzc;

    public zzbnw(zzbog zzbogVar, zzbof zzbofVar, zzfhb zzfhbVar) {
        this.zza = zzbofVar;
        this.zzb = zzfhbVar;
        this.zzc = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbog zzbogVar = this.zzc;
        synchronized (zzbogVar.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbogVar.zzi = 1;
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbev.zzd.zze()).booleanValue() && zzbogVar.zze != null) {
                    zzfhp zzfhpVar = zzbogVar.zze;
                    zzfhb zzfhbVar = this.zzb;
                    zzfhbVar.zzc("Failed loading new engine");
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
