package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f1.c f26867a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.k f26868b;

    /* renamed from: c, reason: collision with root package name */
    public final x.e0 f26869c;

    public b0(f1.c cVar, i0.k kVar) {
        this.f26867a = cVar;
        this.f26868b = kVar;
        long[] jArr = x.l0.f36914a;
        this.f26869c = new x.e0();
    }

    public final mk.e a(int i4, Object obj, Object obj2) {
        x.e0 e0Var = this.f26869c;
        a0 a0Var = (a0) e0Var.g(obj);
        if (a0Var != null && a0Var.f26858c == i4 && nk.k.a(a0Var.f26857b, obj2)) {
            c1.h hVar = a0Var.f26859d;
            if (hVar != null) {
                return hVar;
            }
            c1.h hVar2 = new c1.h(818252804, true, new d0.d1(1, a0Var.f26860e, a0Var));
            a0Var.f26859d = hVar2;
            return hVar2;
        }
        a0 a0Var2 = new a0(this, i4, obj, obj2);
        e0Var.m(obj, a0Var2);
        c1.h hVar3 = a0Var2.f26859d;
        if (hVar3 != null) {
            return hVar3;
        }
        c1.h hVar4 = new c1.h(818252804, true, new d0.d1(1, this, a0Var2));
        a0Var2.f26859d = hVar4;
        return hVar4;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            a0 a0Var = (a0) this.f26869c.g(obj);
            if (a0Var != null) {
                return a0Var.f26857b;
            }
            i0.j jVar = (i0.j) this.f26868b.invoke();
            int iE = jVar.f25429d.e(obj);
            if (iE != -1) {
                jVar.b(iE);
            }
        }
        return null;
    }
}
