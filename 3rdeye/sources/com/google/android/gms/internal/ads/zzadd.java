package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadd {
    public static final zzadd zza = new zzadd(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzadd(int i, long j4, long j10) {
        this.zzb = i;
        this.zzc = j4;
        this.zzd = j10;
    }

    public static zzadd zzd(long j4, long j10) {
        return new zzadd(-1, j4, j10);
    }

    public static zzadd zze(long j4) {
        return new zzadd(0, -9223372036854775807L, j4);
    }

    public static zzadd zzf(long j4, long j10) {
        return new zzadd(-2, j4, j10);
    }
}
