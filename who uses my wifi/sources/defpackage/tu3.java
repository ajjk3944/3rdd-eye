package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class tu3 extends gi2 {
    public static final b44 r0(q44 q44Var) throws IOException {
        String strI;
        int iG = q44Var.g();
        b44 b44VarT0 = t0(q44Var, iG);
        if (b44VarT0 == null) {
            return s0(q44Var, iG);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iA = q44Var.l;
            if (iA == 0) {
                iA = q44Var.a();
            }
            String str = null;
            if (iA == 2 || iA == 4 || iA == 17) {
                if (b44VarT0 instanceof a44) {
                    int iA2 = q44Var.l;
                    if (iA2 == 0) {
                        iA2 = q44Var.a();
                    }
                    if (iA2 != 4) {
                        throw q44Var.q("END_ARRAY");
                    }
                    int i = q44Var.p;
                    q44Var.p = i - 1;
                    int[] iArr = q44Var.r;
                    int i2 = i - 2;
                    iArr[i2] = iArr[i2] + 1;
                    q44Var.l = 0;
                } else {
                    int iA3 = q44Var.l;
                    if (iA3 == 0) {
                        iA3 = q44Var.a();
                    }
                    if (iA3 != 2) {
                        throw q44Var.q("END_OBJECT");
                    }
                    int i3 = q44Var.p;
                    int i4 = i3 - 1;
                    q44Var.p = i4;
                    q44Var.q[i4] = null;
                    int[] iArr2 = q44Var.r;
                    int i5 = i3 - 2;
                    iArr2[i5] = iArr2[i5] + 1;
                    q44Var.l = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return b44VarT0;
                }
                b44VarT0 = (b44) arrayDeque.removeLast();
            } else {
                if (b44VarT0 instanceof d44) {
                    int iA4 = q44Var.l;
                    if (iA4 == 0) {
                        iA4 = q44Var.a();
                    }
                    if (iA4 == 14) {
                        strI = q44Var.k();
                    } else if (iA4 == 12) {
                        strI = q44Var.i('\'');
                    } else {
                        if (iA4 != 13) {
                            throw q44Var.q("a name");
                        }
                        strI = q44Var.i('\"');
                    }
                    str = strI;
                    q44Var.l = 0;
                    q44Var.q[q44Var.p - 1] = str;
                    if (!zt0.F(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iG2 = q44Var.g();
                b44 b44VarT02 = t0(q44Var, iG2);
                b44 b44VarS0 = b44VarT02 == null ? s0(q44Var, iG2) : b44VarT02;
                if (b44VarT0 instanceof a44) {
                    ((a44) b44VarT0).f.add(b44VarS0);
                } else {
                    d44 d44Var = (d44) b44VarT0;
                    if (d44Var.f.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    d44Var.f.put(str, b44VarS0);
                }
                if (b44VarT02 != null) {
                    arrayDeque.addLast(b44VarT0);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    b44VarT0 = b44VarS0;
                } else {
                    continue;
                }
            }
        }
    }

    public static final b44 s0(q44 q44Var, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String strC = q44Var.c();
            if (zt0.F(strC)) {
                return new f44(strC);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new f44(new uu3(q44Var.c()));
        }
        boolean z = true;
        if (i2 != 7) {
            if (i2 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(wl2.A(i)));
            }
            int iA = q44Var.l;
            if (iA == 0) {
                iA = q44Var.a();
            }
            if (iA != 7) {
                throw q44Var.q("null");
            }
            q44Var.l = 0;
            int[] iArr = q44Var.r;
            int i3 = q44Var.p - 1;
            iArr[i3] = iArr[i3] + 1;
            return c44.f;
        }
        int iA2 = q44Var.l;
        if (iA2 == 0) {
            iA2 = q44Var.a();
        }
        if (iA2 == 5) {
            q44Var.l = 0;
            int[] iArr2 = q44Var.r;
            int i4 = q44Var.p - 1;
            iArr2[i4] = iArr2[i4] + 1;
        } else {
            if (iA2 != 6) {
                throw q44Var.q("a boolean");
            }
            q44Var.l = 0;
            int[] iArr3 = q44Var.r;
            int i5 = q44Var.p - 1;
            iArr3[i5] = iArr3[i5] + 1;
            z = false;
        }
        return new f44(Boolean.valueOf(z));
    }

    public static final b44 t0(q44 q44Var, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            int iA = q44Var.l;
            if (iA == 0) {
                iA = q44Var.a();
            }
            if (iA != 3) {
                throw q44Var.q("BEGIN_ARRAY");
            }
            q44Var.l(1);
            q44Var.r[q44Var.p - 1] = 0;
            q44Var.l = 0;
            return new a44();
        }
        if (i2 != 2) {
            return null;
        }
        int iA2 = q44Var.l;
        if (iA2 == 0) {
            iA2 = q44Var.a();
        }
        if (iA2 != 1) {
            throw q44Var.q("BEGIN_OBJECT");
        }
        q44Var.l(3);
        q44Var.l = 0;
        return new d44();
    }
}
