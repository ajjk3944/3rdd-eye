package l0;

import a6.e;
import c0.a0;
import e0.i;
import j1.f;
import j1.m;
import p2.h;
import p2.k;
import p2.t;
import p2.v;
import p2.w;
import p2.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends a0 {
    public boolean J;
    public mk.c K;
    public final e L;

    public d(final boolean z3, i iVar, boolean z10, h hVar, final mk.c cVar) {
        super(iVar, null, z10, hVar, new mk.a() { // from class: l0.c
            @Override // mk.a
            public final Object invoke() {
                cVar.invoke(Boolean.valueOf(!z3));
                return u.f37649a;
            }
        });
        this.J = z3;
        this.K = cVar;
        this.L = new e(15, this);
    }

    @Override // c0.a0
    public final void s0(x xVar) {
        r2.a aVar = this.J ? r2.a.f32728a : r2.a.f32729b;
        tk.c[] cVarArr = v.f31140a;
        w wVar = t.G;
        tk.c[] cVarArr2 = v.f31140a;
        tk.c cVar = cVarArr2[25];
        xVar.a(wVar, aVar);
        w wVar2 = t.f31129r;
        tk.c cVar2 = cVarArr2[9];
        xVar.a(wVar2, m.f27054b);
        f fVarA = ub.a.a(this.J);
        if (fVarA != null) {
            w wVar3 = t.f31130s;
            tk.c cVar3 = cVarArr2[10];
            xVar.a(wVar3, fVarA);
        }
        xVar.a(k.f31077h, new p2.a(null, new b7.u(14, xVar)));
    }
}
