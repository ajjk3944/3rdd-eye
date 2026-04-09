package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x1 implements xk.v, u1 {

    /* renamed from: d, reason: collision with root package name */
    public static final g f35019d = new g();

    /* renamed from: a, reason: collision with root package name */
    public final ck.h f35020a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f35021b = this;

    /* renamed from: c, reason: collision with root package name */
    public volatile ck.h f35022c;

    public x1(ck.h hVar) {
        this.f35020a = hVar;
    }

    @Override // xk.v
    public final ck.h A() {
        ck.h hVarY;
        ck.h hVar = this.f35022c;
        if (hVar == null || hVar == f35019d) {
            h1.d dVar = (h1.d) this.f35020a.O(h1.d.f24803b);
            ck.h w1Var = dVar != null ? new w1(dVar, this) : ck.i.f2898a;
            synchronized (this.f35021b) {
                try {
                    ck.h hVar2 = this.f35022c;
                    if (hVar2 == null) {
                        ck.h hVar3 = this.f35020a;
                        hVarY = hVar3.y(new xk.a1((xk.y0) hVar3.O(xk.s.f37235b))).y(ck.i.f2898a).y(w1Var);
                    } else if (hVar2 == f35019d) {
                        ck.h hVar4 = this.f35020a;
                        xk.a1 a1Var = new xk.a1((xk.y0) hVar4.O(xk.s.f37235b));
                        a1Var.r(new i0(0));
                        hVarY = hVar4.y(a1Var).y(ck.i.f2898a).y(w1Var);
                    } else {
                        hVarY = hVar2;
                    }
                    this.f35022c = hVarY;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar = hVarY;
        }
        nk.k.b(hVar);
        return hVar;
    }

    @Override // u0.u1
    public final void a() {
        c();
    }

    @Override // u0.u1
    public final void b() {
        c();
    }

    public final void c() {
        synchronized (this.f35021b) {
            try {
                ck.h hVar = this.f35022c;
                if (hVar == null) {
                    this.f35022c = f35019d;
                } else {
                    xk.x.f(hVar, new i0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u0.u1
    public final void d() {
    }
}
