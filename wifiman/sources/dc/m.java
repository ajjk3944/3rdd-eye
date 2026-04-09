package Dc;

import Cc.AbstractC2558b;
import Ec.t;
import Yg.J;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.y;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.C6783c;

/* loaded from: classes4.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private final String f3205a;

    /* renamed from: b, reason: collision with root package name */
    private final y f3206b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f3207c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f3208d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f3209e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f3210f;

    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(Long it) {
            AbstractC6492s.i(it, "it");
            return m.this.j();
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Map it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Discovery Results emission results Session: " + m.this.f3205a + ", count: " + it.size(), null, 2, null);
        }
    }

    public static final class d implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f3217b;

        public d(List list) {
            this.f3217b = list;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            Object objPutIfAbsent;
            Object objPutIfAbsent2;
            try {
                synchronized (m.this) {
                    try {
                        for (t.b bVar : this.f3217b) {
                            if (bVar instanceof t.a) {
                                ConcurrentHashMap concurrentHashMap = m.this.f3207c;
                                t.c cVarA = bVar.a();
                                Object concurrentHashMap2 = concurrentHashMap.get(cVarA);
                                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cVarA, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                                    concurrentHashMap2 = objPutIfAbsent;
                                }
                                AbstractC6492s.h(concurrentHashMap2, "getOrPut(...)");
                                ((Map) concurrentHashMap2).put(((t.a) bVar).g(), bVar);
                            } else {
                                ConcurrentHashMap concurrentHashMap3 = m.this.f3208d;
                                t.c cVarA2 = bVar.a();
                                Object concurrentHashMap4 = concurrentHashMap3.get(cVarA2);
                                if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(cVarA2, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                                    concurrentHashMap4 = objPutIfAbsent2;
                                }
                                AbstractC6492s.h(concurrentHashMap4, "getOrPut(...)");
                                ((Map) concurrentHashMap4).put(bVar.c(), bVar);
                            }
                        }
                        J j10 = J.f24997a;
                    } finally {
                    }
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public m(String id2, long j10) {
        AbstractC6492s.i(id2, "id");
        this.f3205a = id2;
        y yVarH = C6783c.f53633a.h("DiscoveryCombiner[" + id2 + "]");
        this.f3206b = yVarH;
        this.f3207c = new ConcurrentHashMap();
        this.f3208d = new ConcurrentHashMap();
        gg.i iVarI2 = gg.i.F0(0L, j10, TimeUnit.MILLISECONDS).e1().Y0(yVarH, false, 1).N0(new b()).f0(new c()).Z(new InterfaceC6464a() { // from class: Dc.l
            @Override // kg.InterfaceC6464a
            public final void run() {
                m.i();
            }
        }).e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3209e = iVarI2;
        this.f3210f = iVarI2;
    }

    private final j h(a aVar) {
        return new j(aVar.b(), aVar.c(), aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        Z7.b.h("Discovery combiner finished", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f3207c.entrySet()) {
            t.c cVar = (t.c) entry.getKey();
            for (Map.Entry entry2 : ((ConcurrentHashMap) entry.getValue()).entrySet()) {
                C5969a c5969a = (C5969a) entry2.getKey();
                t.a aVar = (t.a) entry2.getValue();
                if (k(aVar, jCurrentTimeMillis)) {
                    Object aVar2 = map.get(c5969a);
                    if (aVar2 == null) {
                        aVar2 = new a(null, null, null, 7, null);
                        map.put(c5969a, aVar2);
                    }
                    ((a) aVar2).a().put((EnumMap) cVar, (t.c) aVar);
                }
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            a aVar3 = (a) ((Map.Entry) it.next()).getValue();
            Object obj = map2.get(aVar3.b());
            if (obj == null) {
                map2.put(aVar3.b(), aVar3);
            } else {
                ((a) obj).a().putAll(aVar3.a());
            }
        }
        for (Map.Entry entry3 : this.f3208d.entrySet()) {
            t.c cVar2 = (t.c) entry3.getKey();
            for (Map.Entry entry4 : ((ConcurrentHashMap) entry3.getValue()).entrySet()) {
                inet.ipaddr.g gVar = (inet.ipaddr.g) entry4.getKey();
                t.b bVar = (t.b) entry4.getValue();
                if (k(bVar, jCurrentTimeMillis)) {
                    Object aVar4 = map2.get(gVar);
                    if (aVar4 == null) {
                        aVar4 = new a(null, null, null, 7, null);
                        map2.put(gVar, aVar4);
                    }
                    ((a) aVar4).a().put((EnumMap) cVar2, (t.c) bVar);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry5 : map2.entrySet()) {
            linkedHashMap.put((inet.ipaddr.g) entry5.getKey(), h((a) entry5.getValue()));
            arrayList.add(J.f24997a);
        }
        return linkedHashMap;
    }

    private final boolean k(t.b bVar, long j10) {
        return j10 < bVar.f();
    }

    @Override // Dc.k
    public gg.i a() {
        return this.f3210f;
    }

    @Override // Dc.k
    public AbstractC5912b b(List results) {
        AbstractC6492s.i(results, "results");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d(results));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Cc.l f3211a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC2558b f3212b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumMap f3213c;

        public a(Cc.l lVar, AbstractC2558b abstractC2558b, EnumMap results) {
            AbstractC6492s.i(results, "results");
            this.f3211a = lVar;
            this.f3212b = abstractC2558b;
            this.f3213c = results;
        }

        public final EnumMap a() {
            return this.f3213c;
        }

        public final inet.ipaddr.g b() {
            Object next;
            t.b bVar = (t.b) this.f3213c.get(t.c.ICMP);
            inet.ipaddr.g gVarC = bVar != null ? bVar.c() : null;
            C6180b c6180b = gVarC instanceof C6180b ? (C6180b) gVarC : null;
            if (c6180b != null) {
                return c6180b;
            }
            Collection collectionValues = this.f3213c.values();
            AbstractC6492s.h(collectionValues, "<get-values>(...)");
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((t.b) next).d() != null) {
                    break;
                }
            }
            t.b bVar2 = (t.b) next;
            C6180b c6180bD = bVar2 != null ? bVar2.d() : null;
            if (c6180bD != null) {
                return c6180bD;
            }
            Collection collectionValues2 = this.f3213c.values();
            AbstractC6492s.h(collectionValues2, "<get-values>(...)");
            return ((t.b) AbstractC3689v.p0(collectionValues2)).c();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        public final C5969a c() {
            t.b next;
            t.b bVar = (t.b) this.f3213c.get(t.c.ARP);
            if (bVar == null) {
                Collection collectionValues = this.f3213c.values();
                AbstractC6492s.h(collectionValues, "<get-values>(...)");
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (((t.b) next) instanceof t.a) {
                        break;
                    }
                }
                bVar = next;
            }
            t.a aVar = bVar instanceof t.a ? (t.a) bVar : null;
            if (aVar != null) {
                return aVar.g();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f3211a, aVar.f3211a) && AbstractC6492s.d(this.f3212b, aVar.f3212b) && AbstractC6492s.d(this.f3213c, aVar.f3213c);
        }

        public int hashCode() {
            Cc.l lVar = this.f3211a;
            int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            AbstractC2558b abstractC2558b = this.f3212b;
            return ((iHashCode + (abstractC2558b != null ? abstractC2558b.hashCode() : 0)) * 31) + this.f3213c.hashCode();
        }

        public String toString() {
            return "TempDeviceInfoHolder(deviceInfo=" + this.f3211a + ", deviceType=" + this.f3212b + ", results=" + this.f3213c + ")";
        }

        public /* synthetic */ a(Cc.l lVar, AbstractC2558b abstractC2558b, EnumMap enumMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : abstractC2558b, (i10 & 4) != 0 ? new EnumMap(t.c.class) : enumMap);
        }
    }
}
