package Ai;

import Ai.a;
import Zg.Q;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import oh.AbstractC7137b;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.mp.SnmpConstants;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes4.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return a.l((j10 << 1) + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return a.l((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(AbstractC7978m.m(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return a.l(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * SnmpConstants.MILLISECOND_TO_NANOSECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / SnmpConstants.MILLISECOND_TO_NANOSECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        long jU;
        char cCharAt;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0031a c0031a = a.f849b;
        long jB = c0031a.b();
        char cCharAt4 = str.charAt(0);
        boolean z11 = true;
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && t.W0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i11 = length2 + 1;
            if (i11 == length) {
                throw new IllegalArgumentException();
            }
            d dVar = null;
            boolean z14 = false;
            while (i11 < length) {
                if (str.charAt(i11) != 'T') {
                    int i12 = i11;
                    while (i12 < str.length() && ((c11 <= (cCharAt3 = str.charAt(i12)) && cCharAt3 < c10) || t.V("+-.", cCharAt3, false, 2, null))) {
                        i12++;
                        c10 = ':';
                        c11 = '0';
                    }
                    AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i11, i12);
                    AbstractC6492s.h(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i11 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    int i13 = length3 + 1;
                    d dVarD = f.d(cCharAt5, z14);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iJ0 = t.j0(strSubstring, '.', 0, false, 6, null);
                    if (dVarD != d.SECONDS || iJ0 <= 0) {
                        i10 = i13;
                        jB = a.U(jB, t(q(strSubstring), dVarD));
                    } else {
                        AbstractC6492s.g(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iJ0);
                        AbstractC6492s.h(strSubstring2, "substring(...)");
                        i10 = i13;
                        long jU2 = a.U(jB, t(q(strSubstring2), dVarD));
                        AbstractC6492s.g(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iJ0);
                        AbstractC6492s.h(strSubstring3, "substring(...)");
                        jB = a.U(jU2, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    i11 = i10;
                    dVar = dVarD;
                    c10 = ':';
                    c11 = '0';
                    z11 = true;
                } else {
                    if (z14 || (i11 = i11 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = z11;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (t.F(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0031a.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && t.v1(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    jU = jB;
                    z15 = true;
                } else {
                    jU = jB;
                }
                d dVar2 = null;
                boolean z16 = false;
                while (length2 < length) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i14 = length2;
                    while (i14 < str.length() && (('0' <= (cCharAt2 = str.charAt(i14)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i14++;
                    }
                    AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i14);
                    AbstractC6492s.h(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i15 = length4;
                    while (i15 < str.length() && 'a' <= (cCharAt = str.charAt(i15)) && cCharAt < '{') {
                        i15++;
                    }
                    AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i15);
                    AbstractC6492s.h(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iJ02 = t.j0(strSubstring4, '.', 0, false, 6, null);
                    if (iJ02 > 0) {
                        AbstractC6492s.g(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iJ02);
                        AbstractC6492s.h(strSubstring6, "substring(...)");
                        long jU3 = a.U(jU, t(Long.parseLong(strSubstring6), dVarE));
                        AbstractC6492s.g(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iJ02);
                        AbstractC6492s.h(strSubstring7, "substring(...)");
                        jU = a.U(jU3, r(Double.parseDouble(strSubstring7), dVarE));
                        length2 = length2;
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jU = a.U(jU, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    str2 = str3;
                    dVar2 = dVarE;
                    z16 = true;
                }
                jB = jU;
            }
        }
        return z13 ? a.f0(jB) : jB;
    }

    private static final long q(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !t.V("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable c7974i = new C7974i(i10, t.e0(str));
            if (!(c7974i instanceof Collection) || !((Collection) c7974i).isEmpty()) {
                Iterator it = c7974i.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((Q) it).d());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (t.P(str, MqttTopic.SINGLE_LEVEL_WILDCARD, false, 2, null)) {
            str = t.t1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d10, d unit) {
        AbstractC6492s.i(unit, "unit");
        double dA = e.a(d10, unit, d.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jF = AbstractC7137b.f(dA);
        return (-4611686018426999999L > jF || jF >= 4611686018427000000L) ? k(AbstractC7137b.f(e.a(d10, unit, d.MILLISECONDS))) : l(jF);
    }

    public static final long s(int i10, d unit) {
        AbstractC6492s.i(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? l(e.c(i10, unit, d.NANOSECONDS)) : t(i10, unit);
    }

    public static final long t(long j10, d unit) {
        AbstractC6492s.i(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j10 || j10 > jC) ? j(AbstractC7978m.m(e.b(j10, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(e.c(j10, unit, dVar));
    }
}
