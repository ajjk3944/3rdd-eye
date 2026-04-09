package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzas {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzas(String str, String str2, long j4, long j10, long j11, long j12, long j13, Long l5, Long l10, Long l11, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j4 >= 0);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j13 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = l5;
        this.zzi = l10;
        this.zzj = l11;
        this.zzk = bool;
    }

    public final zzas zza(Long l5, Long l10, Boolean bool) {
        return new zzas(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l5, l10, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final zzas zzb(long j4, long j10) {
        return new zzas(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j4, Long.valueOf(j10), this.zzi, this.zzj, this.zzk);
    }

    public final zzas zzc(long j4) {
        return new zzas(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j4, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
