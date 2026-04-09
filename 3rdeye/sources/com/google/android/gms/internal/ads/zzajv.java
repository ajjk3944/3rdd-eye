package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzajv implements zzaka {
    private final zzaee zza;
    private final zzaed zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajv(zzaee zzaeeVar, zzaed zzaedVar) {
        this.zza = zzaeeVar;
        this.zzb = zzaedVar;
    }

    public final void zza(long j4) {
        this.zzc = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final long zzd(zzadu zzaduVar) {
        long j4 = this.zzd;
        if (j4 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j4 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final zzaes zze() {
        zzdd.zzf(this.zzc != -1);
        return new zzaec(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzg(long j4) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzex.zzd(jArr, j4, true, true)];
    }
}
