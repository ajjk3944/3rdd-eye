package ft;

import dt.x;
import h7.h0;
import ir.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ls.a0;
import ls.d1;
import ls.e1;
import ls.q0;
import ls.w0;
import mq.b0;
import p.v2;
import rr.m0;
import rr.n0;
import rr.o0;
import rr.p0;
import rr.s0;
import rr.z;

/* loaded from: classes.dex */
public final class i extends ur.b implements rr.l {
    public final o0 B;
    public final qs.b D;
    public final z E;
    public final as.p F;
    public final rr.g G;
    public final al.b H;
    public final at.o I;
    public final es.h J;
    public final n0 K;
    public final kg.r L;
    public final rr.l M;
    public final gt.h N;
    public final gt.i O;
    public final gt.i P;
    public final gt.h Q;
    public final dt.u R;
    public final sr.h S;

    /* renamed from: x, reason: collision with root package name */
    public final ls.j f9086x;

    /* renamed from: y, reason: collision with root package name */
    public final ns.a f9087y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(al.b bVar, ls.j jVar, ns.f fVar, ns.a aVar, o0 o0Var) {
        rr.g gVar;
        ns.h hVar;
        kg.r rVar;
        super(((dt.k) bVar.f810b).f7493a, io.sentry.config.a.T(fVar, jVar.f15803x).i());
        br.l.e(bVar, "outerContext");
        br.l.e(jVar, "classProto");
        br.l.e(fVar, "nameResolver");
        br.l.e(o0Var, "sourceElement");
        this.f9086x = jVar;
        this.f9087y = aVar;
        this.B = o0Var;
        this.D = io.sentry.config.a.T(fVar, jVar.f15803x);
        this.E = dt.l.d((a0) ns.e.f18532e.e(jVar.f15802r));
        this.F = f0.p((e1) ns.e.f18531d.e(jVar.f15802r));
        ls.i iVar = (ls.i) ns.e.f18533f.e(jVar.f15802r);
        switch (iVar == null ? -1 : x.f7551b[iVar.ordinal()]) {
            case 1:
                gVar = rr.g.CLASS;
                break;
            case 2:
                gVar = rr.g.INTERFACE;
                break;
            case 3:
                gVar = rr.g.ENUM_CLASS;
                break;
            case 4:
                gVar = rr.g.ENUM_ENTRY;
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                gVar = rr.g.ANNOTATION_CLASS;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                gVar = rr.g.OBJECT;
                break;
            default:
                gVar = rr.g.CLASS;
                break;
        }
        this.G = gVar;
        List list = jVar.B;
        br.l.d(list, "classProto.typeParameterList");
        w0 w0Var = jVar.f15795a0;
        br.l.d(w0Var, "classProto.typeTable");
        h0 h0Var = new h0(w0Var);
        d1 d1Var = jVar.f15797c0;
        br.l.d(d1Var, "classProto.versionRequirementTable");
        if (d1Var.f15754d.size() == 0) {
            hVar = ns.h.f18553a;
        } else {
            br.l.d(d1Var.f15754d, "table.requirementList");
            hVar = new ns.h();
        }
        al.b bVarB = bVar.b(this, list, fVar, h0Var, hVar, aVar);
        dt.k kVar = (dt.k) bVarB.f810b;
        this.H = bVarB;
        rr.g gVar2 = rr.g.ENUM_CLASS;
        this.I = gVar == gVar2 ? new at.r(kVar.f7493a, this) : at.m.f2303b;
        this.J = new es.h(this);
        p0 p0Var = n0.f21691d;
        gt.l lVar = kVar.f7493a;
        gt.l lVar2 = kVar.f7493a;
        ((jt.l) kVar.f7507q).getClass();
        es.l lVar3 = new es.l(1, 2, this);
        p0Var.getClass();
        br.l.e(lVar, "storageManager");
        this.K = new n0(this, lVar, lVar3);
        if (gVar == gVar2) {
            rVar = new kg.r();
            rVar.f14398r = this;
            List list2 = this.f9086x.P;
            br.l.d(list2, "classProto.enumEntryList");
            int iP = b0.P(mq.p.a0(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
            for (Object obj : list2) {
                linkedHashMap.put(io.sentry.config.a.Y((ns.f) this.H.f811c, ((ls.t) obj).f15881r), obj);
            }
            rVar.f14395a = linkedHashMap;
            i iVar2 = (i) rVar.f14398r;
            rVar.f14396d = ((dt.k) iVar2.H.f810b).f7493a.c(new c7.b(rVar, 7, iVar2));
            gt.l lVar4 = ((dt.k) ((i) rVar.f14398r).H.f810b).f7493a;
            as.x xVar = new as.x(23, rVar);
            lVar4.getClass();
            rVar.f14397g = new gt.i(lVar4, xVar);
        } else {
            rVar = null;
        }
        this.L = rVar;
        rr.l lVar5 = (rr.l) bVar.f812d;
        this.M = lVar5;
        h hVar2 = new h(this, 4);
        lVar2.getClass();
        this.N = new gt.h(lVar2, hVar2);
        this.O = new gt.i(lVar2, new h(this, 3));
        new gt.h(lVar2, new h(this, 2));
        this.P = new gt.i(lVar2, new h(this, 5));
        this.Q = new gt.h(lVar2, new h(this, 6));
        ns.f fVar2 = (ns.f) bVarB.f811c;
        h0 h0Var2 = (h0) bVarB.f813e;
        i iVar3 = lVar5 instanceof i ? (i) lVar5 : null;
        this.R = new dt.u(jVar, fVar2, h0Var2, o0Var, iVar3 != null ? iVar3.R : null);
        this.S = !ns.e.f18530c.e(jVar.f15802r).booleanValue() ? sr.g.f22217a : new w(lVar2, new h(this, 1));
    }

    @Override // rr.f
    public final s0 B0() {
        return (s0) this.Q.c();
    }

    @Override // rr.f
    public final boolean D() {
        return ns.e.f18537l.e(this.f9086x.f15802r).booleanValue();
    }

    @Override // ur.z
    public final at.n H(jt.f fVar) {
        n0 n0Var = this.K;
        xs.d.j(n0Var.f21693a);
        return (at.n) io.sentry.config.a.Z(n0Var.f21695c, n0.f21692e[0]);
    }

    @Override // rr.f
    public final Collection I() {
        return (Collection) this.P.c();
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // ur.b, rr.f
    public final List K0() {
        al.b bVar = this.H;
        h0 h0Var = (h0) bVar.f813e;
        ls.j jVar = this.f9086x;
        br.l.e(jVar, "<this>");
        List list = jVar.I;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = jVar.J;
            br.l.d(list2, "contextReceiverTypeIdList");
            ArrayList arrayList = new ArrayList(mq.p.a0(list2, 10));
            for (Integer num : list2) {
                br.l.d(num, "it");
                arrayList.add(h0Var.x(num.intValue()));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ur.v(R0(), new bt.a(this, ((v2) bVar.f809a).m((q0) it.next()), (qs.g) null), sr.g.f22217a));
        }
        return arrayList2;
    }

    public final g L() {
        ((jt.l) ((dt.k) this.H.f810b).f7507q).getClass();
        n0 n0Var = this.K;
        xs.d.j(n0Var.f21693a);
        return (g) ((at.n) io.sentry.config.a.Z(n0Var.f21695c, n0.f21692e[0]));
    }

    @Override // rr.x
    public final boolean M() {
        return ns.e.j.e(this.f9086x.f15802r).booleanValue();
    }

    @Override // rr.f
    public final boolean P0() {
        return ns.e.f18535h.e(this.f9086x.f15802r).booleanValue();
    }

    @Override // rr.f
    public final ur.j R() {
        return (ur.j) this.N.c();
    }

    @Override // rr.f
    public final at.n S() {
        return this.I;
    }

    public final ht.b0 X(qs.g gVar) {
        Iterator it = L().b(gVar, zr.d.FROM_DESERIALIZATION).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((m0) next).j0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        m0 m0Var = (m0) obj;
        return (ht.b0) (m0Var != null ? m0Var.getType() : null);
    }

    @Override // rr.f, rr.o, rr.x
    public final as.p c() {
        return this.F;
    }

    @Override // rr.f
    public final rr.g f() {
        return this.G;
    }

    @Override // rr.f
    public final boolean g() {
        if (!ns.e.k.e(this.f9086x.f15802r).booleanValue()) {
            return false;
        }
        ns.a aVar = this.f9087y;
        int i10 = aVar.f18520b;
        if (i10 >= 1) {
            if (i10 > 1) {
                return false;
            }
            int i11 = aVar.f18521c;
            if (i11 >= 4 && (i11 > 4 || aVar.f18522d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return this.S;
    }

    @Override // rr.m
    public final o0 h() {
        return this.B;
    }

    @Override // rr.f, rr.x
    public final z j() {
        return this.E;
    }

    @Override // rr.f
    public final boolean k() {
        return ns.e.k.e(this.f9086x.f15802r).booleanValue() && this.f9087y.a(1, 4, 2);
    }

    @Override // rr.j
    public final boolean m() {
        return ns.e.f18534g.e(this.f9086x.f15802r).booleanValue();
    }

    @Override // rr.l
    public final rr.l o() {
        return this.M;
    }

    @Override // rr.f, rr.j
    public final List s() {
        return ((v2) this.H.f809a).d();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(M() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // rr.x
    public final boolean u() {
        return ns.e.f18536i.e(this.f9086x.f15802r).booleanValue();
    }

    @Override // rr.i
    public final ht.m0 v() {
        return this.J;
    }

    @Override // rr.f
    public final boolean w() {
        return ns.e.f18533f.e(this.f9086x.f15802r) == ls.i.COMPANION_OBJECT;
    }

    @Override // rr.f
    public final Collection z() {
        return (Collection) this.O.c();
    }
}
