package q9;

import kotlin.jvm.internal.p;
import q9.a;

/* loaded from: classes4.dex */
public abstract class e extends d {
    public static int b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long c(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int d(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long g(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a h(int i10, int i11) {
        return a.f24084d.a(i10, i11, -1);
    }

    public static a i(a aVar, int i10) {
        p.e(aVar, "<this>");
        d.a(i10 > 0, Integer.valueOf(i10));
        a.C0472a c0472a = a.f24084d;
        int iC = aVar.c();
        int iD = aVar.d();
        if (aVar.e() <= 0) {
            i10 = -i10;
        }
        return c0472a.a(iC, iD, i10);
    }

    public static c j(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? c.f24092e.a() : new c(i10, i11 - 1);
    }
}
