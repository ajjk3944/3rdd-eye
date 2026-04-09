package z5;

import c5.C0412i;

/* loaded from: classes3.dex */
public final class Z extends X {

    /* renamed from: e, reason: collision with root package name */
    public final c0 f24509e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f24510f;

    /* renamed from: g, reason: collision with root package name */
    public final C3034j f24511g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f24512h;

    public Z(c0 c0Var, a0 a0Var, C3034j c3034j, Object obj) {
        this.f24509e = c0Var;
        this.f24510f = a0Var;
        this.f24511g = c3034j;
        this.f24512h = obj;
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        o((Throwable) obj);
        return C0412i.f5929a;
    }

    @Override // z5.X
    public final void o(Throwable th) {
        C3034j c3034jF = c0.F(this.f24511g);
        c0 c0Var = this.f24509e;
        a0 a0Var = this.f24510f;
        Object obj = this.f24512h;
        if (c3034jF != null) {
            while (c3034jF.f24535e.C((2 & 1) == 0, (2 & 2) != 0, new Z(c0Var, a0Var, c3034jF, obj)) == e0.f24527a) {
                c3034jF = c0.F(c3034jF);
                if (c3034jF == null) {
                }
            }
            return;
        }
        c0Var.c(c0Var.t(a0Var, obj));
    }
}
