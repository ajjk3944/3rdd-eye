package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzwr implements zzzg {
    public long zza;
    public long zzb;
    public zzzf zzc;
    public zzwr zzd;

    public zzwr(long j4, int i) {
        zze(j4, 65536);
    }

    public final int zza(long j4) {
        long j10 = j4 - this.zza;
        int i = this.zzc.zzb;
        return (int) j10;
    }

    public final zzwr zzb() {
        this.zzc = null;
        zzwr zzwrVar = this.zzd;
        this.zzd = null;
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final zzzf zzc() {
        zzzf zzzfVar = this.zzc;
        zzzfVar.getClass();
        return zzzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final zzzg zzd() {
        zzwr zzwrVar = this.zzd;
        if (zzwrVar == null || zzwrVar.zzc == null) {
            return null;
        }
        return zzwrVar;
    }

    public final void zze(long j4, int i) {
        zzdd.zzf(this.zzc == null);
        this.zza = j4;
        this.zzb = j4 + 65536;
    }
}
