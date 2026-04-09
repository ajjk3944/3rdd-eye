package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public w f34867a;

    /* renamed from: b, reason: collision with root package name */
    public int f34868b;

    /* renamed from: c, reason: collision with root package name */
    public a f34869c;

    /* renamed from: d, reason: collision with root package name */
    public mk.e f34870d;

    /* renamed from: e, reason: collision with root package name */
    public int f34871e;

    /* renamed from: f, reason: collision with root package name */
    public x.z f34872f;
    public x.e0 g;

    public m1(w wVar) {
        this.f34867a = wVar;
    }

    public static boolean a(d0 d0Var, x.e0 e0Var) {
        nk.k.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        j2 j2Var = d0Var.f34763c;
        if (j2Var == null) {
            j2Var = e.g;
        }
        return !j2Var.a(d0Var.h().f34756f, e0Var.g(d0Var));
    }

    public final boolean b() {
        if (this.f34867a != null) {
            a aVar = this.f34869c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final n0 c(Object obj) {
        n0 n0VarS;
        w wVar = this.f34867a;
        return (wVar == null || (n0VarS = wVar.s(this, obj)) == null) ? n0.f34877a : n0VarS;
    }

    public final void d() {
        w wVar = this.f34867a;
        if (wVar != null) {
            wVar.f35004o = true;
            wVar.f35009t.l();
        }
        this.f34867a = null;
        this.f34872f = null;
        this.g = null;
        this.f34870d = null;
    }

    public final void e(boolean z3) {
        int i4 = this.f34868b;
        this.f34868b = z3 ? i4 | 32 : i4 & (-33);
    }
}
