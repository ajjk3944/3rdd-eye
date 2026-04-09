package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaox implements zzaes {
    private final zzaou zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaox(zzaou zzaouVar, int i, long j4, long j10) {
        this.zza = zzaouVar;
        this.zzb = i;
        this.zzc = j4;
        long j11 = (j10 - j4) / zzaouVar.zzd;
        this.zzd = j11;
        this.zze = zzb(j11);
    }

    private final long zzb(long j4) {
        return zzex.zzu(j4 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        long j10 = this.zzb;
        zzaou zzaouVar = this.zza;
        long j11 = (zzaouVar.zzc * j4) / (j10 * 1000000);
        String str = zzex.zza;
        long j12 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = zzaouVar.zzd;
        long jZzb = zzb(jMax);
        long j14 = this.zzc;
        zzaet zzaetVar = new zzaet(jZzb, (jMax * j13) + j14);
        if (jZzb >= j4 || jMax == j12) {
            return new zzaeq(zzaetVar, zzaetVar);
        }
        long j15 = jMax + 1;
        return new zzaeq(zzaetVar, new zzaet(zzb(j15), (j13 * j15) + j14));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
