package ft;

import h7.h0;
import ht.a1;
import ht.b0;
import ht.d1;
import ht.m0;
import ht.x0;
import java.util.List;
import ls.s0;
import rr.o0;

/* loaded from: classes.dex */
public final class u extends ur.o implements l, rr.j {
    public List B;
    public final ur.e D;
    public final gt.o E;
    public final s0 F;
    public final ns.f G;
    public final h0 H;
    public final ns.h I;
    public final k J;
    public b0 K;
    public b0 L;
    public List M;
    public b0 N;

    /* renamed from: y, reason: collision with root package name */
    public final as.p f9119y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(gt.o oVar, rr.l lVar, sr.h hVar, qs.g gVar, as.p pVar, s0 s0Var, ns.f fVar, h0 h0Var, ns.h hVar2, k kVar) {
        super(lVar, hVar, gVar, o0.f21696s);
        br.l.e(oVar, "storageManager");
        br.l.e(lVar, "containingDeclaration");
        br.l.e(pVar, "visibility");
        br.l.e(s0Var, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(h0Var, "typeTable");
        br.l.e(hVar2, "versionRequirementTable");
        this.f9119y = pVar;
        this.D = new ur.e(this);
        this.E = oVar;
        this.F = s0Var;
        this.G = fVar;
        this.H = h0Var;
        this.I = hVar2;
        this.J = kVar;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return false;
    }

    @Override // ft.l
    public final h0 T() {
        throw null;
    }

    @Override // ur.o, ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.i u1() {
        return this;
    }

    @Override // ft.l
    public final ns.f a0() {
        throw null;
    }

    @Override // ft.l
    public final k b0() {
        return this.J;
    }

    @Override // rr.x
    public final as.p c() {
        return this.f9119y;
    }

    @Override // rr.q0
    public final rr.m e(x0 x0Var) {
        br.l.e(x0Var, "substitutor");
        if (x0Var.f10955a.e()) {
            return this;
        }
        rr.l lVarO = o();
        br.l.d(lVarO, "containingDeclaration");
        sr.h annotations = getAnnotations();
        br.l.d(annotations, "annotations");
        qs.g name = getName();
        br.l.d(name, "name");
        u uVar = new u(this.E, lVarO, annotations, name, this.f9119y, this.F, this.G, this.H, this.I, this.J);
        List listS = s();
        b0 b0VarX1 = x1();
        d1 d1Var = d1.INVARIANT;
        uVar.y1(listS, ht.c.b(x0Var.g(b0VarX1, d1Var)), ht.c.b(x0Var.g(w1(), d1Var)));
        return uVar;
    }

    @Override // rr.j
    public final boolean m() {
        return a1.c(x1(), new j1.a(11, this), null);
    }

    @Override // rr.i
    public final b0 q() {
        b0 b0Var = this.N;
        if (b0Var != null) {
            return b0Var;
        }
        br.l.l("defaultTypeImpl");
        throw null;
    }

    @Override // rr.j
    public final List s() {
        List list = this.B;
        if (list != null) {
            return list;
        }
        br.l.l("declaredTypeParametersImpl");
        throw null;
    }

    @Override // ur.n, androidx.lifecycle.o
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // rr.x
    public final boolean u() {
        return false;
    }

    @Override // rr.i
    public final m0 v() {
        return this.D;
    }

    public final rr.f v1() {
        if (ht.c.i(w1())) {
            return null;
        }
        rr.i iVarP = w1().Z().p();
        if (iVarP instanceof rr.f) {
            return (rr.f) iVarP;
        }
        return null;
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.S(this, obj);
    }

    public final b0 w1() {
        b0 b0Var = this.L;
        if (b0Var != null) {
            return b0Var;
        }
        br.l.l("expandedType");
        throw null;
    }

    public final b0 x1() {
        b0 b0Var = this.K;
        if (b0Var != null) {
            return b0Var;
        }
        br.l.l("underlyingType");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y1(java.util.List r25, ht.b0 r26, ht.b0 r27) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.u.y1(java.util.List, ht.b0, ht.b0):void");
    }

    @Override // ur.o, ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.l u1() {
        return this;
    }

    @Override // ur.o
    public final rr.m u1() {
        return this;
    }
}
