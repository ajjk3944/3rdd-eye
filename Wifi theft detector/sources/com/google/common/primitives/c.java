package com.google.common.primitives;

import org.xbill.DNS.TTL;

/* loaded from: classes2.dex */
public abstract class c extends d {
    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int b(int i10, int i11, int i12) {
        com.google.common.base.g.g(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int c(int i10) {
        return i10;
    }

    public static int d(long j10) {
        if (j10 > TTL.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
