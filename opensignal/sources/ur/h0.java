package ur;

import ht.s0;
import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class h0 extends r0 implements rr.m0 {
    public final boolean B;
    public gt.h D;
    public ar.a E;
    public final rr.z F;
    public as.p G;
    public Collection H;
    public final rr.m0 I;
    public final rr.c J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public List P;
    public v Q;
    public v R;
    public ArrayList S;
    public i0 T;
    public j0 U;
    public s V;
    public s W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(rr.l lVar, rr.m0 m0Var, sr.h hVar, rr.z zVar, as.p pVar, boolean z10, qs.g gVar, rr.c cVar, rr.o0 o0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(lVar, hVar, gVar, null, o0Var);
        if (lVar == null) {
            S0(0);
            throw null;
        }
        if (hVar == null) {
            S0(1);
            throw null;
        }
        if (zVar == null) {
            S0(2);
            throw null;
        }
        if (pVar == null) {
            S0(3);
            throw null;
        }
        if (gVar == null) {
            S0(4);
            throw null;
        }
        if (cVar == null) {
            S0(5);
            throw null;
        }
        if (o0Var == null) {
            S0(6);
            throw null;
        }
        this.B = z10;
        this.H = null;
        this.P = Collections.EMPTY_LIST;
        this.F = zVar;
        this.G = pVar;
        this.I = m0Var == null ? this : m0Var;
        this.J = cVar;
        this.K = z11;
        this.L = z12;
        this.M = z13;
        this.N = z14;
        this.O = z15;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void S0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.h0.S0(int):void");
    }

    public static h0 w1(rr.l lVar, rr.z zVar, as.p pVar, boolean z10, qs.g gVar, rr.c cVar, rr.o0 o0Var) {
        if (lVar == null) {
            S0(7);
            throw null;
        }
        if (zVar == null) {
            S0(9);
            throw null;
        }
        if (pVar == null) {
            S0(10);
            throw null;
        }
        if (gVar == null) {
            S0(11);
            throw null;
        }
        if (cVar == null) {
            S0(12);
            throw null;
        }
        if (o0Var != null) {
            return new h0(lVar, null, sr.g.f22217a, zVar, pVar, z10, gVar, cVar, o0Var, false, false, false, false, false);
        }
        S0(13);
        throw null;
    }

    public static rr.u y1(x0 x0Var, rr.l0 l0Var) {
        if (l0Var == null) {
            S0(31);
            throw null;
        }
        rr.u uVar = ((g0) l0Var).I;
        if (uVar != null) {
            return uVar.e(x0Var);
        }
        return null;
    }

    public Object A(rr.a aVar) {
        return null;
    }

    public final void A1(gt.h hVar, ar.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.E = aVar;
        if (hVar == null) {
            hVar = (gt.h) aVar.c();
        }
        this.D = hVar;
    }

    public final void C1(ht.x xVar, List list, v vVar, v vVar2, List list2) {
        if (xVar == null) {
            S0(17);
            throw null;
        }
        if (list == null) {
            S0(18);
            throw null;
        }
        if (list2 == null) {
            S0(19);
            throw null;
        }
        this.f23665y = xVar;
        this.S = new ArrayList(list);
        this.R = vVar2;
        this.Q = vVar;
        this.P = list2;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return this.M;
    }

    @Override // rr.m0
    public final boolean O() {
        return this.O;
    }

    @Override // rr.u0
    public final vs.g U() {
        gt.h hVar = this.D;
        if (hVar != null) {
            return (vs.g) hVar.c();
        }
        return null;
    }

    @Override // rr.m0
    public final i0 b() {
        return this.T;
    }

    @Override // rr.o, rr.x
    public final as.p c() {
        as.p pVar = this.G;
        if (pVar != null) {
            return pVar;
        }
        S0(25);
        throw null;
    }

    @Override // rr.m0
    public final j0 d() {
        return this.U;
    }

    @Override // rr.d
    public final rr.c f() {
        rr.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        S0(39);
        throw null;
    }

    @Override // ur.r0, rr.b
    public final v f0() {
        return this.Q;
    }

    @Override // ur.r0, rr.b
    public final List getTypeParameters() {
        ArrayList arrayList = this.S;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(n.t1(this)));
    }

    @Override // ur.r0, rr.b
    public final ht.x i() {
        ht.x type = getType();
        if (type != null) {
            return type;
        }
        S0(23);
        throw null;
    }

    @Override // rr.u0
    public final boolean i0() {
        return this.B;
    }

    @Override // rr.x
    public final rr.z j() {
        rr.z zVar = this.F;
        if (zVar != null) {
            return zVar;
        }
        S0(24);
        throw null;
    }

    @Override // ur.r0, rr.b
    public final v j0() {
        return this.R;
    }

    @Override // rr.m0
    public final s l0() {
        return this.W;
    }

    @Override // rr.m0
    public final s n0() {
        return this.V;
    }

    @Override // rr.b
    public final List o0() {
        List list = this.P;
        if (list != null) {
            return list;
        }
        S0(22);
        throw null;
    }

    @Override // rr.b
    public final Collection p() {
        Collection collection = this.H;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        S0(41);
        throw null;
    }

    @Override // rr.u0
    public final boolean s0() {
        return this.K;
    }

    @Override // rr.m0
    public final ArrayList t() {
        ArrayList arrayList = new ArrayList(2);
        i0 i0Var = this.T;
        if (i0Var != null) {
            arrayList.add(i0Var);
        }
        j0 j0Var = this.U;
        if (j0Var != null) {
            arrayList.add(j0Var);
        }
        return arrayList;
    }

    public boolean u() {
        return this.N;
    }

    @Override // rr.d
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public final h0 V(rr.l lVar, rr.z zVar, as.p pVar, rr.c cVar) {
        com.google.android.exoplayer2.x0 x0Var = new com.google.android.exoplayer2.x0(this);
        if (lVar == null) {
            com.google.android.exoplayer2.x0.a(0);
            throw null;
        }
        x0Var.f4778b = lVar;
        x0Var.f4781e = null;
        x0Var.f4779c = zVar;
        if (pVar == null) {
            com.google.android.exoplayer2.x0.a(8);
            throw null;
        }
        x0Var.f4780d = pVar;
        if (cVar == null) {
            com.google.android.exoplayer2.x0.a(10);
            throw null;
        }
        x0Var.f4782f = cVar;
        x0Var.f4777a = false;
        h0 h0VarC = x0Var.c();
        if (h0VarC != null) {
            return h0VarC;
        }
        S0(42);
        throw null;
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.I(this, obj);
    }

    public h0 x1(rr.l lVar, rr.z zVar, as.p pVar, rr.m0 m0Var, rr.c cVar, qs.g gVar) {
        if (lVar == null) {
            S0(32);
            throw null;
        }
        if (zVar == null) {
            S0(33);
            throw null;
        }
        if (pVar == null) {
            S0(34);
            throw null;
        }
        if (cVar == null) {
            S0(35);
            throw null;
        }
        if (gVar == null) {
            S0(36);
            throw null;
        }
        return new h0(lVar, m0Var, getAnnotations(), zVar, pVar, this.B, gVar, cVar, rr.o0.f21696s, this.K, y(), this.M, u(), this.O);
    }

    public boolean y() {
        return this.L;
    }

    @Override // rr.d
    public final void y0(Collection collection) {
        if (collection != null) {
            this.H = collection;
        } else {
            S0(40);
            throw null;
        }
    }

    public final void z1(i0 i0Var, j0 j0Var, s sVar, s sVar2) {
        this.T = i0Var;
        this.U = j0Var;
        this.V = sVar;
        this.W = sVar2;
    }

    @Override // rr.q0
    public final rr.m0 e(x0 x0Var) {
        if (x0Var == null) {
            S0(27);
            throw null;
        }
        if (x0Var.f10955a.e()) {
            return this;
        }
        com.google.android.exoplayer2.x0 x0Var2 = new com.google.android.exoplayer2.x0(this);
        s0 s0VarF = x0Var.f();
        if (s0VarF == null) {
            com.google.android.exoplayer2.x0.a(15);
            throw null;
        }
        x0Var2.f4783g = s0VarF;
        x0Var2.f4781e = u1();
        return x0Var2.c();
    }

    @Override // ur.o
    /* renamed from: a */
    public final rr.m0 u1() {
        rr.m0 m0Var = this.I;
        rr.m0 m0VarU1 = m0Var == this ? this : m0Var.u1();
        if (m0VarU1 != null) {
            return m0VarU1;
        }
        S0(38);
        throw null;
    }

    public void B1(ht.x xVar) {
    }
}
