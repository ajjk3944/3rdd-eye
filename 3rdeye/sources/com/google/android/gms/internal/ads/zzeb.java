package com.google.android.gms.internal.ads;

import N7.H7;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeb {
    private int zza;
    private long[] zzb;

    public zzeb() {
        throw null;
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i) {
        if (i < 0 || i >= this.zza) {
            throw new IndexOutOfBoundsException(H7.n(i, this.zza, "Invalid index ", ", size is "));
        }
        return this.zzb[i];
    }

    public final void zzc(long j4) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i10 = this.zza;
        this.zza = i10 + 1;
        jArr2[i10] = j4;
    }

    public final void zzd(long[] jArr) {
        int i = this.zza;
        int length = jArr.length;
        int i10 = i + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i10));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i10;
    }

    public zzeb(int i) {
        this.zzb = new long[i];
    }
}
