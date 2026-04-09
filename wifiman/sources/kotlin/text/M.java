package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.smi.Counter32;

/* loaded from: classes4.dex */
public abstract class M {
    public static final byte a(String str) {
        AbstractC6492s.i(str, "<this>");
        Yg.A aC = c(str);
        if (aC != null) {
            return aC.h();
        }
        D.p(str);
        throw new KotlinNothingValueException();
    }

    public static final byte b(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        Yg.A aD = d(str, i10);
        if (aD != null) {
            return aD.h();
        }
        D.p(str);
        throw new KotlinNothingValueException();
    }

    public static final Yg.A c(String str) {
        AbstractC6492s.i(str, "<this>");
        return d(str, 10);
    }

    public static final Yg.A d(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        Yg.C cG = g(str, i10);
        if (cG == null) {
            return null;
        }
        int iH = cG.h();
        if (Integer.compareUnsigned(iH, Yg.C.b(255)) > 0) {
            return null;
        }
        return Yg.A.a(Yg.A.b((byte) iH));
    }

    public static final int e(String str) {
        AbstractC6492s.i(str, "<this>");
        Yg.C cF = f(str);
        if (cF != null) {
            return cF.h();
        }
        D.p(str);
        throw new KotlinNothingValueException();
    }

    public static final Yg.C f(String str) {
        AbstractC6492s.i(str, "<this>");
        return g(str, 10);
    }

    public static final Yg.C g(String str, int i10) {
        int i11;
        AbstractC6492s.i(str, "<this>");
        AbstractC6507a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC6492s.k(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iB = Yg.C.b(i10);
        int iDivideUnsigned = 119304647;
        while (i11 < length) {
            int iB2 = AbstractC6508b.b(str.charAt(i11), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iB);
                    if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iB3 = Yg.C.b(i12 * iB);
            int iB4 = Yg.C.b(Yg.C.b(iB2) + iB3);
            if (Integer.compareUnsigned(iB4, iB3) < 0) {
                return null;
            }
            i11++;
            i12 = iB4;
        }
        return Yg.C.a(i12);
    }

    public static final long h(String str) {
        AbstractC6492s.i(str, "<this>");
        Yg.E eI = i(str);
        if (eI != null) {
            return eI.j();
        }
        D.p(str);
        throw new KotlinNothingValueException();
    }

    public static final Yg.E i(String str) {
        AbstractC6492s.i(str, "<this>");
        return j(str, 10);
    }

    public static final Yg.E j(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6507a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC6492s.k(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = Yg.E.b(i10);
        long j10 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i11 < length) {
            if (AbstractC6508b.b(str.charAt(i11), i10) < 0) {
                return null;
            }
            if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jB);
                    if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jB2 = Yg.E.b(j10 * jB);
            long jB3 = Yg.E.b(Yg.E.b(Yg.C.b(r13) & Counter32.MAX_COUNTER32_VALUE) + jB2);
            if (Long.compareUnsigned(jB3, jB2) < 0) {
                return null;
            }
            i11++;
            j10 = jB3;
        }
        return Yg.E.a(j10);
    }

    public static final short k(String str) {
        AbstractC6492s.i(str, "<this>");
        Yg.H hL = l(str);
        if (hL != null) {
            return hL.h();
        }
        D.p(str);
        throw new KotlinNothingValueException();
    }

    public static final Yg.H l(String str) {
        AbstractC6492s.i(str, "<this>");
        return m(str, 10);
    }

    public static final Yg.H m(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        Yg.C cG = g(str, i10);
        if (cG == null) {
            return null;
        }
        int iH = cG.h();
        if (Integer.compareUnsigned(iH, Yg.C.b(65535)) > 0) {
            return null;
        }
        return Yg.H.a(Yg.H.b((short) iH));
    }
}
