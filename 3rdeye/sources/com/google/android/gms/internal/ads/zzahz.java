package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzahz extends zzadi implements zzaie {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahz(long j4, long j10, int i, int i10, boolean z10) {
        super(j4, j10, i, i10, false);
        this.zza = j10;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = j4 != -1 ? j4 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j4) {
        return zzb(j4);
    }

    public final zzahz zzf(long j4) {
        return new zzahz(j4, this.zza, this.zzb, this.zzc, false);
    }
}
