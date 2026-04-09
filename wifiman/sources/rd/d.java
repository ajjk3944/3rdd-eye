package rd;

import Yg.s;
import Zc.e;
import Zg.AbstractC3689v;
import b8.EnumC4076c;
import ch.AbstractC4260a;
import com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour;
import ee.AbstractC5456b;
import gg.o;
import gg.q;
import gg.r;
import java.net.Inet4Address;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import je.AbstractC6317r;
import je.u;
import ke.AbstractC6458c;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import ld.C6574a;
import ld.InterfaceC6575b;
import mh.InterfaceC6835l;
import rd.b;
import rd.d;

/* loaded from: classes4.dex */
public final class d implements rd.b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f60264e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final RxBonjour f60265a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f60266b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f60267c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f60268d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC4076c f60269a;

            /* renamed from: b, reason: collision with root package name */
            private final String f60270b;

            /* renamed from: c, reason: collision with root package name */
            private final inet.ipaddr.g f60271c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumC4076c type, String str, inet.ipaddr.g gVar) {
                super(null);
                AbstractC6492s.i(type, "type");
                this.f60269a = type;
                this.f60270b = str;
                this.f60271c = gVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f60269a == aVar.f60269a && AbstractC6492s.d(this.f60270b, aVar.f60270b) && AbstractC6492s.d(this.f60271c, aVar.f60271c);
            }

            public int hashCode() {
                int iHashCode = this.f60269a.hashCode() * 31;
                String str = this.f60270b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                inet.ipaddr.g gVar = this.f60271c;
                return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
            }

            public String toString() {
                return "Connected(type=" + this.f60269a + ", ssid=" + this.f60270b + ", ip=" + this.f60271c + ")";
            }
        }

        /* renamed from: rd.d$b$b, reason: collision with other inner class name */
        public static final class C2105b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2105b f60272a = new C2105b();

            private C2105b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2105b);
            }

            public int hashCode() {
                return -106115243;
            }

            public String toString() {
                return "Disconnected";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f60273a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(Zc.e network, AbstractC6317r wifi) {
            AbstractC6458c abstractC6458cI;
            AbstractC6492s.i(network, "network");
            AbstractC6492s.i(wifi, "wifi");
            if (network.f() != e.b.CONNECTED) {
                return b.C2105b.f60272a;
            }
            EnumC4076c enumC4076cG = network.g();
            AbstractC6317r.b.a aVar = wifi instanceof AbstractC6317r.b.a ? (AbstractC6317r.b.a) wifi : null;
            String strB = (aVar == null || (abstractC6458cI = aVar.i()) == null) ? null : abstractC6458cI.b();
            e.a aVarB = network.b();
            return new b.a(enumC4076cG, strB, aVarB != null ? aVarB.b() : null);
        }
    }

    /* renamed from: rd.d$d, reason: collision with other inner class name */
    static final class C2106d implements n {
        C2106d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(b networkState) {
            AbstractC6492s.i(networkState, "networkState");
            if (networkState instanceof b.a) {
                Z7.b.h("A2A Speedtest Discovery Started", null, 2, null);
                return d.this.f();
            }
            if (!(networkState instanceof b.C2105b)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK0 = gg.i.K0(AbstractC3689v.l());
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f60275a = new e();

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(b.a it) {
            AbstractC6492s.i(it, "it");
            return it.d();
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("A2A Speedtest Discovery results: " + it.size() + " - [" + AbstractC3689v.z0(it, ",", null, null, 0, null, new InterfaceC6835l() { // from class: rd.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return d.e.c((b.a) obj);
                }
            }, 30, null) + "]", null, 2, null);
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f60276a = new f();

        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RxBonjour.b f60277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f60278b;

            public a(RxBonjour.b bVar, String str) {
                this.f60277a = bVar;
                this.f60278b = str;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    RxBonjour.b bVar = this.f60277a;
                    if (bVar instanceof RxBonjour.b.a) {
                        if (((RxBonjour.b.a) bVar).a().d().get("name") == null || AbstractC6492s.d(((RxBonjour.b.a) this.f60277a).a().d().get("id"), this.f60278b)) {
                            bVar = null;
                        }
                    } else if (!(bVar instanceof RxBonjour.b.C1394b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bVar != null) {
                        oVar.onSuccess(bVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            gg.n nVarC = gg.n.c(new a((RxBonjour.b) sVar.c(), (String) objA));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class g implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final g f60279a = new g();

        g() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap concurrentHashMap, RxBonjour.b event) {
            AbstractC6492s.i(event, "event");
            String str = event.a().b() + event.a().e();
            if (event instanceof RxBonjour.b.a) {
                AbstractC6492s.f(concurrentHashMap);
                concurrentHashMap.put(str, ((RxBonjour.b.a) event).a());
            } else {
                if (!(event instanceof RxBonjour.b.C1394b)) {
                    throw new NoWhenBranchMatchedException();
                }
                concurrentHashMap.remove(str);
            }
            return concurrentHashMap;
        }
    }

    static final class h implements n {

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((b.a) obj).a(), ((b.a) obj2).a());
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ConcurrentHashMap concurrentHashMap) {
            d dVar = d.this;
            List listC = AbstractC3689v.c();
            AbstractC6492s.f(concurrentHashMap);
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                b.a aVarE = dVar.e((RxBonjour.a) ((Map.Entry) it.next()).getValue());
                if (aVarE != null) {
                    listC.add(aVarE);
                }
            }
            return AbstractC3689v.X0(AbstractC3689v.a(listC), new a());
        }
    }

    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f60281a = new i();

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60282a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof RxBonjour.Error ? gg.i.d2(3000L, TimeUnit.MILLISECONDS) : gg.i.k0(error);
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i errorStream) {
            AbstractC6492s.i(errorStream, "errorStream");
            return errorStream.p0(a.f60282a);
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f60283a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(C6574a it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    public d(Zc.f networkConnection, u wifiConnectionService, InterfaceC6575b sessionManager, RxBonjour bonjour) {
        AbstractC6492s.i(networkConnection, "networkConnection");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(sessionManager, "sessionManager");
        AbstractC6492s.i(bonjour, "bonjour");
        this.f60265a = bonjour;
        gg.i iVarI2 = gg.i.v(networkConnection.getState(), wifiConnectionService.a(), c.f60273a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f60266b = iVarI2;
        gg.i iVarW = sessionManager.a().N0(j.f60283a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f60267c = iVarW;
        gg.i iVarI22 = iVarI2.I1(new C2106d()).z1(AbstractC3689v.l()).W().f0(e.f60275a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f60268d = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b.a e(RxBonjour.a aVar) {
        Integer numQ;
        Inet4Address inet4Address = (Inet4Address) AbstractC3689v.r0(aVar.a());
        if (inet4Address == null) {
            Z7.b.h("Local Speedtest Discovery - IGNORED(No IPv4) - " + aVar, null, 2, null);
            return null;
        }
        inet.ipaddr.g gVarA = AbstractC5456b.a(inet4Address);
        int iC = aVar.c();
        String strB = aVar.b();
        String str = (String) aVar.d().get("model");
        String str2 = (String) aVar.d().get("wifiExperience");
        S8.g gVarA2 = (str2 == null || (numQ = t.q(str2)) == null) ? null : S8.g.f20381b.a(numQ.intValue());
        String str3 = (String) aVar.d().get("type");
        return new b.a(gVarA, iC, strB, str, gVarA2, str3 != null ? rd.f.a(str3) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i f() {
        gg.i iVarX0 = Ag.c.f753a.a(this.f60267c, this.f60265a.b("_wifiman-local-speedtest._tcp")).v0(f.f60276a).s1(new kg.q() { // from class: rd.c
            @Override // kg.q
            public final Object get() {
                return d.g();
            }
        }, g.f60279a).N0(new h()).p1(i.f60281a).e1().X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap g() {
        return new ConcurrentHashMap();
    }

    @Override // rd.b
    public gg.i a() {
        return this.f60268d;
    }
}
