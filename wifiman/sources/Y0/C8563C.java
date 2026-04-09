package y0;

import E0.C2642u;

/* renamed from: y0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8563C {

    /* renamed from: a, reason: collision with root package name */
    private final E0.G f66209a;

    /* renamed from: b, reason: collision with root package name */
    private final C8584e f66210b;

    /* renamed from: c, reason: collision with root package name */
    private final C8605z f66211c = new C8605z();

    /* renamed from: d, reason: collision with root package name */
    private final C2642u f66212d = new C2642u();

    /* renamed from: e, reason: collision with root package name */
    private boolean f66213e;

    public C8563C(E0.G g10) {
        this.f66209a = g10;
        this.f66210b = new C8584e(g10.c());
    }

    public final void a() {
        this.f66210b.b();
    }

    public final int b(C8561A c8561a, InterfaceC8573M interfaceC8573M, boolean z10) {
        boolean z11;
        if (this.f66213e) {
            return AbstractC8564D.a(false, false);
        }
        boolean z12 = true;
        try {
            this.f66213e = true;
            C8585f c8585fB = this.f66211c.b(c8561a, interfaceC8573M);
            int iO = c8585fB.b().o();
            for (int i10 = 0; i10 < iO; i10++) {
                C8604y c8604y = (C8604y) c8585fB.b().p(i10);
                if (!c8604y.i() && !c8604y.l()) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int iO2 = c8585fB.b().o();
            for (int i11 = 0; i11 < iO2; i11++) {
                C8604y c8604y2 = (C8604y) c8585fB.b().p(i11);
                if (z11 || AbstractC8594o.b(c8604y2)) {
                    E0.G.y0(this.f66209a, c8604y2.h(), this.f66212d, AbstractC8572L.g(c8604y2.n(), AbstractC8572L.f66233a.d()), false, 8, null);
                    if (!this.f66212d.isEmpty()) {
                        this.f66210b.a(c8604y2.f(), this.f66212d, AbstractC8594o.b(c8604y2));
                        this.f66212d.clear();
                    }
                }
            }
            this.f66210b.e();
            boolean zC = this.f66210b.c(c8585fB, z10);
            if (c8585fB.d()) {
                z12 = false;
            } else {
                int iO3 = c8585fB.b().o();
                for (int i12 = 0; i12 < iO3; i12++) {
                    C8604y c8604y3 = (C8604y) c8585fB.b().p(i12);
                    if (AbstractC8594o.k(c8604y3) && c8604y3.p()) {
                        break;
                    }
                }
                z12 = false;
            }
            int iA = AbstractC8564D.a(zC, z12);
            this.f66213e = false;
            return iA;
        } catch (Throwable th2) {
            this.f66213e = false;
            throw th2;
        }
    }

    public final void c() {
        if (this.f66213e) {
            return;
        }
        this.f66211c.a();
        this.f66210b.d();
    }
}
