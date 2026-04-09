package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzacz implements zzaes {
    private final zzadc zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzacz(zzadc zzadcVar, long j4, long j10, long j11, long j12, long j13, long j14) {
        this.zza = zzadcVar;
        this.zzb = j4;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = j14;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j4) {
        return this.zza.zza(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        zzaet zzaetVar = new zzaet(j4, zzadb.zzf(this.zza.zza(j4), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
