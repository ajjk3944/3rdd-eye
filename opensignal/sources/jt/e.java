package jt;

import ht.b0;
import ht.c1;
import ht.d1;
import ht.g0;
import ht.m0;
import ht.p0;
import ht.r;
import ht.w;
import ht.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import rr.r0;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13841a = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final e f13842d = new e();

    /* JADX WARN: Multi-variable type inference failed */
    public static b0 Q(b0 b0Var) {
        x xVarB;
        m0 m0VarZ = b0Var.Z();
        r0 r0Var = null;
        if (m0VarZ instanceof us.c) {
            us.c cVar = (us.c) m0VarZ;
            p0 p0Var = cVar.f23691a;
            p0 p0Var2 = p0Var.a() == d1.IN_VARIANCE ? p0Var : null;
            c1 c1VarK0 = (p0Var2 == null || (xVarB = p0Var2.b()) == null) ? null : xVarB.k0();
            if (cVar.f23692b == null) {
                Collection collectionQ = cVar.q();
                ArrayList arrayList = new ArrayList(mq.p.a0(collectionQ, 10));
                Iterator it = collectionQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x) it.next()).k0());
                }
                cVar.f23692b = new i(p0Var, new ft.d(1, arrayList), r0Var, 8);
            }
            lt.b bVar = lt.b.FOR_SUBTYPING;
            i iVar = cVar.f23692b;
            br.l.b(iVar);
            return new h(bVar, iVar, c1VarK0, b0Var.X(), b0Var.c0(), 32);
        }
        if (!(m0VarZ instanceof w) || !b0Var.c0()) {
            return b0Var;
        }
        w wVar = (w) m0VarZ;
        LinkedHashSet linkedHashSet = wVar.f10951b;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            arrayList2.add(se.b.J((x) it2.next()));
            z10 = true;
        }
        if (z10) {
            x xVar = wVar.f10950a;
            c1 c1VarJ = xVar != null ? se.b.J(xVar) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            w wVar2 = new w(linkedHashSet2);
            wVar2.f10950a = c1VarJ;
            r0Var = wVar2;
        }
        if (r0Var != null) {
            wVar = r0Var;
        }
        return wVar.b();
    }

    @Override // jt.b
    public boolean A(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        return dVar instanceof is.f;
    }

    @Override // jt.b
    public m0 B(lt.e eVar) {
        return g.W(eVar);
    }

    @Override // jt.b
    public b0 C(lt.d dVar) {
        b0 b0VarY;
        br.l.e(dVar, "<this>");
        r rVarG = g.g(dVar);
        if (rVarG != null && (b0VarY = g.Y(rVarG)) != null) {
            return b0VarY;
        }
        b0 b0VarH = g.h(dVar);
        br.l.b(b0VarH);
        return b0VarH;
    }

    @Override // jt.b
    public boolean D(lt.g gVar) {
        return g.A(gVar);
    }

    @Override // jt.b
    public boolean E(lt.g gVar) {
        return g.D(gVar);
    }

    @Override // jt.b
    public boolean F(c1 c1Var) {
        br.l.e(c1Var, "<this>");
        return g.F(h0(c1Var)) != g.F(C(c1Var));
    }

    @Override // jt.b
    public Collection G(lt.g gVar) {
        return g.V(gVar);
    }

    @Override // jt.b
    public boolean H(lt.g gVar, lt.g gVar2) {
        return g.b(gVar, gVar2);
    }

    @Override // jt.b
    public lt.i I(p0 p0Var) {
        return g.t(p0Var);
    }

    @Override // jt.b
    public g0 J(lt.d dVar) {
        return g.i(dVar);
    }

    @Override // jt.b
    public boolean K(lt.e eVar) {
        br.l.e(eVar, "<this>");
        return g.G(p(eVar)) && !g.H(eVar);
    }

    @Override // jt.b
    public lt.c L(lt.e eVar) {
        return g.e(this, eVar);
    }

    @Override // jt.b
    public lt.i M(r0 r0Var) {
        br.l.e(r0Var, "$receiver");
        d1 d1VarN = r0Var.N();
        br.l.d(d1VarN, "this.variance");
        return vc.e.k(d1VarN);
    }

    @Override // jt.b
    public boolean N(lt.g gVar) {
        return g.E(gVar);
    }

    @Override // jt.b
    public b0 O(ht.n nVar) {
        return g.Q(nVar);
    }

    @Override // jt.b
    public boolean P(lt.e eVar) {
        br.l.e(eVar, "<this>");
        return g.D(g.W(eVar));
    }

    @Override // jt.b
    public boolean R(lt.g gVar) {
        return g.z(gVar);
    }

    @Override // jt.b
    public c1 S(ArrayList arrayList) {
        b0 b0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (c1) mq.o.I0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            z10 = z10 || ht.c.i(c1Var);
            if (c1Var instanceof b0) {
                b0Var = (b0) c1Var;
            } else {
                if (!(c1Var instanceof r)) {
                    throw new bf.n();
                }
                b0Var = ((r) c1Var).f10938d;
                z11 = true;
            }
            arrayList2.add(b0Var);
        }
        if (z10) {
            return kt.k.c(kt.j.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        p pVar = p.f13862a;
        if (!z11) {
            return pVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(ht.c.y((c1) it2.next()));
        }
        return ht.e.j(pVar.b(arrayList2), pVar.b(arrayList3));
    }

    @Override // jt.b
    public boolean T(lt.e eVar, lt.e eVar2) {
        return g.w(eVar, eVar2);
    }

    @Override // jt.b
    public b0 V(lt.e eVar, boolean z10) {
        return g.Z(eVar, z10);
    }

    @Override // jt.b
    public p0 W(us.b bVar) {
        return g.T(bVar);
    }

    @Override // jt.b
    public boolean X(lt.g gVar) {
        return g.G(gVar);
    }

    @Override // jt.b
    public c1 Y(lt.d dVar) {
        return g.P(dVar);
    }

    @Override // jt.b
    public p0 Z(lt.d dVar, int i10) {
        return g.p(dVar, i10);
    }

    @Override // jt.b
    public void a(lt.d dVar) {
        br.l.e(dVar, "<this>");
        g.g(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jt.b
    public p0 a0(lt.f fVar, int i10) {
        br.l.e(fVar, "<this>");
        if (fVar instanceof lt.e) {
            return g.p((lt.d) fVar, i10);
        }
        if (fVar instanceof lt.a) {
            E e4 = ((lt.a) fVar).get(i10);
            br.l.d(e4, "get(index)");
            return (p0) e4;
        }
        throw new IllegalStateException(("unknown type argument list type: " + fVar + ", " + br.x.f2918a.b(fVar.getClass())).toString());
    }

    @Override // jt.b
    public i b(lt.c cVar) {
        return g.X(cVar);
    }

    @Override // jt.b
    public b0 b0(r rVar) {
        return g.N(rVar);
    }

    @Override // jt.b
    public lt.f c(lt.e eVar) {
        return g.d(eVar);
    }

    @Override // jt.b
    public void d0(lt.e eVar) {
        g.L(eVar);
    }

    @Override // jt.b
    public lt.e e(lt.e eVar) {
        b0 b0VarQ;
        br.l.e(eVar, "<this>");
        ht.n nVarF = g.f(eVar);
        return (nVarF == null || (b0VarQ = g.Q(nVarF)) == null) ? eVar : b0VarQ;
    }

    @Override // jt.b
    public int e0(lt.g gVar) {
        return g.R(gVar);
    }

    @Override // jt.b
    public a f(lt.e eVar) {
        return g.U(this, eVar);
    }

    @Override // jt.b
    public Collection f0(lt.e eVar) {
        return g.S(this, eVar);
    }

    @Override // jt.b
    public int g(lt.d dVar) {
        return g.c(dVar);
    }

    @Override // jt.b
    public boolean g0(p0 p0Var) {
        return g.K(p0Var);
    }

    @Override // jt.b
    public lt.d h(lt.d dVar) {
        return g.a0(this, dVar);
    }

    @Override // jt.b
    public b0 h0(lt.d dVar) {
        b0 b0VarN;
        br.l.e(dVar, "<this>");
        r rVarG = g.g(dVar);
        if (rVarG != null && (b0VarN = g.N(rVarG)) != null) {
            return b0VarN;
        }
        b0 b0VarH = g.h(dVar);
        br.l.b(b0VarH);
        return b0VarH;
    }

    @Override // jt.b
    public ht.n i(lt.e eVar) {
        return g.f(eVar);
    }

    @Override // jt.b
    public r0 i0(lt.g gVar, int i10) {
        return g.q(gVar, i10);
    }

    @Override // jt.b
    public lt.b j(lt.c cVar) {
        return g.k(cVar);
    }

    @Override // jt.b
    public boolean j0(lt.c cVar) {
        return cVar instanceof us.a;
    }

    @Override // jt.b
    public b0 k(r rVar) {
        return g.Y(rVar);
    }

    @Override // jt.b
    public boolean k0(lt.e eVar) {
        br.l.e(eVar, "<this>");
        return g.y(g.W(eVar));
    }

    @Override // jt.b
    public boolean l(lt.g gVar) {
        return g.y(gVar);
    }

    @Override // jt.b
    public p0 l0(lt.e eVar, int i10) {
        br.l.e(eVar, "<this>");
        if (i10 < 0 || i10 >= g.c(eVar)) {
            return null;
        }
        return g.p(eVar, i10);
    }

    @Override // jt.b
    public c1 m(p0 p0Var) {
        return g.r(p0Var);
    }

    @Override // jt.b
    public void m0(lt.e eVar) {
        g.M(eVar);
    }

    @Override // jt.b
    public c1 n(lt.e eVar, lt.e eVar2) {
        return g.m(this, eVar, eVar2);
    }

    @Override // jt.b
    public boolean n0(lt.e eVar) {
        br.l.e(eVar, "<this>");
        b0 b0VarH = g.h(eVar);
        return (b0VarH != null ? g.e(this, b0VarH) : null) != null;
    }

    @Override // jt.b
    public boolean o(lt.d dVar) {
        br.l.e(dVar, "<this>");
        b0 b0VarH = g.h(dVar);
        return (b0VarH != null ? g.f(b0VarH) : null) != null;
    }

    @Override // jt.b
    public int o0(lt.f fVar) {
        br.l.e(fVar, "<this>");
        if (fVar instanceof lt.e) {
            return g.c((lt.d) fVar);
        }
        if (fVar instanceof lt.a) {
            return ((lt.a) fVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + fVar + ", " + br.x.f2918a.b(fVar.getClass())).toString());
    }

    @Override // jt.b
    public m0 p(lt.d dVar) {
        br.l.e(dVar, "<this>");
        b0 b0VarH = g.h(dVar);
        if (b0VarH == null) {
            b0VarH = h0(dVar);
        }
        return g.W(b0VarH);
    }

    @Override // jt.b
    public b0 p0(lt.e eVar, lt.b bVar) {
        return g.j(eVar, bVar);
    }

    @Override // jt.b
    public boolean q(lt.c cVar) {
        return g.J(cVar);
    }

    public lt.d r(lt.d dVar) {
        b0 b0VarZ;
        br.l.e(dVar, "<this>");
        b0 b0VarH = g.h(dVar);
        return (b0VarH == null || (b0VarZ = g.Z(b0VarH, true)) == null) ? dVar : b0VarZ;
    }

    @Override // jt.b
    public r s(lt.d dVar) {
        return g.g(dVar);
    }

    @Override // jt.b
    public c1 t(lt.c cVar) {
        return g.O(cVar);
    }

    @Override // jt.b
    public boolean u(lt.e eVar) {
        return g.F(eVar);
    }

    @Override // jt.b
    public boolean v(r0 r0Var, lt.g gVar) {
        return g.v(r0Var, gVar);
    }

    @Override // jt.b
    public boolean w(lt.g gVar) {
        return g.x(gVar);
    }

    @Override // jt.b
    public b0 x(lt.d dVar) {
        return g.h(dVar);
    }

    @Override // jt.b
    public boolean y(lt.e eVar) {
        return g.B(eVar);
    }

    public c1 z(lt.d dVar) {
        c1 c1VarJ;
        br.l.e(dVar, "type");
        if (!(dVar instanceof x)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c1 c1VarK0 = ((x) dVar).k0();
        if (c1VarK0 instanceof b0) {
            c1VarJ = Q((b0) c1VarK0);
        } else {
            if (!(c1VarK0 instanceof r)) {
                throw new bf.n();
            }
            r rVar = (r) c1VarK0;
            b0 b0Var = rVar.f10939g;
            b0 b0Var2 = rVar.f10938d;
            b0 b0VarQ = Q(b0Var2);
            b0 b0VarQ2 = Q(b0Var);
            c1VarJ = (b0VarQ == b0Var2 && b0VarQ2 == b0Var) ? c1VarK0 : ht.e.j(b0VarQ, b0VarQ2);
        }
        x xVarE = ht.c.e(c1VarK0);
        return ht.c.A(c1VarJ, xVarE != null ? z(xVarE) : null);
    }

    @Override // jt.b
    public void d(lt.e eVar, lt.g gVar) {
    }
}
