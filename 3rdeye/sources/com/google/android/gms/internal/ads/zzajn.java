package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzajn {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzz zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzajo[] zzl;

    public zzajn(int i, int i10, long j4, long j10, long j11, long j12, zzz zzzVar, int i11, zzajo[] zzajoVarArr, int i12, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = zzzVar;
        this.zzh = i11;
        this.zzl = zzajoVarArr;
        this.zzk = i12;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzajn zza(zzz zzzVar) {
        return new zzajn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzzVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    public final zzajo zzb(int i) {
        return this.zzl[i];
    }
}
