package v9;

import androidx.work.s;
import kotlin.jvm.internal.l;

/* compiled from: _Ranges.kt */
/* loaded from: classes3.dex */
public class h extends com.google.gson.internal.c {
    public static float K(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int L(int i, int i10, int i11) {
        if (i10 <= i11) {
            return i < i10 ? i10 : i > i11 ? i11 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long M(long j4, long j10, long j11) {
        if (j10 <= j11) {
            return j4 < j10 ? j10 : j4 > j11 ? j11 : j4;
        }
        throw new IllegalArgumentException(s.f(s.j("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j11), j10, '.'));
    }

    public static e N(g gVar, int i) {
        l.f(gVar, "<this>");
        boolean z10 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z10) {
            if (gVar.f47098d <= 0) {
                i = -i;
            }
            return new e(gVar.f47096b, gVar.f47097c, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static g O(int i, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new g(i, i10 - 1, 1);
        }
        g gVar = g.f47103e;
        return g.f47103e;
    }
}
