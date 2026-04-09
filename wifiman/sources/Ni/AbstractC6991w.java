package ni;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.Y;
import Bh.f0;
import Bh.k0;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import ii.AbstractC6165l;
import ii.C6157d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import li.AbstractC6609L;
import li.C6638p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import xi.AbstractC8534a;

/* renamed from: ni.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6991w extends AbstractC6165l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ th.l[] f54791f = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(AbstractC6991w.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(AbstractC6991w.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    private final C6638p f54792b;

    /* renamed from: c, reason: collision with root package name */
    private final a f54793c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f54794d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.j f54795e;

    /* renamed from: ni.w$a */
    private interface a {
        Set a();

        Collection b(Zh.f fVar, Ih.b bVar);

        Set c();

        Collection d(Zh.f fVar, Ih.b bVar);

        k0 e(Zh.f fVar);

        void f(Collection collection, C6157d c6157d, InterfaceC6835l interfaceC6835l, Ih.b bVar);

        Set g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.w$b */
    final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ th.l[] f54796o = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        private final List f54797a;

        /* renamed from: b, reason: collision with root package name */
        private final List f54798b;

        /* renamed from: c, reason: collision with root package name */
        private final List f54799c;

        /* renamed from: d, reason: collision with root package name */
        private final oi.i f54800d;

        /* renamed from: e, reason: collision with root package name */
        private final oi.i f54801e;

        /* renamed from: f, reason: collision with root package name */
        private final oi.i f54802f;

        /* renamed from: g, reason: collision with root package name */
        private final oi.i f54803g;

        /* renamed from: h, reason: collision with root package name */
        private final oi.i f54804h;

        /* renamed from: i, reason: collision with root package name */
        private final oi.i f54805i;

        /* renamed from: j, reason: collision with root package name */
        private final oi.i f54806j;

        /* renamed from: k, reason: collision with root package name */
        private final oi.i f54807k;

        /* renamed from: l, reason: collision with root package name */
        private final oi.i f54808l;

        /* renamed from: m, reason: collision with root package name */
        private final oi.i f54809m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ AbstractC6991w f54810n;

        public b(AbstractC6991w abstractC6991w, List functionList, List propertyList, List typeAliasList) {
            AbstractC6492s.i(functionList, "functionList");
            AbstractC6492s.i(propertyList, "propertyList");
            AbstractC6492s.i(typeAliasList, "typeAliasList");
            this.f54810n = abstractC6991w;
            this.f54797a = functionList;
            this.f54798b = propertyList;
            this.f54799c = abstractC6991w.s().c().g().g() ? typeAliasList : AbstractC3689v.l();
            this.f54800d = abstractC6991w.s().h().f(new C6992x(this));
            this.f54801e = abstractC6991w.s().h().f(new C6993y(this));
            this.f54802f = abstractC6991w.s().h().f(new C6994z(this));
            this.f54803g = abstractC6991w.s().h().f(new C6950A(this));
            this.f54804h = abstractC6991w.s().h().f(new C6951B(this));
            this.f54805i = abstractC6991w.s().h().f(new C6952C(this));
            this.f54806j = abstractC6991w.s().h().f(new C6953D(this));
            this.f54807k = abstractC6991w.s().h().f(new C6954E(this));
            this.f54808l = abstractC6991w.s().h().f(new C6955F(this, abstractC6991w));
            this.f54809m = abstractC6991w.s().h().f(new C6956G(this, abstractC6991w));
        }

        private final List A() {
            List list = this.f54799c;
            AbstractC6991w abstractC6991w = this.f54810n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k0 k0VarZ = abstractC6991w.s().f().z((Uh.r) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (k0VarZ != null) {
                    arrayList.add(k0VarZ);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, AbstractC6991w abstractC6991w) {
            List list = bVar.f54797a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC6991w abstractC6991w2 = bVar.f54810n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC6609L.b(abstractC6991w2.s().g(), ((Uh.i) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).n1()));
            }
            return d0.l(linkedHashSet, abstractC6991w.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                Zh.f name = ((f0) obj).getName();
                AbstractC6492s.h(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List F() {
            return (List) oi.m.a(this.f54803g, this, f54796o[3]);
        }

        private final List G() {
            return (List) oi.m.a(this.f54804h, this, f54796o[4]);
        }

        private final List H() {
            return (List) oi.m.a(this.f54802f, this, f54796o[2]);
        }

        private final List I() {
            return (List) oi.m.a(this.f54800d, this, f54796o[0]);
        }

        private final List J() {
            return (List) oi.m.a(this.f54801e, this, f54796o[1]);
        }

        private final Map K() {
            return (Map) oi.m.a(this.f54806j, this, f54796o[6]);
        }

        private final Map L() {
            return (Map) oi.m.a(this.f54807k, this, f54796o[7]);
        }

        private final Map M() {
            return (Map) oi.m.a(this.f54805i, this, f54796o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                Zh.f name = ((Y) obj).getName();
                AbstractC6492s.h(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(listH, 10)), 16));
            for (Object obj : listH) {
                Zh.f name = ((k0) obj).getName();
                AbstractC6492s.h(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, AbstractC6991w abstractC6991w) {
            List list = bVar.f54798b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC6991w abstractC6991w2 = bVar.f54810n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC6609L.b(abstractC6991w2.s().g(), ((Uh.n) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).m1()));
            }
            return d0.l(linkedHashSet, abstractC6991w.x());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return AbstractC3689v.M0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return AbstractC3689v.M0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List u() {
            Set setW = this.f54810n.w();
            ArrayList arrayList = new ArrayList();
            Iterator it = setW.iterator();
            while (it.hasNext()) {
                AbstractC3689v.C(arrayList, x((Zh.f) it.next()));
            }
            return arrayList;
        }

        private final List v() {
            Set setX = this.f54810n.x();
            ArrayList arrayList = new ArrayList();
            Iterator it = setX.iterator();
            while (it.hasNext()) {
                AbstractC3689v.C(arrayList, y((Zh.f) it.next()));
            }
            return arrayList;
        }

        private final List w() {
            List list = this.f54797a;
            AbstractC6991w abstractC6991w = this.f54810n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f0 f0VarS = abstractC6991w.s().f().s((Uh.i) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (!abstractC6991w.A(f0VarS)) {
                    f0VarS = null;
                }
                if (f0VarS != null) {
                    arrayList.add(f0VarS);
                }
            }
            return arrayList;
        }

        private final List x(Zh.f fVar) {
            List listI = I();
            AbstractC6991w abstractC6991w = this.f54810n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (AbstractC6492s.d(((InterfaceC2503m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC6991w.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List y(Zh.f fVar) {
            List listJ = J();
            AbstractC6991w abstractC6991w = this.f54810n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (AbstractC6492s.d(((InterfaceC2503m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC6991w.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List z() {
            List list = this.f54798b;
            AbstractC6991w abstractC6991w = this.f54810n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Y yU = abstractC6991w.s().f().u((Uh.n) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (yU != null) {
                    arrayList.add(yU);
                }
            }
            return arrayList;
        }

        @Override // ni.AbstractC6991w.a
        public Set a() {
            return (Set) oi.m.a(this.f54808l, this, f54796o[8]);
        }

        @Override // ni.AbstractC6991w.a
        public Collection b(Zh.f name, Ih.b location) {
            Collection collection;
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            return (a().contains(name) && (collection = (Collection) K().get(name)) != null) ? collection : AbstractC3689v.l();
        }

        @Override // ni.AbstractC6991w.a
        public Set c() {
            return (Set) oi.m.a(this.f54809m, this, f54796o[9]);
        }

        @Override // ni.AbstractC6991w.a
        public Collection d(Zh.f name, Ih.b location) {
            Collection collection;
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            return (c().contains(name) && (collection = (Collection) L().get(name)) != null) ? collection : AbstractC3689v.l();
        }

        @Override // ni.AbstractC6991w.a
        public k0 e(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return (k0) M().get(name);
        }

        @Override // ni.AbstractC6991w.a
        public void f(Collection result, C6157d kindFilter, InterfaceC6835l nameFilter, Ih.b location) {
            AbstractC6492s.i(result, "result");
            AbstractC6492s.i(kindFilter, "kindFilter");
            AbstractC6492s.i(nameFilter, "nameFilter");
            AbstractC6492s.i(location, "location");
            if (kindFilter.a(C6157d.f49182c.i())) {
                for (Object obj : G()) {
                    Zh.f name = ((Y) obj).getName();
                    AbstractC6492s.h(name, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(C6157d.f49182c.d())) {
                for (Object obj2 : F()) {
                    Zh.f name2 = ((f0) obj2).getName();
                    AbstractC6492s.h(name2, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // ni.AbstractC6991w.a
        public Set g() {
            List list = this.f54799c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC6991w abstractC6991w = this.f54810n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC6609L.b(abstractC6991w.s().g(), ((Uh.r) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).g1()));
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.w$c */
    final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ th.l[] f54811j = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        private final Map f54812a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f54813b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f54814c;

        /* renamed from: d, reason: collision with root package name */
        private final oi.g f54815d;

        /* renamed from: e, reason: collision with root package name */
        private final oi.g f54816e;

        /* renamed from: f, reason: collision with root package name */
        private final oi.h f54817f;

        /* renamed from: g, reason: collision with root package name */
        private final oi.i f54818g;

        /* renamed from: h, reason: collision with root package name */
        private final oi.i f54819h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC6991w f54820i;

        /* renamed from: ni.w$c$a */
        public static final class a implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.p f54821a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f54822b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6991w f54823c;

            public a(kotlin.reflect.jvm.internal.impl.protobuf.p pVar, ByteArrayInputStream byteArrayInputStream, AbstractC6991w abstractC6991w) {
                this.f54821a = pVar;
                this.f54822b = byteArrayInputStream;
                this.f54823c = abstractC6991w;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.protobuf.n invoke() {
                return (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f54821a.c(this.f54822b, this.f54823c.s().c().k());
            }
        }

        public c(AbstractC6991w abstractC6991w, List functionList, List propertyList, List typeAliasList) throws IOException {
            Map mapH;
            AbstractC6492s.i(functionList, "functionList");
            AbstractC6492s.i(propertyList, "propertyList");
            AbstractC6492s.i(typeAliasList, "typeAliasList");
            this.f54820i = abstractC6991w;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Zh.f fVarB = AbstractC6609L.b(abstractC6991w.s().g(), ((Uh.i) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj)).n1());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f54812a = r(linkedHashMap);
            AbstractC6991w abstractC6991w2 = this.f54820i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Zh.f fVarB2 = AbstractC6609L.b(abstractC6991w2.s().g(), ((Uh.n) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj2)).m1());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f54813b = r(linkedHashMap2);
            if (this.f54820i.s().c().g().g()) {
                AbstractC6991w abstractC6991w3 = this.f54820i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    Zh.f fVarB3 = AbstractC6609L.b(abstractC6991w3.s().g(), ((Uh.r) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj3)).g1());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapH = r(linkedHashMap3);
            } else {
                mapH = U.h();
            }
            this.f54814c = mapH;
            this.f54815d = this.f54820i.s().h().e(new C6957H(this));
            this.f54816e = this.f54820i.s().h().e(new C6958I(this));
            this.f54817f = this.f54820i.s().h().i(new C6959J(this));
            this.f54818g = this.f54820i.s().h().f(new C6960K(this, this.f54820i));
            this.f54819h = this.f54820i.s().h().f(new C6961L(this, this.f54820i));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection m(Zh.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f54812a
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.i.f22651w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.AbstractC6492s.h(r1, r2)
                ni.w r2 = r5.f54820i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                ni.w r3 = r5.f54820i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                ni.w$c$a r0 = new ni.w$c$a
                r0.<init>(r1, r4, r3)
                zi.j r0 = zi.AbstractC8783m.o(r0)
                java.util.List r0 = zi.AbstractC8783m.Z(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = Zg.AbstractC3689v.l()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                Uh.i r1 = (Uh.i) r1
                li.p r4 = r2.s()
                li.K r4 = r4.f()
                kotlin.jvm.internal.AbstractC6492s.f(r1)
                Bh.f0 r1 = r4.s(r1)
                boolean r4 = r2.A(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.n(r6, r3)
                java.util.List r6 = xi.AbstractC8534a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ni.AbstractC6991w.c.m(Zh.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection n(Zh.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f54813b
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.n.f22719w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.AbstractC6492s.h(r1, r2)
                ni.w r2 = r5.f54820i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                ni.w r3 = r5.f54820i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                ni.w$c$a r0 = new ni.w$c$a
                r0.<init>(r1, r4, r3)
                zi.j r0 = zi.AbstractC8783m.o(r0)
                java.util.List r0 = zi.AbstractC8783m.Z(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = Zg.AbstractC3689v.l()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                Uh.n r1 = (Uh.n) r1
                li.p r4 = r2.s()
                li.K r4 = r4.f()
                kotlin.jvm.internal.AbstractC6492s.f(r1)
                Bh.Y r1 = r4.u(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L63:
                r2.o(r6, r3)
                java.util.List r6 = xi.AbstractC8534a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ni.AbstractC6991w.c.n(Zh.f):java.util.Collection");
        }

        private final k0 o(Zh.f fVar) {
            Uh.r rVarX1;
            byte[] bArr = (byte[]) this.f54814c.get(fVar);
            if (bArr == null || (rVarX1 = Uh.r.x1(new ByteArrayInputStream(bArr), this.f54820i.s().c().k())) == null) {
                return null;
            }
            return this.f54820i.s().f().z(rVarX1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(c cVar, AbstractC6991w abstractC6991w) {
            return d0.l(cVar.f54812a.keySet(), abstractC6991w.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(c cVar, Zh.f it) {
            AbstractC6492s.i(it, "it");
            return cVar.m(it);
        }

        private final Map r(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(U.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it.next()).j(byteArrayOutputStream);
                    arrayList.add(Yg.J.f24997a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(c cVar, Zh.f it) {
            AbstractC6492s.i(it, "it");
            return cVar.n(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0 t(c cVar, Zh.f it) {
            AbstractC6492s.i(it, "it");
            return cVar.o(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(c cVar, AbstractC6991w abstractC6991w) {
            return d0.l(cVar.f54813b.keySet(), abstractC6991w.x());
        }

        @Override // ni.AbstractC6991w.a
        public Set a() {
            return (Set) oi.m.a(this.f54818g, this, f54811j[0]);
        }

        @Override // ni.AbstractC6991w.a
        public Collection b(Zh.f name, Ih.b location) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            return !a().contains(name) ? AbstractC3689v.l() : (Collection) this.f54815d.invoke(name);
        }

        @Override // ni.AbstractC6991w.a
        public Set c() {
            return (Set) oi.m.a(this.f54819h, this, f54811j[1]);
        }

        @Override // ni.AbstractC6991w.a
        public Collection d(Zh.f name, Ih.b location) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(location, "location");
            return !c().contains(name) ? AbstractC3689v.l() : (Collection) this.f54816e.invoke(name);
        }

        @Override // ni.AbstractC6991w.a
        public k0 e(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return (k0) this.f54817f.invoke(name);
        }

        @Override // ni.AbstractC6991w.a
        public void f(Collection result, C6157d kindFilter, InterfaceC6835l nameFilter, Ih.b location) {
            AbstractC6492s.i(result, "result");
            AbstractC6492s.i(kindFilter, "kindFilter");
            AbstractC6492s.i(nameFilter, "nameFilter");
            AbstractC6492s.i(location, "location");
            if (kindFilter.a(C6157d.f49182c.i())) {
                Set<Zh.f> setC = c();
                ArrayList arrayList = new ArrayList();
                for (Zh.f fVar : setC) {
                    if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(d(fVar, location));
                    }
                }
                bi.l INSTANCE = bi.l.f33358a;
                AbstractC6492s.h(INSTANCE, "INSTANCE");
                AbstractC3689v.B(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(C6157d.f49182c.d())) {
                Set<Zh.f> setA = a();
                ArrayList arrayList2 = new ArrayList();
                for (Zh.f fVar2 : setA) {
                    if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(b(fVar2, location));
                    }
                }
                bi.l INSTANCE2 = bi.l.f33358a;
                AbstractC6492s.h(INSTANCE2, "INSTANCE");
                AbstractC3689v.B(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // ni.AbstractC6991w.a
        public Set g() {
            return this.f54814c.keySet();
        }
    }

    protected AbstractC6991w(C6638p c10, List functionList, List propertyList, List typeAliasList, InterfaceC6824a classNames) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(functionList, "functionList");
        AbstractC6492s.i(propertyList, "propertyList");
        AbstractC6492s.i(typeAliasList, "typeAliasList");
        AbstractC6492s.i(classNames, "classNames");
        this.f54792b = c10;
        this.f54793c = q(functionList, propertyList, typeAliasList);
        this.f54794d = c10.h().f(new C6989u(classNames));
        this.f54795e = c10.h().b(new C6990v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(InterfaceC6824a interfaceC6824a) {
        return AbstractC3689v.n1((Iterable) interfaceC6824a.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(AbstractC6991w abstractC6991w) {
        Set setV = abstractC6991w.v();
        if (setV == null) {
            return null;
        }
        return d0.l(d0.l(abstractC6991w.t(), abstractC6991w.f54793c.g()), setV);
    }

    private final a q(List list, List list2, List list3) {
        return this.f54792b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final InterfaceC2495e r(Zh.f fVar) {
        return this.f54792b.c().b(p(fVar));
    }

    private final Set u() {
        return (Set) oi.m.b(this.f54795e, this, f54791f[1]);
    }

    private final k0 y(Zh.f fVar) {
        return this.f54793c.e(fVar);
    }

    protected boolean A(f0 function) {
        AbstractC6492s.i(function, "function");
        return true;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set a() {
        return this.f54793c.a();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return this.f54793c.b(name, location);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set c() {
        return this.f54793c.c();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return this.f54793c.d(name, location);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set f() {
        return u();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        if (z(name)) {
            return r(name);
        }
        if (this.f54793c.g().contains(name)) {
            return y(name);
        }
        return null;
    }

    protected abstract void j(Collection collection, InterfaceC6835l interfaceC6835l);

    protected final Collection m(C6157d kindFilter, InterfaceC6835l nameFilter, Ih.b location) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        AbstractC6492s.i(location, "location");
        ArrayList arrayList = new ArrayList(0);
        C6157d.a aVar = C6157d.f49182c;
        if (kindFilter.a(aVar.g())) {
            j(arrayList, nameFilter);
        }
        this.f54793c.f(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (Zh.f fVar : t()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    AbstractC8534a.a(arrayList, r(fVar));
                }
            }
        }
        if (kindFilter.a(C6157d.f49182c.h())) {
            for (Zh.f fVar2 : this.f54793c.g()) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    AbstractC8534a.a(arrayList, this.f54793c.e(fVar2));
                }
            }
        }
        return AbstractC8534a.c(arrayList);
    }

    protected void n(Zh.f name, List functions) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(functions, "functions");
    }

    protected void o(Zh.f name, List descriptors) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(descriptors, "descriptors");
    }

    protected abstract Zh.b p(Zh.f fVar);

    protected final C6638p s() {
        return this.f54792b;
    }

    public final Set t() {
        return (Set) oi.m.a(this.f54794d, this, f54791f[0]);
    }

    protected abstract Set v();

    protected abstract Set w();

    protected abstract Set x();

    protected boolean z(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return t().contains(name);
    }
}
