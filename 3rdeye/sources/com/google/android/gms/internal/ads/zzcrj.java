package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcrj implements zzgcx {
    final /* synthetic */ zzgcx zza;
    final /* synthetic */ zzcrk zzb;

    public zzcrj(zzcrk zzcrkVar, zzgcx zzgcxVar) {
        this.zza = zzgcxVar;
        this.zzb = zzcrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcre
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd = false;
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcre
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd = false;
            }
        });
        this.zza.zzb((zzcqv) obj);
    }
}
