package ni;

import Bh.AbstractC2510u;
import Bh.C2511v;
import Bh.EnumC2496f;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.L;
import Bh.Y;
import Bh.e0;
import Bh.f0;
import Bh.g0;
import Bh.j0;
import Bh.p0;
import Bh.q0;
import Bh.s0;
import Dh.AbstractC2595a;
import Dh.AbstractC2612s;
import Dh.C2603i;
import Dh.C2611q;
import Uh.c;
import Wh.h;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import bi.C4113a;
import fi.AbstractC5833e;
import ii.AbstractC6165l;
import ii.C6157d;
import ii.C6170q;
import ii.InterfaceC6164k;
import ii.InterfaceC6167n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ji.C6341b;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import li.AbstractC6609L;
import li.AbstractC6611N;
import li.AbstractC6613P;
import li.AbstractC6622Z;
import li.C6608K;
import li.C6612O;
import li.C6620X;
import li.C6636n;
import li.C6638p;
import li.InterfaceC6645w;
import mh.InterfaceC6835l;
import pi.AbstractC7341b;
import pi.AbstractC7346d0;
import pi.v0;
import sh.AbstractC7978m;

/* renamed from: ni.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6981m extends AbstractC2595a implements InterfaceC2503m {

    /* renamed from: f, reason: collision with root package name */
    private final Uh.c f54751f;

    /* renamed from: g, reason: collision with root package name */
    private final Wh.a f54752g;

    /* renamed from: h, reason: collision with root package name */
    private final g0 f54753h;

    /* renamed from: i, reason: collision with root package name */
    private final Zh.b f54754i;

    /* renamed from: j, reason: collision with root package name */
    private final Bh.D f54755j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC2510u f54756k;

    /* renamed from: l, reason: collision with root package name */
    private final EnumC2496f f54757l;

    /* renamed from: m, reason: collision with root package name */
    private final C6638p f54758m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f54759n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC6165l f54760o;

    /* renamed from: p, reason: collision with root package name */
    private final b f54761p;

    /* renamed from: q, reason: collision with root package name */
    private final e0 f54762q;

    /* renamed from: r, reason: collision with root package name */
    private final c f54763r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC2503m f54764s;

    /* renamed from: t, reason: collision with root package name */
    private final oi.j f54765t;

    /* renamed from: u, reason: collision with root package name */
    private final oi.i f54766u;

    /* renamed from: v, reason: collision with root package name */
    private final oi.j f54767v;

    /* renamed from: w, reason: collision with root package name */
    private final oi.i f54768w;

    /* renamed from: x, reason: collision with root package name */
    private final oi.j f54769x;

    /* renamed from: y, reason: collision with root package name */
    private final AbstractC6611N.a f54770y;

    /* renamed from: z, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f54771z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.m$a */
    final class a extends AbstractC6991w {

        /* renamed from: g, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f54772g;

        /* renamed from: h, reason: collision with root package name */
        private final oi.i f54773h;

        /* renamed from: i, reason: collision with root package name */
        private final oi.i f54774i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C6981m f54775j;

        /* renamed from: ni.m$a$a, reason: collision with other inner class name */
        public static final class C1992a extends bi.m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f54776a;

            C1992a(List list) {
                this.f54776a = list;
            }

            @Override // bi.n
            public void a(InterfaceC2492b fakeOverride) {
                AbstractC6492s.i(fakeOverride, "fakeOverride");
                bi.o.K(fakeOverride, null);
                this.f54776a.add(fakeOverride);
            }

            @Override // bi.m
            protected void e(InterfaceC2492b fromSuper, InterfaceC2492b fromCurrent) {
                AbstractC6492s.i(fromSuper, "fromSuper");
                AbstractC6492s.i(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof AbstractC2612s) {
                    ((AbstractC2612s) fromCurrent).U0(C2511v.f1809a, fromSuper);
                }
            }
        }

        public a(C6981m c6981m, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f54775j = c6981m;
            C6638p c6638pD1 = c6981m.d1();
            List listR1 = c6981m.e1().R1();
            AbstractC6492s.h(listR1, "getFunctionList(...)");
            List listF2 = c6981m.e1().f2();
            AbstractC6492s.h(listF2, "getPropertyList(...)");
            List listN2 = c6981m.e1().n2();
            AbstractC6492s.h(listN2, "getTypeAliasList(...)");
            List listC2 = c6981m.e1().c2();
            AbstractC6492s.h(listC2, "getNestedClassNameList(...)");
            List list = listC2;
            Wh.c cVarG = c6981m.d1().g();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC6609L.b(cVarG, ((Number) it.next()).intValue()));
            }
            super(c6638pD1, listR1, listF2, listN2, new C6978j(arrayList));
            this.f54772g = kotlinTypeRefiner;
            this.f54773h = s().h().f(new C6979k(this));
            this.f54774i = s().h().f(new C6980l(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(C6157d.f49194o, InterfaceC6164k.f49220a.c(), Ih.d.WHEN_GET_ALL_DESCRIPTORS);
        }

        private final void G(Zh.f fVar, Collection collection, List list) {
            s().c().n().a().v(fVar, collection, new ArrayList(list), H(), new C1992a(list));
        }

        private final C6981m H() {
            return this.f54775j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f54772g.g(aVar.H());
        }

        @Override // ni.AbstractC6991w
        protected boolean A(f0 function) {
            AbstractC6492s.i(function, "function");
            return s().c().t().b(this.f54775j, function);
        }

        public void I(Zh.f name, Ih.b location) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            Hh.a.a(s().c().p(), location, H(), name);
        }

        @Override // ni.AbstractC6991w, ii.AbstractC6165l, ii.InterfaceC6164k
        public Collection b(Zh.f name, Ih.b location) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            I(name, location);
            return super.b(name, location);
        }

        @Override // ni.AbstractC6991w, ii.AbstractC6165l, ii.InterfaceC6164k
        public Collection d(Zh.f name, Ih.b location) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            I(name, location);
            return super.d(name, location);
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6167n
        public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
            AbstractC6492s.i(kindFilter, "kindFilter");
            AbstractC6492s.i(nameFilter, "nameFilter");
            return (Collection) this.f54773h.invoke();
        }

        @Override // ni.AbstractC6991w, ii.AbstractC6165l, ii.InterfaceC6167n
        public InterfaceC2498h g(Zh.f name, Ih.b location) {
            InterfaceC2495e interfaceC2495eI;
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            I(name, location);
            c cVar = H().f54763r;
            return (cVar == null || (interfaceC2495eI = cVar.i(name)) == null) ? super.g(name, location) : interfaceC2495eI;
        }

        @Override // ni.AbstractC6991w
        protected void j(Collection result, InterfaceC6835l nameFilter) {
            AbstractC6492s.i(result, "result");
            AbstractC6492s.i(nameFilter, "nameFilter");
            c cVar = H().f54763r;
            List listD = cVar != null ? cVar.d() : null;
            if (listD == null) {
                listD = AbstractC3689v.l();
            }
            result.addAll(listD);
        }

        @Override // ni.AbstractC6991w
        protected void n(Zh.f name, List functions) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f54774i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((pi.S) it.next()).r().b(name, Ih.d.FOR_ALREADY_TRACKED));
            }
            functions.addAll(s().c().c().d(name, this.f54775j));
            G(name, arrayList, functions);
        }

        @Override // ni.AbstractC6991w
        protected void o(Zh.f name, List descriptors) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f54774i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((pi.S) it.next()).r().d(name, Ih.d.FOR_ALREADY_TRACKED));
            }
            G(name, arrayList, descriptors);
        }

        @Override // ni.AbstractC6991w
        protected Zh.b p(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return this.f54775j.f54754i.d(name);
        }

        @Override // ni.AbstractC6991w
        protected Set v() {
            List listA = H().f54761p.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set setF = ((pi.S) it.next()).r().f();
                if (setF == null) {
                    return null;
                }
                AbstractC3689v.C(linkedHashSet, setF);
            }
            return linkedHashSet;
        }

        @Override // ni.AbstractC6991w
        protected Set w() {
            List listA = H().f54761p.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                AbstractC3689v.C(linkedHashSet, ((pi.S) it.next()).r().a());
            }
            linkedHashSet.addAll(s().c().c().e(this.f54775j));
            return linkedHashSet;
        }

        @Override // ni.AbstractC6991w
        protected Set x() {
            List listA = H().f54761p.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                AbstractC3689v.C(linkedHashSet, ((pi.S) it.next()).r().c());
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.m$b */
    final class b extends AbstractC7341b {

        /* renamed from: d, reason: collision with root package name */
        private final oi.i f54777d;

        public b() {
            super(C6981m.this.d1().h());
            this.f54777d = C6981m.this.d1().h().f(new C6982n(C6981m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List L(C6981m c6981m) {
            return p0.g(c6981m);
        }

        @Override // pi.AbstractC7374v, pi.v0
        /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C6981m c() {
            return C6981m.this;
        }

        @Override // pi.v0
        public boolean d() {
            return true;
        }

        @Override // pi.v0
        public List getParameters() {
            return (List) this.f54777d.invoke();
        }

        @Override // pi.AbstractC7369p
        protected Collection r() {
            String strB;
            Zh.c cVarA;
            List listO = Wh.f.o(C6981m.this.e1(), C6981m.this.d1().j());
            C6981m c6981m = C6981m.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(c6981m.d1().i().u((Uh.q) it.next()));
            }
            List listM0 = AbstractC3689v.M0(arrayList, C6981m.this.d1().c().c().c(C6981m.this));
            ArrayList<L.b> arrayList2 = new ArrayList();
            Iterator it2 = listM0.iterator();
            while (it2.hasNext()) {
                InterfaceC2498h interfaceC2498hC = ((pi.S) it2.next()).N0().c();
                L.b bVar = interfaceC2498hC instanceof L.b ? (L.b) interfaceC2498hC : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC6645w interfaceC6645wJ = C6981m.this.d1().c().j();
                C6981m c6981m2 = C6981m.this;
                ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(arrayList2, 10));
                for (L.b bVar2 : arrayList2) {
                    Zh.b bVarN = AbstractC5833e.n(bVar2);
                    if (bVarN == null || (cVarA = bVarN.a()) == null || (strB = cVarA.b()) == null) {
                        strB = bVar2.getName().b();
                        AbstractC6492s.h(strB, "asString(...)");
                    }
                    arrayList3.add(strB);
                }
                interfaceC6645wJ.b(c6981m2, arrayList3);
            }
            return AbstractC3689v.i1(listM0);
        }

        public String toString() {
            String string = C6981m.this.getName().toString();
            AbstractC6492s.h(string, "toString(...)");
            return string;
        }

        @Override // pi.AbstractC7369p
        protected j0 v() {
            return j0.a.f1787a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.m$c */
    final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map f54779a;

        /* renamed from: b, reason: collision with root package name */
        private final oi.h f54780b;

        /* renamed from: c, reason: collision with root package name */
        private final oi.i f54781c;

        public c() {
            List listM1 = C6981m.this.e1().M1();
            AbstractC6492s.h(listM1, "getEnumEntryList(...)");
            List list = listM1;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(AbstractC6609L.b(C6981m.this.d1().g(), ((Uh.g) obj).K0()), obj);
            }
            this.f54779a = linkedHashMap;
            this.f54780b = C6981m.this.d1().h().i(new C6983o(this, C6981m.this));
            this.f54781c = C6981m.this.d1().h().f(new C6984p(this));
        }

        private final Set e() {
            HashSet hashSet = new HashSet();
            Iterator it = C6981m.this.k().a().iterator();
            while (it.hasNext()) {
                for (InterfaceC2503m interfaceC2503m : InterfaceC6167n.a.a(((pi.S) it.next()).r(), null, null, 3, null)) {
                    if ((interfaceC2503m instanceof f0) || (interfaceC2503m instanceof Y)) {
                        hashSet.add(((InterfaceC2492b) interfaceC2503m).getName());
                    }
                }
            }
            List listR1 = C6981m.this.e1().R1();
            AbstractC6492s.h(listR1, "getFunctionList(...)");
            C6981m c6981m = C6981m.this;
            Iterator it2 = listR1.iterator();
            while (it2.hasNext()) {
                hashSet.add(AbstractC6609L.b(c6981m.d1().g(), ((Uh.i) it2.next()).n1()));
            }
            List listF2 = C6981m.this.e1().f2();
            AbstractC6492s.h(listF2, "getPropertyList(...)");
            C6981m c6981m2 = C6981m.this;
            Iterator it3 = listF2.iterator();
            while (it3.hasNext()) {
                hashSet.add(AbstractC6609L.b(c6981m2.d1().g(), ((Uh.n) it3.next()).m1()));
            }
            return d0.l(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC2495e f(c cVar, C6981m c6981m, Zh.f name) {
            AbstractC6492s.i(name, "name");
            Uh.g gVar = (Uh.g) cVar.f54779a.get(name);
            if (gVar != null) {
                return C2611q.L0(c6981m.d1().h(), c6981m, name, cVar.f54781c, new C6969a(c6981m.d1().h(), new C6985q(c6981m, gVar)), g0.f1784a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(C6981m c6981m, Uh.g gVar) {
            return AbstractC3689v.i1(c6981m.d1().c().d().d(c6981m.i1(), gVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection d() {
            Set setKeySet = this.f54779a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC2495e interfaceC2495eI = i((Zh.f) it.next());
                if (interfaceC2495eI != null) {
                    arrayList.add(interfaceC2495eI);
                }
            }
            return arrayList;
        }

        public final InterfaceC2495e i(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return (InterfaceC2495e) this.f54780b.invoke(name);
        }
    }

    /* renamed from: ni.m$d */
    /* synthetic */ class d extends AbstractC6489o implements InterfaceC6835l {
        d(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC7346d0 invoke(Uh.q p02) {
            AbstractC6492s.i(p02, "p0");
            return C6620X.q((C6620X) this.receiver, p02, false, 2, null);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "simpleType";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.b(AbstractC6492s.a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* renamed from: ni.m$e */
    /* synthetic */ class e extends AbstractC6489o implements InterfaceC6835l {
        e(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC7346d0 invoke(Zh.f p02) {
            AbstractC6492s.i(p02, "p0");
            return ((C6981m) this.receiver).j1(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "getValueClassPropertyType";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.b(C6981m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* renamed from: ni.m$f */
    /* synthetic */ class f extends AbstractC6489o implements InterfaceC6835l {
        f(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke(kotlin.reflect.jvm.internal.impl.types.checker.g p02) {
            AbstractC6492s.i(p02, "p0");
            return new a((C6981m) this.receiver, p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return kotlin.jvm.internal.O.b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6981m(C6638p outerContext, Uh.c classProto, Wh.c nameResolver, Wh.a metadataVersion, g0 sourceElement) {
        AbstractC6165l c6170q;
        super(outerContext.h(), AbstractC6609L.a(nameResolver, classProto.O1()).h());
        AbstractC6492s.i(outerContext, "outerContext");
        AbstractC6492s.i(classProto, "classProto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        AbstractC6492s.i(sourceElement, "sourceElement");
        this.f54751f = classProto;
        this.f54752g = metadataVersion;
        this.f54753h = sourceElement;
        this.f54754i = AbstractC6609L.a(nameResolver, classProto.O1());
        C6612O c6612o = C6612O.f52662a;
        this.f54755j = c6612o.b((Uh.k) Wh.b.f23941e.d(classProto.N1()));
        this.f54756k = AbstractC6613P.a(c6612o, (Uh.x) Wh.b.f23940d.d(classProto.N1()));
        EnumC2496f enumC2496fA = c6612o.a((c.EnumC0834c) Wh.b.f23942f.d(classProto.N1()));
        this.f54757l = enumC2496fA;
        List listQ2 = classProto.q2();
        AbstractC6492s.h(listQ2, "getTypeParameterList(...)");
        Uh.t tVarR2 = classProto.r2();
        AbstractC6492s.h(tVarR2, "getTypeTable(...)");
        Wh.g gVar = new Wh.g(tVarR2);
        h.a aVar = Wh.h.f23970b;
        Uh.w wVarT2 = classProto.t2();
        AbstractC6492s.h(wVarT2, "getVersionRequirementTable(...)");
        C6638p c6638pA = outerContext.a(this, listQ2, nameResolver, gVar, aVar.a(wVarT2), metadataVersion);
        this.f54758m = c6638pA;
        Boolean boolD = Wh.b.f23949m.d(classProto.N1());
        AbstractC6492s.h(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.f54759n = zBooleanValue;
        EnumC2496f enumC2496f = EnumC2496f.ENUM_CLASS;
        if (enumC2496fA == enumC2496f) {
            c6170q = new C6170q(c6638pA.h(), this, zBooleanValue || AbstractC6492s.d(c6638pA.c().i().a(), Boolean.TRUE));
        } else {
            c6170q = InterfaceC6164k.b.f49223b;
        }
        this.f54760o = c6170q;
        this.f54761p = new b();
        this.f54762q = e0.f1778e.a(this, c6638pA.h(), c6638pA.c().n().d(), new f(this));
        this.f54763r = enumC2496fA == enumC2496f ? new c() : null;
        InterfaceC2503m interfaceC2503mE = outerContext.e();
        this.f54764s = interfaceC2503mE;
        this.f54765t = c6638pA.h().b(new C6972d(this));
        this.f54766u = c6638pA.h().f(new C6973e(this));
        this.f54767v = c6638pA.h().b(new C6974f(this));
        this.f54768w = c6638pA.h().f(new C6975g(this));
        this.f54769x = c6638pA.h().b(new C6976h(this));
        Wh.c cVarG = c6638pA.g();
        Wh.g gVarJ = c6638pA.j();
        C6981m c6981m = interfaceC2503mE instanceof C6981m ? (C6981m) interfaceC2503mE : null;
        this.f54770y = new AbstractC6611N.a(classProto, cVarG, gVarJ, sourceElement, c6981m != null ? c6981m.f54770y : null);
        this.f54771z = !Wh.b.f23939c.d(classProto.N1()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b() : new C6968T(c6638pA.h(), new C6977i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U0(C6981m c6981m) {
        return AbstractC3689v.i1(c6981m.f54758m.c().d().a(c6981m.f54770y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2495e V0(C6981m c6981m) {
        return c6981m.W0();
    }

    private final InterfaceC2495e W0() {
        if (!this.f54751f.u2()) {
            return null;
        }
        InterfaceC2498h interfaceC2498hG = f1().g(AbstractC6609L.b(this.f54758m.g(), this.f54751f.A1()), Ih.d.FROM_DESERIALIZATION);
        if (interfaceC2498hG instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hG;
        }
        return null;
    }

    private final Collection X0() {
        return AbstractC3689v.M0(AbstractC3689v.M0(Z0(), AbstractC3689v.p(P())), this.f54758m.c().c().a(this));
    }

    private final InterfaceC2494d Y0() {
        Object next;
        if (this.f54757l.isSingleton()) {
            C2603i c2603iL = bi.h.l(this, g0.f1784a);
            c2603iL.g1(u());
            return c2603iL;
        }
        List listD1 = this.f54751f.D1();
        AbstractC6492s.h(listD1, "getConstructorList(...)");
        Iterator it = listD1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Wh.b.f23950n.d(((Uh.d) next).T0()).booleanValue()) {
                break;
            }
        }
        Uh.d dVar = (Uh.d) next;
        if (dVar != null) {
            return this.f54758m.f().r(dVar, true);
        }
        return null;
    }

    private final List Z0() {
        List listD1 = this.f54751f.D1();
        AbstractC6492s.h(listD1, "getConstructorList(...)");
        ArrayList<Uh.d> arrayList = new ArrayList();
        for (Object obj : listD1) {
            Boolean boolD = Wh.b.f23950n.d(((Uh.d) obj).T0());
            AbstractC6492s.h(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
        for (Uh.d dVar : arrayList) {
            C6608K c6608kF = this.f54758m.f();
            AbstractC6492s.f(dVar);
            arrayList2.add(c6608kF.r(dVar, false));
        }
        return arrayList2;
    }

    private final Collection a1() {
        if (this.f54755j != Bh.D.SEALED) {
            return AbstractC3689v.l();
        }
        List<Integer> listG2 = this.f54751f.g2();
        AbstractC6492s.f(listG2);
        if (listG2.isEmpty()) {
            return C4113a.f33345a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listG2) {
            C6636n c6636nC = this.f54758m.c();
            Wh.c cVarG = this.f54758m.g();
            AbstractC6492s.f(num);
            InterfaceC2495e interfaceC2495eB = c6636nC.b(AbstractC6609L.a(cVarG, num.intValue()));
            if (interfaceC2495eB != null) {
                arrayList.add(interfaceC2495eB);
            }
        }
        return arrayList;
    }

    private final q0 b1() {
        if (!isInline() && !o()) {
            return null;
        }
        q0 q0VarA = AbstractC6622Z.a(this.f54751f, this.f54758m.g(), this.f54758m.j(), new d(this.f54758m.i()), new e(this));
        if (q0VarA != null) {
            return q0VarA;
        }
        if (this.f54752g.c(1, 5, 1)) {
            return null;
        }
        InterfaceC2494d interfaceC2494dP = P();
        if (interfaceC2494dP == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List listI = interfaceC2494dP.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        Zh.f name = ((s0) AbstractC3689v.q0(listI)).getName();
        AbstractC6492s.h(name, "getName(...)");
        AbstractC7346d0 abstractC7346d0J1 = j1(name);
        if (abstractC7346d0J1 != null) {
            return new Bh.A(name, abstractC7346d0J1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection c1(C6981m c6981m) {
        return c6981m.X0();
    }

    private final a f1() {
        return (a) this.f54762q.c(this.f54758m.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC7346d0 j1(Zh.f fVar) {
        Iterator it = f1().d(fVar, Ih.d.FROM_DESERIALIZATION).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((Y) next).k0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        Y y10 = (Y) obj;
        return (AbstractC7346d0) (y10 != null ? y10.getType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2494d l1(C6981m c6981m) {
        return c6981m.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection m1(C6981m c6981m) {
        return c6981m.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 n1(C6981m c6981m) {
        return c6981m.b1();
    }

    @Override // Bh.InterfaceC2495e
    public boolean D() {
        Boolean boolD = Wh.b.f23948l.d(this.f54751f.N1());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Bh.C
    public boolean F0() {
        return false;
    }

    @Override // Dh.AbstractC2595a, Bh.InterfaceC2495e
    public List H0() {
        List listB = Wh.f.b(this.f54751f, this.f54758m.j());
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dh.N(J0(), new C6341b(this, this.f54758m.i().u((Uh.q) it.next()), null, null), kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b()));
        }
        return arrayList;
    }

    @Override // Bh.InterfaceC2495e
    public boolean I0() {
        Boolean boolD = Wh.b.f23944h.d(this.f54751f.N1());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Bh.C
    public boolean L() {
        Boolean boolD = Wh.b.f23946j.d(this.f54751f.N1());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        Boolean boolD = Wh.b.f23943g.d(this.f54751f.N1());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2494d P() {
        return (InterfaceC2494d) this.f54765t.invoke();
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2495e S() {
        return (InterfaceC2495e) this.f54767v.invoke();
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2504n, Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        return this.f54764s;
    }

    public final C6638p d1() {
        return this.f54758m;
    }

    public final Uh.c e1() {
        return this.f54751f;
    }

    public final Wh.a g1() {
        return this.f54752g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        return this.f54771z;
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        return this.f54756k;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        return this.f54757l;
    }

    @Override // Bh.InterfaceC2495e
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public AbstractC6165l Q() {
        return this.f54760o;
    }

    @Override // Dh.z
    protected InterfaceC6164k i0(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f54762q.c(kotlinTypeRefiner);
    }

    public final AbstractC6611N.a i1() {
        return this.f54770y;
    }

    @Override // Bh.C
    public boolean isExternal() {
        Boolean boolD = Wh.b.f23945i.d(this.f54751f.N1());
        AbstractC6492s.h(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return Wh.b.f23947k.d(this.f54751f.N1()).booleanValue() && this.f54752g.e(1, 4, 1);
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        return this.f54753h;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        return this.f54761p;
    }

    public final boolean k1(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return f1().t().contains(name);
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public Bh.D l() {
        return this.f54755j;
    }

    @Override // Bh.InterfaceC2495e
    public Collection m() {
        return (Collection) this.f54766u.invoke();
    }

    @Override // Bh.InterfaceC2495e
    public Collection n() {
        return (Collection) this.f54768w.invoke();
    }

    @Override // Bh.InterfaceC2495e
    public boolean o() {
        return Wh.b.f23947k.d(this.f54751f.N1()).booleanValue() && this.f54752g.c(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(L() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        return this.f54758m.i().m();
    }

    @Override // Bh.InterfaceC2495e
    public boolean z() {
        return Wh.b.f23942f.d(this.f54751f.N1()) == c.EnumC0834c.COMPANION_OBJECT;
    }

    @Override // Bh.InterfaceC2495e
    public q0 z0() {
        return (q0) this.f54769x.invoke();
    }
}
