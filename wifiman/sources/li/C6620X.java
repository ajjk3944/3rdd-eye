package li;

import Bh.AbstractC2514y;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.k0;
import Bh.l0;
import Uh.q;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import ni.C6967S;
import ni.C6969a;
import pi.AbstractC7346d0;
import pi.AbstractC7354h0;
import pi.B0;
import pi.C7356i0;
import pi.C7360k0;
import pi.C7377y;
import pi.D0;
import pi.N0;
import pi.q0;
import pi.r0;
import pi.v0;
import si.AbstractC7984d;
import zi.AbstractC8783m;

/* renamed from: li.X, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6620X {

    /* renamed from: a, reason: collision with root package name */
    private final C6638p f52682a;

    /* renamed from: b, reason: collision with root package name */
    private final C6620X f52683b;

    /* renamed from: c, reason: collision with root package name */
    private final String f52684c;

    /* renamed from: d, reason: collision with root package name */
    private final String f52685d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f52686e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f52687f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f52688g;

    public C6620X(C6638p c10, C6620X c6620x, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(typeParameterProtos, "typeParameterProtos");
        AbstractC6492s.i(debugName, "debugName");
        AbstractC6492s.i(containerPresentableName, "containerPresentableName");
        this.f52682a = c10;
        this.f52683b = c6620x;
        this.f52684c = debugName;
        this.f52685d = containerPresentableName;
        this.f52686e = c10.h().i(new C6615S(this));
        this.f52687f = c10.h().i(new C6616T(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = Zg.U.h();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uh.s sVar = (Uh.s) it.next();
                linkedHashMap.put(Integer.valueOf(sVar.W0()), new C6967S(this.f52682a, sVar, i10));
                i10++;
            }
        }
        this.f52688g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Uh.q it) {
        AbstractC6492s.i(it, "it");
        return it.e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2498h f(C6620X c6620x, int i10) {
        return c6620x.g(i10);
    }

    private final InterfaceC2498h g(int i10) {
        Zh.b bVarA = AbstractC6609L.a(this.f52682a.g(), i10);
        return bVarA.i() ? this.f52682a.c().b(bVarA) : AbstractC2514y.c(this.f52682a.c().q(), bVarA);
    }

    private final AbstractC7346d0 h(int i10) {
        if (AbstractC6609L.a(this.f52682a.g(), i10).i()) {
            return this.f52682a.c().o().a();
        }
        return null;
    }

    private final InterfaceC2498h i(int i10) {
        Zh.b bVarA = AbstractC6609L.a(this.f52682a.g(), i10);
        if (bVarA.i()) {
            return null;
        }
        return AbstractC2514y.f(this.f52682a.c().q(), bVarA);
    }

    private final AbstractC7346d0 j(pi.S s10, pi.S s11) {
        kotlin.reflect.jvm.internal.impl.builtins.i iVarN = AbstractC7984d.n(s10);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = s10.getAnnotations();
        pi.S sK = kotlin.reflect.jvm.internal.impl.builtins.h.k(s10);
        List listE = kotlin.reflect.jvm.internal.impl.builtins.h.e(s10);
        List listI0 = AbstractC3689v.i0(kotlin.reflect.jvm.internal.impl.builtins.h.m(s10), 1);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listI0, 10));
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.h.b(iVarN, annotations, sK, listE, arrayList, null, s11, true).R0(s10.O0());
    }

    private final AbstractC7346d0 k(r0 r0Var, v0 v0Var, List list, boolean z10) {
        AbstractC7346d0 abstractC7346d0L;
        int size;
        int size2 = v0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            abstractC7346d0L = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                v0 v0VarK = v0Var.q().X(size).k();
                AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
                abstractC7346d0L = pi.V.k(r0Var, v0VarK, list, z10, null, 16, null);
            }
        } else {
            abstractC7346d0L = l(r0Var, v0Var, list, z10);
        }
        return abstractC7346d0L == null ? kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.f(kotlin.reflect.jvm.internal.impl.types.error.k.INCONSISTENT_SUSPEND_FUNCTION, list, v0Var, new String[0]) : abstractC7346d0L;
    }

    private final AbstractC7346d0 l(r0 r0Var, v0 v0Var, List list, boolean z10) {
        AbstractC7346d0 abstractC7346d0K = pi.V.k(r0Var, v0Var, list, z10, null, 16, null);
        if (kotlin.reflect.jvm.internal.impl.builtins.h.q(abstractC7346d0K)) {
            return t(abstractC7346d0K);
        }
        return null;
    }

    private final l0 n(int i10) {
        l0 l0Var = (l0) this.f52688g.get(Integer.valueOf(i10));
        if (l0Var != null) {
            return l0Var;
        }
        C6620X c6620x = this.f52683b;
        if (c6620x != null) {
            return c6620x.n(i10);
        }
        return null;
    }

    private static final List p(Uh.q qVar, C6620X c6620x) {
        List listF1 = qVar.f1();
        AbstractC6492s.h(listF1, "getArgumentList(...)");
        List list = listF1;
        Uh.q qVarJ = Wh.f.j(qVar, c6620x.f52682a.j());
        List listP = qVarJ != null ? p(qVarJ, c6620x) : null;
        if (listP == null) {
            listP = AbstractC3689v.l();
        }
        return AbstractC3689v.M0(list, listP);
    }

    public static /* synthetic */ AbstractC7346d0 q(C6620X c6620x, Uh.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c6620x.o(qVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(C6620X c6620x, Uh.q qVar) {
        return c6620x.f52682a.c().d().j(qVar, c6620x.f52682a.g());
    }

    private final r0 s(List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, v0 v0Var, InterfaceC2503m interfaceC2503m) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).a(hVar, v0Var, interfaceC2503m));
        }
        return r0.f58162b.i(AbstractC3689v.y(arrayList));
    }

    private final AbstractC7346d0 t(pi.S s10) {
        pi.S type;
        B0 b02 = (B0) AbstractC3689v.D0(kotlin.reflect.jvm.internal.impl.builtins.h.m(s10));
        if (b02 == null || (type = b02.getType()) == null) {
            return null;
        }
        InterfaceC2498h interfaceC2498hC = type.N0().c();
        Zh.c cVarO = interfaceC2498hC != null ? AbstractC5833e.o(interfaceC2498hC) : null;
        if (type.L0().size() != 1 || (!AbstractC6492s.d(cVarO, kotlin.reflect.jvm.internal.impl.builtins.o.f51798v) && !AbstractC6492s.d(cVarO, AbstractC6621Y.f52690a))) {
            return (AbstractC7346d0) s10;
        }
        pi.S type2 = ((B0) AbstractC3689v.R0(type.L0())).getType();
        AbstractC6492s.h(type2, "getType(...)");
        InterfaceC2503m interfaceC2503mE = this.f52682a.e();
        InterfaceC2491a interfaceC2491a = interfaceC2503mE instanceof InterfaceC2491a ? (InterfaceC2491a) interfaceC2503mE : null;
        return AbstractC6492s.d(interfaceC2491a != null ? AbstractC5833e.k(interfaceC2491a) : null, AbstractC6614Q.f52674a) ? j(s10, type2) : j(s10, type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2498h v(C6620X c6620x, int i10) {
        return c6620x.i(i10);
    }

    private final B0 w(l0 l0Var, q.b bVar) {
        if (bVar.S() == q.b.c.STAR) {
            return l0Var == null ? new C7356i0(this.f52682a.c().q().q()) : new C7360k0(l0Var);
        }
        C6612O c6612o = C6612O.f52662a;
        q.b.c cVarS = bVar.S();
        AbstractC6492s.h(cVarS, "getProjection(...)");
        N0 n0C = c6612o.c(cVarS);
        Uh.q qVarP = Wh.f.p(bVar, this.f52682a.j());
        return qVarP == null ? new D0(kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.NO_RECORDED_TYPE, bVar.toString())) : new D0(n0C, u(qVarP));
    }

    private final v0 x(Uh.q qVar) {
        InterfaceC2498h interfaceC2498hY;
        Object next;
        if (qVar.v1()) {
            interfaceC2498hY = (InterfaceC2498h) this.f52686e.invoke(Integer.valueOf(qVar.g1()));
            if (interfaceC2498hY == null) {
                interfaceC2498hY = y(this, qVar, qVar.g1());
            }
        } else if (qVar.E1()) {
            interfaceC2498hY = n(qVar.r1());
            if (interfaceC2498hY == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.e(kotlin.reflect.jvm.internal.impl.types.error.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.r1()), this.f52685d);
            }
        } else if (qVar.F1()) {
            String string = this.f52682a.g().getString(qVar.s1());
            Iterator it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((l0) next).getName().b(), string)) {
                    break;
                }
            }
            interfaceC2498hY = (l0) next;
            if (interfaceC2498hY == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.e(kotlin.reflect.jvm.internal.impl.types.error.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f52682a.e().toString());
            }
        } else {
            if (!qVar.D1()) {
                return kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.e(kotlin.reflect.jvm.internal.impl.types.error.k.UNKNOWN_TYPE, new String[0]);
            }
            interfaceC2498hY = (InterfaceC2498h) this.f52687f.invoke(Integer.valueOf(qVar.q1()));
            if (interfaceC2498hY == null) {
                interfaceC2498hY = y(this, qVar, qVar.q1());
            }
        }
        v0 v0VarK = interfaceC2498hY.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        return v0VarK;
    }

    private static final InterfaceC2495e y(C6620X c6620x, Uh.q qVar, int i10) {
        Zh.b bVarA = AbstractC6609L.a(c6620x.f52682a.g(), i10);
        List listA0 = AbstractC8783m.a0(AbstractC8783m.N(AbstractC8783m.n(qVar, new C6618V(c6620x)), C6619W.f52681a));
        int iX = AbstractC8783m.x(AbstractC8783m.n(bVarA, new kotlin.jvm.internal.E() { // from class: li.X.a
            @Override // th.n
            public Object get(Object obj) {
                return ((Zh.b) obj).e();
            }

            @Override // kotlin.jvm.internal.AbstractC6480f, th.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.AbstractC6480f
            public th.f getOwner() {
                return kotlin.jvm.internal.O.b(Zh.b.class);
            }

            @Override // kotlin.jvm.internal.AbstractC6480f
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (listA0.size() < iX) {
            listA0.add(0);
        }
        return c6620x.f52682a.c().r().d(bVarA, listA0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uh.q z(C6620X c6620x, Uh.q it) {
        AbstractC6492s.i(it, "it");
        return Wh.f.j(it, c6620x.f52682a.j());
    }

    public final List m() {
        return AbstractC3689v.i1(this.f52688g.values());
    }

    public final AbstractC7346d0 o(Uh.q proto, boolean z10) {
        AbstractC7346d0 abstractC7346d0K;
        AbstractC7346d0 abstractC7346d0J;
        AbstractC6492s.i(proto, "proto");
        AbstractC7346d0 abstractC7346d0H = proto.v1() ? h(proto.g1()) : proto.D1() ? h(proto.q1()) : null;
        if (abstractC7346d0H != null) {
            return abstractC7346d0H;
        }
        v0 v0VarX = x(proto);
        if (kotlin.reflect.jvm.internal.impl.types.error.l.m(v0VarX.c())) {
            return kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.c(kotlin.reflect.jvm.internal.impl.types.error.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, v0VarX, v0VarX.toString());
        }
        C6969a c6969a = new C6969a(this.f52682a.h(), new C6617U(this, proto));
        r0 r0VarS = s(this.f52682a.c().v(), c6969a, v0VarX, this.f52682a.e());
        List listP = p(proto, this);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            List parameters = v0VarX.getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            arrayList.add(w((l0) AbstractC3689v.t0(parameters, i10), (q.b) obj));
            i10 = i11;
        }
        List listI1 = AbstractC3689v.i1(arrayList);
        InterfaceC2498h interfaceC2498hC = v0VarX.c();
        if (z10 && (interfaceC2498hC instanceof k0)) {
            AbstractC7346d0 abstractC7346d0C = pi.V.c((k0) interfaceC2498hC, listI1);
            abstractC7346d0K = abstractC7346d0C.R0(pi.W.b(abstractC7346d0C) || proto.n1()).T0(s(this.f52682a.c().v(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.a(AbstractC3689v.K0(c6969a, abstractC7346d0C.getAnnotations())), v0VarX, this.f52682a.e()));
        } else if (Wh.b.f23937a.d(proto.j1()).booleanValue()) {
            abstractC7346d0K = k(r0VarS, v0VarX, listI1, proto.n1());
        } else {
            abstractC7346d0K = pi.V.k(r0VarS, v0VarX, listI1, proto.n1(), null, 16, null);
            if (Wh.b.f23938b.d(proto.j1()).booleanValue()) {
                C7377y c7377yC = C7377y.a.c(C7377y.f58191d, abstractC7346d0K, true, false, 4, null);
                if (c7377yC == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC7346d0K + '\'').toString());
                }
                abstractC7346d0K = c7377yC;
            }
        }
        Uh.q qVarA = Wh.f.a(proto, this.f52682a.j());
        return (qVarA == null || (abstractC7346d0J = AbstractC7354h0.j(abstractC7346d0K, o(qVarA, false))) == null) ? abstractC7346d0K : abstractC7346d0J;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f52684c);
        if (this.f52683b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f52683b.f52684c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final pi.S u(Uh.q proto) {
        AbstractC6492s.i(proto, "proto");
        if (!proto.x1()) {
            return o(proto, true);
        }
        String string = this.f52682a.g().getString(proto.k1());
        AbstractC7346d0 abstractC7346d0Q = q(this, proto, false, 2, null);
        Uh.q qVarF = Wh.f.f(proto, this.f52682a.j());
        AbstractC6492s.f(qVarF);
        return this.f52682a.c().m().a(proto, string, abstractC7346d0Q, q(this, qVarF, false, 2, null));
    }
}
