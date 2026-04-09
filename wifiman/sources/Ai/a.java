package Ai;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import org.snmp4j.mp.SnmpConstants;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0031a f849b = new C0031a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f850c = l(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f851d = c.j(4611686018427387903L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f852e = c.j(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    private final long f853a;

    /* renamed from: Ai.a$a, reason: collision with other inner class name */
    public static final class C0031a {
        public /* synthetic */ C0031a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f851d;
        }

        public final long b() {
            return a.f850c;
        }

        public final long c(String value) {
            AbstractC6492s.i(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        private C0031a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f853a = j10;
    }

    public static final int B(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (y(j10) % 60);
    }

    public static final int C(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (K(j10) ? c.n(H(j10) % 1000) : H(j10) % 1000000000);
    }

    public static final int D(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (z(j10) % 60);
    }

    private static final d E(long j10) {
        return M(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    private static final long H(long j10) {
        return j10 >> 1;
    }

    public static int I(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean J(long j10) {
        return !N(j10);
    }

    private static final boolean K(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean M(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean N(long j10) {
        return j10 == f851d || j10 == f852e;
    }

    public static final boolean P(long j10) {
        return j10 < 0;
    }

    public static final boolean T(long j10) {
        return j10 > 0;
    }

    public static final long U(long j10, long j11) {
        if (N(j10)) {
            if (J(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (N(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return K(j10) ? c(j10, H(j10), H(j11)) : c(j10, H(j11), H(j10));
        }
        long jH = H(j10) + H(j11);
        return M(j10) ? c.m(jH) : c.k(jH);
    }

    public static final String W(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (P(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jP = p(j10);
        long jT = t(jP);
        int iB = B(jP);
        int iD = D(jP);
        int iC = C(jP);
        if (N(j10)) {
            jT = 9999999999999L;
        }
        boolean z10 = false;
        boolean z11 = jT != 0;
        boolean z12 = (iD == 0 && iC == 0) ? false : true;
        if (iB != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jT);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iB);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            d(j10, sb2, iD, iC, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long b0(long j10, d unit) {
        AbstractC6492s.i(unit, "unit");
        if (j10 == f851d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f852e) {
            return Long.MIN_VALUE;
        }
        return e.b(H(j10), E(j10), unit);
    }

    private static final long c(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.j(AbstractC7978m.m(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    private static final void d(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strY0 = t.y0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strY0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strY0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strY0, 0, ((i13 + 3) / 3) * 3);
                AbstractC6492s.h(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strY0, 0, i15);
                AbstractC6492s.h(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static String d0(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f851d) {
            return "Infinity";
        }
        if (j10 == f852e) {
            return "-Infinity";
        }
        boolean zP = P(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zP) {
            sb2.append('-');
        }
        long jP = p(j10);
        long jS = s(jP);
        int iR = r(jP);
        int iB = B(jP);
        int iD = D(jP);
        int iC = C(jP);
        int i10 = 0;
        boolean z10 = jS != 0;
        boolean z11 = iR != 0;
        boolean z12 = iB != 0;
        boolean z13 = (iD == 0 && iC == 0) ? false : true;
        if (z10) {
            sb2.append(jS);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iR);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iB);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iD != 0 || z10 || z11 || z12) {
                d(j10, sb2, iD, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                d(j10, sb2, iC / SnmpConstants.MILLISECOND_TO_NANOSECOND, iC % SnmpConstants.MILLISECOND_TO_NANOSECOND, 6, "ms", false);
            } else if (iC >= 1000) {
                d(j10, sb2, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb2.append(iC);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zP && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long f0(long j10) {
        return c.i(-H(j10), ((int) j10) & 1);
    }

    public static final /* synthetic */ a g(long j10) {
        return new a(j10);
    }

    public static int j(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC6492s.l(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return P(j10) ? -i10 : i10;
    }

    public static long l(long j10) {
        if (b.a()) {
            if (M(j10)) {
                long jH = H(j10);
                if (-4611686018426999999L > jH || jH >= 4611686018427000000L) {
                    throw new AssertionError(H(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long jH2 = H(j10);
                if (-4611686018427387903L > jH2 || jH2 >= 4611686018427387904L) {
                    throw new AssertionError(H(j10) + " ms is out of milliseconds range");
                }
                long jH3 = H(j10);
                if (-4611686018426L <= jH3 && jH3 < 4611686018427L) {
                    throw new AssertionError(H(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).g0();
    }

    public static final long p(long j10) {
        return P(j10) ? f0(j10) : j10;
    }

    public static final int r(long j10) {
        if (N(j10)) {
            return 0;
        }
        return (int) (t(j10) % 24);
    }

    public static final long s(long j10) {
        return b0(j10, d.DAYS);
    }

    public static final long t(long j10) {
        return b0(j10, d.HOURS);
    }

    public static final long v(long j10) {
        return (K(j10) && J(j10)) ? H(j10) : b0(j10, d.MILLISECONDS);
    }

    public static final long y(long j10) {
        return b0(j10, d.MINUTES);
    }

    public static final long z(long j10) {
        return b0(j10, d.SECONDS);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return h(((a) obj).g0());
    }

    public boolean equals(Object obj) {
        return n(this.f853a, obj);
    }

    public final /* synthetic */ long g0() {
        return this.f853a;
    }

    public int h(long j10) {
        return j(this.f853a, j10);
    }

    public int hashCode() {
        return I(this.f853a);
    }

    public String toString() {
        return d0(this.f853a);
    }
}
