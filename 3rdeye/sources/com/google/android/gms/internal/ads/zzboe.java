package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzboe implements zzcam {
    final /* synthetic */ zzbof zza;

    public zzboe(zzbof zzbofVar) {
        this.zza = zzbofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbnb zzbnbVar = (zzbnb) obj;
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbod
            @Override // java.lang.Runnable
            public final void run() {
                zzbnb zzbnbVar2 = zzbnbVar;
                zzbnbVar2.zzr("/result", zzbkc.zzo);
                zzbnbVar2.zzc();
            }
        });
    }
}
