package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ub0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rb0 {
    public static ub0.a a(uf1 uf1Var) {
        uf1Var.f(1);
        int iW = uf1Var.w();
        long jD = uf1Var.d() + iW;
        int i = iW / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                break;
            }
            long jP = uf1Var.p();
            if (jP == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jP;
            jArrCopyOf2[i10] = uf1Var.p();
            uf1Var.f(2);
            i10++;
        }
        uf1Var.f((int) (jD - uf1Var.d()));
        return new ub0.a(jArrCopyOf, jArrCopyOf2);
    }
}
