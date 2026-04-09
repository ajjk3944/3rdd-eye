package o5;

/* loaded from: classes.dex */
public final class d1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18915a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18916d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f18917g;

    public d1(f1 f1Var) {
        this.f18917g = f1Var;
    }

    @Override // o5.x0
    public final void a() {
        f1 f1Var = this.f18917g;
        if (f1Var.G) {
            return;
        }
        f1Var.E.a();
    }

    @Override // o5.x0
    public final boolean b() {
        return this.f18917g.H;
    }

    public final void c() {
        if (this.f18916d) {
            return;
        }
        f1 f1Var = this.f18917g;
        f1Var.f18933x.b(androidx.media3.common.j0.g(f1Var.F.H), f1Var.F, 0, null, 0L);
        this.f18916d = true;
    }

    @Override // o5.x0
    public final int h(long j) {
        c();
        if (j <= 0 || this.f18915a == 2) {
            return 0;
        }
        this.f18915a = 2;
        return 1;
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        c();
        f1 f1Var = this.f18917g;
        boolean z10 = f1Var.H;
        if (z10 && f1Var.I == null) {
            this.f18915a = 2;
        }
        int i11 = this.f18915a;
        if (i11 == 2) {
            gVar.b(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            cVar.f12354g = f1Var.F;
            this.f18915a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        f1Var.I.getClass();
        gVar.b(1);
        gVar.f3308y = 0L;
        if ((i10 & 4) == 0) {
            gVar.r(f1Var.J);
            gVar.f3306r.put(f1Var.I, 0, f1Var.J);
        }
        if ((i10 & 1) == 0) {
            this.f18915a = 2;
        }
        return -4;
    }
}
