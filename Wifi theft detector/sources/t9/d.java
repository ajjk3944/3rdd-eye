package t9;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import kotlin.time.DurationUnit;
import org.slf4j.Marker;
import s9.r;
import s9.u;
import s9.w;
import t9.b;
import z8.e0;

/* loaded from: classes4.dex */
public abstract class d {
    public static final long i(long j10, int i10) {
        return b.j((j10 << 1) + i10);
    }

    public static final long j(long j10) {
        return b.j((j10 << 1) + 1);
    }

    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(q9.e.g(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    public static final long l(long j10) {
        return b.j(j10 << 1);
    }

    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    public static final long n(long j10) {
        return j10 * 1000000;
    }

    public static final long o(long j10) {
        return j10 / 1000000;
    }

    public static final long p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.a aVar = b.f24466b;
        long jC = aVar.c();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && u.G0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            DurationUnit durationUnit = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!u.O("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    p.c(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    p.d(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    DurationUnit durationUnitD = f.d(cCharAt5, z14);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iA0 = u.a0(strSubstring, '.', 0, false, 6, null);
                    if (durationUnitD != DurationUnit.f22191d || iA0 <= 0) {
                        z11 = z14;
                        jC = b.F(jC, t(q(strSubstring), durationUnitD));
                    } else {
                        p.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iA0);
                        p.d(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jF = b.F(jC, t(q(strSubstring2), durationUnitD));
                        p.c(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iA0);
                        p.d(strSubstring3, "substring(...)");
                        jC = b.F(jF, r(Double.parseDouble(strSubstring3), durationUnitD));
                    }
                    z14 = z11;
                    durationUnit = durationUnitD;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z14 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (r.z(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jC = aVar.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && w.a1(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z15 = true;
                } else {
                    i10 = length;
                }
                boolean z16 = false;
                DurationUnit durationUnit2 = null;
                while (length2 < i10) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    p.c(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    p.d(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    p.c(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    p.d(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitE = f.e(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iA02 = u.a0(strSubstring4, '.', 0, false, 6, null);
                    if (iA02 > 0) {
                        p.c(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iA02);
                        p.d(strSubstring6, "substring(...)");
                        long jF2 = b.F(jC, t(Long.parseLong(strSubstring6), durationUnitE));
                        p.c(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iA02);
                        p.d(strSubstring7, "substring(...)");
                        jC = b.F(jF2, r(Double.parseDouble(strSubstring7), durationUnitE));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jC = b.F(jC, t(Long.parseLong(strSubstring4), durationUnitE));
                    }
                    durationUnit2 = durationUnitE;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? b.K(jC) : jC;
    }

    public static final long q(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !u.O("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable cVar = new q9.c(i10, u.V(str));
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator it = cVar.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((e0) it).nextInt());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return r.J(str, Marker.ANY_NON_NULL_MARKER, false, 2, null) ? Long.parseLong(w.Z0(str, 1)) : Long.parseLong(str);
    }

    public static final long r(double d10, DurationUnit unit) {
        p.e(unit, "unit");
        double dA = e.a(d10, unit, DurationUnit.f22188a);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC = n9.b.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? k(n9.b.c(e.a(d10, unit, DurationUnit.f22190c))) : l(jC);
    }

    public static final long s(int i10, DurationUnit unit) {
        p.e(unit, "unit");
        return unit.compareTo(DurationUnit.f22191d) <= 0 ? l(e.c(i10, unit, DurationUnit.f22188a)) : t(i10, unit);
    }

    public static final long t(long j10, DurationUnit unit) {
        p.e(unit, "unit");
        DurationUnit durationUnit = DurationUnit.f22188a;
        long jC = e.c(4611686018426999999L, durationUnit, unit);
        return ((-jC) > j10 || j10 > jC) ? j(q9.e.g(e.b(j10, unit, DurationUnit.f22190c), -4611686018427387903L, 4611686018427387903L)) : l(e.c(j10, unit, durationUnit));
    }
}
