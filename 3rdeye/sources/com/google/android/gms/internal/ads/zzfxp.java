package com.google.android.gms.internal.ads;

import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfxp {
    public static int zza(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iZzb = zzfxx.zzb(obj);
        int i12 = iZzb & i;
        int iZzc = zzc(obj3, i12);
        if (iZzc != 0) {
            int i13 = ~i;
            int i14 = iZzb & i13;
            int i15 = -1;
            while (true) {
                i10 = iZzc - 1;
                int i16 = iArr[i10];
                i11 = i16 & i;
                if ((i16 & i13) != i14 || !zzfvb.zza(obj, objArr[i10]) || (objArr2 != null && !zzfvb.zza(obj2, objArr2[i10]))) {
                    if (i11 == 0) {
                        break;
                    }
                    i15 = i10;
                    iZzc = i11;
                } else {
                    break;
                }
            }
            if (i15 == -1) {
                zze(obj3, i12, i11);
                return i10;
            }
            iArr[i15] = (iArr[i15] & i13) | (i11 & i);
            return i10;
        }
        return -1;
    }

    public static int zzc(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(C4356c.h(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void zze(Object obj, int i, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }
}
