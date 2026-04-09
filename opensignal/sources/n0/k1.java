package n0;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public v f17204a;

    /* renamed from: b, reason: collision with root package name */
    public int f17205b;

    /* renamed from: c, reason: collision with root package name */
    public a f17206c;

    /* renamed from: d, reason: collision with root package name */
    public ar.n f17207d;

    /* renamed from: e, reason: collision with root package name */
    public int f17208e;

    /* renamed from: f, reason: collision with root package name */
    public u.y f17209f;

    /* renamed from: g, reason: collision with root package name */
    public u.a0 f17210g;

    public k1(v vVar) {
        this.f17204a = vVar;
    }

    public static boolean a(d0 d0Var, u.a0 a0Var) {
        br.l.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        return !br.l.a(d0Var.m().f17143f, a0Var.g(d0Var));
    }

    public final boolean b() {
        if (this.f17204a != null) {
            a aVar = this.f17206c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final n0 c(Object obj) {
        n0 n0VarN;
        v vVar = this.f17204a;
        return (vVar == null || (n0VarN = vVar.n(this, obj)) == null) ? n0.IGNORED : n0VarN;
    }

    public final void d() {
        v vVar = this.f17204a;
        if (vVar != null) {
            vVar.K = true;
            vVar.N.V();
        }
        this.f17204a = null;
        this.f17209f = null;
        this.f17210g = null;
        this.f17207d = null;
    }

    public final void e(boolean z10) {
        int i10 = this.f17205b;
        this.f17205b = z10 ? i10 | 32 : i10 & (-33);
    }
}
