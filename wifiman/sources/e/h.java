package E;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final g f3602a = b(50);

    public static final g a(float f10) {
        return c(c.a(f10));
    }

    public static final g b(int i10) {
        return c(c.b(i10));
    }

    public static final g c(b bVar) {
        return new g(bVar, bVar, bVar, bVar);
    }

    public static final g d(float f10) {
        return c(c.c(f10));
    }

    public static final g e(float f10, float f11, float f12, float f13) {
        return new g(c.c(f10), c.c(f11), c.c(f12), c.c(f13));
    }

    public static /* synthetic */ g f(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Y0.h.j(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Y0.h.j(0);
        }
        return e(f10, f11, f12, f13);
    }

    public static final g g() {
        return f3602a;
    }
}
