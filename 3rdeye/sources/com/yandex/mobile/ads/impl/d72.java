package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class d72 {
    public static long a(int i, int i10, uf1 uf1Var) {
        uf1Var.e(i);
        if (uf1Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iH = uf1Var.h();
        if ((8388608 & iH) != 0 || ((2096896 & iH) >> 8) != i10 || (iH & 32) == 0 || uf1Var.t() < 7 || uf1Var.a() < 7 || (uf1Var.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        uf1Var.a(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }
}
