package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzlx extends zzuv {
    private final zzbk zzc;

    public zzlx(zzly zzlyVar, zzbl zzblVar) {
        super(zzblVar);
        this.zzc = new zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i, zzbj zzbjVar, boolean z10) {
        zzbl zzblVar = this.zzb;
        zzbj zzbjVarZzd = zzblVar.zzd(i, zzbjVar, z10);
        if (zzblVar.zze(zzbjVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbjVarZzd.zzi(zzbjVar.zza, zzbjVar.zzb, zzbjVar.zzc, zzbjVar.zzd, 0L, zzb.zza, true);
            return zzbjVarZzd;
        }
        zzbjVarZzd.zzf = true;
        return zzbjVarZzd;
    }
}
