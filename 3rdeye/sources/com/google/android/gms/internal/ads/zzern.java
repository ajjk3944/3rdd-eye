package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzern implements zzetu {
    private final zzgdm zza;
    private final zzdvb zzb;

    public zzern(zzgdm zzgdmVar, zzdvb zzdvbVar) {
        this.zza = zzgdmVar;
        this.zzb = zzdvbVar;
    }

    public static /* synthetic */ zzero zzc(zzern zzernVar) {
        zzdvb zzdvbVar = zzernVar.zzb;
        return new zzero(zzdvbVar.zzc(), zzdvbVar.zzr(), com.google.android.gms.ads.internal.zzv.zzu().zzl(), zzdvbVar.zzp(), zzdvbVar.zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzern.zzc(this.zza);
            }
        });
    }
}
