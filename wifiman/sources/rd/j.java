package rd;

import Cc.AbstractC2558b;
import Ja.a;
import Zc.e;
import Zg.U;
import Zg.d0;
import b8.EnumC4076c;
import com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour;
import dc.C5341a;
import gg.AbstractC5912b;
import gg.t;
import gg.u;
import gg.z;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import ld.C6574a;
import ld.InterfaceC6575b;
import mc.InterfaceC6794a;
import rd.InterfaceC7587a;
import rd.b;
import vc.InterfaceC8209b;

/* loaded from: classes4.dex */
public final class j implements InterfaceC7587a {

    /* renamed from: p, reason: collision with root package name */
    public static final a f60287p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6794a f60288a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8209b f60289b;

    /* renamed from: c, reason: collision with root package name */
    private final RxBonjour f60290c;

    /* renamed from: d, reason: collision with root package name */
    private final C5341a f60291d;

    /* renamed from: e, reason: collision with root package name */
    private final Fg.b f60292e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f60293f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.b f60294g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f60295h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f60296i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f60297j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC5912b f60298k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f60299l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f60300m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC5912b f60301n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC5912b f60302o;

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
            private final EnumC4076c f60303a;

            /* renamed from: b, reason: collision with root package name */
            private final e.a f60304b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumC4076c type, e.a aVar) {
                super(null);
                AbstractC6492s.i(type, "type");
                this.f60303a = type;
                this.f60304b = aVar;
            }

            public final e.a a() {
                return this.f60304b;
            }

            public final EnumC4076c b() {
                return this.f60303a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f60303a == aVar.f60303a && AbstractC6492s.d(this.f60304b, aVar.f60304b);
            }

            public int hashCode() {
                int iHashCode = this.f60303a.hashCode() * 31;
                e.a aVar = this.f60304b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public String toString() {
                return "Connected(type=" + this.f60303a + ", address=" + this.f60304b + ")";
            }
        }

        /* renamed from: rd.j$b$b, reason: collision with other inner class name */
        public static final class C2107b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2107b f60305a = new C2107b();

            private C2107b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2107b);
            }

            public int hashCode() {
                return 1014782431;
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

    private static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60306a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -515208196;
            }

            public String toString() {
                return "Disabled";
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final inet.ipaddr.g f60307a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(inet.ipaddr.g address) {
                super(null);
                AbstractC6492s.i(address, "address");
                this.f60307a = address;
            }

            public final inet.ipaddr.g a() {
                return this.f60307a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f60307a, ((b) obj).f60307a);
            }

            public int hashCode() {
                return this.f60307a.hashCode();
            }

            public String toString() {
                return "Enabled(address=" + this.f60307a + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f60308a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(InterfaceC7587a.AbstractC2100a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf((it instanceof InterfaceC7587a.AbstractC2100a.b.c) && ((InterfaceC7587a.AbstractC2100a.b.c) it).a() > 0);
        }
    }

    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean inProgress) {
            AbstractC6492s.i(inProgress, "inProgress");
            return inProgress.booleanValue() ? j.this.f60289b.a() : AbstractC5912b.m();
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f60310a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(Zc.e network) {
            AbstractC6492s.i(network, "network");
            if (network.f() != e.b.CONNECTED) {
                return b.C2107b.f60305a;
            }
            EnumC4076c enumC4076cG = network.g();
            e.a aVarB = network.b();
            if (aVarB == null) {
                aVarB = network.c();
            }
            return new b.a(enumC4076cG, aVarB);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f60311a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ja.a apply(Long l10) {
            AbstractC6492s.i(l10, "<unused var>");
            return Ja.a.f9952a.a(new a.b(false, true));
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f60312a = new h();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60313a = new a();

            /* renamed from: rd.j$h$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2108a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f60314a;

                static {
                    int[] iArr = new int[a.c.values().length];
                    try {
                        iArr[a.c.OFF.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.c.STARTING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.c.IDLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.c.ACTIVE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f60314a = iArr;
                }
            }

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC7587a.AbstractC2100a.b apply(a.d status) {
                AbstractC6492s.i(status, "status");
                int i10 = C2108a.f60314a[status.c().ordinal()];
                if (i10 == 1) {
                    return InterfaceC7587a.AbstractC2100a.b.C2103b.f60254a;
                }
                if (i10 == 2) {
                    return InterfaceC7587a.AbstractC2100a.b.d.f60257a;
                }
                if (i10 == 3) {
                    Integer numB = status.b();
                    return new InterfaceC7587a.AbstractC2100a.b.C2102a(numB != null ? numB.intValue() : 0);
                }
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer numB2 = status.b();
                return new InterfaceC7587a.AbstractC2100a.b.c(numB2 != null ? numB2.intValue() : 0, status.a());
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Ja.a server) {
            AbstractC6492s.i(server, "server");
            return Qi.i.c(server.start(), null, 1, null).N0(a.f60313a);
        }
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f60315a = new i();

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC7587a.AbstractC2100a.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Speedtest SERVER State " + it, null, 2, null);
        }
    }

    /* renamed from: rd.j$j, reason: collision with other inner class name */
    static final class C2109j implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2109j f60316a = new C2109j();

        C2109j() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Speedtest SERVER Subscribed", null, 2, null);
        }
    }

    static final class k implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f60318b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.g f60319c;

        k(int i10, inet.ipaddr.g gVar) {
            this.f60318b = i10;
            this.f60319c = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String sessionId) {
            AbstractC6492s.i(sessionId, "sessionId");
            String name = j.this.f60288a.getName();
            if (name == null) {
                name = j.this.f60288a.c() + " " + j.this.f60288a.b();
            }
            String str = name;
            String strB = rd.f.b(j.this.f60288a.d() instanceof AbstractC2558b.a.C0119b ? b.a.EnumC2104a.TABLET_ANDROID : b.a.EnumC2104a.PHONE_ANDROID);
            inet.ipaddr.g gVar = this.f60319c;
            Set setB = d0.b();
            InetAddress inetAddressP1 = gVar.p1();
            Inet4Address inet4Address = inetAddressP1 instanceof Inet4Address ? (Inet4Address) inetAddressP1 : null;
            if (inet4Address != null) {
                setB.add(inet4Address);
            }
            Set setA = d0.a(setB);
            inet.ipaddr.g gVar2 = this.f60319c;
            Set setB2 = d0.b();
            InetAddress inetAddressP12 = gVar2.p1();
            Inet6Address inet6Address = inetAddressP12 instanceof Inet6Address ? (Inet6Address) inetAddressP12 : null;
            if (inet6Address != null) {
                setB2.add(inet6Address);
            }
            Set setA2 = d0.a(setB2);
            j jVar = j.this;
            Map mapC = U.c();
            mapC.put("name", str);
            mapC.put("model", jVar.f60288a.b());
            mapC.put("type", strB);
            mapC.put("version", jVar.f60291d.d());
            mapC.put("id", sessionId);
            return j.this.f60290c.c(new RxBonjour.a(str, "_wifiman-local-speedtest._tcp", U.b(mapC), setA, setA2, this.f60318b));
        }
    }

    static final class l implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final l f60320a = new l();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f60321a;

            static {
                int[] iArr = new int[EnumC4076c.values().length];
                try {
                    iArr[EnumC4076c.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4076c.DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC4076c.MOBILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC4076c.ETHERNET.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC4076c.WIFI.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f60321a = iArr;
            }
        }

        l() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c apply(Boolean paused, b connectionState) {
            b.a aVar;
            e.a aVarA;
            inet.ipaddr.g gVarB;
            AbstractC6492s.i(paused, "paused");
            AbstractC6492s.i(connectionState, "connectionState");
            if (!paused.booleanValue() && (connectionState instanceof b.a) && (aVarA = (aVar = (b.a) connectionState).a()) != null && (gVarB = aVarA.b()) != null && gVarB.e1()) {
                int i10 = a.f60321a[aVar.b().ordinal()];
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    if (i10 == 4 || i10 == 5) {
                        return new c.b(aVar.a().b());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return c.a.f60306a;
        }
    }

    static final class m implements kg.n {

        static final class a implements gg.m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f60323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f60324b;

            a(j jVar, c cVar) {
                this.f60323a = jVar;
                this.f60324b = cVar;
            }

            @Override // gg.m
            public final Dj.a a(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.U0(this.f60323a.s(it, ((c.b) this.f60324b).a()));
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f60325a;

            b(j jVar) {
                this.f60325a = jVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                this.f60325a.f60294g.h(InterfaceC7587a.AbstractC2100a.b.C2103b.f60254a);
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f60326a;

            c(j jVar) {
                this.f60326a = jVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                this.f60326a.f60294g.h(InterfaceC7587a.AbstractC2100a.C2101a.f60252a);
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(c params) {
            AbstractC6492s.i(params, "params");
            Z7.b.h("Speedtest SERVER params: " + params, null, 2, null);
            if (params instanceof c.b) {
                gg.i iVarG0 = j.this.n().x(new a(j.this, params)).g0(new b(j.this));
                AbstractC6492s.f(iVarG0);
                return iVarG0;
            }
            if (!(params instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarG02 = gg.i.K0(InterfaceC7587a.AbstractC2100a.C2101a.f60252a).g0(new c(j.this));
            AbstractC6492s.f(iVarG02);
            return iVarG02;
        }
    }

    static final class n implements InterfaceC6469f {
        n() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC7587a.AbstractC2100a it) {
            AbstractC6492s.i(it, "it");
            j.this.f60294g.h(it);
        }
    }

    static final class o implements InterfaceC6469f {
        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            j.this.f60294g.h(InterfaceC7587a.AbstractC2100a.b.C2103b.f60254a);
            Z7.b.j("Speedtest SERVER failed, retrying in 5000ms", it, null, 4, null);
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f60329a = new p();

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(5000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f60330a = new q();

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(C6574a it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class r implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final r f60331a = new r();

        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC7587a.AbstractC2100a.b state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof InterfaceC7587a.AbstractC2100a.b.C2103b) || (state instanceof InterfaceC7587a.AbstractC2100a.b.d)) {
                return new C6556a(null);
            }
            if (state instanceof InterfaceC7587a.AbstractC2100a.b.C2102a) {
                return new C6556a(Integer.valueOf(((InterfaceC7587a.AbstractC2100a.b.C2102a) state).a()));
            }
            if (state instanceof InterfaceC7587a.AbstractC2100a.b.c) {
                return new C6556a(Integer.valueOf(((InterfaceC7587a.AbstractC2100a.b.c) state).b()));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class s implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.g f60333b;

        s(inet.ipaddr.g gVar) {
            this.f60333b = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Integer num = (Integer) c6556a.a();
            return num != null ? j.this.r(this.f60333b, num.intValue()) : AbstractC5912b.m();
        }
    }

    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f60334a = new t();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60335a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof RxBonjour.Error)) {
                    return gg.i.k0(error);
                }
                Z7.b.j("App2App Speedtest Server Discovery Failed. Retrying...", null, null, 6, null);
                return gg.i.d2(5000L, TimeUnit.MILLISECONDS);
            }
        }

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f60335a);
        }
    }

    public j(Zc.f networkConnection, InterfaceC6794a androidInfo, InterfaceC6575b sessionManager, InterfaceC8209b appScreenManager, RxBonjour bonjour, C5341a buildConfig) {
        AbstractC6492s.i(networkConnection, "networkConnection");
        AbstractC6492s.i(androidInfo, "androidInfo");
        AbstractC6492s.i(sessionManager, "sessionManager");
        AbstractC6492s.i(appScreenManager, "appScreenManager");
        AbstractC6492s.i(bonjour, "bonjour");
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f60288a = androidInfo;
        this.f60289b = appScreenManager;
        this.f60290c = bonjour;
        this.f60291d = buildConfig;
        Fg.b bVarH2 = Fg.a.k2(Boolean.FALSE).h2();
        AbstractC6492s.h(bVarH2, "toSerialized(...)");
        this.f60292e = bVarH2;
        gg.i iVarI2 = bVarH2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f60293f = iVarI2;
        Fg.b bVarH22 = Fg.a.k2(InterfaceC7587a.AbstractC2100a.C2101a.f60252a).h2();
        AbstractC6492s.h(bVarH22, "toSerialized(...)");
        this.f60294g = bVarH22;
        gg.i iVarW = networkConnection.getState().N0(f.f60310a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f60295h = iVarW;
        gg.i iVarW2 = gg.i.v(iVarI2, iVarW, l.f60320a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f60296i = iVarW2;
        gg.i iVarI22 = bVarH22.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f60297j = iVarI22;
        AbstractC5912b abstractC5912bL1 = m().N0(d.f60308a).W().L1(new e());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f60298k = abstractC5912bL1;
        gg.i iVarI23 = iVarW2.I1(new m()).f0(new n()).d0(new o()).p1(p.f60329a).U0(abstractC5912bL1).F1(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f60299l = iVarI23;
        gg.i iVarW3 = sessionManager.a().N0(q.f60330a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f60300m = iVarW3;
        AbstractC5912b abstractC5912bF0 = gg.s.o(new u() { // from class: rd.i
            @Override // gg.u
            public final void a(t tVar) {
                j.p(this.f60286a, tVar);
            }
        }).r0().l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f60301n = abstractC5912bF0;
        AbstractC5912b abstractC5912bE0 = iVarI23.E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f60302o = abstractC5912bE0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i n() {
        gg.i iVarI2 = z.U(1000L, TimeUnit.MILLISECONDS).A(g.f60311a).w(h.f60312a).f0(i.f60315a).g0(C2109j.f60316a).Z(new InterfaceC6464a() { // from class: rd.h
            @Override // kg.InterfaceC6464a
            public final void run() {
                j.o();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        Z7.b.h("Speedtest SERVER Finished", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final j jVar, gg.t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        emitter.d(new InterfaceC6468e() { // from class: rd.g
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                j.q(this.f60285a);
            }
        });
        jVar.f60292e.h(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(j jVar) {
        jVar.f60292e.h(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b r(inet.ipaddr.g gVar, int i10) {
        AbstractC5912b abstractC5912bT = this.f60300m.o0().t(new k(i10, gVar));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b s(gg.i iVar, inet.ipaddr.g gVar) {
        AbstractC5912b abstractC5912bQ = iVar.N0(r.f60331a).W().L1(new s(gVar)).Q(t.f60334a);
        AbstractC6492s.h(abstractC5912bQ, "retryWhen(...)");
        return abstractC5912bQ;
    }

    @Override // rd.InterfaceC7587a
    public AbstractC5912b a() {
        return this.f60302o;
    }

    public gg.i m() {
        return this.f60297j;
    }
}
