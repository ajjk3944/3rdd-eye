package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzahk implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzahk(long j4, long j10, long j11, long j12, long j13) {
        this.zza = j4;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahk.class == obj.getClass()) {
            zzahk zzahkVar = (zzahk) obj;
            if (this.zza == zzahkVar.zza && this.zzb == zzahkVar.zzb && this.zzc == zzahkVar.zzc && this.zzd == zzahkVar.zzd && this.zze == zzahkVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.zza;
        int i = (int) (j4 ^ (j4 >>> 32));
        long j10 = this.zze;
        long j11 = this.zzd;
        long j12 = this.zzc;
        long j13 = this.zzb;
        return ((((((((i + 527) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
