package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaib implements zzaie {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaib(long[] jArr, long[] jArr2, long j4) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j4 == -9223372036854775807L ? zzex.zzs(jArr2[jArr2.length - 1]) : j4;
    }

    public static zzaib zzb(long j4, zzahg zzahgVar, long j10) {
        int length = zzahgVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j4;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j4 += zzahgVar.zzb + r0[i11];
            j11 += zzahgVar.zzc + zzahgVar.zze[i11];
            jArr[i10] = j4;
            jArr2[i10] = j11;
        }
        return new zzaib(jArr, jArr2, j10);
    }

    private static Pair zzf(long j4, long[] jArr, long[] jArr2) {
        int iZzd = zzex.zzd(jArr, j4, true, true);
        long j10 = jArr[iZzd];
        long j11 = jArr2[iZzd];
        int i = iZzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr[i] == j10 ? 0.0d : (j4 - j10) / (r6 - j10)) * (jArr2[i] - j11))) + j11));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j4) {
        return zzex.zzs(((Long) zzf(j4, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        String str = zzex.zza;
        Pair pairZzf = zzf(zzex.zzv(Math.max(0L, Math.min(j4, this.zzc))), this.zzb, this.zza);
        zzaet zzaetVar = new zzaet(zzex.zzs(((Long) pairZzf.first).longValue()), ((Long) pairZzf.second).longValue());
        return new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
