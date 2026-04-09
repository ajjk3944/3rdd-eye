package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzagk extends zzaef {
    private final long zza;

    public zzagk(zzadu zzaduVar, long j4) {
        super(zzaduVar);
        zzdd.zzd(zzaduVar.zzf() >= j4);
        this.zza = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzadu
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzadu
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzadu
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
