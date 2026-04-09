package m0;

import l0.C6531g;
import l0.C6533i;
import l0.C6535k;

/* loaded from: classes.dex */
public interface U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52857a = a.f52858a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f52858a = new a();

        private a() {
        }
    }

    public enum b {
        CounterClockwise,
        Clockwise
    }

    static /* synthetic */ void d(U0 u02, U0 u03, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = C6531g.f52335b.c();
        }
        u02.m(u03, j10);
    }

    static /* synthetic */ void g(U0 u02, C6533i c6533i, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        u02.i(c6533i, bVar);
    }

    static /* synthetic */ void t(U0 u02, C6535k c6535k, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        u02.p(c6535k, bVar);
    }

    void a();

    void b(float f10, float f11, float f12, float f13);

    boolean c();

    void close();

    void e(float f10, float f11);

    void f(float f10, float f11, float f12, float f13, float f14, float f15);

    C6533i getBounds();

    void h(int i10);

    void i(C6533i c6533i, b bVar);

    boolean isEmpty();

    void j(float f10, float f11, float f12, float f13);

    boolean k(U0 u02, U0 u03, int i10);

    int l();

    void m(U0 u02, long j10);

    void n(float f10, float f11);

    void o(float f10, float f11, float f12, float f13, float f14, float f15);

    void p(C6535k c6535k, b bVar);

    void q();

    void r(long j10);

    void s(float f10, float f11);

    void u(float f10, float f11);
}
