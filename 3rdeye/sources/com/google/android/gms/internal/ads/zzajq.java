package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzajq {
    public final zzajn zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzajq(zzajn zzajnVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j4) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        int length3 = jArr.length;
        zzdd.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdd.zzd(length4 == length2);
        this.zza = zzajnVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j4;
        this.zzb = length3;
        if (length4 > 0) {
            int i10 = length4 - 1;
            iArr2[i10] = iArr2[i10] | 536870912;
        }
    }

    public final int zza(long j4) {
        for (int iZzd = zzex.zzd(this.zzf, j4, true, false); iZzd >= 0; iZzd--) {
            if ((this.zzg[iZzd] & 1) != 0) {
                return iZzd;
            }
        }
        return -1;
    }

    public final int zzb(long j4) {
        long[] jArr = this.zzf;
        for (int iZza = zzex.zza(jArr, j4, true, false); iZza < jArr.length; iZza++) {
            if ((this.zzg[iZza] & 1) != 0) {
                return iZza;
            }
        }
        return -1;
    }
}
