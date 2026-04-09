package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeos implements zzetu {
    private final zzgdm zza;
    private final zzdpx zzb;
    private final String zzc;
    private final zzfco zzd;

    public zzeos(zzgdm zzgdmVar, zzdpx zzdpxVar, zzfco zzfcoVar, String str) {
        this.zza = zzgdmVar;
        this.zzb = zzdpxVar;
        this.zzd = zzfcoVar;
        this.zzc = str;
    }

    public static /* synthetic */ zzeot zzc(zzeos zzeosVar) {
        zzfco zzfcoVar = zzeosVar.zzd;
        zzdpx zzdpxVar = zzeosVar.zzb;
        return new zzeot(zzdpxVar.zzb(zzfcoVar.zzf, zzeosVar.zzc), zzdpxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeos.zzc(this.zza);
            }
        });
    }
}
