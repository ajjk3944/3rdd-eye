package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bm1;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class cm1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.bm1.a> a(com.yandex.mobile.ads.impl.uf1 r30) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cm1.a(com.yandex.mobile.ads.impl.uf1):java.util.ArrayList");
    }

    public static bm1 a(int i, byte[] bArr) {
        ArrayList<bm1.a> arrayListA;
        int iH;
        uf1 uf1Var = new uf1(bArr);
        try {
            uf1Var.f(4);
            iH = uf1Var.h();
            uf1Var.e(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (iH == 1886547818) {
            uf1Var.f(8);
            int iD = uf1Var.d();
            int iE = uf1Var.e();
            while (iD < iE) {
                int iH2 = uf1Var.h() + iD;
                if (iH2 > iD && iH2 <= iE) {
                    int iH3 = uf1Var.h();
                    if (iH3 != 2037673328 && iH3 != 1836279920) {
                        uf1Var.e(iH2);
                        iD = iH2;
                    }
                    uf1Var.d(iH2);
                    arrayListA = a(uf1Var);
                    break;
                }
                break;
            }
            arrayListA = null;
        } else {
            arrayListA = a(uf1Var);
        }
        if (arrayListA == null) {
            return null;
        }
        int size = arrayListA.size();
        if (size == 1) {
            bm1.a aVar = arrayListA.get(0);
            return new bm1(aVar, aVar, i);
        }
        if (size != 2) {
            return null;
        }
        return new bm1(arrayListA.get(0), arrayListA.get(1), i);
    }
}
