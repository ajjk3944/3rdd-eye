package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class i02 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f28438a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(rz rzVar) throws IOException {
        return a(rzVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(v70 v70Var, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        int i;
        int i10;
        long jB = v70Var.b();
        long j4 = -1;
        int i11 = (jB > (-1L) ? 1 : (jB == (-1L) ? 0 : -1));
        long j10 = 4096;
        if (i11 != 0 && jB <= 4096) {
            j10 = jB;
        }
        int i12 = (int) j10;
        uf1 uf1Var = new uf1(64);
        int i13 = 0;
        int i14 = 0;
        boolean z14 = false;
        while (i14 < i12) {
            uf1Var.c(8);
            if (!v70Var.b(uf1Var.c(), i13, 8, true)) {
                break;
            }
            long jV = uf1Var.v();
            int iH = uf1Var.h();
            if (jV == 1) {
                v70Var.a(uf1Var.c(), 8, 8);
                uf1Var.d(16);
                z13 = i13;
                i = i14;
                i10 = 16;
                jV = uf1Var.p();
            } else {
                if (jV == 0) {
                    long jB2 = v70Var.b();
                    if (jB2 != j4) {
                        jV = (jB2 - v70Var.d()) + 8;
                    }
                }
                z13 = i13;
                i = i14;
                i10 = 8;
            }
            long j11 = i10;
            if (jV < j11) {
                return z13;
            }
            int i15 = i + i10;
            boolean z15 = z13;
            if (iH == 1836019574) {
                i12 += (int) jV;
                if (i11 != 0 && i12 > jB) {
                    i12 = (int) jB;
                }
                i14 = i15;
                i13 = z15 ? 1 : 0;
                j4 = -1;
            } else {
                if (iH == 1836019558 || iH == 1836475768) {
                    z12 = true;
                    break;
                }
                int i16 = i11;
                if ((i15 + jV) - j11 >= i12) {
                    break;
                }
                int i17 = (int) (jV - j11);
                i14 = i15 + i17;
                if (iH == 1718909296) {
                    if (i17 < 8) {
                        return z15;
                    }
                    uf1Var.c(i17);
                    v70Var.a(uf1Var.c(), z15 ? 1 : 0, i17);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 != 1) {
                            int iH2 = uf1Var.h();
                            if ((iH2 >>> 8) != 3368816 && (iH2 != 1751476579 || !z11)) {
                                int[] iArr = f28438a;
                                for (int i20 = 0; i20 < 29; i20++) {
                                    if (iArr[i20] != iH2) {
                                    }
                                }
                            }
                            z14 = true;
                            break;
                        }
                        uf1Var.f(4);
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i17 != 0) {
                    v70Var.b(i17);
                }
                i11 = i16;
                j4 = -1;
                i13 = 0;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean a(v70 v70Var, boolean z10) throws IOException {
        return a(v70Var, false, z10);
    }
}
