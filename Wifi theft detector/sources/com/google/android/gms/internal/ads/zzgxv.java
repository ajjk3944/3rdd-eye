package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgxv {
    public static long zza(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j10);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zzb(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
