package rr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends ur.k {
    public final boolean B;
    public final ArrayList D;
    public final ht.k E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gt.l lVar, h hVar, qs.g gVar, boolean z10, int i10) {
        super(lVar, hVar, gVar, o0.f21696s);
        br.l.e(hVar, "container");
        this.B = z10;
        hr.d dVarT = vc.e.T(0, i10);
        ArrayList arrayList = new ArrayList(mq.p.a0(dVarT, 10));
        Iterator it = dVarT.iterator();
        while (true) {
            hr.c cVar = (hr.c) it;
            if (!cVar.f10868g) {
                this.D = arrayList;
                this.E = new ht.k(this, w.c(this), i3.g.H(xs.d.j(this).n().e()), lVar);
                return;
            } else {
                int iNextInt = cVar.nextInt();
                arrayList.add(ur.o0.y1(this, ht.d1.INVARIANT, qs.g.e("T" + iNextInt), iNextInt, lVar));
            }
        }
    }

    @Override // rr.f
    public final s0 B0() {
        return null;
    }

    @Override // rr.f
    public final boolean D() {
        return false;
    }

    @Override // ur.z
    public final at.n H(jt.f fVar) {
        return at.m.f2303b;
    }

    @Override // rr.f
    public final Collection I() {
        return mq.w.f16945a;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return false;
    }

    @Override // rr.f
    public final boolean P0() {
        return false;
    }

    @Override // rr.f
    public final ur.j R() {
        return null;
    }

    @Override // rr.f
    public final /* bridge */ /* synthetic */ at.n S() {
        return at.m.f2303b;
    }

    @Override // rr.f, rr.o, rr.x
    public final as.p c() {
        as.p pVar = p.f21701e;
        br.l.d(pVar, "PUBLIC");
        return pVar;
    }

    @Override // rr.f
    public final g f() {
        return g.CLASS;
    }

    @Override // rr.f
    public final boolean g() {
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return sr.g.f22217a;
    }

    @Override // rr.f, rr.x
    public final z j() {
        return z.FINAL;
    }

    @Override // rr.f
    public final boolean k() {
        return false;
    }

    @Override // rr.j
    public final boolean m() {
        return this.B;
    }

    @Override // rr.f, rr.j
    public final List s() {
        return this.D;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // ur.k, rr.x
    public final boolean u() {
        return false;
    }

    @Override // rr.i
    public final ht.m0 v() {
        return this.E;
    }

    @Override // rr.f
    public final boolean w() {
        return false;
    }

    @Override // rr.f
    public final Collection z() {
        return mq.y.f16947a;
    }
}
