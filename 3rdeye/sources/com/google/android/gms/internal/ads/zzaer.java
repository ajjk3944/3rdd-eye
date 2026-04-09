package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzaer implements zzaes {
    private final long zza;
    private final zzaeq zzb;

    public zzaer(long j4, long j10) {
        this.zza = j4;
        zzaet zzaetVar = j10 == 0 ? zzaet.zza : new zzaet(0L, j10);
        this.zzb = new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return false;
    }
}
