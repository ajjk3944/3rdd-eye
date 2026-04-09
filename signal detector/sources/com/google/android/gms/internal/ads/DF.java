package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class DF extends AbstractC1984ut {
    public static final AbstractC1527mK J(CK ck) throws IOException {
        String strK;
        int iE = ck.e();
        AbstractC1527mK abstractC1527mKL = L(ck, iE);
        if (abstractC1527mKL == null) {
            return K(ck, iE);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iA = ck.f7576g;
            if (iA == 0) {
                iA = ck.a();
            }
            String str = null;
            if (iA == 2 || iA == 4 || iA == 17) {
                if (abstractC1527mKL instanceof C1473lK) {
                    int iA2 = ck.f7576g;
                    if (iA2 == 0) {
                        iA2 = ck.a();
                    }
                    if (iA2 != 4) {
                        throw ck.s("END_ARRAY");
                    }
                    int i = ck.f7579k;
                    ck.f7579k = i - 1;
                    int[] iArr = ck.f7581m;
                    int i3 = i - 2;
                    iArr[i3] = iArr[i3] + 1;
                    ck.f7576g = 0;
                } else {
                    int iA3 = ck.f7576g;
                    if (iA3 == 0) {
                        iA3 = ck.a();
                    }
                    if (iA3 != 2) {
                        throw ck.s("END_OBJECT");
                    }
                    int i6 = ck.f7579k;
                    int i7 = i6 - 1;
                    ck.f7579k = i7;
                    ck.f7580l[i7] = null;
                    int[] iArr2 = ck.f7581m;
                    int i8 = i6 - 2;
                    iArr2[i8] = iArr2[i8] + 1;
                    ck.f7576g = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC1527mKL;
                }
                abstractC1527mKL = (AbstractC1527mK) arrayDeque.removeLast();
            } else {
                if (abstractC1527mKL instanceof C1635oK) {
                    int iA4 = ck.f7576g;
                    if (iA4 == 0) {
                        iA4 = ck.a();
                    }
                    if (iA4 == 14) {
                        strK = ck.m();
                    } else if (iA4 == 12) {
                        strK = ck.k('\'');
                    } else {
                        if (iA4 != 13) {
                            throw ck.s("a name");
                        }
                        strK = ck.k('\"');
                    }
                    str = strK;
                    ck.f7576g = 0;
                    ck.f7580l[ck.f7579k - 1] = str;
                    if (!AbstractC1984ut.n(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iE2 = ck.e();
                AbstractC1527mK abstractC1527mKL2 = L(ck, iE2);
                AbstractC1527mK abstractC1527mKK = abstractC1527mKL2 == null ? K(ck, iE2) : abstractC1527mKL2;
                if (abstractC1527mKL instanceof C1473lK) {
                    ((C1473lK) abstractC1527mKL).f15380a.add(abstractC1527mKK);
                } else {
                    C1635oK c1635oK = (C1635oK) abstractC1527mKL;
                    if (c1635oK.f15933a.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    c1635oK.f15933a.put(str, abstractC1527mKK);
                }
                if (abstractC1527mKL2 != null) {
                    arrayDeque.addLast(abstractC1527mKL);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    abstractC1527mKL = abstractC1527mKK;
                } else {
                    continue;
                }
            }
        }
    }

    public static final AbstractC1527mK K(CK ck, int i) throws IOException {
        int i3 = i - 1;
        if (i3 == 5) {
            String strB = ck.b();
            if (AbstractC1984ut.n(strB)) {
                return new C1743qK(strB);
            }
            throw new IOException("illegal characters in string");
        }
        if (i3 == 6) {
            return new C1743qK(new EF(ck.b()));
        }
        boolean z6 = true;
        if (i3 != 7) {
            if (i3 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(AbstractC0582Jp.e(i)));
            }
            int iA = ck.f7576g;
            if (iA == 0) {
                iA = ck.a();
            }
            if (iA != 7) {
                throw ck.s("null");
            }
            ck.f7576g = 0;
            int[] iArr = ck.f7581m;
            int i6 = ck.f7579k - 1;
            iArr[i6] = iArr[i6] + 1;
            return C1581nK.f15767a;
        }
        int iA2 = ck.f7576g;
        if (iA2 == 0) {
            iA2 = ck.a();
        }
        if (iA2 == 5) {
            ck.f7576g = 0;
            int[] iArr2 = ck.f7581m;
            int i7 = ck.f7579k - 1;
            iArr2[i7] = iArr2[i7] + 1;
        } else {
            if (iA2 != 6) {
                throw ck.s("a boolean");
            }
            ck.f7576g = 0;
            int[] iArr3 = ck.f7581m;
            int i8 = ck.f7579k - 1;
            iArr3[i8] = iArr3[i8] + 1;
            z6 = false;
        }
        return new C1743qK(Boolean.valueOf(z6));
    }

    public static final AbstractC1527mK L(CK ck, int i) throws IOException {
        int i3 = i - 1;
        if (i3 == 0) {
            int iA = ck.f7576g;
            if (iA == 0) {
                iA = ck.a();
            }
            if (iA != 3) {
                throw ck.s("BEGIN_ARRAY");
            }
            ck.n(1);
            ck.f7581m[ck.f7579k - 1] = 0;
            ck.f7576g = 0;
            return new C1473lK();
        }
        if (i3 != 2) {
            return null;
        }
        int iA2 = ck.f7576g;
        if (iA2 == 0) {
            iA2 = ck.a();
        }
        if (iA2 != 1) {
            throw ck.s("BEGIN_OBJECT");
        }
        ck.n(3);
        ck.f7576g = 0;
        return new C1635oK();
    }
}
