package com.google.common.math;

/* loaded from: classes2.dex */
public abstract class c {
    public static void a(boolean z10, String str, int i10, int i11) {
        if (z10) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
}
