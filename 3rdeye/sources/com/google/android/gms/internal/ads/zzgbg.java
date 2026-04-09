package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgbg implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgbg(int[] iArr, int i, int i10) {
        this.zza = iArr;
        this.zzb = i10;
    }

    public static zzgbg zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgbg(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbg)) {
            return false;
        }
        zzgbg zzgbgVar = (zzgbg) obj;
        int i = this.zzb;
        if (i != zzgbgVar.zzb) {
            return false;
        }
        for (int i10 = 0; i10 < i; i10++) {
            if (zza(i10) != zzgbgVar.zza(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            i = (i * 31) + this.zza[i10];
        }
        return i;
    }

    public final String toString() {
        int i = this.zzb;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[0]);
        for (int i10 = 1; i10 < i; i10++) {
            sb.append(", ");
            sb.append(iArr[i10]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zza(int i) {
        zzfve.zza(i, this.zzb, "index");
        return this.zza[i];
    }
}
