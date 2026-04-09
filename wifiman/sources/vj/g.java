package vj;

import Yg.s;
import Yg.y;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.q;
import rj.C7712j2;
import rj.C7719k2;
import rj.N5;
import vj.k;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes3.dex */
public final class g implements org.kodein.di.h {

    /* renamed from: a, reason: collision with root package name */
    private final List f63673a;

    /* renamed from: b, reason: collision with root package name */
    private final List f63674b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f63675c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f63676d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f63677e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f63678f;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f63679a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar) {
            super(1);
            this.f63679a = qVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            AbstractC6492s.i(entry, "<name for destructuring parameter 0>");
            return Boolean.valueOf(((k) entry.getKey()).a(this.f63679a));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f63680a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f63681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, g gVar) {
            super(1);
            this.f63680a = qVar;
            this.f63681b = gVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke(y triple) {
            Object next;
            AbstractC6492s.i(triple, "triple");
            k.a aVar = (k.a) triple.a();
            if (aVar.a(this.f63680a)) {
                return triple;
            }
            ArrayList arrayList = this.f63681b.f63678f;
            q qVar = this.f63680a;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                uj.d dVar = (uj.d) next;
                if (dVar.b().d(qVar) && aVar.a(dVar.c())) {
                    break;
                }
            }
            uj.d dVar2 = (uj.d) next;
            if (dVar2 != null) {
                return y.h(triple, null, null, dVar2, 3, null);
            }
            return null;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f63682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(1);
            this.f63682a = qVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y yVar) {
            AbstractC6492s.i(yVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(((k.a) yVar.a()).a(this.f63682a));
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f63683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj) {
            super(1);
            this.f63683a = obj;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(y yVar) {
            AbstractC6492s.i(yVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(AbstractC6492s.d(yVar.a(), this.f63683a));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f63684a = new e();

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ uj.d f63685a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(uj.d dVar) {
                super(1);
                this.f63685a = dVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y invoke(Map.Entry it) {
                AbstractC6492s.i(it, "it");
                return new y(it.getKey(), it.getValue(), this.f63685a);
            }
        }

        e() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8780j invoke(y yVar) {
            AbstractC6492s.i(yVar, "<name for destructuring parameter 0>");
            return AbstractC8783m.N(U.y((Map) yVar.c()), new a((uj.d) yVar.d()));
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f63686a = new f();

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f63687a = new a();

            a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y invoke(Map.Entry it) {
                AbstractC6492s.i(it, "it");
                return new y(it.getKey(), it.getValue(), null);
            }
        }

        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8780j invoke(Map.Entry entry) {
            AbstractC6492s.i(entry, "<name for destructuring parameter 0>");
            return AbstractC8783m.N(U.y((Map) entry.getValue()), a.f63687a);
        }
    }

    /* renamed from: vj.g$g, reason: collision with other inner class name */
    static final class C2267g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2267g f63688a = new C2267g();

        C2267g() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(y yVar) {
            AbstractC6492s.i(yVar, "<name for destructuring parameter 0>");
            return z.a((DI.e) yVar.c(), (uj.d) yVar.d());
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f63689a = new h();

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ uj.d f63690a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(uj.d dVar) {
                super(1);
                this.f63690a = dVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y invoke(Map.Entry it) {
                AbstractC6492s.i(it, "it");
                return new y(it.getKey(), it.getValue(), this.f63690a);
            }
        }

        h() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8780j invoke(y yVar) {
            AbstractC6492s.i(yVar, "<name for destructuring parameter 0>");
            return AbstractC8783m.N(U.y((Map) yVar.c()), new a((uj.d) yVar.d()));
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final i f63691a = new i();

        i() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(DI.e it) {
            AbstractC6492s.i(it, "it");
            return it.j();
        }
    }

    public g(Map map, List externalSources, List registeredTranslators) {
        ArrayList arrayList;
        AbstractC6492s.i(map, "map");
        AbstractC6492s.i(externalSources, "externalSources");
        AbstractC6492s.i(registeredTranslators, "registeredTranslators");
        this.f63673a = externalSources;
        this.f63674b = registeredTranslators;
        this.f63675c = j.a();
        this.f63676d = new HashMap();
        this.f63678f = new ArrayList(h());
        for (Map.Entry entry : map.entrySet()) {
            DI.e eVar = (DI.e) entry.getKey();
            List list = (List) entry.getValue();
            List<C7712j2> list2 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
            for (C7712j2 c7712j2 : list2) {
                arrayList2.add(c7712j2 instanceof C7719k2 ? (C7719k2) c7712j2 : new C7719k2(c7712j2.a(), c7712j2.b(), this));
            }
            this.f63675c.put(eVar, new y(eVar, arrayList2, null));
            Object aVar = ((C7712j2) AbstractC3689v.q0(list)).a().g() ? new k.a(eVar.l()) : new k.b(eVar.l());
            Map map2 = this.f63676d;
            Object map3 = map2.get(aVar);
            if (map3 == null) {
                map3 = new HashMap();
                map2.put(aVar, map3);
            }
            Map map4 = (Map) map3;
            k.a aVar2 = new k.a(eVar.g());
            Object map5 = map4.get(aVar2);
            if (map5 == null) {
                map5 = new HashMap();
                map4.put(aVar2, map5);
            }
            Map map6 = (Map) map5;
            k.a aVar3 = new k.a(eVar.d());
            Object map7 = map6.get(aVar3);
            if (map7 == null) {
                map7 = new HashMap();
                map6.put(aVar3, map7);
            }
            ((Map) map7).put(eVar.k(), eVar);
        }
        Map map8 = this.f63675c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.d(map8.size()));
        for (Map.Entry entry2 : map8.entrySet()) {
            linkedHashMap.put(entry2.getKey(), (List) ((y) entry2.getValue()).l());
        }
        this.f63677e = new HashMap(linkedHashMap);
        do {
            arrayList = new ArrayList();
            Iterator it = this.f63678f.iterator();
            while (it.hasNext()) {
                uj.d dVar = (uj.d) it.next();
                Iterator it2 = this.f63678f.iterator();
                while (it2.hasNext()) {
                    uj.d dVar2 = (uj.d) it2.next();
                    if (dVar2.b().d(dVar.c()) && !AbstractC6492s.d(dVar.b(), dVar2.c())) {
                        ArrayList<uj.d> arrayList3 = this.f63678f;
                        if (arrayList3 == null || !arrayList3.isEmpty()) {
                            for (uj.d dVar3 : arrayList3) {
                                if (!AbstractC6492s.d(dVar3.b(), dVar.b()) || !AbstractC6492s.d(dVar3.c(), dVar2.c())) {
                                }
                            }
                        }
                        AbstractC6492s.g(dVar, "null cannot be cast to non-null type org.kodein.di.bindings.ContextTranslator<kotlin.Any, kotlin.Any>");
                        AbstractC6492s.g(dVar2, "null cannot be cast to non-null type org.kodein.di.bindings.ContextTranslator<kotlin.Any, kotlin.Any>");
                        arrayList.add(new uj.c(dVar, dVar2));
                    }
                }
            }
            AbstractC3689v.C(this.f63678f, arrayList);
        } while (!arrayList.isEmpty());
    }

    private final List g(N5 n52) {
        InterfaceC8780j interfaceC8780jY = U.y(this.f63676d);
        q qVarD = n52.d();
        if (qVarD != null && !AbstractC6492s.d(qVarD, q.f56966a.a())) {
            interfaceC8780jY = AbstractC8783m.C(interfaceC8780jY, new a(qVarD));
        }
        InterfaceC8780j interfaceC8780jH = AbstractC8783m.H(interfaceC8780jY, f.f63686a);
        q qVarB = n52.b();
        if (qVarB != null) {
            interfaceC8780jH = AbstractC8783m.O(interfaceC8780jH, new b(qVarB, this));
        }
        InterfaceC8780j interfaceC8780jH2 = AbstractC8783m.H(interfaceC8780jH, e.f63684a);
        q qVarA = n52.a();
        if (qVarA != null) {
            interfaceC8780jH2 = AbstractC8783m.C(interfaceC8780jH2, new c(qVarA));
        }
        InterfaceC8780j interfaceC8780jH3 = AbstractC8783m.H(interfaceC8780jH2, h.f63689a);
        Object objC = n52.c();
        if (!AbstractC6492s.d(objC, N5.a.f60604a)) {
            interfaceC8780jH3 = AbstractC8783m.C(interfaceC8780jH3, new d(objC));
        }
        return AbstractC8783m.Z(AbstractC8783m.N(interfaceC8780jH3, C2267g.f63688a));
    }

    private final IllegalStateException i(DI.e eVar, DI.e eVar2) {
        return new IllegalStateException("Tree returned key " + eVar.j() + " that is not in cache when searching for " + eVar2.j() + ".\nKeys in cache:\n" + AbstractC3689v.z0(this.f63675c.keySet(), "\n", null, null, 0, null, i.f63691a, 30, null));
    }

    @Override // org.kodein.di.h
    public Map a() {
        return this.f63677e;
    }

    @Override // org.kodein.di.h
    public y b(DI.e key) {
        AbstractC6492s.i(key, "key");
        return (y) this.f63675c.get(key);
    }

    @Override // org.kodein.di.h
    public List c() {
        return this.f63673a;
    }

    @Override // org.kodein.di.h
    public List d(DI.e key, int i10, boolean z10) {
        y yVar;
        y yVarH;
        AbstractC6492s.i(key, "key");
        if (!z10) {
            y yVar2 = (y) this.f63675c.get(key);
            if (yVar2 != null) {
                DI.e eVar = (DI.e) yVar2.a();
                List list = (List) yVar2.c();
                uj.d dVar = (uj.d) yVar2.d();
                C7719k2 c7719k2 = (C7719k2) AbstractC3689v.t0(list, i10);
                if (c7719k2 == null) {
                    return AbstractC3689v.l();
                }
                AbstractC6492s.g(eVar, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$7, T of org.kodein.di.internal.DITreeImpl.find$lambda$7>");
                AbstractC6492s.g(c7719k2, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$7, T of org.kodein.di.internal.DITreeImpl.find$lambda$7>");
                return AbstractC3689v.e(new y(eVar, c7719k2, dVar));
            }
            q qVarG = key.g();
            q.a aVar = q.f56966a;
            if (!AbstractC6492s.d(qVarG, aVar.a())) {
                y yVar3 = (y) this.f63675c.get(DI.e.c(key, aVar.a(), null, null, null, 14, null));
                if (yVar3 != null) {
                    DI.e eVar2 = (DI.e) yVar3.a();
                    List list2 = (List) yVar3.c();
                    uj.d dVar2 = (uj.d) yVar3.d();
                    if (dVar2 == null || AbstractC6492s.d(dVar2.b(), key.g())) {
                        this.f63675c.put(key, yVar3);
                        C7719k2 c7719k22 = (C7719k2) AbstractC3689v.t0(list2, i10);
                        if (c7719k22 == null) {
                            return AbstractC3689v.l();
                        }
                        AbstractC6492s.g(eVar2, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$8, T of org.kodein.di.internal.DITreeImpl.find$lambda$8>");
                        AbstractC6492s.g(c7719k22, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$8, T of org.kodein.di.internal.DITreeImpl.find$lambda$8>");
                        return AbstractC3689v.e(new y(eVar2, c7719k22, dVar2));
                    }
                }
            }
            ArrayList arrayList = this.f63678f;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (AbstractC6492s.d(((uj.d) obj).b(), key.g())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = this.f63678f;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (AbstractC6492s.d(((uj.d) obj2).b(), q.f56966a.a())) {
                    arrayList4.add(obj2);
                }
            }
            for (uj.d dVar3 : AbstractC3689v.M0(arrayList2, arrayList4)) {
                y yVar4 = (y) this.f63675c.get(new DI.e(dVar3.c(), key.d(), key.l(), key.k()));
                if (yVar4 != null) {
                    y yVar5 = yVar4.m() == null ? yVar4 : null;
                    if (yVar5 != null && yVar5.m() == null) {
                        this.f63675c.put(key, y.h(yVar5, null, null, dVar3, 3, null));
                        DI.e eVar3 = (DI.e) yVar5.a();
                        C7719k2 c7719k23 = (C7719k2) AbstractC3689v.t0((List) yVar5.c(), i10);
                        if (c7719k23 == null) {
                            return AbstractC3689v.l();
                        }
                        AbstractC6492s.g(eVar3, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$12, T of org.kodein.di.internal.DITreeImpl.find$lambda$12>");
                        AbstractC6492s.g(c7719k23, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$12, T of org.kodein.di.internal.DITreeImpl.find$lambda$12>");
                        return AbstractC3689v.e(new y(eVar3, c7719k23, dVar3));
                    }
                }
            }
        }
        List<s> listG = g(new N5(key.g(), key.d(), key.l(), key.k()));
        if (listG.size() == 1) {
            s sVar = (s) AbstractC3689v.q0(listG);
            DI.e eVar4 = (DI.e) sVar.a();
            uj.d dVar4 = (uj.d) sVar.c();
            Map map = this.f63675c;
            y yVar6 = (y) map.get(eVar4);
            if (yVar6 == null || (yVarH = y.h(yVar6, null, null, dVar4, 3, null)) == null) {
                throw i(eVar4, key);
            }
            map.put(key, yVarH);
        }
        ArrayList arrayList5 = new ArrayList();
        for (s sVar2 : listG) {
            DI.e eVar5 = (DI.e) sVar2.a();
            uj.d dVar5 = (uj.d) sVar2.c();
            y yVar7 = (y) this.f63675c.get(eVar5);
            if (yVar7 == null) {
                throw i(eVar5, key);
            }
            C7719k2 c7719k24 = (C7719k2) AbstractC3689v.t0((List) yVar7.c(), i10);
            if (c7719k24 == null) {
                yVar = null;
            } else {
                AbstractC6492s.g(eVar5, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$13, T of org.kodein.di.internal.DITreeImpl.find$lambda$13>");
                AbstractC6492s.g(c7719k24, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$13, T of org.kodein.di.internal.DITreeImpl.find$lambda$13>");
                yVar = new y(eVar5, c7719k24, dVar5);
            }
            if (yVar != null) {
                arrayList5.add(yVar);
            }
        }
        return arrayList5;
    }

    @Override // org.kodein.di.h
    public List e(N5 search) {
        AbstractC6492s.i(search, "search");
        List<s> listG = g(search);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listG, 10));
        for (s sVar : listG) {
            DI.e eVar = (DI.e) sVar.a();
            uj.d dVar = (uj.d) sVar.c();
            Object obj = this.f63675c.get(eVar);
            AbstractC6492s.f(obj);
            arrayList.add(new y(eVar, ((y) obj).l(), dVar));
        }
        return arrayList;
    }

    public List h() {
        return this.f63674b;
    }
}
