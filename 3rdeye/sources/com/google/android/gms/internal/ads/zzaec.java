package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaec implements zzaes {
    private final zzaee zza;
    private final long zzb;

    public zzaec(zzaee zzaeeVar, long j4) {
        this.zza = zzaeeVar;
        this.zzb = j4;
    }

    private final zzaet zzb(long j4, long j10) {
        return new zzaet((j4 * 1000000) / this.zza.zze, this.zzb + j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        zzaee zzaeeVar = this.zza;
        zzaed zzaedVar = zzaeeVar.zzk;
        zzdd.zzb(zzaedVar);
        long[] jArr = zzaedVar.zza;
        long[] jArr2 = zzaedVar.zzb;
        int iZzd = zzex.zzd(jArr, zzaeeVar.zzb(j4), true, false);
        zzaet zzaetVarZzb = zzb(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzaetVarZzb.zzb == j4 || iZzd == jArr.length - 1) {
            return new zzaeq(zzaetVarZzb, zzaetVarZzb);
        }
        int i = iZzd + 1;
        return new zzaeq(zzaetVarZzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
