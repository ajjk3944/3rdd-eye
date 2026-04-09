package z9;

import k8.F;
import kotlin.jvm.internal.l;
import v9.h;
import y9.q;

/* compiled from: Duration.kt */
/* renamed from: z9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5870a implements Comparable<C5870a> {

    /* renamed from: c, reason: collision with root package name */
    public static final long f48494c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f48495d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f48496e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f48497b;

    static {
        int i = C5871b.f48498a;
        f48494c = F.e(4611686018427387903L);
        f48495d = F.e(-4611686018427387903L);
    }

    public static final long a(long j4, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j4 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return F.e(h.M(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return F.g((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb, int i, int i10, int i11, String str, boolean z10) {
        sb.append(i);
        if (i10 != 0) {
            sb.append('.');
            String strL0 = q.l0(i11, String.valueOf(i10));
            int i12 = -1;
            int length = strL0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strL0.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z10 || i14 >= 3) {
                sb.append((CharSequence) strL0, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strL0, 0, i14);
            }
        }
        sb.append(str);
    }

    public static final int c(long j4) {
        if (d(j4)) {
            return 0;
        }
        return (((int) j4) & 1) == 1 ? (int) (((j4 >> 1) % 1000) * 1000000) : (int) ((j4 >> 1) % 1000000000);
    }

    public static final boolean d(long j4) {
        return j4 == f48494c || j4 == f48495d;
    }

    public static final long e(long j4, long j10) {
        if (d(j4)) {
            if (!d(j10) || (j10 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j10)) {
            return j10;
        }
        int i = ((int) j4) & 1;
        if (i != (((int) j10) & 1)) {
            return i == 1 ? a(j4 >> 1, j10 >> 1) : a(j10 >> 1, j4 >> 1);
        }
        long j11 = (j4 >> 1) + (j10 >> 1);
        return i == 0 ? (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? F.e(j11 / 1000000) : F.g(j11) : F.f(j11);
    }

    public static final int f(long j4, EnumC5872c unit) {
        l.f(unit, "unit");
        return (int) h.M(g(j4, unit), -2147483648L, 2147483647L);
    }

    public static final long g(long j4, EnumC5872c unit) {
        l.f(unit, "unit");
        if (j4 == f48494c) {
            return Long.MAX_VALUE;
        }
        if (j4 == f48495d) {
            return Long.MIN_VALUE;
        }
        long j10 = j4 >> 1;
        EnumC5872c sourceUnit = (((int) j4) & 1) == 0 ? EnumC5872c.NANOSECONDS : EnumC5872c.MILLISECONDS;
        l.f(sourceUnit, "sourceUnit");
        return unit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5870a c5870a) {
        long j4 = c5870a.f48497b;
        long j10 = this.f48497b;
        long j11 = j10 ^ j4;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i = (((int) j10) & 1) - (((int) j4) & 1);
            return j10 < 0 ? -i : i;
        }
        if (j10 < j4) {
            return -1;
        }
        return j10 == j4 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5870a) {
            return this.f48497b == ((C5870a) obj).f48497b;
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f48497b;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        long j4;
        int iG;
        boolean z10;
        int iG2;
        int i;
        long j10 = this.f48497b;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f48494c) {
            return "Infinity";
        }
        if (j10 == f48495d) {
            return "-Infinity";
        }
        boolean z11 = j10 < 0;
        StringBuilder sb = new StringBuilder();
        if (z11) {
            sb.append('-');
        }
        if (j10 < 0) {
            j10 = (((int) j10) & 1) + ((-(j10 >> 1)) << 1);
            int i10 = C5871b.f48498a;
        }
        long jG = g(j10, EnumC5872c.DAYS);
        if (d(j10)) {
            j4 = 0;
            iG = 0;
        } else {
            j4 = 0;
            iG = (int) (g(j10, EnumC5872c.HOURS) % 24);
        }
        if (d(j10)) {
            z10 = z11;
            iG2 = 0;
        } else {
            z10 = z11;
            iG2 = (int) (g(j10, EnumC5872c.MINUTES) % 60);
        }
        int iG3 = d(j10) ? 0 : (int) (g(j10, EnumC5872c.SECONDS) % 60);
        int iC = c(j10);
        boolean z12 = jG != j4;
        boolean z13 = iG != 0;
        boolean z14 = iG2 != 0;
        boolean z15 = (iG3 == 0 && iC == 0) ? false : true;
        if (z12) {
            sb.append(jG);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z13 || (z12 && (z14 || z15))) {
            int i11 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('h');
            i = i11;
        }
        if (z14 || (z15 && (z13 || z12))) {
            int i12 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG2);
            sb.append('m');
            i = i12;
        }
        if (z15) {
            int i13 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iG3 != 0 || z12 || z13 || z14) {
                b(sb, iG3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i = i13;
        }
        if (z10 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
