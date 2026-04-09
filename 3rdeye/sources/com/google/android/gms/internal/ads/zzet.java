package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzet {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzet() {
        throw null;
    }

    private final Object zzf() {
        zzdd.zzf(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i = this.zzc;
        Object obj = objArr[i];
        objArr[i] = null;
        this.zzc = (i + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized int zza() {
        return this.zzd;
    }

    public final synchronized Object zzb() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zzc(long j4) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j4 - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public final synchronized void zzd(long j4, Object obj) {
        try {
            if (this.zzd > 0) {
                if (j4 <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                    zze();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i10 = this.zzc;
                int i11 = length - i10;
                System.arraycopy(this.zza, i10, jArr, 0, i11);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i11);
                int i12 = this.zzc;
                if (i12 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i11, i12);
                    System.arraycopy(this.zzb, 0, objArr, i11, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i13 = this.zzc;
            int i14 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i13 + i14) % objArr2.length;
            this.zza[length2] = j4;
            objArr2[length2] = obj;
            this.zzd = i14 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zze() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public zzet(int i) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
