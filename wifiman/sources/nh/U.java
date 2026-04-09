package Nh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.f0;
import Bh.l0;
import Bh.t0;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import ii.AbstractC6156c;
import ii.AbstractC6165l;
import ii.C6157d;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import pi.I0;
import pi.J0;
import xi.AbstractC8534a;

/* loaded from: classes4.dex */
public abstract class U extends AbstractC6165l {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ th.l[] f16467m = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(U.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(U.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(U.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    private final Mh.k f16468b;

    /* renamed from: c, reason: collision with root package name */
    private final U f16469c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f16470d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.i f16471e;

    /* renamed from: f, reason: collision with root package name */
    private final oi.g f16472f;

    /* renamed from: g, reason: collision with root package name */
    private final oi.h f16473g;

    /* renamed from: h, reason: collision with root package name */
    private final oi.g f16474h;

    /* renamed from: i, reason: collision with root package name */
    private final oi.i f16475i;

    /* renamed from: j, reason: collision with root package name */
    private final oi.i f16476j;

    /* renamed from: k, reason: collision with root package name */
    private final oi.i f16477k;

    /* renamed from: l, reason: collision with root package name */
    private final oi.g f16478l;

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final pi.S f16479a;

        /* renamed from: b, reason: collision with root package name */
        private final pi.S f16480b;

        /* renamed from: c, reason: collision with root package name */
        private final List f16481c;

        /* renamed from: d, reason: collision with root package name */
        private final List f16482d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f16483e;

        /* renamed from: f, reason: collision with root package name */
        private final List f16484f;

        public a(pi.S returnType, pi.S s10, List valueParameters, List typeParameters, boolean z10, List errors) {
            AbstractC6492s.i(returnType, "returnType");
            AbstractC6492s.i(valueParameters, "valueParameters");
            AbstractC6492s.i(typeParameters, "typeParameters");
            AbstractC6492s.i(errors, "errors");
            this.f16479a = returnType;
            this.f16480b = s10;
            this.f16481c = valueParameters;
            this.f16482d = typeParameters;
            this.f16483e = z10;
            this.f16484f = errors;
        }

        public final List a() {
            return this.f16484f;
        }

        public final boolean b() {
            return this.f16483e;
        }

        public final pi.S c() {
            return this.f16480b;
        }

        public final pi.S d() {
            return this.f16479a;
        }

        public final List e() {
            return this.f16482d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f16479a, aVar.f16479a) && AbstractC6492s.d(this.f16480b, aVar.f16480b) && AbstractC6492s.d(this.f16481c, aVar.f16481c) && AbstractC6492s.d(this.f16482d, aVar.f16482d) && this.f16483e == aVar.f16483e && AbstractC6492s.d(this.f16484f, aVar.f16484f);
        }

        public final List f() {
            return this.f16481c;
        }

        public int hashCode() {
            int iHashCode = this.f16479a.hashCode() * 31;
            pi.S s10 = this.f16480b;
            return ((((((((iHashCode + (s10 == null ? 0 : s10.hashCode())) * 31) + this.f16481c.hashCode()) * 31) + this.f16482d.hashCode()) * 31) + Boolean.hashCode(this.f16483e)) * 31) + this.f16484f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f16479a + ", receiverType=" + this.f16480b + ", valueParameters=" + this.f16481c + ", typeParameters=" + this.f16482d + ", hasStableParameterNames=" + this.f16483e + ", errors=" + this.f16484f + ')';
        }
    }

    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f16485a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f16486b;

        public b(List descriptors, boolean z10) {
            AbstractC6492s.i(descriptors, "descriptors");
            this.f16485a = descriptors;
            this.f16486b = z10;
        }

        public final List a() {
            return this.f16485a;
        }

        public final boolean b() {
            return this.f16486b;
        }
    }

    public /* synthetic */ U(Mh.k kVar, U u10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? null : u10);
    }

    private final Dh.K E(Qh.n nVar) {
        Lh.f fVarF1 = Lh.f.f1(R(), Mh.h.a(this.f16468b, nVar), Bh.D.FINAL, Jh.V.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f16468b.a().t().a(nVar), U(nVar));
        AbstractC6492s.h(fVarF1, "create(...)");
        return fVarF1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.Y F(U u10, Zh.f name) {
        AbstractC6492s.i(name, "name");
        U u11 = u10.f16469c;
        if (u11 != null) {
            return (Bh.Y) u11.f16473g.invoke(name);
        }
        Qh.n nVarC = ((InterfaceC3376c) u10.f16471e.invoke()).c(name);
        if (nVarC == null || nVarC.G()) {
            return null;
        }
        return u10.a0(nVarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection G(U u10, Zh.f name) {
        AbstractC6492s.i(name, "name");
        U u11 = u10.f16469c;
        if (u11 != null) {
            return (Collection) u11.f16472f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (Qh.r rVar : ((InterfaceC3376c) u10.f16471e.invoke()).b(name)) {
            Lh.e eVarZ = u10.Z(rVar);
            if (u10.V(eVarZ)) {
                u10.f16468b.a().h().a(rVar, eVarZ);
                arrayList.add(eVarZ);
            }
        }
        u10.y(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3376c H(U u10) {
        return u10.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set I(U u10) {
        return u10.x(C6157d.f49201v, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection J(U u10, Zh.f name) {
        AbstractC6492s.i(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) u10.f16472f.invoke(name));
        u10.e0(linkedHashSet);
        u10.B(linkedHashSet, name);
        return AbstractC3689v.i1(u10.f16468b.a().r().p(u10.f16468b, linkedHashSet));
    }

    private final Set M() {
        return (Set) oi.m.a(this.f16477k, this, f16467m[2]);
    }

    private final Set P() {
        return (Set) oi.m.a(this.f16475i, this, f16467m[0]);
    }

    private final Set S() {
        return (Set) oi.m.a(this.f16476j, this, f16467m[1]);
    }

    private final pi.S T(Qh.n nVar) {
        pi.S sP = this.f16468b.g().p(nVar.getType(), Oh.b.b(I0.COMMON, false, false, null, 7, null));
        if ((!kotlin.reflect.jvm.internal.impl.builtins.i.s0(sP) && !kotlin.reflect.jvm.internal.impl.builtins.i.v0(sP)) || !U(nVar) || !nVar.O()) {
            return sP;
        }
        pi.S sN = J0.n(sP);
        AbstractC6492s.h(sN, "makeNotNullable(...)");
        return sN;
    }

    private final boolean U(Qh.n nVar) {
        return nVar.isFinal() && nVar.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(U u10, Zh.f name) {
        AbstractC6492s.i(name, "name");
        ArrayList arrayList = new ArrayList();
        AbstractC8534a.a(arrayList, u10.f16473g.invoke(name));
        u10.C(name, arrayList);
        return bi.i.t(u10.R()) ? AbstractC3689v.i1(arrayList) : AbstractC3689v.i1(u10.f16468b.a().r().p(u10.f16468b, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set X(U u10) {
        return u10.D(C6157d.f49202w, null);
    }

    private final Bh.Y a0(Qh.n nVar) {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        Dh.K kE = E(nVar);
        n10.f51689a = kE;
        kE.V0(null, null, null, null);
        ((Dh.K) n10.f51689a).b1(T(nVar), AbstractC3689v.l(), O(), null, AbstractC3689v.l());
        InterfaceC2503m interfaceC2503mR = R();
        InterfaceC2495e interfaceC2495e = interfaceC2503mR instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mR : null;
        if (interfaceC2495e != null) {
            n10.f51689a = this.f16468b.a().w().d(interfaceC2495e, (Dh.K) n10.f51689a, this.f16468b);
        }
        Object obj = n10.f51689a;
        if (bi.i.K((t0) obj, ((Dh.K) obj).getType())) {
            ((Dh.K) n10.f51689a).L0(new I(this, nVar, n10));
        }
        this.f16468b.a().h().d(nVar, (Bh.Y) n10.f51689a);
        return (Bh.Y) n10.f51689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oi.j b0(U u10, Qh.n nVar, kotlin.jvm.internal.N n10) {
        return u10.f16468b.e().b(new J(u10, nVar, n10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5398g c0(U u10, Qh.n nVar, kotlin.jvm.internal.N n10) {
        return u10.f16468b.a().g().a(nVar, (Bh.Y) n10.f51689a);
    }

    private final void e0(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = Sh.C.c((f0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection collectionB = bi.r.b(list2, T.f16466a);
                set.removeAll(list2);
                set.addAll(collectionB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2491a f0(f0 selectMostSpecificInEachOverridableGroup) {
        AbstractC6492s.i(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(U u10) {
        return u10.w(C6157d.f49194o, InterfaceC6164k.f49220a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set u(U u10) {
        return u10.v(C6157d.f49199t, null);
    }

    protected final pi.S A(Qh.r method, Mh.k c10) {
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(c10, "c");
        return c10.g().p(method.getReturnType(), Oh.b.b(I0.COMMON, method.P().n(), false, null, 6, null));
    }

    protected abstract void B(Collection collection, Zh.f fVar);

    protected abstract void C(Zh.f fVar, Collection collection);

    protected abstract Set D(C6157d c6157d, InterfaceC6835l interfaceC6835l);

    protected final oi.i K() {
        return this.f16470d;
    }

    protected final Mh.k L() {
        return this.f16468b;
    }

    protected final oi.i N() {
        return this.f16471e;
    }

    protected abstract Bh.b0 O();

    protected final U Q() {
        return this.f16469c;
    }

    protected abstract InterfaceC2503m R();

    protected boolean V(Lh.e eVar) {
        AbstractC6492s.i(eVar, "<this>");
        return true;
    }

    protected abstract a Y(Qh.r rVar, List list, pi.S s10, List list2);

    protected final Lh.e Z(Qh.r method) {
        AbstractC6492s.i(method, "method");
        Lh.e eVarP1 = Lh.e.p1(R(), Mh.h.a(this.f16468b, method), method.getName(), this.f16468b.a().t().a(method), ((InterfaceC3376c) this.f16471e.invoke()).f(method.getName()) != null && method.i().isEmpty());
        AbstractC6492s.h(eVarP1, "createJavaMethod(...)");
        Mh.k kVarI = Mh.c.i(this.f16468b, eVarP1, method, 0, 4, null);
        List typeParameters = method.getTypeParameters();
        List arrayList = new ArrayList(AbstractC3689v.w(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            l0 l0VarA = kVarI.f().a((Qh.y) it.next());
            AbstractC6492s.f(l0VarA);
            arrayList.add(l0VarA);
        }
        b bVarD0 = d0(kVarI, eVarP1, method.i());
        a aVarY = Y(method, arrayList, A(method, kVarI), bVarD0.a());
        pi.S sC = aVarY.c();
        eVarP1.o1(sC != null ? bi.h.i(eVarP1, sC, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b()) : null, O(), AbstractC3689v.l(), aVarY.e(), aVarY.f(), aVarY.d(), Bh.D.Companion.a(false, method.isAbstract(), true ^ method.isFinal()), Jh.V.d(method.getVisibility()), aVarY.c() != null ? Zg.U.e(Yg.z.a(Lh.e.f11821G, AbstractC3689v.q0(bVarD0.a()))) : Zg.U.h());
        eVarP1.s1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            kVarI.a().s().a(eVarP1, aVarY.a());
        }
        return eVarP1;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set a() {
        return P();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return !a().contains(name) ? AbstractC3689v.l() : (Collection) this.f16474h.invoke(name);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set c() {
        return S();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return !c().contains(name) ? AbstractC3689v.l() : (Collection) this.f16478l.invoke(name);
    }

    protected final b d0(Mh.k kVar, InterfaceC2515z function, List jValueParameters) {
        Yg.s sVarA;
        Zh.f name;
        Mh.k c10 = kVar;
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(function, "function");
        AbstractC6492s.i(jValueParameters, "jValueParameters");
        Iterable<Zg.N> iterableQ1 = AbstractC3689v.q1(jValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterableQ1, 10));
        boolean z10 = false;
        for (Zg.N n10 : iterableQ1) {
            int iA = n10.a();
            Qh.B b10 = (Qh.B) n10.b();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarA = Mh.h.a(c10, b10);
            Oh.a aVarB = Oh.b.b(I0.COMMON, false, false, null, 7, null);
            if (b10.c()) {
                Qh.x type = b10.getType();
                Qh.f fVar = type instanceof Qh.f ? (Qh.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b10);
                }
                pi.S sL = kVar.g().l(fVar, aVarB, true);
                sVarA = Yg.z.a(sL, kVar.d().q().k(sL));
            } else {
                sVarA = Yg.z.a(kVar.g().p(b10.getType(), aVarB), null);
            }
            pi.S s10 = (pi.S) sVarA.a();
            pi.S s11 = (pi.S) sVarA.c();
            if (AbstractC6492s.d(function.getName().b(), "equals") && jValueParameters.size() == 1 && AbstractC6492s.d(kVar.d().q().I(), s10)) {
                name = Zh.f.h("other");
            } else {
                name = b10.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(iA);
                    name = Zh.f.h(sb2.toString());
                    AbstractC6492s.h(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            Zh.f fVar2 = name;
            AbstractC6492s.f(fVar2);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Dh.V(function, null, iA, hVarA, fVar2, s10, false, false, false, s11, kVar.a().t().a(b10)));
            arrayList = arrayList2;
            z10 = z11;
            c10 = kVar;
        }
        return new b(AbstractC3689v.i1(arrayList), z10);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return (Collection) this.f16470d.invoke();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set f() {
        return M();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected abstract Set v(C6157d c6157d, InterfaceC6835l interfaceC6835l);

    protected final List w(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        Ih.d dVar = Ih.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(C6157d.f49182c.c())) {
            for (Zh.f fVar : v(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    AbstractC8534a.a(linkedHashSet, g(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(C6157d.f49182c.d()) && !kindFilter.l().contains(AbstractC6156c.a.f49179a)) {
            for (Zh.f fVar2 : x(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(b(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(C6157d.f49182c.i()) && !kindFilter.l().contains(AbstractC6156c.a.f49179a)) {
            for (Zh.f fVar3 : D(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(d(fVar3, dVar));
                }
            }
        }
        return AbstractC3689v.i1(linkedHashSet);
    }

    protected abstract Set x(C6157d c6157d, InterfaceC6835l interfaceC6835l);

    protected void y(Collection result, Zh.f name) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(name, "name");
    }

    protected abstract InterfaceC3376c z();

    public U(Mh.k c10, U u10) {
        AbstractC6492s.i(c10, "c");
        this.f16468b = c10;
        this.f16469c = u10;
        this.f16470d = c10.e().g(new H(this), AbstractC3689v.l());
        this.f16471e = c10.e().f(new K(this));
        this.f16472f = c10.e().e(new L(this));
        this.f16473g = c10.e().i(new M(this));
        this.f16474h = c10.e().e(new N(this));
        this.f16475i = c10.e().f(new O(this));
        this.f16476j = c10.e().f(new P(this));
        this.f16477k = c10.e().f(new Q(this));
        this.f16478l = c10.e().e(new S(this));
    }
}
