package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzafx implements zzafy {
    private final long zza;
    private final zzafw zzb;

    public zzafx(long j10, long j11) {
        this.zza = j10;
        zzafz zzafzVar = j11 == 0 ? zzafz.zza : new zzafz(0L, j11);
        this.zzb = new zzafw(zzafzVar, zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        return this.zzb;
    }
}
