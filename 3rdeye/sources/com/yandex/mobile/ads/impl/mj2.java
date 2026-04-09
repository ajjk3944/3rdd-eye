package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class mj2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f30401c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f30402d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f30403a = new uf1();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f30404b = new StringBuilder();

    public static String b(uf1 uf1Var, StringBuilder sb) {
        b(uf1Var);
        if (uf1Var.a() == 0) {
            return null;
        }
        String strA = a(uf1Var, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) uf1Var.t());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x030d, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(com.yandex.mobile.ads.impl.uf1 r18) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mj2.a(com.yandex.mobile.ads.impl.uf1):java.util.ArrayList");
    }

    public static void b(uf1 uf1Var) {
        while (true) {
            for (boolean z10 = true; uf1Var.a() > 0 && z10; z10 = false) {
                char c10 = (char) uf1Var.c()[uf1Var.d()];
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int iD = uf1Var.d();
                    int iE = uf1Var.e();
                    byte[] bArrC = uf1Var.c();
                    int i = iD + 2;
                    if (i <= iE) {
                        int i10 = iD + 1;
                        if (bArrC[iD] == 47 && bArrC[i10] == 42) {
                            while (true) {
                                int i11 = i + 1;
                                if (i11 >= iE) {
                                    break;
                                }
                                if (((char) bArrC[i]) == '*' && ((char) bArrC[i11]) == '/') {
                                    i += 2;
                                    iE = i;
                                } else {
                                    i = i11;
                                }
                            }
                            uf1Var.f(iE - uf1Var.d());
                        }
                    }
                } else {
                    uf1Var.f(1);
                }
            }
            return;
        }
    }

    private static String a(uf1 uf1Var, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int iD = uf1Var.d();
        int iE = uf1Var.e();
        while (iD < iE && !z10) {
            char c10 = (char) uf1Var.c()[iD];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iD++;
                sb.append(c10);
            }
        }
        uf1Var.f(iD - uf1Var.d());
        return sb.toString();
    }
}
