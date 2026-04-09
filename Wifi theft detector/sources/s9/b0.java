package s9;

import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public abstract class b0 {
    public static final byte a(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        y8.j jVarB = b(str);
        if (jVarB != null) {
            return jVarB.g();
        }
        q.n(str);
        throw new KotlinNothingValueException();
    }

    public static final y8.j b(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        return c(str, 10);
    }

    public static final y8.j c(String str, int i10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        y8.l lVarF = f(str, i10);
        if (lVarF == null) {
            return null;
        }
        int iG = lVarF.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, y8.l.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return y8.j.a(y8.j.b((byte) iG));
    }

    public static final int d(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        y8.l lVarE = e(str);
        if (lVarE != null) {
            return lVarE.g();
        }
        q.n(str);
        throw new KotlinNothingValueException();
    }

    public static final y8.l e(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        return f(str, 10);
    }

    public static final y8.l f(String str, int i10) {
        int i11;
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.text.a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.p.f(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iB = y8.l.b(i10);
        int iA = 119304647;
        while (i11 < length) {
            int iB2 = kotlin.text.a.b(str.charAt(i11), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = a0.a(-1, iB);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = y8.l.b(i12 * iB);
            int iB4 = y8.l.b(y8.l.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iB4;
        }
        return y8.l.a(i12);
    }

    public static final long g(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        y8.n nVarH = h(str);
        if (nVarH != null) {
            return nVarH.g();
        }
        q.n(str);
        throw new KotlinNothingValueException();
    }

    public static final y8.n h(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        return i(str, 10);
    }

    public static final y8.n i(String str, int i10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.text.a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.p.f(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = y8.n.b(i10);
        long j10 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            if (kotlin.text.a.b(str.charAt(i11), i10) < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = y.a(-1L, jB);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = y8.n.b(j10 * jB);
            long jB3 = y8.n.b(y8.n.b(y8.l.b(r13) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j10 = jB3;
        }
        return y8.n.a(j10);
    }

    public static final short j(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        y8.q qVarK = k(str);
        if (qVarK != null) {
            return qVarK.g();
        }
        q.n(str);
        throw new KotlinNothingValueException();
    }

    public static final y8.q k(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        return l(str, 10);
    }

    public static final y8.q l(String str, int i10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        y8.l lVarF = f(str, i10);
        if (lVarF == null) {
            return null;
        }
        int iG = lVarF.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, y8.l.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return y8.q.a(y8.q.b((short) iG));
    }
}
