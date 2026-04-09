package u3;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f23235a;

    /* renamed from: b, reason: collision with root package name */
    public k3.d[] f23236b;

    public y0() {
        this(new h1());
    }

    public final void a() {
        k3.d[] dVarArr = this.f23236b;
        if (dVarArr != null) {
            k3.d dVarF = dVarArr[0];
            k3.d dVarF2 = dVarArr[1];
            h1 h1Var = this.f23235a;
            if (dVarF2 == null) {
                dVarF2 = h1Var.f23176a.f(2);
            }
            if (dVarF == null) {
                dVarF = h1Var.f23176a.f(1);
            }
            g(k3.d.a(dVarF, dVarF2));
            k3.d dVar = this.f23236b[se.b.G(16)];
            if (dVar != null) {
                f(dVar);
            }
            k3.d dVar2 = this.f23236b[se.b.G(32)];
            if (dVar2 != null) {
                d(dVar2);
            }
            k3.d dVar3 = this.f23236b[se.b.G(64)];
            if (dVar3 != null) {
                h(dVar3);
            }
        }
    }

    public abstract h1 b();

    public void c(int i10, k3.d dVar) {
        if (this.f23236b == null) {
            this.f23236b = new k3.d[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f23236b[se.b.G(i11)] = dVar;
            }
        }
    }

    public abstract void e(k3.d dVar);

    public abstract void g(k3.d dVar);

    public y0(h1 h1Var) {
        this.f23235a = h1Var;
    }

    public void d(k3.d dVar) {
    }

    public void f(k3.d dVar) {
    }

    public void h(k3.d dVar) {
    }
}
