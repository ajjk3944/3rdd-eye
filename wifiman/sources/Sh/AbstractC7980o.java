package sh;

import kotlin.jvm.internal.AbstractC6492s;
import sh.C7972g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sh.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7980o extends AbstractC7979n {
    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static float f(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int g(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long h(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double i(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float j(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int k(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static int l(int i10, InterfaceC7971f range) {
        AbstractC6492s.i(range, "range");
        if (range instanceof InterfaceC7970e) {
            return ((Number) AbstractC7978m.o(Integer.valueOf(i10), (InterfaceC7970e) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.e()).intValue() ? ((Number) range.e()).intValue() : i10 > ((Number) range.g()).intValue() ? ((Number) range.g()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long m(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static Comparable n(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        AbstractC6492s.i(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static Comparable o(Comparable comparable, InterfaceC7970e range) {
        AbstractC6492s.i(comparable, "<this>");
        AbstractC6492s.i(range, "range");
        if (!range.isEmpty()) {
            return (!range.b(comparable, range.e()) || range.b(range.e(), comparable)) ? (!range.b(range.g(), comparable) || range.b(comparable, range.g())) ? comparable : range.g() : range.e();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static C7972g p(int i10, int i11) {
        return C7972g.f61622d.a(i10, i11, -1);
    }

    public static C7972g q(C7972g c7972g) {
        AbstractC6492s.i(c7972g, "<this>");
        return C7972g.f61622d.a(c7972g.j(), c7972g.i(), -c7972g.k());
    }

    public static C7972g r(C7972g c7972g, int i10) {
        AbstractC6492s.i(c7972g, "<this>");
        AbstractC7979n.a(i10 > 0, Integer.valueOf(i10));
        C7972g.a aVar = C7972g.f61622d;
        int i11 = c7972g.i();
        int iJ = c7972g.j();
        if (c7972g.k() <= 0) {
            i10 = -i10;
        }
        return aVar.a(i11, iJ, i10);
    }

    public static C7974i s(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C7974i.f61630e.a() : new C7974i(i10, i11 - 1);
    }

    public static C7977l t(int i10, long j10) {
        return j10 <= Long.MIN_VALUE ? C7977l.f61640e.a() : new C7977l(i10, j10 - 1);
    }
}
