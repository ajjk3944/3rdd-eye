package Nh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2515z;
import Bh.f0;
import Bh.l0;
import Bh.s0;
import Dh.C2603i;
import Dh.C2611q;
import Jh.C3112f;
import Jh.C3115i;
import Jh.C3119m;
import Jh.InterfaceC3126u;
import Jh.U;
import Kh.o;
import Nh.U;
import Rh.e0;
import Zg.AbstractC3689v;
import Zg.d0;
import bi.o;
import fi.AbstractC5833e;
import ii.C6157d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC6645w;
import mh.InterfaceC6835l;
import pi.I0;
import pi.J0;
import sh.AbstractC7978m;
import xi.AbstractC8534a;
import xi.C8545l;

/* renamed from: Nh.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3398z extends U {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC2495e f16563n;

    /* renamed from: o, reason: collision with root package name */
    private final Qh.g f16564o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f16565p;

    /* renamed from: q, reason: collision with root package name */
    private final oi.i f16566q;

    /* renamed from: r, reason: collision with root package name */
    private final oi.i f16567r;

    /* renamed from: s, reason: collision with root package name */
    private final oi.i f16568s;

    /* renamed from: t, reason: collision with root package name */
    private final oi.i f16569t;

    /* renamed from: u, reason: collision with root package name */
    private final oi.h f16570u;

    /* renamed from: Nh.z$a */
    /* synthetic */ class a extends AbstractC6489o implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(Zh.f p02) {
            AbstractC6492s.i(p02, "p0");
            return ((C3398z) this.receiver).q1(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.b(C3398z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* renamed from: Nh.z$b */
    /* synthetic */ class b extends AbstractC6489o implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(Zh.f p02) {
            AbstractC6492s.i(p02, "p0");
            return ((C3398z) this.receiver).r1(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.b(C3398z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public /* synthetic */ C3398z(Mh.k kVar, InterfaceC2495e interfaceC2495e, Qh.g gVar, boolean z10, C3398z c3398z, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC2495e, gVar, z10, (i10 & 16) != 0 ? null : c3398z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A0(C3398z c3398z, Zh.f it) {
        AbstractC6492s.i(it, "it");
        return c3398z.q1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection B0(C3398z c3398z, Zh.f it) {
        AbstractC6492s.i(it, "it");
        return c3398z.r1(it);
    }

    private final Collection C0() {
        if (!this.f16565p) {
            return L().a().k().d().g(R());
        }
        Collection collectionA = R().k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        return collectionA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(C3398z c3398z, Mh.k kVar) {
        Collection collectionM = c3398z.f16564o.m();
        ArrayList arrayList = new ArrayList(collectionM.size());
        Iterator it = collectionM.iterator();
        while (it.hasNext()) {
            arrayList.add(c3398z.o1((Qh.k) it.next()));
        }
        if (c3398z.f16564o.p()) {
            InterfaceC2494d interfaceC2494dG0 = c3398z.G0();
            String strC = Sh.C.c(interfaceC2494dG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(interfaceC2494dG0);
                kVar.a().h().c(c3398z.f16564o, interfaceC2494dG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (AbstractC6492s.d(Sh.C.c((InterfaceC2494d) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(interfaceC2494dG0);
                kVar.a().h().c(c3398z.f16564o, interfaceC2494dG0);
            }
        }
        kVar.a().w().a(c3398z.R(), arrayList, kVar);
        e0 e0VarR = kVar.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listP = arrayList;
        if (zIsEmpty) {
            listP = AbstractC3689v.p(c3398z.F0());
        }
        return AbstractC3689v.i1(e0VarR.p(kVar, listP));
    }

    private final List E0(C2603i c2603i) {
        Yg.s sVar;
        Collection collectionM = this.f16564o.M();
        ArrayList arrayList = new ArrayList(collectionM.size());
        Oh.a aVarB = Oh.b.b(I0.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionM) {
            if (AbstractC6492s.d(((Qh.r) obj).getName(), Jh.I.f10104c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Yg.s sVar2 = new Yg.s(arrayList2, arrayList3);
        List list = (List) sVar2.a();
        List<Qh.r> list2 = (List) sVar2.c();
        list.size();
        Qh.r rVar = (Qh.r) AbstractC3689v.s0(list);
        if (rVar != null) {
            Qh.x returnType = rVar.getReturnType();
            if (returnType instanceof Qh.f) {
                Qh.f fVar = (Qh.f) returnType;
                sVar = new Yg.s(L().g().l(fVar, aVarB, true), L().g().p(fVar.k(), aVarB));
            } else {
                sVar = new Yg.s(L().g().p(returnType, aVarB), null);
            }
            s0(arrayList, c2603i, 0, rVar, (pi.S) sVar.a(), (pi.S) sVar.c());
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (Qh.r rVar2 : list2) {
            s0(arrayList, c2603i, i10 + i11, rVar2, L().g().p(rVar2.getReturnType(), aVarB), null);
            i10++;
        }
        return arrayList;
    }

    private final InterfaceC2494d F0() {
        boolean zN = this.f16564o.n();
        if ((this.f16564o.H() || !this.f16564o.t()) && !zN) {
            return null;
        }
        InterfaceC2495e interfaceC2495eR = R();
        Lh.b bVarT1 = Lh.b.t1(interfaceC2495eR, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), true, L().a().t().a(this.f16564o));
        AbstractC6492s.h(bVarT1, "createJavaConstructor(...)");
        List listE0 = zN ? E0(bVarT1) : Collections.emptyList();
        bVarT1.Z0(false);
        bVarT1.q1(listE0, Z0(interfaceC2495eR));
        bVarT1.Y0(true);
        bVarT1.g1(interfaceC2495eR.u());
        L().a().h().c(this.f16564o, bVarT1);
        return bVarT1;
    }

    private final InterfaceC2494d G0() {
        InterfaceC2495e interfaceC2495eR = R();
        Lh.b bVarT1 = Lh.b.t1(interfaceC2495eR, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), true, L().a().t().a(this.f16564o));
        AbstractC6492s.h(bVarT1, "createJavaConstructor(...)");
        List listM0 = M0(bVarT1);
        bVarT1.Z0(false);
        bVarT1.q1(listM0, Z0(interfaceC2495eR));
        bVarT1.Y0(false);
        bVarT1.g1(interfaceC2495eR.u());
        return bVarT1;
    }

    private final f0 H0(f0 f0Var, InterfaceC2491a interfaceC2491a, Collection collection) {
        Collection<f0> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return f0Var;
        }
        for (f0 f0Var2 : collection2) {
            if (!AbstractC6492s.d(f0Var, f0Var2) && f0Var2.a0() == null && Q0(f0Var2, interfaceC2491a)) {
                InterfaceC2515z interfaceC2515zA = f0Var.v().q().a();
                AbstractC6492s.f(interfaceC2515zA);
                return (f0) interfaceC2515zA;
            }
        }
        return f0Var;
    }

    private final f0 I0(InterfaceC2515z interfaceC2515z, InterfaceC6835l interfaceC6835l) {
        Object next;
        Zh.f name = interfaceC2515z.getName();
        AbstractC6492s.h(name, "getName(...)");
        Iterator it = ((Iterable) interfaceC6835l.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e1((f0) next, interfaceC2515z)) {
                break;
            }
        }
        f0 f0Var = (f0) next;
        if (f0Var == null) {
            return null;
        }
        InterfaceC2515z.a aVarV = f0Var.v();
        List listI = interfaceC2515z.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        List list = listI;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((s0) it2.next()).getType());
        }
        List listI2 = f0Var.i();
        AbstractC6492s.h(listI2, "getValueParameters(...)");
        aVarV.d(Lh.h.a(arrayList, listI2, interfaceC2515z));
        aVarV.u();
        aVarV.i();
        aVarV.k(Lh.e.f11822H, Boolean.TRUE);
        return (f0) aVarV.a();
    }

    private final Lh.f J0(Bh.Y y10, InterfaceC6835l interfaceC6835l) {
        f0 f0VarX0;
        Dh.M m10 = null;
        if (!P0(y10, interfaceC6835l)) {
            return null;
        }
        f0 f0VarW0 = W0(y10, interfaceC6835l);
        AbstractC6492s.f(f0VarW0);
        if (y10.h0()) {
            f0VarX0 = X0(y10, interfaceC6835l);
            AbstractC6492s.f(f0VarX0);
        } else {
            f0VarX0 = null;
        }
        if (f0VarX0 != null) {
            f0VarX0.l();
            f0VarW0.l();
        }
        Lh.d dVar = new Lh.d(R(), f0VarW0, f0VarX0, y10);
        pi.S returnType = f0VarW0.getReturnType();
        AbstractC6492s.f(returnType);
        dVar.b1(returnType, AbstractC3689v.l(), O(), null, AbstractC3689v.l());
        Dh.L lK = bi.h.k(dVar, f0VarW0.getAnnotations(), false, false, false, f0VarW0.j());
        lK.M0(f0VarW0);
        lK.P0(dVar.getType());
        AbstractC6492s.h(lK, "apply(...)");
        if (f0VarX0 != null) {
            List listI = f0VarX0.i();
            AbstractC6492s.h(listI, "getValueParameters(...)");
            s0 s0Var = (s0) AbstractC3689v.s0(listI);
            if (s0Var == null) {
                throw new AssertionError("No parameter found for " + f0VarX0);
            }
            m10 = bi.h.m(dVar, f0VarX0.getAnnotations(), s0Var.getAnnotations(), false, false, false, f0VarX0.getVisibility(), f0VarX0.j());
            m10.M0(f0VarX0);
        }
        dVar.U0(lK, m10);
        return dVar;
    }

    private final Lh.f K0(Qh.r rVar, pi.S s10, Bh.D d10) {
        Lh.f fVarF1 = Lh.f.f1(R(), Mh.h.a(L(), rVar), d10, Jh.V.d(rVar.getVisibility()), false, rVar.getName(), L().a().t().a(rVar), false);
        AbstractC6492s.h(fVarF1, "create(...)");
        Dh.L lD = bi.h.d(fVarF1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b());
        AbstractC6492s.h(lD, "createDefaultGetter(...)");
        fVarF1.U0(lD, null);
        pi.S sA = s10 == null ? A(rVar, Mh.c.i(L(), fVarF1, rVar, 0, 4, null)) : s10;
        fVarF1.b1(sA, AbstractC3689v.l(), O(), null, AbstractC3689v.l());
        lD.P0(sA);
        return fVarF1;
    }

    static /* synthetic */ Lh.f L0(C3398z c3398z, Qh.r rVar, pi.S s10, Bh.D d10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s10 = null;
        }
        return c3398z.K0(rVar, s10, d10);
    }

    private final List M0(C2603i c2603i) {
        Collection collectionG = this.f16564o.g();
        ArrayList arrayList = new ArrayList(collectionG.size());
        Oh.a aVarB = Oh.b.b(I0.COMMON, false, false, null, 6, null);
        Iterator it = collectionG.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            Qh.w wVar = (Qh.w) it.next();
            pi.S sP = L().g().p(wVar.getType(), aVarB);
            arrayList.add(new Dh.V(c2603i, null, i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), wVar.getName(), sP, false, false, false, wVar.c() ? L().a().m().q().k(sP) : null, L().a().t().a(wVar)));
        }
    }

    private final f0 N0(f0 f0Var, Zh.f fVar) {
        InterfaceC2515z.a aVarV = f0Var.v();
        aVarV.n(fVar);
        aVarV.u();
        aVarV.i();
        InterfaceC2515z interfaceC2515zA = aVarV.a();
        AbstractC6492s.f(interfaceC2515zA);
        return (f0) interfaceC2515zA;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Bh.f0 O0(Bh.f0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.i()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            java.lang.Object r0 = Zg.AbstractC3689v.D0(r0)
            Bh.s0 r0 = (Bh.s0) r0
            r2 = 0
            if (r0 == 0) goto L7d
            pi.S r3 = r0.getType()
            pi.v0 r3 = r3.N0()
            Bh.h r3 = r3.c()
            if (r3 == 0) goto L35
            Zh.d r3 = fi.AbstractC5833e.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            Zh.c r3 = r3.l()
            goto L36
        L35:
            r3 = r2
        L36:
            Zh.c r4 = kotlin.reflect.jvm.internal.impl.builtins.o.f51798v
            boolean r3 = kotlin.jvm.internal.AbstractC6492s.d(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            Bh.z$a r2 = r6.v()
            java.util.List r6 = r6.i()
            kotlin.jvm.internal.AbstractC6492s.h(r6, r1)
            r1 = 1
            java.util.List r6 = Zg.AbstractC3689v.i0(r6, r1)
            Bh.z$a r6 = r2.d(r6)
            pi.S r0 = r0.getType()
            java.util.List r0 = r0.L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            pi.B0 r0 = (pi.B0) r0
            pi.S r0 = r0.getType()
            Bh.z$a r6 = r6.g(r0)
            Bh.z r6 = r6.a()
            Bh.f0 r6 = (Bh.f0) r6
            r0 = r6
            Dh.O r0 = (Dh.O) r0
            if (r0 == 0) goto L7c
            r0.h1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.C3398z.O0(Bh.f0):Bh.f0");
    }

    private final boolean P0(Bh.Y y10, InterfaceC6835l interfaceC6835l) {
        if (AbstractC3377d.a(y10)) {
            return false;
        }
        f0 f0VarW0 = W0(y10, interfaceC6835l);
        f0 f0VarX0 = X0(y10, interfaceC6835l);
        if (f0VarW0 == null) {
            return false;
        }
        if (y10.h0()) {
            return f0VarX0 != null && f0VarX0.l() == f0VarW0.l();
        }
        return true;
    }

    private final boolean Q0(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
        o.i.a aVarC = bi.o.f33360f.F(interfaceC2491a2, interfaceC2491a, true).c();
        AbstractC6492s.h(aVarC, "getResult(...)");
        return aVarC == o.i.a.OVERRIDABLE && !Jh.z.f10219a.a(interfaceC2491a2, interfaceC2491a);
    }

    private final boolean R0(f0 f0Var) {
        U.a aVar = Jh.U.f10160a;
        Zh.f name = f0Var.getName();
        AbstractC6492s.h(name, "getName(...)");
        Zh.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set setB1 = b1(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (Jh.T.d((f0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        f0 f0VarN0 = N0(f0Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((f0) it.next(), f0VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(f0 f0Var, InterfaceC2515z interfaceC2515z) {
        if (C3112f.f10185o.m(f0Var)) {
            interfaceC2515z = interfaceC2515z.a();
        }
        AbstractC6492s.f(interfaceC2515z);
        return Q0(interfaceC2515z, f0Var);
    }

    private final boolean T0(f0 f0Var) {
        f0 f0VarO0 = O0(f0Var);
        if (f0VarO0 == null) {
            return false;
        }
        Zh.f name = f0Var.getName();
        AbstractC6492s.h(name, "getName(...)");
        Set<f0> setB1 = b1(name);
        if ((setB1 instanceof Collection) && setB1.isEmpty()) {
            return false;
        }
        for (f0 f0Var2 : setB1) {
            if (f0Var2.isSuspend() && Q0(f0VarO0, f0Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U0(C3398z c3398z) {
        Collection collectionC = c3398z.f16564o.C();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionC) {
            if (((Qh.n) obj).G()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Qh.n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final f0 V0(Bh.Y y10, String str, InterfaceC6835l interfaceC6835l) {
        f0 f0Var;
        Zh.f fVarH = Zh.f.h(str);
        AbstractC6492s.h(fVarH, "identifier(...)");
        Iterator it = ((Iterable) interfaceC6835l.invoke(fVarH)).iterator();
        do {
            f0Var = null;
            if (!it.hasNext()) {
                break;
            }
            f0 f0Var2 = (f0) it.next();
            if (f0Var2.i().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f52144a;
                pi.S returnType = f0Var2.getReturnType();
                if (returnType == null ? false : eVar.c(returnType, y10.getType())) {
                    f0Var = f0Var2;
                }
            }
        } while (f0Var == null);
        return f0Var;
    }

    private final f0 W0(Bh.Y y10, InterfaceC6835l interfaceC6835l) {
        Bh.Z zD = y10.d();
        Bh.Z z10 = zD != null ? (Bh.Z) Jh.T.g(zD) : null;
        String strB = z10 != null ? C3119m.f10196a.b(z10) : null;
        if (strB != null && !Jh.T.l(R(), z10)) {
            return V0(y10, strB, interfaceC6835l);
        }
        String strB2 = y10.getName().b();
        AbstractC6492s.h(strB2, "asString(...)");
        return V0(y10, Jh.H.b(strB2), interfaceC6835l);
    }

    private final f0 X0(Bh.Y y10, InterfaceC6835l interfaceC6835l) {
        f0 f0Var;
        pi.S returnType;
        String strB = y10.getName().b();
        AbstractC6492s.h(strB, "asString(...)");
        Zh.f fVarH = Zh.f.h(Jh.H.e(strB));
        AbstractC6492s.h(fVarH, "identifier(...)");
        Iterator it = ((Iterable) interfaceC6835l.invoke(fVarH)).iterator();
        do {
            f0Var = null;
            if (!it.hasNext()) {
                break;
            }
            f0 f0Var2 = (f0) it.next();
            if (f0Var2.i().size() == 1 && (returnType = f0Var2.getReturnType()) != null && kotlin.reflect.jvm.internal.impl.builtins.i.C0(returnType)) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f52144a;
                List listI = f0Var2.i();
                AbstractC6492s.h(listI, "getValueParameters(...)");
                if (eVar.b(((s0) AbstractC3689v.R0(listI)).getType(), y10.getType())) {
                    f0Var = f0Var2;
                }
            }
        } while (f0Var == null);
        return f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Y0(Mh.k kVar, C3398z c3398z) {
        return AbstractC3689v.n1(kVar.a().w().g(c3398z.R(), kVar));
    }

    private final AbstractC2510u Z0(InterfaceC2495e interfaceC2495e) {
        AbstractC2510u visibility = interfaceC2495e.getVisibility();
        AbstractC6492s.h(visibility, "getVisibility(...)");
        if (!AbstractC6492s.d(visibility, Jh.y.f10216b)) {
            return visibility;
        }
        AbstractC2510u PROTECTED_AND_PACKAGE = Jh.y.f10217c;
        AbstractC6492s.h(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set b1(Zh.f fVar) {
        Collection collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(linkedHashSet, ((pi.S) it.next()).r().b(fVar, Ih.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set d1(Zh.f fVar) {
        Collection collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection collectionD = ((pi.S) it.next()).r().d(fVar, Ih.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(collectionD, 10));
            Iterator it2 = collectionD.iterator();
            while (it2.hasNext()) {
                arrayList2.add((Bh.Y) it2.next());
            }
            AbstractC3689v.C(arrayList, arrayList2);
        }
        return AbstractC3689v.n1(arrayList);
    }

    private final boolean e1(f0 f0Var, InterfaceC2515z interfaceC2515z) {
        String strC = Sh.C.c(f0Var, false, false, 2, null);
        InterfaceC2515z interfaceC2515zA = interfaceC2515z.a();
        AbstractC6492s.h(interfaceC2515zA, "getOriginal(...)");
        return AbstractC6492s.d(strC, Sh.C.c(interfaceC2515zA, false, false, 2, null)) && !Q0(f0Var, interfaceC2515z);
    }

    private final boolean f1(f0 f0Var) {
        Zh.f name = f0Var.getName();
        AbstractC6492s.h(name, "getName(...)");
        List listA = Jh.N.a(name);
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set<Bh.Y> setD1 = d1((Zh.f) it.next());
                if (!(setD1 instanceof Collection) || !setD1.isEmpty()) {
                    for (Bh.Y y10 : setD1) {
                        if (P0(y10, new C3394v(f0Var, this))) {
                            if (!y10.h0()) {
                                String strB = f0Var.getName().b();
                                AbstractC6492s.h(strB, "asString(...)");
                                if (!Jh.H.d(strB)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(f0Var) || s1(f0Var) || T0(f0Var)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g1(f0 f0Var, C3398z c3398z, Zh.f accessorName) {
        AbstractC6492s.i(accessorName, "accessorName");
        return AbstractC6492s.d(f0Var.getName(), accessorName) ? AbstractC3689v.e(f0Var) : AbstractC3689v.M0(c3398z.q1(accessorName), c3398z.r1(accessorName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h1(C3398z c3398z) {
        return AbstractC3689v.n1(c3398z.f16564o.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e i1(C3398z c3398z, Mh.k kVar, Zh.f name) {
        AbstractC6492s.i(name, "name");
        if (((Set) c3398z.f16567r.invoke()).contains(name)) {
            InterfaceC3126u interfaceC3126uD = kVar.a().d();
            Zh.b bVarN = AbstractC5833e.n(c3398z.R());
            AbstractC6492s.f(bVarN);
            Qh.g gVarC = interfaceC3126uD.c(new InterfaceC3126u.a(bVarN.d(name), null, c3398z.f16564o, 2, null));
            if (gVarC == null) {
                return null;
            }
            C3387n c3387n = new C3387n(kVar, c3398z.R(), gVarC, null, 8, null);
            kVar.a().e().a(c3387n);
            return c3387n;
        }
        if (!((Set) c3398z.f16568s.invoke()).contains(name)) {
            Qh.n nVar = (Qh.n) ((Map) c3398z.f16569t.invoke()).get(name);
            if (nVar == null) {
                return null;
            }
            return C2611q.L0(kVar.e(), c3398z.R(), name, kVar.e().f(new C3397y(c3398z)), Mh.h.a(kVar, nVar), kVar.a().t().a(nVar));
        }
        List listC = AbstractC3689v.c();
        kVar.a().w().b(c3398z.R(), name, listC, kVar);
        List listA = AbstractC3689v.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (InterfaceC2495e) AbstractC3689v.R0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j1(C3398z c3398z) {
        return d0.l(c3398z.a(), c3398z.c());
    }

    private final f0 k1(f0 f0Var, InterfaceC6835l interfaceC6835l, Collection collection) {
        f0 f0VarI0;
        InterfaceC2515z interfaceC2515zL = C3115i.l(f0Var);
        if (interfaceC2515zL == null || (f0VarI0 = I0(interfaceC2515zL, interfaceC6835l)) == null) {
            return null;
        }
        if (!f1(f0VarI0)) {
            f0VarI0 = null;
        }
        if (f0VarI0 != null) {
            return H0(f0VarI0, interfaceC2515zL, collection);
        }
        return null;
    }

    private final f0 l1(f0 f0Var, InterfaceC6835l interfaceC6835l, Zh.f fVar, Collection collection) {
        f0 f0Var2 = (f0) Jh.T.g(f0Var);
        if (f0Var2 == null) {
            return null;
        }
        String strE = Jh.T.e(f0Var2);
        AbstractC6492s.f(strE);
        Zh.f fVarH = Zh.f.h(strE);
        AbstractC6492s.h(fVarH, "identifier(...)");
        Iterator it = ((Collection) interfaceC6835l.invoke(fVarH)).iterator();
        while (it.hasNext()) {
            f0 f0VarN0 = N0((f0) it.next(), fVar);
            if (S0(f0Var2, f0VarN0)) {
                return H0(f0VarN0, f0Var2, collection);
            }
        }
        return null;
    }

    private final f0 m1(f0 f0Var, InterfaceC6835l interfaceC6835l) {
        if (!f0Var.isSuspend()) {
            return null;
        }
        Zh.f name = f0Var.getName();
        AbstractC6492s.h(name, "getName(...)");
        Iterator it = ((Iterable) interfaceC6835l.invoke(name)).iterator();
        while (it.hasNext()) {
            f0 f0VarO0 = O0((f0) it.next());
            if (f0VarO0 == null || !Q0(f0VarO0, f0Var)) {
                f0VarO0 = null;
            }
            if (f0VarO0 != null) {
                return f0VarO0;
            }
        }
        return null;
    }

    private final Lh.b o1(Qh.k kVar) {
        InterfaceC2495e interfaceC2495eR = R();
        Lh.b bVarT1 = Lh.b.t1(interfaceC2495eR, Mh.h.a(L(), kVar), false, L().a().t().a(kVar));
        AbstractC6492s.h(bVarT1, "createJavaConstructor(...)");
        Mh.k kVarH = Mh.c.h(L(), bVarT1, kVar, interfaceC2495eR.w().size());
        U.b bVarD0 = d0(kVarH, bVarT1, kVar.i());
        List listW = interfaceC2495eR.w();
        AbstractC6492s.h(listW, "getDeclaredTypeParameters(...)");
        List list = listW;
        List typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            l0 l0VarA = kVarH.f().a((Qh.y) it.next());
            AbstractC6492s.f(l0VarA);
            arrayList.add(l0VarA);
        }
        bVarT1.r1(bVarD0.a(), Jh.V.d(kVar.getVisibility()), AbstractC3689v.M0(list, arrayList));
        bVarT1.Y0(false);
        bVarT1.Z0(bVarD0.b());
        bVarT1.g1(interfaceC2495eR.u());
        kVarH.a().h().c(kVar, bVarT1);
        return bVarT1;
    }

    private final Lh.e p1(Qh.w wVar) {
        Lh.e eVarP1 = Lh.e.p1(R(), Mh.h.a(L(), wVar), wVar.getName(), L().a().t().a(wVar), true);
        AbstractC6492s.h(eVarP1, "createJavaMethod(...)");
        eVarP1.o1(null, O(), AbstractC3689v.l(), AbstractC3689v.l(), AbstractC3689v.l(), L().g().p(wVar.getType(), Oh.b.b(I0.COMMON, false, false, null, 6, null)), Bh.D.Companion.a(false, false, true), AbstractC2509t.f1796e, null);
        eVarP1.s1(false, false);
        L().a().h().a(wVar, eVarP1);
        return eVarP1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection q1(Zh.f fVar) {
        Collection collectionB = ((InterfaceC3376c) N().invoke()).b(fVar);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionB, 10));
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((Qh.r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection r1(Zh.f fVar) {
        Set setB1 = b1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            f0 f0Var = (f0) obj;
            if (!Jh.T.d(f0Var) && C3115i.l(f0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void s0(List list, InterfaceC2502l interfaceC2502l, int i10, Qh.r rVar, pi.S s10, pi.S s11) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        Zh.f name = rVar.getName();
        pi.S sN = J0.n(s10);
        AbstractC6492s.h(sN, "makeNotNullable(...)");
        list.add(new Dh.V(interfaceC2502l, null, i10, hVarB, name, sN, rVar.L(), false, false, s11 != null ? J0.n(s11) : null, L().a().t().a(rVar)));
    }

    private final boolean s1(f0 f0Var) {
        C3115i c3115i = C3115i.f10188o;
        Zh.f name = f0Var.getName();
        AbstractC6492s.h(name, "getName(...)");
        if (!c3115i.n(name)) {
            return false;
        }
        Zh.f name2 = f0Var.getName();
        AbstractC6492s.h(name2, "getName(...)");
        Set setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setB1.iterator();
        while (it.hasNext()) {
            InterfaceC2515z interfaceC2515zL = C3115i.l((f0) it.next());
            if (interfaceC2515zL != null) {
                arrayList.add(interfaceC2515zL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(f0Var, (InterfaceC2515z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection collection, Zh.f fVar, Collection collection2, boolean z10) {
        Collection collectionD = Kh.a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().a());
        AbstractC6492s.h(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        Collection<f0> collection3 = collectionD;
        List listM0 = AbstractC3689v.M0(collection, collection3);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection3, 10));
        for (f0 f0VarH0 : collection3) {
            f0 f0Var = (f0) Jh.T.j(f0VarH0);
            if (f0Var == null) {
                AbstractC6492s.f(f0VarH0);
            } else {
                AbstractC6492s.f(f0VarH0);
                f0VarH0 = H0(f0VarH0, f0Var, listM0);
            }
            arrayList.add(f0VarH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(Zh.f fVar, Collection collection, Collection collection2, Collection collection3, InterfaceC6835l interfaceC6835l) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            AbstractC8534a.a(collection3, l1(f0Var, interfaceC6835l, fVar, collection));
            AbstractC8534a.a(collection3, k1(f0Var, interfaceC6835l, collection));
            AbstractC8534a.a(collection3, m1(f0Var, interfaceC6835l));
        }
    }

    private final void v0(Set set, Collection collection, Set set2, InterfaceC6835l interfaceC6835l) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Bh.Y y10 = (Bh.Y) it.next();
            Lh.f fVarJ0 = J0(y10, interfaceC6835l);
            if (fVarJ0 != null) {
                collection.add(fVarJ0);
                if (set2 != null) {
                    set2.add(y10);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(Zh.f fVar, Collection collection) {
        Qh.r rVar = (Qh.r) AbstractC3689v.S0(((InterfaceC3376c) N().invoke()).b(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(L0(this, rVar, null, Bh.D.FINAL, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(Qh.q it) {
        AbstractC6492s.i(it, "it");
        return !it.Q();
    }

    @Override // Nh.U
    protected void B(Collection result, Zh.f name) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(name, "name");
        Set setB1 = b1(name);
        if (!Jh.U.f10160a.k(name) && !C3115i.f10188o.n(name)) {
            Set set = setB1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2515z) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (f1((f0) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(result, name, arrayList, false);
            return;
        }
        C8545l c8545lA = C8545l.f66170c.a();
        Collection collectionD = Kh.a.d(name, setB1, AbstractC3689v.l(), R(), InterfaceC6645w.f52759a, L().a().k().a());
        AbstractC6492s.h(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(name, result, collectionD, result, new a(this));
        u0(name, result, collectionD, c8545lA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((f0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(result, name, AbstractC3689v.M0(arrayList2, c8545lA), true);
    }

    @Override // Nh.U
    protected void C(Zh.f name, Collection result) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(result, "result");
        if (this.f16564o.n()) {
            w0(name, result);
        }
        Set setD1 = d1(name);
        if (setD1.isEmpty()) {
            return;
        }
        C8545l.b bVar = C8545l.f66170c;
        C8545l c8545lA = bVar.a();
        C8545l c8545lA2 = bVar.a();
        v0(setD1, result, c8545lA, new C3395w(this));
        v0(d0.j(setD1, c8545lA), c8545lA2, null, new C3396x(this));
        Collection collectionD = Kh.a.d(name, d0.l(setD1, c8545lA2), result, R(), L().a().c(), L().a().k().a());
        AbstractC6492s.h(collectionD, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionD);
    }

    @Override // Nh.U
    protected Set D(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        if (this.f16564o.n()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC3376c) N().invoke()).e());
        Collection collectionA = R().k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(linkedHashSet, ((pi.S) it.next()).r().c());
        }
        return linkedHashSet;
    }

    @Override // Nh.U
    protected Bh.b0 O() {
        return bi.i.l(R());
    }

    @Override // Nh.U
    protected boolean V(Lh.e eVar) {
        AbstractC6492s.i(eVar, "<this>");
        if (this.f16564o.n()) {
            return false;
        }
        return f1(eVar);
    }

    @Override // Nh.U
    protected U.a Y(Qh.r method, List methodTypeParameters, pi.S returnType, List valueParameters) {
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(methodTypeParameters, "methodTypeParameters");
        AbstractC6492s.i(returnType, "returnType");
        AbstractC6492s.i(valueParameters, "valueParameters");
        o.b bVarB = L().a().s().b(method, R(), returnType, null, valueParameters, methodTypeParameters);
        AbstractC6492s.h(bVarB, "resolvePropagatedSignature(...)");
        pi.S sD = bVarB.d();
        AbstractC6492s.h(sD, "getReturnType(...)");
        pi.S sC = bVarB.c();
        List listF = bVarB.f();
        AbstractC6492s.h(listF, "getValueParameters(...)");
        List listE = bVarB.e();
        AbstractC6492s.h(listE, "getTypeParameters(...)");
        boolean zG = bVarB.g();
        List listB = bVarB.b();
        AbstractC6492s.h(listB, "getErrors(...)");
        return new U.a(sD, sC, listF, listE, zG, listB);
    }

    public final oi.i a1() {
        return this.f16566q;
    }

    @Override // Nh.U, ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        n1(name, location);
        return super.b(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nh.U
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public InterfaceC2495e R() {
        return this.f16563n;
    }

    @Override // Nh.U, ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        n1(name, location);
        return super.d(name, location);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        oi.h hVar;
        InterfaceC2495e interfaceC2495e;
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        n1(name, location);
        C3398z c3398z = (C3398z) Q();
        return (c3398z == null || (hVar = c3398z.f16570u) == null || (interfaceC2495e = (InterfaceC2495e) hVar.invoke(name)) == null) ? (InterfaceC2498h) this.f16570u.invoke(name) : interfaceC2495e;
    }

    public void n1(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        Hh.a.a(L().a().l(), location, R(), name);
    }

    @Override // Nh.U
    public String toString() {
        return "Lazy Java member scope for " + this.f16564o.e();
    }

    @Override // Nh.U
    protected Set v(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        return d0.l((Set) this.f16567r.invoke(), ((Map) this.f16569t.invoke()).keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nh.U
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet x(C6157d kindFilter, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        Collection collectionA = R().k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(linkedHashSet, ((pi.S) it.next()).r().a());
        }
        linkedHashSet.addAll(((InterfaceC3376c) N().invoke()).a());
        linkedHashSet.addAll(((InterfaceC3376c) N().invoke()).d());
        linkedHashSet.addAll(v(kindFilter, interfaceC6835l));
        linkedHashSet.addAll(L().a().w().e(R(), L()));
        return linkedHashSet;
    }

    @Override // Nh.U
    protected void y(Collection result, Zh.f name) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(name, "name");
        if (this.f16564o.p() && ((InterfaceC3376c) N().invoke()).f(name) != null) {
            Collection collection = result;
            if (collection.isEmpty()) {
                Qh.w wVarF = ((InterfaceC3376c) N().invoke()).f(name);
                AbstractC6492s.f(wVarF);
                result.add(p1(wVarF));
            } else {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (((f0) it.next()).i().isEmpty()) {
                        break;
                    }
                }
                Qh.w wVarF2 = ((InterfaceC3376c) N().invoke()).f(name);
                AbstractC6492s.f(wVarF2);
                result.add(p1(wVarF2));
            }
        }
        L().a().w().f(R(), name, result, L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Nh.U
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C3375b z() {
        return new C3375b(this.f16564o, C3393u.f16557a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3398z(Mh.k c10, InterfaceC2495e ownerDescriptor, Qh.g jClass, boolean z10, C3398z c3398z) {
        super(c10, c3398z);
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(ownerDescriptor, "ownerDescriptor");
        AbstractC6492s.i(jClass, "jClass");
        this.f16563n = ownerDescriptor;
        this.f16564o = jClass;
        this.f16565p = z10;
        this.f16566q = c10.e().f(new C3389p(this, c10));
        this.f16567r = c10.e().f(new C3390q(this));
        this.f16568s = c10.e().f(new r(c10, this));
        this.f16569t = c10.e().f(new C3391s(this));
        this.f16570u = c10.e().i(new C3392t(this, c10));
    }
}
