package Oh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.l0;
import Mh.p;
import Qh.A;
import Qh.C;
import Qh.v;
import Qh.x;
import Qh.y;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.o;
import kotlin.reflect.jvm.internal.impl.types.error.l;
import pi.A0;
import pi.AbstractC7346d0;
import pi.B0;
import pi.D0;
import pi.I0;
import pi.J0;
import pi.N0;
import pi.S;
import pi.V;
import pi.Y;
import pi.r0;
import pi.s0;
import pi.v0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Mh.k f17845a;

    /* renamed from: b, reason: collision with root package name */
    private final p f17846b;

    /* renamed from: c, reason: collision with root package name */
    private final g f17847c;

    /* renamed from: d, reason: collision with root package name */
    private final A0 f17848d;

    public e(Mh.k c10, p typeParameterResolver) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(typeParameterResolver, "typeParameterResolver");
        this.f17845a = c10;
        this.f17846b = typeParameterResolver;
        g gVar = new g();
        this.f17847c = gVar;
        this.f17848d = new A0(gVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(Qh.j jVar, InterfaceC2495e interfaceC2495e) {
        N0 n0P;
        if (!A.a((x) AbstractC3689v.D0(jVar.F()))) {
            return false;
        }
        List parameters = Ah.d.f791a.b(interfaceC2495e).k().getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        l0 l0Var = (l0) AbstractC3689v.D0(parameters);
        return (l0Var == null || (n0P = l0Var.p()) == null || n0P == N0.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List c(Qh.j r10, Oh.a r11, pi.v0 r12) {
        /*
            r9 = this;
            boolean r0 = r10.w()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L24
            java.util.List r0 = r10.F()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.AbstractC6492s.h(r2, r1)
            if (r0 == 0) goto L33
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L33:
            int r11 = r2.size()
            java.util.List r12 = r10.F()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L7e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = Zg.AbstractC3689v.w(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L79
            java.lang.Object r12 = r11.next()
            Bh.l0 r12 = (Bh.l0) r12
            pi.D0 r0 = new pi.D0
            kotlin.reflect.jvm.internal.impl.types.error.k r1 = kotlin.reflect.jvm.internal.impl.types.error.k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            Zh.f r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            kotlin.reflect.jvm.internal.impl.types.error.i r12 = kotlin.reflect.jvm.internal.impl.types.error.l.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L52
        L79:
            java.util.List r10 = Zg.AbstractC3689v.i1(r10)
            return r10
        L7e:
            java.util.List r10 = r10.F()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = Zg.AbstractC3689v.q1(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = Zg.AbstractC3689v.w(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L95:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lca
            java.lang.Object r12 = r10.next()
            Zg.N r12 = (Zg.N) r12
            int r0 = r12.a()
            java.lang.Object r12 = r12.b()
            Qh.x r12 = (Qh.x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            Bh.l0 r0 = (Bh.l0) r0
            pi.I0 r3 = pi.I0.COMMON
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            Oh.a r1 = Oh.b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.AbstractC6492s.f(r0)
            pi.B0 r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L95
        Lca:
            java.util.List r10 = Zg.AbstractC3689v.i1(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.e.c(Qh.j, Oh.a, pi.v0):java.util.List");
    }

    private final List d(Qh.j jVar, List list, v0 v0Var, a aVar) {
        List<l0> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        for (l0 l0Var : list2) {
            arrayList.add(AbstractC7984d.q(l0Var, null, aVar.c()) ? J0.t(l0Var, aVar) : this.f17847c.a(l0Var, aVar.j(jVar.w()), this.f17848d, new Y(this.f17845a.e(), new d(this, l0Var, aVar, v0Var, jVar))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S e(e eVar, l0 l0Var, a aVar, v0 v0Var, Qh.j jVar) {
        A0 a02 = eVar.f17848d;
        InterfaceC2498h interfaceC2498hC = v0Var.c();
        return a02.e(l0Var, aVar.k(interfaceC2498hC != null ? interfaceC2498hC.u() : null).j(jVar.w()));
    }

    private final AbstractC7346d0 f(Qh.j jVar, a aVar, AbstractC7346d0 abstractC7346d0) {
        r0 r0VarB;
        if (abstractC7346d0 == null || (r0VarB = abstractC7346d0.M0()) == null) {
            r0VarB = s0.b(new Mh.g(this.f17845a, jVar, false, 4, null));
        }
        r0 r0Var = r0VarB;
        v0 v0VarG = g(jVar, aVar);
        if (v0VarG == null) {
            return null;
        }
        boolean zJ = j(aVar);
        return (AbstractC6492s.d(abstractC7346d0 != null ? abstractC7346d0.N0() : null, v0VarG) && !jVar.w() && zJ) ? abstractC7346d0.R0(true) : V.k(r0Var, v0VarG, c(jVar, aVar, v0VarG), zJ, null, 16, null);
    }

    private final v0 g(Qh.j jVar, a aVar) {
        v0 v0VarK;
        Qh.i iVarR = jVar.r();
        if (iVarR == null) {
            return h(jVar);
        }
        if (!(iVarR instanceof Qh.g)) {
            if (iVarR instanceof y) {
                l0 l0VarA = this.f17846b.a((y) iVarR);
                if (l0VarA != null) {
                    return l0VarA.k();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + iVarR);
        }
        Qh.g gVar = (Qh.g) iVarR;
        Zh.c cVarE = gVar.e();
        if (cVarE != null) {
            InterfaceC2495e interfaceC2495eK = k(jVar, aVar, cVarE);
            if (interfaceC2495eK == null) {
                interfaceC2495eK = this.f17845a.a().n().a(gVar);
            }
            return (interfaceC2495eK == null || (v0VarK = interfaceC2495eK.k()) == null) ? h(jVar) : v0VarK;
        }
        throw new AssertionError("Class type should have a FQ name: " + iVarR);
    }

    private final v0 h(Qh.j jVar) {
        v0 v0VarK = this.f17845a.a().b().f().r().d(Zh.b.f25401d.c(new Zh.c(jVar.x())), AbstractC3689v.e(0)).k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        return v0VarK;
    }

    private final boolean i(N0 n02, l0 l0Var) {
        return (l0Var.p() == N0.INVARIANT || n02 == l0Var.p()) ? false : true;
    }

    private final boolean j(a aVar) {
        return (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == I0.SUPERTYPE) ? false : true;
    }

    private final InterfaceC2495e k(Qh.j jVar, a aVar, Zh.c cVar) {
        if (aVar.h() && AbstractC6492s.d(cVar, f.f17849a)) {
            return this.f17845a.a().p().d();
        }
        Ah.d dVar = Ah.d.f791a;
        InterfaceC2495e interfaceC2495eF = Ah.d.f(dVar, cVar, this.f17845a.d().q(), null, 4, null);
        if (interfaceC2495eF == null) {
            return null;
        }
        return (dVar.d(interfaceC2495eF) && (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.b() == I0.SUPERTYPE || b(jVar, interfaceC2495eF))) ? dVar.b(interfaceC2495eF) : interfaceC2495eF;
    }

    public static /* synthetic */ S m(e eVar, Qh.f fVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eVar.l(fVar, aVar, z10);
    }

    private final S n(Qh.j jVar, a aVar) {
        AbstractC7346d0 abstractC7346d0F;
        boolean z10 = (aVar.h() || aVar.b() == I0.SUPERTYPE) ? false : true;
        boolean zW = jVar.w();
        if (!zW && !z10) {
            AbstractC7346d0 abstractC7346d0F2 = f(jVar, aVar, null);
            return abstractC7346d0F2 != null ? abstractC7346d0F2 : o(jVar);
        }
        AbstractC7346d0 abstractC7346d0F3 = f(jVar, aVar.l(c.FLEXIBLE_LOWER_BOUND), null);
        if (abstractC7346d0F3 != null && (abstractC7346d0F = f(jVar, aVar.l(c.FLEXIBLE_UPPER_BOUND), abstractC7346d0F3)) != null) {
            return zW ? new k(abstractC7346d0F3, abstractC7346d0F) : V.e(abstractC7346d0F3, abstractC7346d0F);
        }
        return o(jVar);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.i o(Qh.j jVar) {
        return l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNRESOLVED_JAVA_CLASS, jVar.s());
    }

    private final B0 q(x xVar, a aVar, l0 l0Var) {
        if (!(xVar instanceof C)) {
            return new D0(N0.INVARIANT, p(xVar, aVar));
        }
        C c10 = (C) xVar;
        x xVarB = c10.B();
        N0 n02 = c10.J() ? N0.OUT_VARIANCE : N0.IN_VARIANCE;
        if (xVarB == null || i(n02, l0Var)) {
            B0 b0T = J0.t(l0Var, aVar);
            AbstractC6492s.h(b0T, "makeStarProjection(...)");
            return b0T;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarA = Jh.V.a(this.f17845a, c10);
        S sP = p(xVarB, b.b(I0.COMMON, false, false, null, 7, null));
        if (cVarA != null) {
            sP = AbstractC7984d.C(sP, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.L0(sP.getAnnotations(), cVarA)));
        }
        return AbstractC7984d.k(sP, n02, l0Var);
    }

    public final S l(Qh.f arrayType, a attr, boolean z10) {
        AbstractC6492s.i(arrayType, "arrayType");
        AbstractC6492s.i(attr, "attr");
        x xVarK = arrayType.k();
        v vVar = xVarK instanceof v ? (v) xVarK : null;
        kotlin.reflect.jvm.internal.impl.builtins.l type = vVar != null ? vVar.getType() : null;
        Mh.g gVar = new Mh.g(this.f17845a, arrayType, true);
        if (type != null) {
            AbstractC7346d0 abstractC7346d0O = this.f17845a.d().q().O(type);
            AbstractC6492s.f(abstractC7346d0O);
            S sC = AbstractC7984d.C(abstractC7346d0O, new o(abstractC7346d0O.getAnnotations(), gVar));
            AbstractC6492s.g(sC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) sC;
            return attr.h() ? abstractC7346d0 : V.e(abstractC7346d0, abstractC7346d0.R0(true));
        }
        S sP = p(xVarK, b.b(I0.COMMON, attr.h(), false, null, 6, null));
        if (attr.h()) {
            AbstractC7346d0 abstractC7346d0M = this.f17845a.d().q().m(z10 ? N0.OUT_VARIANCE : N0.INVARIANT, sP, gVar);
            AbstractC6492s.h(abstractC7346d0M, "getArrayType(...)");
            return abstractC7346d0M;
        }
        AbstractC7346d0 abstractC7346d0M2 = this.f17845a.d().q().m(N0.INVARIANT, sP, gVar);
        AbstractC6492s.h(abstractC7346d0M2, "getArrayType(...)");
        return V.e(abstractC7346d0M2, this.f17845a.d().q().m(N0.OUT_VARIANCE, sP, gVar).R0(true));
    }

    public final S p(x xVar, a attr) {
        S sP;
        AbstractC6492s.i(attr, "attr");
        if (xVar instanceof v) {
            kotlin.reflect.jvm.internal.impl.builtins.l type = ((v) xVar).getType();
            AbstractC7346d0 abstractC7346d0R = type != null ? this.f17845a.d().q().R(type) : this.f17845a.d().q().Z();
            AbstractC6492s.f(abstractC7346d0R);
            return abstractC7346d0R;
        }
        if (xVar instanceof Qh.j) {
            return n((Qh.j) xVar, attr);
        }
        if (xVar instanceof Qh.f) {
            return m(this, (Qh.f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof C) {
            x xVarB = ((C) xVar).B();
            if (xVarB != null && (sP = p(xVarB, attr)) != null) {
                return sP;
            }
            AbstractC7346d0 abstractC7346d0Y = this.f17845a.d().q().y();
            AbstractC6492s.h(abstractC7346d0Y, "getDefaultBound(...)");
            return abstractC7346d0Y;
        }
        if (xVar == null) {
            AbstractC7346d0 abstractC7346d0Y2 = this.f17845a.d().q().y();
            AbstractC6492s.h(abstractC7346d0Y2, "getDefaultBound(...)");
            return abstractC7346d0Y2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
