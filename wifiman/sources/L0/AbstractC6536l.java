package l0;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6536l {
    public static final C6535k a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jA = AbstractC6526b.a(f14, f15);
        return new C6535k(f10, f11, f12, f13, jA, jA, jA, jA, null);
    }

    public static final C6535k b(C6533i c6533i, long j10, long j11, long j12, long j13) {
        return new C6535k(c6533i.k(), c6533i.n(), c6533i.l(), c6533i.e(), j10, j11, j12, j13, null);
    }

    public static final C6535k d(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, AbstractC6525a.d(j10), AbstractC6525a.e(j10));
    }

    public static final C6533i e(C6535k c6535k) {
        return new C6533i(c6535k.e(), c6535k.g(), c6535k.f(), c6535k.a());
    }

    public static final boolean f(C6535k c6535k) {
        return AbstractC6525a.d(c6535k.h()) == AbstractC6525a.e(c6535k.h()) && AbstractC6525a.d(c6535k.h()) == AbstractC6525a.d(c6535k.i()) && AbstractC6525a.d(c6535k.h()) == AbstractC6525a.e(c6535k.i()) && AbstractC6525a.d(c6535k.h()) == AbstractC6525a.d(c6535k.c()) && AbstractC6525a.d(c6535k.h()) == AbstractC6525a.e(c6535k.c()) && AbstractC6525a.d(c6535k.h()) == AbstractC6525a.d(c6535k.b()) && AbstractC6525a.d(c6535k.h()) == AbstractC6525a.e(c6535k.b());
    }
}
