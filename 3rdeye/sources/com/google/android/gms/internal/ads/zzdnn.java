package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdnn {
    private final zzcvp zza;
    private final zzcwy zzb;
    private final zzcxl zzc;
    private final zzcxx zzd;
    private final zzdas zze;
    private final zzfbt zzf;
    private final zzfbw zzg;
    private final zzcml zzh;

    public zzdnn(zzcvp zzcvpVar, zzcwy zzcwyVar, zzcxl zzcxlVar, zzcxx zzcxxVar, zzdas zzdasVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzcml zzcmlVar) {
        this.zza = zzcvpVar;
        this.zzb = zzcwyVar;
        this.zzc = zzcxlVar;
        this.zzd = zzcxxVar;
        this.zze = zzdasVar;
        this.zzf = zzfbtVar;
        this.zzg = zzfbwVar;
        this.zzh = zzcmlVar;
    }

    public final void zza(zzdnr zzdnrVar) {
        final zzcwy zzcwyVar = this.zzb;
        zzdne zzdneVar = zzdnrVar.zza;
        Objects.requireNonNull(zzcwyVar);
        zzdneVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdnm
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final void zzg() {
                zzcwyVar.zzb();
            }
        });
        zzdnrVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
