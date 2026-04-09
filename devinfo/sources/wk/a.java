package wk;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.bumptech.glide.e;
import nk.k;
import vk.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f36812b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f36813c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36814d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f36815a;

    static {
        int i4 = b.f36816a;
        f36812b = com.bumptech.glide.d.m(4611686018427387903L);
        f36813c = com.bumptech.glide.d.m(-4611686018427387903L);
    }

    public static final long a(long j, long j8) {
        long j9 = 1000000;
        long j10 = j8 / j9;
        long j11 = j + j10;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            return com.bumptech.glide.d.m(ci.b.f(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return com.bumptech.glide.d.n((j11 * j9) + (j8 - (j10 * j9)));
    }

    public static final void b(StringBuilder sb2, int i4, int i10, int i11, String str, boolean z3) {
        sb2.append(i4);
        if (i10 != 0) {
            sb2.append('.');
            String strL0 = i.L0(i11, String.valueOf(i10));
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
            if (z3 || i14 >= 3) {
                sb2.append((CharSequence) strL0, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strL0, 0, i14);
            }
        }
        sb2.append(str);
    }

    public static int c(long j, long j8) {
        long j9 = j ^ j8;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return k.g(j, j8);
        }
        int i4 = (((int) j) & 1) - (((int) j8) & 1);
        return j < 0 ? -i4 : i4;
    }

    public static final boolean d(long j) {
        return j == f36812b || j == f36813c;
    }

    public static final long e(long j, long j8) {
        if (d(j)) {
            if (!d(j8) || (j8 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j8)) {
            return j8;
        }
        int i4 = ((int) j) & 1;
        if (i4 != (((int) j8) & 1)) {
            return i4 == 1 ? a(j >> 1, j8 >> 1) : a(j8 >> 1, j >> 1);
        }
        long j9 = (j >> 1) + (j8 >> 1);
        return i4 == 0 ? (-4611686018426999999L > j9 || j9 >= 4611686018427000000L) ? com.bumptech.glide.d.m(j9 / 1000000) : com.bumptech.glide.d.n(j9) : (-4611686018426L > j9 || j9 >= 4611686018427L) ? com.bumptech.glide.d.m(ci.b.f(j9, -4611686018427387903L, 4611686018427387903L)) : com.bumptech.glide.d.n(j9 * 1000000);
    }

    public static final long f(long j, c cVar) {
        k.e(cVar, "unit");
        if (j == f36812b) {
            return Long.MAX_VALUE;
        }
        if (j == f36813c) {
            return Long.MIN_VALUE;
        }
        return e.o(j >> 1, (((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, cVar);
    }

    public static final long g(long j) {
        long j8 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i4 = b.f36816a;
        return j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f36815a, ((a) obj).f36815a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f36815a == ((a) obj).f36815a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f36815a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j;
        int iF;
        int i4;
        long jG = this.f36815a;
        if (jG == 0) {
            return "0s";
        }
        if (jG == f36812b) {
            return "Infinity";
        }
        if (jG == f36813c) {
            return "-Infinity";
        }
        int i10 = 0;
        boolean z3 = jG < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append('-');
        }
        if (jG < 0) {
            jG = g(jG);
        }
        long jF = f(jG, c.DAYS);
        int iF2 = d(jG) ? 0 : (int) (f(jG, c.HOURS) % 24);
        if (d(jG)) {
            j = 0;
            iF = 0;
        } else {
            j = 0;
            iF = (int) (f(jG, c.MINUTES) % 60);
        }
        int iF3 = d(jG) ? 0 : (int) (f(jG, c.SECONDS) % 60);
        if (d(jG)) {
            i4 = 0;
        } else {
            i4 = (int) ((((int) jG) & 1) == 1 ? ((jG >> 1) % 1000) * 1000000 : (jG >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        }
        boolean z10 = jF != j;
        boolean z11 = iF2 != 0;
        boolean z12 = iF != 0;
        boolean z13 = (iF3 == 0 && i4 == 0) ? false : true;
        if (z10) {
            sb2.append(jF);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iF2);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iF);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iF3 != 0 || z10 || z11 || z12) {
                b(sb2, iF3, i4, 9, "s", false);
            } else if (i4 >= 1000000) {
                b(sb2, i4 / 1000000, i4 % 1000000, 6, "ms", false);
            } else if (i4 >= 1000) {
                b(sb2, i4 / 1000, i4 % 1000, 3, "us", false);
            } else {
                sb2.append(i4);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (z3 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
