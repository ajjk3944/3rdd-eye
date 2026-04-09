package re;

import Yg.J;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import h9.C5969a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import re.InterfaceC7588a;
import re.InterfaceC7601n;

/* renamed from: re.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7604q implements InterfaceC7601n {

    /* renamed from: d, reason: collision with root package name */
    public static final b f60385d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f60386a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f60387b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f60388c;

    /* renamed from: re.q$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f60389a;

        public a(LinkedList signal) {
            AbstractC6492s.i(signal, "signal");
            this.f60389a = signal;
        }

        public final LinkedList a() {
            return this.f60389a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f60389a, ((a) obj).f60389a);
        }

        public int hashCode() {
            return this.f60389a.hashCode();
        }

        public String toString() {
            return "ApStatsCache(signal=" + this.f60389a + ")";
        }
    }

    /* renamed from: re.q$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: re.q$c */
    private static abstract class c {

        /* renamed from: re.q$c$a */
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC7588a.C2110a f60390a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC7588a.C2110a ap) {
                super(null);
                AbstractC6492s.i(ap, "ap");
                this.f60390a = ap;
            }

            public InterfaceC7588a.C2110a a() {
                return this.f60390a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f60390a, ((a) obj).f60390a);
            }

            public int hashCode() {
                return this.f60390a.hashCode();
            }

            public String toString() {
                return "Added(ap=" + this.f60390a + ")";
            }
        }

        /* renamed from: re.q$c$b */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC7588a.C2110a f60391a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC7588a.C2110a ap) {
                super(null);
                AbstractC6492s.i(ap, "ap");
                this.f60391a = ap;
            }

            public InterfaceC7588a.C2110a a() {
                return this.f60391a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f60391a, ((b) obj).f60391a);
            }

            public int hashCode() {
                return this.f60391a.hashCode();
            }

            public String toString() {
                return "Removed(ap=" + this.f60391a + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: re.q$d */
    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f60392a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(s sVar, Set current) {
            AbstractC6492s.i(current, "current");
            return z.a(sVar.j(), current);
        }
    }

    /* renamed from: re.q$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f60393a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(s sVar) {
            Object next;
            Set set = (Set) sVar.a();
            Set<InterfaceC7588a.C2110a> set2 = (Set) sVar.c();
            ArrayList arrayList = new ArrayList();
            Set set3 = set;
            Iterator it = set3.iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC7588a.C2110a c2110a = (InterfaceC7588a.C2110a) it.next();
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (AbstractC6492s.d(c2110a, (InterfaceC7588a.C2110a) next2)) {
                        obj = next2;
                        break;
                    }
                }
                if (obj == null) {
                    arrayList.add(new c.b(c2110a));
                }
            }
            for (InterfaceC7588a.C2110a c2110a2 : set2) {
                Iterator it3 = set3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (AbstractC6492s.d(c2110a2, (InterfaceC7588a.C2110a) next)) {
                        break;
                    }
                }
                if (next == null) {
                    arrayList.add(new c.a(c2110a2));
                }
            }
            return Ag.b.b(arrayList);
        }
    }

    /* renamed from: re.q$f */
    static final class f implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f60394a = new f();

        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap apply(HashMap map, c event) {
            AbstractC6492s.i(map, "map");
            AbstractC6492s.i(event, "event");
            synchronized (map) {
                try {
                    if (event instanceof c.a) {
                        map.put(((c.a) event).a(), new a(new LinkedList()));
                        J j10 = J.f24997a;
                    } else {
                        if (!(event instanceof c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        map.remove(((c.b) event).a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }
    }

    /* renamed from: re.q$g */
    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f60395a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(HashMap map) {
            Map mapT;
            AbstractC6492s.i(map, "map");
            synchronized (map) {
                mapT = U.t(map);
            }
            return mapT;
        }
    }

    /* renamed from: re.q$h */
    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f60396a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            List<com.ui.wmw.wifi.a> list = (List) sVar.a();
            Map map = (Map) sVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(((InterfaceC7588a.C2110a) it.next()).b(), null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - 10000;
            for (com.ui.wmw.wifi.a aVar : list) {
                if (linkedHashMap.containsKey(aVar.c())) {
                    C5969a c5969aC = aVar.c();
                    S8.l lVarL = aVar.l();
                    if (aVar.k() <= jCurrentTimeMillis) {
                        lVarL = null;
                    }
                    linkedHashMap.put(c5969aC, lVarL);
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis2 - 35000;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                InterfaceC7588a.C2110a c2110a = (InterfaceC7588a.C2110a) entry.getKey();
                a aVar2 = (a) entry.getValue();
                aVar2.a().add(new Wc.c(jCurrentTimeMillis2, linkedHashMap.get(c2110a.b())));
                Iterator it2 = aVar2.a().iterator();
                AbstractC6492s.h(it2, "iterator(...)");
                Wc.c cVar = null;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AbstractC6492s.h(next, "next(...)");
                    Wc.c cVar2 = (Wc.c) next;
                    if (cVar2.c() >= j10) {
                        break;
                    }
                    it2.remove();
                    cVar = cVar2;
                }
                if (cVar != null) {
                    aVar2.a().add(0, cVar);
                }
                arrayList.add(new InterfaceC7601n.a(c2110a, AbstractC3689v.i1(aVar2.a())));
            }
            return arrayList;
        }
    }

    public C7604q(com.ui.wmw.g wizardSession, InterfaceC7590c manager) {
        AbstractC6492s.i(wizardSession, "wizardSession");
        AbstractC6492s.i(manager, "manager");
        gg.i iVarB = manager.b().s1(new kg.q() { // from class: re.o
            @Override // kg.q
            public final Object get() {
                return C7604q.d();
            }
        }, d.f60392a).B(e.f60393a);
        AbstractC6492s.h(iVarB, "concatMap(...)");
        this.f60386a = iVarB;
        gg.i iVarN0 = iVarB.s1(new kg.q() { // from class: re.p
            @Override // kg.q
            public final Object get() {
                return C7604q.e();
            }
        }, f.f60394a).N0(g.f60395a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f60387b = iVarN0;
        gg.i iVarI2 = Ag.c.f753a.a(wizardSession.d().b(), iVarN0).U1(1000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1).N0(h.f60396a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f60388c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s d() {
        return z.a(d0.e(), d0.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap e() {
        return new HashMap();
    }

    @Override // re.InterfaceC7601n
    public gg.i c() {
        return this.f60388c;
    }
}
