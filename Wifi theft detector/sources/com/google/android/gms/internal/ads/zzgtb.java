package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgtb {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        StringBuilder sb = new StringBuilder(string.length() + 26);
        sb.append("null value in entry: ");
        sb.append(string);
        sb.append("=null");
        throw new NullPointerException(sb.toString());
    }

    public static int zzb(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i10).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }
}
