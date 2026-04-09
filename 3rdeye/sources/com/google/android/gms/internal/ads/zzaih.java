package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaih implements zzaie {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaih(long j4, int i, long j10, int i10, long j11, long[] jArr) {
        this.zza = j4;
        this.zzb = i;
        this.zzc = j10;
        this.zzd = i10;
        this.zze = j11;
        this.zzg = jArr;
        this.zzf = j11 != -1 ? j4 + j11 : -1L;
    }

    public static zzaih zzb(zzaig zzaigVar, long j4) {
        long jZza = zzaigVar.zza();
        if (jZza == -9223372036854775807L) {
            return null;
        }
        zzael zzaelVar = zzaigVar.zza;
        return new zzaih(j4, zzaelVar.zzc, jZza, zzaelVar.zzf, zzaigVar.zzc, zzaigVar.zzf);
    }

    private final long zzf(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j4) {
        if (!zzh()) {
            return 0L;
        }
        long j10 = j4 - this.zza;
        if (j10 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzdd.zzb(jArr);
        double d10 = (j10 * 256.0d) / this.zze;
        int iZzd = zzex.zzd(jArr, (long) d10, true, true);
        long jZzf = zzf(iZzd);
        long j11 = jArr[iZzd];
        int i = iZzd + 1;
        long jZzf2 = zzf(i);
        return Math.round((j11 == (iZzd == 99 ? 256L : jArr[i]) ? 0.0d : (d10 - j11) / (r0 - j11)) * (jZzf2 - jZzf)) + jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        if (!zzh()) {
            zzaet zzaetVar = new zzaet(0L, this.zza + this.zzb);
            return new zzaeq(zzaetVar, zzaetVar);
        }
        long j10 = this.zzc;
        String str = zzex.zza;
        long jMax = Math.max(0L, Math.min(j4, j10));
        double d10 = (jMax * 100.0d) / j10;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i = (int) d10;
                long[] jArr = this.zzg;
                zzdd.zzb(jArr);
                double d12 = jArr[i];
                d11 = (((i == 99 ? 256.0d : jArr[i + 1]) - d12) * (d10 - i)) + d12;
            }
        }
        long j11 = this.zze;
        zzaet zzaetVar2 = new zzaet(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j11), j11 - 1)));
        return new zzaeq(zzaetVar2, zzaetVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return this.zzg != null;
    }
}
