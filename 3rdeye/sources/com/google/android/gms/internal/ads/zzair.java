package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzair implements zzaio {
    private final int zza;
    private final int zzb;
    private final zzen zzc;

    public zzair(zzfd zzfdVar, zzz zzzVar) {
        zzen zzenVar = zzfdVar.zza;
        this.zzc = zzenVar;
        zzenVar.zzL(12);
        int iZzp = zzenVar.zzp();
        if ("audio/raw".equals(zzzVar.zzo)) {
            int iZzk = zzex.zzk(zzzVar.zzI) * zzzVar.zzG;
            if (iZzp == 0 || iZzp % iZzk != 0) {
                zzea.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iZzk + ", stsz sample size: " + iZzp);
                iZzp = iZzk;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
        this.zzb = zzenVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
