package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcri implements zzgcx {
    final /* synthetic */ zzgcx zza;
    final /* synthetic */ zzcrk zzb;

    public zzcri(zzcrk zzcrkVar, zzgcx zzgcxVar) {
        this.zza = zzgcxVar;
        this.zzb = zzcrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcre
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd = false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrk.zzc(this.zzb, ((zzcrd) obj).zza, this.zza);
    }
}
