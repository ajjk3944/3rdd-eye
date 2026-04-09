package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfh implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfh(long j4, long j10, long j11) {
        this.zza = j4;
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfh)) {
            return false;
        }
        zzfh zzfhVar = (zzfh) obj;
        return this.zza == zzfhVar.zza && this.zzb == zzfhVar.zzb && this.zzc == zzfhVar.zzc;
    }

    public final int hashCode() {
        long j4 = this.zza;
        int i = (int) (j4 ^ (j4 >>> 32));
        long j10 = this.zzb;
        return ((((i + 527) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
