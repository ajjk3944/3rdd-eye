package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzadi implements zzaes {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzadi(long j4, long j10, int i, int i10, boolean z10) {
        long jZzc;
        this.zza = j4;
        this.zzb = j10;
        this.zzc = i10 == -1 ? 1 : i10;
        this.zze = i;
        if (j4 == -1) {
            this.zzd = -1L;
            jZzc = -9223372036854775807L;
        } else {
            this.zzd = j4 - j10;
            jZzc = zzc(j4, j10, i);
        }
        this.zzf = jZzc;
    }

    private static long zzc(long j4, long j10, int i) {
        return (Math.max(0L, j4 - j10) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j4) {
        return zzc(j4, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        long j10 = this.zzd;
        if (j10 == -1) {
            zzaet zzaetVar = new zzaet(0L, this.zzb);
            return new zzaeq(zzaetVar, zzaetVar);
        }
        long j11 = this.zzc;
        long jMin = (((this.zze * j4) / 8000000) / j11) * j11;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j11);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        zzaet zzaetVar2 = new zzaet(jZzb, jMax);
        if (j10 != -1 && jZzb < j4) {
            long j12 = jMax + j11;
            if (j12 < this.zza) {
                return new zzaeq(zzaetVar2, new zzaet(zzb(j12), j12));
            }
        }
        return new zzaeq(zzaetVar2, zzaetVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
