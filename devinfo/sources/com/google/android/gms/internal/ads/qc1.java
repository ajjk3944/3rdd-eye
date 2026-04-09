package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class qc1 extends yo0 {
    public static final zl1 J(om1 om1Var) throws IOException {
        String strV;
        int iM = om1Var.m();
        zl1 zl1VarL = L(om1Var, iM);
        if (zl1VarL == null) {
            return K(om1Var, iM);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iC = om1Var.g;
            if (iC == 0) {
                iC = om1Var.c();
            }
            String str = null;
            if (iC == 2 || iC == 4 || iC == 17) {
                if (zl1VarL instanceof yl1) {
                    int iC2 = om1Var.g;
                    if (iC2 == 0) {
                        iC2 = om1Var.c();
                    }
                    if (iC2 != 4) {
                        throw om1Var.L("END_ARRAY");
                    }
                    int i4 = om1Var.f14750k;
                    om1Var.f14750k = i4 - 1;
                    int[] iArr = om1Var.f14752m;
                    int i10 = i4 - 2;
                    iArr[i10] = iArr[i10] + 1;
                    om1Var.g = 0;
                } else {
                    int iC3 = om1Var.g;
                    if (iC3 == 0) {
                        iC3 = om1Var.c();
                    }
                    if (iC3 != 2) {
                        throw om1Var.L("END_OBJECT");
                    }
                    int i11 = om1Var.f14750k;
                    int i12 = i11 - 1;
                    om1Var.f14750k = i12;
                    om1Var.f14751l[i12] = null;
                    int[] iArr2 = om1Var.f14752m;
                    int i13 = i11 - 2;
                    iArr2[i13] = iArr2[i13] + 1;
                    om1Var.g = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return zl1VarL;
                }
                zl1VarL = (zl1) arrayDeque.removeLast();
            } else {
                if (zl1VarL instanceof bm1) {
                    int iC4 = om1Var.g;
                    if (iC4 == 0) {
                        iC4 = om1Var.c();
                    }
                    if (iC4 == 14) {
                        strV = om1Var.w();
                    } else if (iC4 == 12) {
                        strV = om1Var.v('\'');
                    } else {
                        if (iC4 != 13) {
                            throw om1Var.L("a name");
                        }
                        strV = om1Var.v('\"');
                    }
                    str = strV;
                    om1Var.g = 0;
                    om1Var.f14751l[om1Var.f14750k - 1] = str;
                    if (!yo0.n(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iM2 = om1Var.m();
                zl1 zl1VarL2 = L(om1Var, iM2);
                zl1 zl1VarK = zl1VarL2 == null ? K(om1Var, iM2) : zl1VarL2;
                if (zl1VarL instanceof yl1) {
                    ((yl1) zl1VarL).f18797a.add(zl1VarK);
                } else {
                    bm1 bm1Var = (bm1) zl1VarL;
                    if (bm1Var.f9723a.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    bm1Var.f9723a.put(str, zl1VarK);
                }
                if (zl1VarL2 != null) {
                    arrayDeque.addLast(zl1VarL);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zl1VarL = zl1VarK;
                } else {
                    continue;
                }
            }
        }
    }

    public static final zl1 K(om1 om1Var, int i4) throws IOException {
        int i10 = i4 - 1;
        if (i10 == 5) {
            String strE = om1Var.e();
            if (yo0.n(strE)) {
                return new dm1(strE);
            }
            throw new IOException("illegal characters in string");
        }
        if (i10 == 6) {
            return new dm1(new rc1(om1Var.e()));
        }
        boolean z3 = true;
        if (i10 != 7) {
            if (i10 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(mq0.e(i4)));
            }
            int iC = om1Var.g;
            if (iC == 0) {
                iC = om1Var.c();
            }
            if (iC != 7) {
                throw om1Var.L("null");
            }
            om1Var.g = 0;
            int[] iArr = om1Var.f14752m;
            int i11 = om1Var.f14750k - 1;
            iArr[i11] = iArr[i11] + 1;
            return am1.f9365a;
        }
        int iC2 = om1Var.g;
        if (iC2 == 0) {
            iC2 = om1Var.c();
        }
        if (iC2 == 5) {
            om1Var.g = 0;
            int[] iArr2 = om1Var.f14752m;
            int i12 = om1Var.f14750k - 1;
            iArr2[i12] = iArr2[i12] + 1;
        } else {
            if (iC2 != 6) {
                throw om1Var.L("a boolean");
            }
            om1Var.g = 0;
            int[] iArr3 = om1Var.f14752m;
            int i13 = om1Var.f14750k - 1;
            iArr3[i13] = iArr3[i13] + 1;
            z3 = false;
        }
        return new dm1(Boolean.valueOf(z3));
    }

    public static final zl1 L(om1 om1Var, int i4) throws IOException {
        int i10 = i4 - 1;
        if (i10 == 0) {
            int iC = om1Var.g;
            if (iC == 0) {
                iC = om1Var.c();
            }
            if (iC != 3) {
                throw om1Var.L("BEGIN_ARRAY");
            }
            om1Var.y(1);
            om1Var.f14752m[om1Var.f14750k - 1] = 0;
            om1Var.g = 0;
            return new yl1();
        }
        if (i10 != 2) {
            return null;
        }
        int iC2 = om1Var.g;
        if (iC2 == 0) {
            iC2 = om1Var.c();
        }
        if (iC2 != 1) {
            throw om1Var.L("BEGIN_OBJECT");
        }
        om1Var.y(3);
        om1Var.g = 0;
        return new bm1();
    }
}
