package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzec {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzec() {
        throw null;
    }

    public final long zza() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i = this.zzc;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i10 = this.zza;
        long j4 = jArr[i10];
        this.zza = this.zze & (i10 + 1);
        this.zzc = i - 1;
        return j4;
    }

    public final void zzc(long j4) {
        int i = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i == length) {
            int i10 = length + length;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i10];
            int i11 = this.zza;
            int i12 = length - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy(this.zzd, 0, jArr2, i12, i11);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i13 = (this.zzb + 1) & this.zze;
        this.zzb = i13;
        jArr[i13] = j4;
        this.zzc++;
    }

    public final void zzd() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public final boolean zze() {
        return this.zzc == 0;
    }

    public zzec(int i) {
        int i10 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i10];
        this.zze = r3.length - 1;
    }
}
