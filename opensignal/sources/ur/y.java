package ur;

import com.google.android.gms.internal.measurement.e5;
import ht.a1;
import ht.d1;
import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rr.s0;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    public final z f23681a;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f23682d;

    /* renamed from: g, reason: collision with root package name */
    public x0 f23683g;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f23684r;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f23685x;

    /* renamed from: y, reason: collision with root package name */
    public ht.k f23686y;

    public y(z zVar, x0 x0Var) {
        this.f23681a = zVar;
        this.f23682d = x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void J(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.y.J(int):void");
    }

    @Override // rr.f
    public final s0 B0() {
        s0 s0VarB0 = this.f23681a.B0();
        if (s0VarB0 == null) {
            return null;
        }
        boolean z10 = s0VarB0 instanceof rr.v;
        x0 x0Var = this.f23682d;
        if (z10) {
            rr.v vVar = (rr.v) s0VarB0;
            qs.g gVar = vVar.f21719a;
            ht.b0 b0Var = (ht.b0) vVar.f21720b;
            if (b0Var != null && !x0Var.f10955a.e()) {
                b0Var = (ht.b0) K().i(b0Var, d1.INVARIANT);
            }
            return new rr.v(gVar, b0Var);
        }
        if (!(s0VarB0 instanceof rr.b0)) {
            throw new bf.n();
        }
        ArrayList arrayList = ((rr.b0) s0VarB0).f21676a;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lq.l lVar = (lq.l) it.next();
            qs.g gVar2 = (qs.g) lVar.f15571a;
            ht.b0 b0Var2 = (ht.b0) ((lt.e) lVar.f15572d);
            if (b0Var2 != null && !x0Var.f10955a.e()) {
                b0Var2 = (ht.b0) K().i(b0Var2, d1.INVARIANT);
            }
            arrayList2.add(new lq.l(gVar2, b0Var2));
        }
        return new rr.b0(arrayList2);
    }

    @Override // rr.f
    public final boolean D() {
        return this.f23681a.D();
    }

    @Override // ur.z
    public final at.n H(jt.f fVar) {
        at.n nVarH = this.f23681a.H(fVar);
        if (!this.f23682d.f10955a.e()) {
            return new at.s(nVarH, K());
        }
        if (nVarH != null) {
            return nVarH;
        }
        J(14);
        throw null;
    }

    @Override // rr.f
    public final at.n H0() {
        xs.d.i(ts.d.d(this.f23681a));
        return H(jt.f.f13843a);
    }

    @Override // rr.f
    public final Collection I() {
        Collection collectionI = this.f23681a.I();
        if (collectionI != null) {
            return collectionI;
        }
        J(31);
        throw null;
    }

    @Override // rr.x
    public final boolean I0() {
        return this.f23681a.I0();
    }

    public final x0 K() {
        if (this.f23683g == null) {
            x0 x0Var = this.f23682d;
            if (x0Var.f10955a.e()) {
                this.f23683g = x0Var;
            } else {
                List listO = this.f23681a.v().o();
                this.f23684r = new ArrayList(listO.size());
                this.f23683g = ht.c.u(listO, x0Var.f(), this, this.f23684r);
                ArrayList arrayList = this.f23684r;
                br.l.e(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((rr.r0) obj).m0()) {
                        arrayList2.add(obj);
                    }
                }
                this.f23685x = arrayList2;
            }
        }
        return this.f23683g;
    }

    @Override // rr.f
    public final List K0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        J(17);
        throw null;
    }

    @Override // rr.x
    public final boolean M() {
        return this.f23681a.M();
    }

    @Override // rr.f
    public final boolean P0() {
        return this.f23681a.P0();
    }

    @Override // rr.f
    public final j R() {
        return this.f23681a.R();
    }

    @Override // rr.f
    public final v R0() {
        throw new UnsupportedOperationException();
    }

    @Override // rr.f
    public final at.n S() {
        at.n nVarS = this.f23681a.S();
        if (nVarS != null) {
            return nVarS;
        }
        J(15);
        throw null;
    }

    @Override // ur.z, rr.f, rr.l, rr.i
    /* renamed from: a */
    public final rr.f u1() {
        rr.f fVarU1 = this.f23681a.u1();
        if (fVarU1 != null) {
            return fVarU1;
        }
        J(21);
        throw null;
    }

    @Override // rr.f, rr.o, rr.x
    public final as.p c() {
        as.p pVarC = this.f23681a.c();
        if (pVarC != null) {
            return pVarC;
        }
        J(27);
        throw null;
    }

    @Override // rr.q0
    public final rr.m e(x0 x0Var) {
        if (x0Var != null) {
            return x0Var.f10955a.e() ? this : new y(this, x0.e(x0Var.f(), K().f()));
        }
        J(23);
        throw null;
    }

    @Override // rr.f
    public final at.n e0(ht.s0 s0Var) {
        xs.d.i(ts.d.d(this));
        return x(s0Var, jt.f.f13843a);
    }

    @Override // rr.f
    public final rr.g f() {
        rr.g gVarF = this.f23681a.f();
        if (gVarF != null) {
            return gVarF;
        }
        J(25);
        throw null;
    }

    @Override // rr.f
    public final boolean g() {
        return this.f23681a.g();
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        sr.h annotations = this.f23681a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        J(19);
        throw null;
    }

    @Override // rr.l
    public final qs.g getName() {
        qs.g name = this.f23681a.getName();
        if (name != null) {
            return name;
        }
        J(20);
        throw null;
    }

    @Override // rr.m
    public final rr.o0 h() {
        return rr.o0.f21696s;
    }

    @Override // rr.f, rr.x
    public final rr.z j() {
        rr.z zVarJ = this.f23681a.j();
        if (zVarJ != null) {
            return zVarJ;
        }
        J(26);
        throw null;
    }

    @Override // rr.f
    public final boolean k() {
        return this.f23681a.k();
    }

    @Override // rr.j
    public final boolean m() {
        return this.f23681a.m();
    }

    @Override // rr.l
    public final rr.l o() {
        rr.l lVarO = this.f23681a.o();
        if (lVarO != null) {
            return lVarO;
        }
        J(22);
        throw null;
    }

    @Override // rr.f, rr.i
    public final ht.b0 q() {
        ht.i0 i0VarM;
        List listD = a1.d(v().o());
        sr.h annotations = getAnnotations();
        if (annotations.isEmpty()) {
            ht.i0.f10910d.getClass();
            i0VarM = ht.i0.f10911g;
        } else {
            bm.e eVar = ht.i0.f10910d;
            List listH = e5.H(new ht.i(annotations));
            eVar.getClass();
            i0VarM = bm.e.m(listH);
        }
        return ht.e.s(H0(), i0VarM, v(), listD, false);
    }

    @Override // rr.f, rr.j
    public final List s() {
        K();
        ArrayList arrayList = this.f23685x;
        if (arrayList != null) {
            return arrayList;
        }
        J(30);
        throw null;
    }

    @Override // rr.x
    public final boolean u() {
        return this.f23681a.u();
    }

    @Override // rr.i
    public final ht.m0 v() {
        ht.m0 m0VarV = this.f23681a.v();
        if (this.f23682d.f10955a.e()) {
            if (m0VarV != null) {
                return m0VarV;
            }
            J(0);
            throw null;
        }
        if (this.f23686y == null) {
            x0 x0VarK = K();
            Collection collectionQ = m0VarV.q();
            ArrayList arrayList = new ArrayList(collectionQ.size());
            Iterator it = collectionQ.iterator();
            while (it.hasNext()) {
                arrayList.add(x0VarK.i((ht.x) it.next(), d1.INVARIANT));
            }
            this.f23686y = new ht.k(this, this.f23684r, arrayList, gt.l.f9657e);
        }
        ht.k kVar = this.f23686y;
        if (kVar != null) {
            return kVar;
        }
        J(1);
        throw null;
    }

    @Override // rr.f
    public final boolean w() {
        return this.f23681a.w();
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.B(this, obj);
    }

    @Override // ur.z
    public final at.n x(ht.s0 s0Var, jt.f fVar) {
        at.n nVarX = this.f23681a.x(s0Var, fVar);
        if (!this.f23682d.f10955a.e()) {
            return new at.s(nVarX, K());
        }
        if (nVarX != null) {
            return nVarX;
        }
        J(7);
        throw null;
    }

    @Override // rr.f
    public final Collection z() {
        Collection<j> collectionZ = this.f23681a.z();
        ArrayList arrayList = new ArrayList(collectionZ.size());
        for (j jVar : collectionZ) {
            j jVar2 = jVar;
            jVar2.getClass();
            t tVarB1 = jVar2.B1(x0.f10954b);
            tVarB1.f23670x = jVar.a();
            tVarB1.t(jVar2.j());
            tVarB1.v(jVar2.c());
            tVarB1.C(jVar2.f());
            tVarB1.I = false;
            arrayList.add(((j) tVarB1.T.y1(tVarB1)).e(K()));
        }
        return arrayList;
    }

    @Override // rr.f
    public final at.n z0() {
        at.n nVarZ0 = this.f23681a.z0();
        if (nVarZ0 != null) {
            return nVarZ0;
        }
        J(28);
        throw null;
    }
}
