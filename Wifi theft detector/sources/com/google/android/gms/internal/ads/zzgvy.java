package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvy {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zzb(objArr[i11], i11);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 9);
        sb.append("at index ");
        sb.append(i10);
        throw new NullPointerException(sb.toString());
    }
}
