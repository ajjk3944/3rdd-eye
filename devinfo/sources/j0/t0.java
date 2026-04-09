package j0;

import i2.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 extends i1.m implements u1 {

    /* renamed from: o, reason: collision with root package name */
    public mk.a f26978o;

    /* renamed from: p, reason: collision with root package name */
    public i0.d f26979p;

    /* renamed from: q, reason: collision with root package name */
    public d0.a1 f26980q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26981r;

    /* renamed from: s, reason: collision with root package name */
    public p2.i f26982s;

    /* renamed from: t, reason: collision with root package name */
    public final q0 f26983t = new q0(this, 0);

    /* renamed from: u, reason: collision with root package name */
    public q0 f26984u;

    public t0(mk.a aVar, i0.d dVar, d0.a1 a1Var, boolean z3) {
        this.f26978o = aVar;
        this.f26979p = dVar;
        this.f26980q = a1Var;
        this.f26981r = z3;
        p0();
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        tk.c[] cVarArr = p2.v.f31140a;
        p2.w wVar = p2.t.f31124m;
        tk.c[] cVarArr2 = p2.v.f31140a;
        tk.c cVar = cVarArr2[6];
        xVar.a(wVar, Boolean.TRUE);
        xVar.a(p2.t.J, this.f26983t);
        if (this.f26980q == d0.a1.f21662a) {
            p2.i iVar = this.f26982s;
            if (iVar == null) {
                nk.k.k("scrollAxisRange");
                throw null;
            }
            p2.w wVar2 = p2.t.f31133v;
            tk.c cVar2 = cVarArr2[13];
            xVar.a(wVar2, iVar);
        } else {
            p2.i iVar2 = this.f26982s;
            if (iVar2 == null) {
                nk.k.k("scrollAxisRange");
                throw null;
            }
            p2.w wVar3 = p2.t.f31132u;
            tk.c cVar3 = cVarArr2[12];
            xVar.a(wVar3, iVar2);
        }
        q0 q0Var = this.f26984u;
        if (q0Var != null) {
            xVar.a(p2.k.f31076f, new p2.a(null, q0Var));
        }
        xVar.a(p2.k.B, new p2.a(null, new c2.l0(22, new r0(this, 2))));
        i0.d dVar = this.f26979p;
        dVar.getClass();
        p2.c cVar4 = new p2.c(((Number) dVar.f25412a.getValue()).intValue(), 1);
        p2.w wVar4 = p2.t.f31119f;
        tk.c cVar5 = cVarArr2[23];
        xVar.a(wVar4, cVar4);
    }

    public final void p0() {
        this.f26982s = new p2.i(new r0(this, 0), new r0(this, 1));
        this.f26984u = this.f26981r ? new q0(this, 1) : null;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }
}
