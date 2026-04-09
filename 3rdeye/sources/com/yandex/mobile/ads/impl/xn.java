package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xn {
    public static void a(long j4, uf1 uf1Var, n52[] n52VarArr) {
        int i;
        while (true) {
            if (uf1Var.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (uf1Var.a() == 0) {
                    i = -1;
                    break;
                }
                int iT = uf1Var.t();
                i10 += iT;
                if (iT != 255) {
                    i = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (uf1Var.a() == 0) {
                    i11 = -1;
                    break;
                }
                int iT2 = uf1Var.t();
                i11 += iT2;
                if (iT2 != 255) {
                    break;
                }
            }
            int iD = uf1Var.d() + i11;
            if (i11 == -1 || i11 > uf1Var.a()) {
                rs0.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iD = uf1Var.e();
            } else if (i == 4 && i11 >= 8) {
                int iT3 = uf1Var.t();
                int iZ = uf1Var.z();
                int iH = iZ == 49 ? uf1Var.h() : 0;
                int iT4 = uf1Var.t();
                if (iZ == 47) {
                    uf1Var.f(1);
                }
                boolean z10 = iT3 == 181 && (iZ == 49 || iZ == 47) && iT4 == 3;
                if (iZ == 49) {
                    z10 &= iH == 1195456820;
                }
                if (z10) {
                    b(j4, uf1Var, n52VarArr);
                }
            }
            uf1Var.e(iD);
        }
    }

    public static void b(long j4, uf1 uf1Var, n52[] n52VarArr) {
        long j10;
        int iT = uf1Var.t();
        if ((iT & 64) != 0) {
            uf1Var.f(1);
            int i = (iT & 31) * 3;
            int iD = uf1Var.d();
            int length = n52VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                n52 n52Var = n52VarArr[i10];
                uf1Var.e(iD);
                n52Var.a(i, uf1Var);
                if (j4 != -9223372036854775807L) {
                    j10 = j4;
                    n52Var.a(j10, 1, i, 0, null);
                } else {
                    j10 = j4;
                }
                i10++;
                j4 = j10;
            }
        }
    }
}
