package t9;

import kotlin.jvm.internal.p;
import kotlin.time.DurationUnit;
import s9.u;

/* loaded from: classes4.dex */
public final class b implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24466b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f24467c = j(0);

    /* renamed from: d, reason: collision with root package name */
    public static final long f24468d = d.j(4611686018427387903L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f24469e = d.j(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    public final long f24470a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final long a() {
            return b.f24468d;
        }

        public final long b() {
            return b.f24469e;
        }

        public final long c() {
            return b.f24467c;
        }

        public final long d(String value) {
            p.e(value, "value");
            try {
                return d.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        public a() {
        }
    }

    public /* synthetic */ b(long j10) {
        this.f24470a = j10;
    }

    public static final boolean A(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean B(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean C(long j10) {
        return j10 == f24468d || j10 == f24469e;
    }

    public static final boolean D(long j10) {
        return j10 < 0;
    }

    public static final boolean E(long j10) {
        return j10 > 0;
    }

    public static final long F(long j10, long j11) {
        if (C(j10)) {
            if (z(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (C(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return A(j10) ? d(j10, x(j10), x(j11)) : d(j10, x(j11), x(j10));
        }
        long jX = x(j10) + x(j11);
        return B(j10) ? d.m(jX) : d.k(jX);
    }

    public static final double G(long j10, DurationUnit unit) {
        p.e(unit, "unit");
        if (j10 == f24468d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f24469e) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(x(j10), w(j10), unit);
    }

    public static final String H(long j10) {
        StringBuilder sb = new StringBuilder();
        if (D(j10)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM = m(j10);
        long jP = p(jM);
        int iT = t(jM);
        int iV = v(jM);
        int iU = u(jM);
        long j11 = C(j10) ? 9999999999999L : jP;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iV == 0 && iU == 0) ? false : true;
        if (iT != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb.append(j11);
            sb.append('H');
        }
        if (z10) {
            sb.append(iT);
            sb.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            f(j10, sb, iV, iU, 9, "S", true);
        }
        return sb.toString();
    }

    public static final long I(long j10, DurationUnit unit) {
        p.e(unit, "unit");
        if (j10 == f24468d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f24469e) {
            return Long.MIN_VALUE;
        }
        return e.b(x(j10), w(j10), unit);
    }

    public static String J(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f24468d) {
            return "Infinity";
        }
        if (j10 == f24469e) {
            return "-Infinity";
        }
        boolean zD = D(j10);
        StringBuilder sb = new StringBuilder();
        if (zD) {
            sb.append('-');
        }
        long jM = m(j10);
        long jO = o(jM);
        int iN = n(jM);
        int iT = t(jM);
        int iV = v(jM);
        int iU = u(jM);
        int i10 = 0;
        boolean z10 = jO != 0;
        boolean z11 = iN != 0;
        boolean z12 = iT != 0;
        boolean z13 = (iV == 0 && iU == 0) ? false : true;
        if (z10) {
            sb.append(jO);
            sb.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iN);
            sb.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iT);
            sb.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iV != 0 || z10 || z11 || z12) {
                f(j10, sb, iV, iU, 9, "s", false);
            } else if (iU >= 1000000) {
                f(j10, sb, iU / 1000000, iU % 1000000, 6, "ms", false);
            } else if (iU >= 1000) {
                f(j10, sb, iU / 1000, iU % 1000, 3, "us", false);
            } else {
                sb.append(iU);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (zD && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long K(long j10) {
        return d.i(-x(j10), ((int) j10) & 1);
    }

    public static final long d(long j10, long j11, long j12) {
        long jO = d.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return d.j(q9.e.g(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return d.l(d.n(j13) + (j12 - d.n(jO)));
    }

    public static final void f(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strM0 = u.m0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strM0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM0.charAt(length) != '0') {
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
                sb.append((CharSequence) strM0, 0, ((i13 + 3) / 3) * 3);
                p.d(sb, "append(...)");
            } else {
                sb.append((CharSequence) strM0, 0, i15);
                p.d(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ b g(long j10) {
        return new b(j10);
    }

    public static int i(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return p.g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return D(j10) ? -i10 : i10;
    }

    public static long j(long j10) {
        if (!c.a()) {
            return j10;
        }
        if (B(j10)) {
            long jX = x(j10);
            if (-4611686018426999999L <= jX && jX < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(x(j10) + " ns is out of nanoseconds range");
        }
        long jX2 = x(j10);
        if (-4611686018427387903L > jX2 || jX2 >= 4611686018427387904L) {
            throw new AssertionError(x(j10) + " ms is out of milliseconds range");
        }
        long jX3 = x(j10);
        if (-4611686018426L > jX3 || jX3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(x(j10) + " ms is denormalized");
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).L();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final long m(long j10) {
        return D(j10) ? K(j10) : j10;
    }

    public static final int n(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (p(j10) % 24);
    }

    public static final long o(long j10) {
        return I(j10, DurationUnit.f22194g);
    }

    public static final long p(long j10) {
        return I(j10, DurationUnit.f22193f);
    }

    public static final long q(long j10) {
        return (A(j10) && z(j10)) ? x(j10) : I(j10, DurationUnit.f22190c);
    }

    public static final long r(long j10) {
        return I(j10, DurationUnit.f22192e);
    }

    public static final long s(long j10) {
        return I(j10, DurationUnit.f22191d);
    }

    public static final int t(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (r(j10) % 60);
    }

    public static final int u(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (A(j10) ? d.n(x(j10) % 1000) : x(j10) % 1000000000);
    }

    public static final int v(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (s(j10) % 60);
    }

    public static final DurationUnit w(long j10) {
        return B(j10) ? DurationUnit.f22188a : DurationUnit.f22190c;
    }

    public static final long x(long j10) {
        return j10 >> 1;
    }

    public static int y(long j10) {
        return androidx.privacysandbox.ads.adservices.topics.d.a(j10);
    }

    public static final boolean z(long j10) {
        return !C(j10);
    }

    public final /* synthetic */ long L() {
        return this.f24470a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return h(((b) obj).L());
    }

    public boolean equals(Object obj) {
        return k(this.f24470a, obj);
    }

    public int h(long j10) {
        return i(this.f24470a, j10);
    }

    public int hashCode() {
        return y(this.f24470a);
    }

    public String toString() {
        return J(this.f24470a);
    }
}
