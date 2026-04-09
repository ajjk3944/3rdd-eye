package ut;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;
import tt.l;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final long f23693d;

    /* renamed from: g, reason: collision with root package name */
    public static final long f23694g;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f23695r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f23696a;

    static {
        int i10 = b.f23697a;
        f23693d = y3.o(4611686018427387903L);
        f23694g = y3.o(-4611686018427387903L);
    }

    public static final long a(long j, long j7) {
        long j10 = 1000000;
        long j11 = j7 / j10;
        long j12 = j + j11;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return y3.o(vc.e.i(j12, -4611686018427387903L, 4611686018427387903L));
        }
        return y3.q((j12 * j10) + (j7 - (j11 * j10)));
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strH0 = l.H0(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strH0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strH0.charAt(length) != '0') {
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
                sb2.append((CharSequence) strH0, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strH0, 0, i15);
            }
        }
        sb2.append(str);
    }

    public static int c(long j, long j7) {
        long j10 = j ^ j7;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return br.l.h(j, j7);
        }
        int i10 = (((int) j) & 1) - (((int) j7) & 1);
        return j < 0 ? -i10 : i10;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || f(j)) ? h(j, c.MILLISECONDS) : j >> 1;
    }

    public static final int e(long j) {
        if (f(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean f(long j) {
        return j == f23693d || j == f23694g;
    }

    public static final long g(long j, long j7) {
        if (f(j)) {
            if (!f(j7) || (j7 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (f(j7)) {
            return j7;
        }
        int i10 = ((int) j) & 1;
        if (i10 != (((int) j7) & 1)) {
            return i10 == 1 ? a(j >> 1, j7 >> 1) : a(j7 >> 1, j >> 1);
        }
        long j10 = (j >> 1) + (j7 >> 1);
        return i10 == 0 ? (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? y3.o(j10 / 1000000) : y3.q(j10) : y3.p(j10);
    }

    public static final long h(long j, c cVar) {
        br.l.e(cVar, "unit");
        if (j == f23693d) {
            return Long.MAX_VALUE;
        }
        if (j == f23694g) {
            return Long.MIN_VALUE;
        }
        return b4.m(j >> 1, (((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, cVar);
    }

    public static final long i(long j) {
        long j7 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i10 = b.f23697a;
        return j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f23696a, ((a) obj).f23696a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f23696a == ((a) obj).f23696a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23696a);
    }

    public final String toString() {
        long j;
        int iH;
        long jI = this.f23696a;
        if (jI == 0) {
            return "0s";
        }
        if (jI == f23693d) {
            return "Infinity";
        }
        if (jI == f23694g) {
            return "-Infinity";
        }
        int i10 = 0;
        boolean z10 = jI < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (jI < 0) {
            jI = i(jI);
        }
        long jH = h(jI, c.DAYS);
        int iH2 = f(jI) ? 0 : (int) (h(jI, c.HOURS) % 24);
        if (f(jI)) {
            j = 0;
            iH = 0;
        } else {
            j = 0;
            iH = (int) (h(jI, c.MINUTES) % 60);
        }
        int iH3 = f(jI) ? 0 : (int) (h(jI, c.SECONDS) % 60);
        int iE = e(jI);
        boolean z11 = jH != j;
        boolean z12 = iH2 != 0;
        boolean z13 = iH != 0;
        boolean z14 = (iH3 == 0 && iE == 0) ? false : true;
        if (z11) {
            sb2.append(jH);
            sb2.append('d');
            i10 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iH2);
            sb2.append('h');
            i10 = i11;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iH);
            sb2.append('m');
            i10 = i12;
        }
        if (z14) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iH3 != 0 || z11 || z12 || z13) {
                b(sb2, iH3, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb2, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb2, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb2.append(iE);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (z10 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
