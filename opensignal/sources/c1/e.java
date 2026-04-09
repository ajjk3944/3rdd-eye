package c1;

import br.w;
import x1.k;
import x1.u;
import x1.y1;
import z0.l;

/* loaded from: classes.dex */
public final class e extends l implements y1, u {

    /* renamed from: p, reason: collision with root package name */
    public e f3127p;

    /* renamed from: q, reason: collision with root package name */
    public e f3128q;

    /* renamed from: r, reason: collision with root package name */
    public long f3129r;

    @Override // z0.l
    public final void V() {
        this.f3128q = null;
        this.f3127p = null;
    }

    public final boolean c0(b9.e eVar) {
        e eVar2 = this.f3127p;
        if (eVar2 != null) {
            return eVar2.c0(eVar);
        }
        e eVar3 = this.f3128q;
        if (eVar3 != null) {
            return eVar3.c0(eVar);
        }
        return false;
    }

    public final void d0(b9.e eVar) {
        e eVar2 = this.f3128q;
        if (eVar2 != null) {
            eVar2.d0(eVar);
            return;
        }
        e eVar3 = this.f3127p;
        if (eVar3 != null) {
            eVar3.d0(eVar);
        }
    }

    public final void e0(b9.e eVar) {
        e eVar2 = this.f3128q;
        if (eVar2 != null) {
            eVar2.e0(eVar);
        }
        e eVar3 = this.f3127p;
        if (eVar3 != null) {
            eVar3.e0(eVar);
        }
        this.f3127p = null;
    }

    @Override // x1.y1
    public final Object f() {
        return c.f3122a;
    }

    public final void f0(b9.e eVar) {
        y1 y1Var;
        e eVar2;
        e eVar3 = this.f3127p;
        if (eVar3 == null || !se.b.c(eVar3, vc.e.w(eVar))) {
            if (this.f26495b.f26506o) {
                w wVar = new w();
                k.u(this, new d(wVar, this, eVar, 0));
                y1Var = (y1) wVar.f2917a;
            } else {
                y1Var = null;
            }
            eVar2 = (e) y1Var;
        } else {
            eVar2 = eVar3;
        }
        if (eVar2 != null && eVar3 == null) {
            eVar2.d0(eVar);
            eVar2.f0(eVar);
            e eVar4 = this.f3128q;
            if (eVar4 != null) {
                eVar4.e0(eVar);
            }
        } else if (eVar2 == null && eVar3 != null) {
            e eVar5 = this.f3128q;
            if (eVar5 != null) {
                eVar5.d0(eVar);
                eVar5.f0(eVar);
            }
            eVar3.e0(eVar);
        } else if (!br.l.a(eVar2, eVar3)) {
            if (eVar2 != null) {
                eVar2.d0(eVar);
                eVar2.f0(eVar);
            }
            if (eVar3 != null) {
                eVar3.e0(eVar);
            }
        } else if (eVar2 != null) {
            eVar2.f0(eVar);
        } else {
            e eVar6 = this.f3128q;
            if (eVar6 != null) {
                eVar6.f0(eVar);
            }
        }
        this.f3127p = eVar2;
    }

    public final void g0(b9.e eVar) {
        e eVar2 = this.f3128q;
        if (eVar2 != null) {
            eVar2.g0(eVar);
            return;
        }
        e eVar3 = this.f3127p;
        if (eVar3 != null) {
            eVar3.g0(eVar);
        }
    }

    @Override // x1.u
    public final void h(long j) {
        this.f3129r = j;
    }
}
