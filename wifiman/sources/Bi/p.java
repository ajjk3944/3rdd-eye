package bi;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC6506a;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import mh.InterfaceC6839p;
import pi.S;
import pi.u0;
import pi.v0;
import ri.C7610a;
import ri.EnumC7611b;
import ri.InterfaceC7612c;
import ri.InterfaceC7613d;
import ri.InterfaceC7614e;
import ri.InterfaceC7615f;
import ri.InterfaceC7616g;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;
import ri.InterfaceC7620k;
import ri.InterfaceC7621l;

/* loaded from: classes4.dex */
public final class p implements kotlin.reflect.jvm.internal.impl.types.checker.b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f33376a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f33377b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f33378c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f33379d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6839p f33380e;

    public static final class a extends u0 {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ p f33381k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, p pVar, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            super(z10, z11, true, pVar, fVar, gVar);
            this.f33381k = pVar;
        }

        @Override // pi.u0
        public boolean f(InterfaceC7618i subType, InterfaceC7618i superType) {
            AbstractC6492s.i(subType, "subType");
            AbstractC6492s.i(superType, "superType");
            if (!(subType instanceof S)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof S) {
                return ((Boolean) this.f33381k.f33380e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public p(Map map, e.a equalityAxioms, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypePreparator, InterfaceC6839p interfaceC6839p) {
        AbstractC6492s.i(equalityAxioms, "equalityAxioms");
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC6492s.i(kotlinTypePreparator, "kotlinTypePreparator");
        this.f33376a = map;
        this.f33377b = equalityAxioms;
        this.f33378c = kotlinTypeRefiner;
        this.f33379d = kotlinTypePreparator;
        this.f33380e = interfaceC6839p;
    }

    private final boolean J0(v0 v0Var, v0 v0Var2) {
        if (this.f33377b.a(v0Var, v0Var2)) {
            return true;
        }
        Map map = this.f33376a;
        if (map == null) {
            return false;
        }
        v0 v0Var3 = (v0) map.get(v0Var);
        v0 v0Var4 = (v0) this.f33376a.get(v0Var2);
        if (v0Var3 == null || !AbstractC6492s.d(v0Var3, v0Var2)) {
            return v0Var4 != null && AbstractC6492s.d(v0Var4, v0Var);
        }
        return true;
    }

    @Override // ri.o
    public Collection A(InterfaceC7619j interfaceC7619j) {
        return b.a.i0(this, interfaceC7619j);
    }

    @Override // ri.o
    public InterfaceC7612c A0(InterfaceC7613d interfaceC7613d) {
        return b.a.m0(this, interfaceC7613d);
    }

    @Override // ri.o
    public boolean B(ri.m mVar) {
        return b.a.P(this, mVar);
    }

    @Override // ri.o
    public InterfaceC7619j B0(InterfaceC7614e interfaceC7614e) {
        return b.a.g0(this, interfaceC7614e);
    }

    @Override // ri.o
    public InterfaceC7621l C(InterfaceC7618i interfaceC7618i, int i10) {
        return b.a.m(this, interfaceC7618i, i10);
    }

    @Override // ri.o
    public boolean C0(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return (interfaceC7618i instanceof InterfaceC7619j) && t((InterfaceC7619j) interfaceC7618i);
    }

    @Override // ri.o
    public boolean D(ri.m mVar) {
        return b.a.K(this, mVar);
    }

    @Override // ri.o
    public boolean D0(InterfaceC7619j interfaceC7619j) {
        return b.a.S(this, interfaceC7619j);
    }

    @Override // ri.o
    public ri.s E(ri.n nVar) {
        return b.a.z(this, nVar);
    }

    @Override // ri.o
    public boolean E0(ri.n nVar, ri.m mVar) {
        return b.a.B(this, nVar, mVar);
    }

    @Override // ri.o
    public List F(InterfaceC7619j interfaceC7619j, ri.m constructor) {
        AbstractC6492s.i(interfaceC7619j, "<this>");
        AbstractC6492s.i(constructor, "constructor");
        return null;
    }

    @Override // ri.o
    public InterfaceC7619j F0(InterfaceC7618i interfaceC7618i) {
        InterfaceC7619j interfaceC7619jG;
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7616g interfaceC7616gU = u(interfaceC7618i);
        if (interfaceC7616gU != null && (interfaceC7619jG = g(interfaceC7616gU)) != null) {
            return interfaceC7619jG;
        }
        InterfaceC7619j interfaceC7619jC = c(interfaceC7618i);
        AbstractC6492s.f(interfaceC7619jC);
        return interfaceC7619jC;
    }

    @Override // pi.H0
    public kotlin.reflect.jvm.internal.impl.builtins.l G(ri.m mVar) {
        return b.a.s(this, mVar);
    }

    @Override // pi.H0
    public InterfaceC7618i G0(InterfaceC7618i interfaceC7618i) {
        InterfaceC7619j interfaceC7619jB;
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7619j interfaceC7619jC = c(interfaceC7618i);
        return (interfaceC7619jC == null || (interfaceC7619jB = b(interfaceC7619jC, true)) == null) ? interfaceC7618i : interfaceC7619jB;
    }

    @Override // ri.o
    public List H(InterfaceC7618i interfaceC7618i) {
        return b.a.n(this, interfaceC7618i);
    }

    @Override // ri.o
    public boolean H0(InterfaceC7618i interfaceC7618i) {
        return b.a.a0(this, interfaceC7618i);
    }

    @Override // ri.o
    public boolean I(InterfaceC7613d interfaceC7613d) {
        return b.a.T(this, interfaceC7613d);
    }

    @Override // ri.o
    public boolean J(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return t(b0(interfaceC7618i)) != t(F0(interfaceC7618i));
    }

    @Override // ri.o
    public boolean K(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7619j interfaceC7619jC = c(interfaceC7618i);
        return (interfaceC7619jC != null ? V(interfaceC7619jC) : null) != null;
    }

    public u0 K0(boolean z10, boolean z11) {
        if (this.f33380e != null) {
            return new a(z10, z11, this, this.f33379d, this.f33378c);
        }
        return AbstractC6506a.a(z10, z11, this, this.f33379d, this.f33378c);
    }

    @Override // ri.o
    public boolean L(InterfaceC7618i interfaceC7618i) {
        return b.a.O(this, interfaceC7618i);
    }

    @Override // ri.o
    public InterfaceC7621l M(InterfaceC7619j interfaceC7619j, int i10) {
        AbstractC6492s.i(interfaceC7619j, "<this>");
        if (i10 < 0 || i10 >= k0(interfaceC7619j)) {
            return null;
        }
        return C(interfaceC7619j, i10);
    }

    @Override // ri.o
    public boolean N(ri.m mVar) {
        return b.a.E(this, mVar);
    }

    @Override // ri.o
    public boolean O(ri.m c12, ri.m c22) {
        AbstractC6492s.i(c12, "c1");
        AbstractC6492s.i(c22, "c2");
        if (!(c12 instanceof v0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c22 instanceof v0) {
            return b.a.a(this, c12, c22) || J0((v0) c12, (v0) c22);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // ri.o
    public InterfaceC7621l P(InterfaceC7612c interfaceC7612c) {
        return b.a.j0(this, interfaceC7612c);
    }

    @Override // ri.o
    public boolean Q(InterfaceC7619j interfaceC7619j) {
        return b.a.Z(this, interfaceC7619j);
    }

    @Override // ri.o
    public boolean R(InterfaceC7618i interfaceC7618i) {
        return b.a.U(this, interfaceC7618i);
    }

    @Override // ri.o
    public List S(ri.n nVar) {
        return b.a.x(this, nVar);
    }

    @Override // ri.o
    public InterfaceC7618i T(Collection collection) {
        return b.a.D(this, collection);
    }

    @Override // ri.o
    public InterfaceC7621l U(InterfaceC7620k interfaceC7620k, int i10) {
        AbstractC6492s.i(interfaceC7620k, "<this>");
        if (interfaceC7620k instanceof InterfaceC7619j) {
            return C((InterfaceC7618i) interfaceC7620k, i10);
        }
        if (interfaceC7620k instanceof C7610a) {
            E e10 = ((C7610a) interfaceC7620k).get(i10);
            AbstractC6492s.h(e10, "get(...)");
            return (InterfaceC7621l) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC7620k + ", " + O.b(interfaceC7620k.getClass())).toString());
    }

    @Override // ri.o
    public InterfaceC7614e V(InterfaceC7619j interfaceC7619j) {
        return b.a.e(this, interfaceC7619j);
    }

    @Override // ri.o
    public InterfaceC7618i W(InterfaceC7618i interfaceC7618i, boolean z10) {
        return b.a.e0(this, interfaceC7618i, z10);
    }

    @Override // ri.o
    public boolean X(ri.m mVar) {
        return b.a.G(this, mVar);
    }

    @Override // ri.o
    public InterfaceC7615f Y(InterfaceC7616g interfaceC7616g) {
        b.a.f(this, interfaceC7616g);
        return null;
    }

    @Override // ri.o
    public boolean Z(ri.m mVar) {
        return b.a.F(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public InterfaceC7613d a(InterfaceC7619j interfaceC7619j) {
        return b.a.d(this, interfaceC7619j);
    }

    @Override // ri.o
    public ri.n a0(ri.m mVar, int i10) {
        return b.a.p(this, mVar, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public InterfaceC7619j b(InterfaceC7619j interfaceC7619j, boolean z10) {
        return b.a.q0(this, interfaceC7619j, z10);
    }

    @Override // ri.o
    public InterfaceC7619j b0(InterfaceC7618i interfaceC7618i) {
        InterfaceC7619j interfaceC7619jE;
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7616g interfaceC7616gU = u(interfaceC7618i);
        if (interfaceC7616gU != null && (interfaceC7619jE = e(interfaceC7616gU)) != null) {
            return interfaceC7619jE;
        }
        InterfaceC7619j interfaceC7619jC = c(interfaceC7618i);
        AbstractC6492s.f(interfaceC7619jC);
        return interfaceC7619jC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public InterfaceC7619j c(InterfaceC7618i interfaceC7618i) {
        return b.a.h(this, interfaceC7618i);
    }

    @Override // ri.o
    public boolean c0(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7616g interfaceC7616gU = u(interfaceC7618i);
        if (interfaceC7616gU == null) {
            return false;
        }
        Y(interfaceC7616gU);
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public ri.m d(InterfaceC7619j interfaceC7619j) {
        return b.a.n0(this, interfaceC7619j);
    }

    @Override // ri.q
    public boolean d0() {
        return b.a.M(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public InterfaceC7619j e(InterfaceC7616g interfaceC7616g) {
        return b.a.c0(this, interfaceC7616g);
    }

    @Override // ri.o
    public ri.n e0(ri.m mVar) {
        return b.a.v(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public boolean f(InterfaceC7619j interfaceC7619j) {
        return b.a.V(this, interfaceC7619j);
    }

    @Override // ri.o
    public ri.m f0(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7619j interfaceC7619jC = c(interfaceC7618i);
        if (interfaceC7619jC == null) {
            interfaceC7619jC = b0(interfaceC7618i);
        }
        return d(interfaceC7619jC);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, ri.o
    public InterfaceC7619j g(InterfaceC7616g interfaceC7616g) {
        return b.a.o0(this, interfaceC7616g);
    }

    @Override // ri.o
    public boolean g0(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        InterfaceC7619j interfaceC7619jC = c(interfaceC7618i);
        return (interfaceC7619jC != null ? a(interfaceC7619jC) : null) != null;
    }

    @Override // pi.H0
    public InterfaceC7618i h(InterfaceC7618i interfaceC7618i) {
        return b.a.w(this, interfaceC7618i);
    }

    @Override // ri.o
    public u0.c h0(InterfaceC7619j interfaceC7619j) {
        return b.a.k0(this, interfaceC7619j);
    }

    @Override // ri.o
    public boolean i(InterfaceC7619j interfaceC7619j) {
        AbstractC6492s.i(interfaceC7619j, "<this>");
        return D(d(interfaceC7619j));
    }

    @Override // ri.o
    public boolean i0(ri.m mVar) {
        return b.a.L(this, mVar);
    }

    @Override // ri.o
    public InterfaceC7618i j(InterfaceC7621l interfaceC7621l) {
        return b.a.u(this, interfaceC7621l);
    }

    @Override // ri.o
    public List j0(ri.m mVar) {
        return b.a.q(this, mVar);
    }

    @Override // ri.o
    public boolean k(InterfaceC7613d interfaceC7613d) {
        return b.a.R(this, interfaceC7613d);
    }

    @Override // ri.o
    public int k0(InterfaceC7618i interfaceC7618i) {
        return b.a.b(this, interfaceC7618i);
    }

    @Override // ri.o
    public int l(InterfaceC7620k interfaceC7620k) {
        AbstractC6492s.i(interfaceC7620k, "<this>");
        if (interfaceC7620k instanceof InterfaceC7619j) {
            return k0((InterfaceC7618i) interfaceC7620k);
        }
        if (interfaceC7620k instanceof C7610a) {
            return ((C7610a) interfaceC7620k).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC7620k + ", " + O.b(interfaceC7620k.getClass())).toString());
    }

    @Override // ri.o
    public InterfaceC7620k l0(InterfaceC7619j interfaceC7619j) {
        return b.a.c(this, interfaceC7619j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    public InterfaceC7618i m(InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        return b.a.l(this, interfaceC7619j, interfaceC7619j2);
    }

    @Override // ri.o
    public boolean m0(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return B(f0(interfaceC7618i)) && !v0(interfaceC7618i);
    }

    @Override // pi.H0
    public boolean n(ri.m mVar) {
        return b.a.b0(this, mVar);
    }

    @Override // pi.H0
    public boolean n0(ri.m mVar) {
        return b.a.J(this, mVar);
    }

    @Override // pi.H0
    public kotlin.reflect.jvm.internal.impl.builtins.l o(ri.m mVar) {
        return b.a.r(this, mVar);
    }

    @Override // ri.o
    public InterfaceC7619j o0(InterfaceC7619j interfaceC7619j) {
        InterfaceC7619j interfaceC7619jB0;
        AbstractC6492s.i(interfaceC7619j, "<this>");
        InterfaceC7614e interfaceC7614eV = V(interfaceC7619j);
        return (interfaceC7614eV == null || (interfaceC7619jB0 = B0(interfaceC7614eV)) == null) ? interfaceC7619j : interfaceC7619jB0;
    }

    @Override // ri.o
    public boolean p(InterfaceC7621l interfaceC7621l) {
        return b.a.X(this, interfaceC7621l);
    }

    @Override // ri.o
    public InterfaceC7618i p0(InterfaceC7613d interfaceC7613d) {
        return b.a.d0(this, interfaceC7613d);
    }

    @Override // ri.o
    public int q(ri.m mVar) {
        return b.a.h0(this, mVar);
    }

    @Override // ri.o
    public boolean q0(InterfaceC7619j interfaceC7619j) {
        AbstractC6492s.i(interfaceC7619j, "<this>");
        return Z(d(interfaceC7619j));
    }

    @Override // ri.r
    public boolean r(InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        return b.a.C(this, interfaceC7619j, interfaceC7619j2);
    }

    @Override // ri.o
    public boolean r0(ri.m mVar) {
        return b.a.H(this, mVar);
    }

    @Override // ri.o
    public InterfaceC7621l s(InterfaceC7618i interfaceC7618i) {
        return b.a.i(this, interfaceC7618i);
    }

    @Override // pi.H0
    public Zh.d s0(ri.m mVar) {
        return b.a.o(this, mVar);
    }

    @Override // ri.o
    public boolean t(InterfaceC7619j interfaceC7619j) {
        return b.a.N(this, interfaceC7619j);
    }

    @Override // pi.H0
    public boolean t0(InterfaceC7618i interfaceC7618i, Zh.c cVar) {
        return b.a.A(this, interfaceC7618i, cVar);
    }

    @Override // ri.o
    public InterfaceC7616g u(InterfaceC7618i interfaceC7618i) {
        return b.a.g(this, interfaceC7618i);
    }

    @Override // pi.H0
    public InterfaceC7618i u0(ri.n nVar) {
        return b.a.t(this, nVar);
    }

    @Override // ri.o
    public ri.s v(InterfaceC7621l interfaceC7621l) {
        return b.a.y(this, interfaceC7621l);
    }

    @Override // ri.o
    public boolean v0(InterfaceC7618i interfaceC7618i) {
        return b.a.Q(this, interfaceC7618i);
    }

    @Override // ri.o
    public InterfaceC7618i w(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return W(interfaceC7618i, false);
    }

    @Override // ri.o
    public boolean w0(InterfaceC7618i interfaceC7618i) {
        return b.a.I(this, interfaceC7618i);
    }

    @Override // ri.o
    public InterfaceC7618i x(InterfaceC7618i interfaceC7618i, boolean z10) {
        return b.a.p0(this, interfaceC7618i, z10);
    }

    @Override // ri.o
    public Collection x0(ri.m mVar) {
        return b.a.l0(this, mVar);
    }

    @Override // ri.o
    public InterfaceC7619j y(InterfaceC7619j interfaceC7619j, EnumC7611b enumC7611b) {
        return b.a.j(this, interfaceC7619j, enumC7611b);
    }

    @Override // ri.o
    public EnumC7611b y0(InterfaceC7613d interfaceC7613d) {
        return b.a.k(this, interfaceC7613d);
    }

    @Override // ri.o
    public boolean z(InterfaceC7618i interfaceC7618i) {
        AbstractC6492s.i(interfaceC7618i, "<this>");
        return !AbstractC6492s.d(d(b0(interfaceC7618i)), d(F0(interfaceC7618i)));
    }

    @Override // ri.o
    public boolean z0(InterfaceC7619j interfaceC7619j) {
        return b.a.Y(this, interfaceC7619j);
    }
}
