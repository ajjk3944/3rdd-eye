package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadb {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzadb(long j4, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = j4;
        this.zzb = j10;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzc = j15;
        this.zzh = zzf(j10, 0L, j12, j13, j14, j15);
    }

    public static long zzf(long j4, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (long) (((j13 - j12) / (j11 - j10)) * (j4 - j10));
        String str = zzex.zza;
        return Math.max(j12, Math.min(((j12 + j15) - j14) - (j15 / 20), j13 - 1));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzadb zzadbVar, long j4, long j10) {
        zzadbVar.zze = j4;
        zzadbVar.zzg = j10;
        zzadbVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzadb zzadbVar, long j4, long j10) {
        zzadbVar.zzd = j4;
        zzadbVar.zzf = j10;
        zzadbVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
