package com.ui.wifiman.model.network.hosts;

import Yg.s;
import Yg.z;
import Zc.e;
import Zg.AbstractC3689v;
import Zg.U;
import android.database.sqlite.SQLiteConstraintException;
import com.ui.wifiman.model.network.hosts.NetworkHost;
import dd.InterfaceC5347a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.p;
import kg.q;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.AbstractC6561f;
import l9.C6556a;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
public final class a implements NetworkHost.Manager {

    /* renamed from: h, reason: collision with root package name */
    public static final C1407a f42820h = new C1407a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Rb.a f42821a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5347a f42822b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f42823c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f42824d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f42825e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f42826f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f42827g;

    /* renamed from: com.ui.wifiman.model.network.hosts.a$a, reason: collision with other inner class name */
    public static final class C1407a {
        public /* synthetic */ C1407a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1407a() {
        }
    }

    private static abstract class b {

        /* renamed from: com.ui.wifiman.model.network.hosts.a$b$a, reason: collision with other inner class name */
        public static final class C1408a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f42828a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1408a(String host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f42828a = host;
            }

            public final String a() {
                return this.f42828a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1408a) && AbstractC6492s.d(this.f42828a, ((C1408a) obj).f42828a);
            }

            public int hashCode() {
                return this.f42828a.hashCode();
            }

            public String toString() {
                return "HostAdded(host=" + this.f42828a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.network.hosts.a$b$b, reason: collision with other inner class name */
        public static final class C1409b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f42829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1409b(String host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f42829a = host;
            }

            public final String a() {
                return this.f42829a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1409b) && AbstractC6492s.d(this.f42829a, ((C1409b) obj).f42829a);
            }

            public int hashCode() {
                return this.f42829a.hashCode();
            }

            public String toString() {
                return "HostRemoved(host=" + this.f42829a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final String host;
        private final int position;
        public static final c GATEWAY = new c("GATEWAY", 0, "gateway", 3);
        public static final c GOOGLE = new c("GOOGLE", 1, "google.com", 0);
        public static final c FACEBOOK = new c("FACEBOOK", 2, "facebook.com", 1);
        public static final c TWITTER = new c("TWITTER", 3, "x.com", 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{GATEWAY, GOOGLE, FACEBOOK, TWITTER};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, String str2, int i11) {
            this.host = str2;
            this.position = i11;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final String getHost() {
            return this.host;
        }

        public final int getPosition() {
            return this.position;
        }
    }

    static final class d implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42831b;

        /* renamed from: com.ui.wifiman.model.network.hosts.a$d$a, reason: collision with other inner class name */
        public static final class C1410a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f42832a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f42833b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42834c;

            public C1410a(List list, a aVar, String str) {
                this.f42832a = list;
                this.f42833b = aVar;
                this.f42834c = str;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    AbstractC6492s.f(this.f42832a);
                    Rb.c cVar = (Rb.c) AbstractC3689v.D0(this.f42832a);
                    try {
                        this.f42833b.f42821a.e(new Rb.c(0L, this.f42834c, cVar != null ? cVar.e() + 1 : MPv3.MAX_MESSAGE_ID, System.currentTimeMillis(), 1, null));
                        interfaceC5913c.a();
                    } catch (SQLiteConstraintException e10) {
                        Z7.b.h("NetworkHostsManager - failed to add host " + this.f42834c + " due to a SQLiteConstraintException. Probably because the host is already added", null, 2, null);
                        throw new NetworkHost.Manager.Error.HostAlreadyAdded(this.f42834c, e10);
                    }
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        d(String str) {
            this.f42831b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(List hosts) {
            AbstractC6492s.i(hosts, "hosts");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1410a(hosts, a.this, this.f42831b));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class e implements kg.n {

        /* renamed from: com.ui.wifiman.model.network.hosts.a$e$a, reason: collision with other inner class name */
        static final class C1411a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f42836a;

            C1411a(a aVar) {
                this.f42836a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(String address) {
                AbstractC6492s.i(address, "address");
                return this.f42836a.f42822b.a(address, 3000, 1000);
            }
        }

        static final class b implements p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.C1408a f42837a;

            b(b.C1408a c1408a) {
                this.f42837a = c1408a;
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(b it) {
                AbstractC6492s.i(it, "it");
                return (it instanceof b.C1409b) && AbstractC6492s.d(((b.C1409b) it).a(), this.f42837a.a());
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.C1408a f42838a;

            c(b.C1408a c1408a) {
                this.f42838a = c1408a;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final dd.i apply(dd.i stats) {
                AbstractC6492s.i(stats, "stats");
                return AbstractC6492s.d(this.f42838a.a(), "gateway") ? dd.i.b(stats, "gateway", null, null, null, null, null, null, 126, null) : stats;
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(b.C1408a event) {
            AbstractC6492s.i(event, "event");
            return a.this.m(event).I1(new C1411a(a.this)).Q1(a.this.f42824d.m0(new b(event))).N0(new c(event));
        }
    }

    static final class f implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42839a = new f();

        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap concurrentHashMap, dd.i stats) {
            AbstractC6492s.i(stats, "stats");
            AbstractC6492s.f(concurrentHashMap);
            concurrentHashMap.put(stats.c(), stats);
            return concurrentHashMap;
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f42840a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Zc.e it) {
            inet.ipaddr.g gVarA;
            AbstractC6492s.i(it, "it");
            e.a aVarB = it.b();
            return new C6556a((aVarB == null || (gVarA = aVarB.a()) == null) ? null : gVarA.toString());
        }
    }

    static final class h implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f42841a = new h();

        h() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List sortedHosts, Map stats) {
            NetworkHost aVar;
            AbstractC6492s.i(sortedHosts, "sortedHosts");
            AbstractC6492s.i(stats, "stats");
            List list = sortedHosts;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                Rb.c cVar = (Rb.c) obj;
                if (AbstractC6492s.d(cVar.c(), "gateway")) {
                    long jD = cVar.d();
                    dd.i iVar = (dd.i) stats.get(cVar.c());
                    dd.i iVar2 = (dd.i) stats.get(cVar.c());
                    aVar = new NetworkHost.b(jD, iVar2 != null ? iVar2.g() : null, i10, iVar);
                } else {
                    long jD2 = cVar.d();
                    String strC = cVar.c();
                    dd.i iVar3 = (dd.i) stats.get(cVar.c());
                    dd.i iVar4 = (dd.i) stats.get(cVar.c());
                    aVar = new NetworkHost.a(jD2, iVar4 != null ? iVar4.g() : null, strC, i10, iVar3);
                }
                arrayList.add(aVar);
                i10 = i11;
            }
            return arrayList;
        }
    }

    static final class i implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f42842a = new i();

        i() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(s sVar, List current) {
            AbstractC6492s.i(current, "current");
            return z.a(sVar.j(), current);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f42843a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(s sVar) {
            Object next;
            List list = (List) sVar.a();
            List<Rb.c> list2 = (List) sVar.c();
            ArrayList arrayList = new ArrayList();
            List list3 = list;
            Iterator it = list3.iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Rb.c cVar = (Rb.c) it.next();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (AbstractC6492s.d(cVar.c(), ((Rb.c) next2).c())) {
                        obj = next2;
                        break;
                    }
                }
                if (obj == null) {
                    arrayList.add(new b.C1409b(cVar.c()));
                }
            }
            for (Rb.c cVar2 : list2) {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (AbstractC6492s.d(cVar2.c(), ((Rb.c) next).c())) {
                        break;
                    }
                }
                if (next == null) {
                    arrayList.add(new b.C1408a(cVar2.c()));
                }
            }
            return Ag.b.b(arrayList);
        }
    }

    public static final class k implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f42845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42846c;

        public k(long j10, int i10) {
            this.f42845b = j10;
            this.f42846c = i10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                a.this.f42821a.d(this.f42845b, this.f42846c, System.currentTimeMillis());
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class l implements kg.n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(List hosts) {
            AbstractC6492s.i(hosts, "hosts");
            return hosts.isEmpty() ? a.this.o().h(a.this.f42821a.a().O1(1L)) : gg.i.K0(hosts);
        }
    }

    public static final class m implements InterfaceC5915e {
        public m() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("Favorite Host DB prepopulate initiated", null, 2, null);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Rb.a aVar = a.this.f42821a;
                InterfaceC5826a<c> entries = c.getEntries();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(entries, 10));
                for (c cVar : entries) {
                    arrayList.add(new Rb.c(0L, cVar.getHost(), cVar.getPosition(), System.currentTimeMillis(), 1, null));
                }
                Rb.c[] cVarArr = (Rb.c[]) arrayList.toArray(new Rb.c[0]);
                aVar.e((Rb.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
                Z7.b.h("Favorite Host DB prepopulate COMPLETED", null, 2, null);
                interfaceC5913c.a();
            } catch (Throwable th3) {
                th = th3;
                interfaceC5913c.onError(th);
            }
        }
    }

    public static final class n implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f42850b;

        public n(long j10) {
            this.f42850b = j10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                if (a.this.f42821a.b(this.f42850b) < 1) {
                    throw new NetworkHost.Manager.Error.HostNotFound(String.valueOf(this.f42850b), null, 2, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public a(Rb.a dao, InterfaceC5347a hostLatencyStatsService, Zc.f networkConnectionManager) {
        AbstractC6492s.i(dao, "dao");
        AbstractC6492s.i(hostLatencyStatsService, "hostLatencyStatsService");
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        this.f42821a = dao;
        this.f42822b = hostLatencyStatsService;
        gg.i iVarI2 = dao.a().I1(new l()).F1(Gg.a.d()).X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42823c = iVarI2;
        gg.i iVarI22 = iVarI2.s1(new q() { // from class: bd.a
            @Override // kg.q
            public final Object get() {
                return com.ui.wifiman.model.network.hosts.a.n();
            }
        }, i.f42842a).B(j.f42843a).h1().i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f42824d = iVarI22;
        gg.i iVarI23 = networkConnectionManager.getState().N0(g.f42840a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f42825e = iVarI23;
        gg.i iVarZ0 = iVarI22.Z0(b.C1408a.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarY0 = iVarZ0.p0(new e()).s1(new q() { // from class: bd.b
            @Override // kg.q
            public final Object get() {
                return com.ui.wifiman.model.network.hosts.a.l();
            }
        }, f.f42839a).U1(1000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        gg.i iVarN = iVarY0.n(Map.class);
        AbstractC6492s.h(iVarN, "cast(R::class.java)");
        this.f42826f = iVarN;
        gg.i iVarI24 = gg.i.v(iVarI2, iVarN.z1(U.h()), h.f42841a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f42827g = iVarI24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap l() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i m(b.C1408a c1408a) {
        if (AbstractC6492s.d(c1408a.a(), "gateway")) {
            return AbstractC6561f.e(this.f42825e);
        }
        gg.i iVarK0 = gg.i.K0(c1408a.a());
        AbstractC6492s.h(iVarK0, "just(...)");
        return iVarK0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s n() {
        return z.a(AbstractC3689v.l(), AbstractC3689v.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b o() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new m());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.network.hosts.NetworkHost.Manager
    public AbstractC5912b a(String host) {
        AbstractC6492s.i(host, "host");
        AbstractC5912b abstractC5912bL = this.f42823c.o0().t(new d(host)).W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.network.hosts.NetworkHost.Manager
    public AbstractC5912b b(long j10, int i10) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new k(j10, i10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.network.hosts.NetworkHost.Manager
    public gg.i c() {
        return this.f42827g;
    }

    @Override // com.ui.wifiman.model.network.hosts.NetworkHost.Manager
    public AbstractC5912b d(long j10) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new n(j10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }
}
