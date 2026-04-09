package Sd;

import Sd.d;
import Wc.b;
import Zg.AbstractC3689v;
import Zg.d0;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import com.ui.wifiman.model.ubiquiti.console.e;
import h9.C5969a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class e implements Sd.d {

    /* renamed from: m, reason: collision with root package name */
    public static final C3498a f20479m = new C3498a(null);

    /* renamed from: a, reason: collision with root package name */
    private final a f20480a;

    /* renamed from: b, reason: collision with root package name */
    private final fe.u f20481b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f20482c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f20483d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f20484e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f20485f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f20486g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f20487h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f20488i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f20489j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f20490k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f20491l;

    static final class A implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final A f20492a = new A();

        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(AbstractC3500c directConnState) {
            boolean z10;
            AbstractC6492s.i(directConnState, "directConnState");
            if ((directConnState instanceof AbstractC3500c.b.a) || (directConnState instanceof AbstractC3500c.a) || (directConnState instanceof AbstractC3500c.b.C0745c)) {
                z10 = false;
            } else {
                if (!(directConnState instanceof AbstractC3500c.b.C0744b) && !(directConnState instanceof AbstractC3500c.b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class B implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ld.f f20493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f20494b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3499b.C0743b f20495a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f20496b;

            /* renamed from: Sd.e$B$a$a, reason: collision with other inner class name */
            static final class C0741a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC3499b.C0743b f20497a;

                C0741a(AbstractC3499b.C0743b c0743b) {
                    this.f20497a = c0743b;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AbstractC3500c apply(Td.a it) {
                    AbstractC6492s.i(it, "it");
                    return new AbstractC3500c.a(this.f20497a.a(), it, null);
                }
            }

            static final class b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f20498a;

                /* renamed from: Sd.e$B$a$b$a, reason: collision with other inner class name */
                static final class C0742a implements kg.n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ e f20499a;

                    C0742a(e eVar) {
                        this.f20499a = eVar;
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a apply(Throwable error) {
                        AbstractC6492s.i(error, "error");
                        if (!(error instanceof UnifiConsoleConnectionError.UntrustedCertificate) && (error instanceof UnifiConsoleConnectionError)) {
                            return gg.i.e2(5000L, TimeUnit.MILLISECONDS, this.f20499a.f20481b.a());
                        }
                        return gg.i.k0(error);
                    }
                }

                b(e eVar) {
                    this.f20498a = eVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(gg.i it) {
                    AbstractC6492s.i(it, "it");
                    return it.p0(new C0742a(this.f20498a));
                }
            }

            a(AbstractC3499b.C0743b c0743b, e eVar) {
                this.f20495a = c0743b;
                this.f20496b = eVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                Ld.e eVar = (Ld.e) c6556a.a();
                return eVar == null ? gg.i.K0(AbstractC3500c.b.C0745c.f20511a) : eVar.c().b(this.f20495a.a()).N0(new C0741a(this.f20495a)).z1(AbstractC3500c.b.a.f20509a).p1(new b(this.f20496b));
            }
        }

        B(Ld.f fVar, e eVar) {
            this.f20493a = fVar;
            this.f20494b = eVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC3499b.C0743b c0743b = (AbstractC3499b.C0743b) c6556a.a();
            return c0743b == null ? gg.i.K0(AbstractC3500c.b.C0745c.f20511a) : this.f20493a.a().I1(new a(c0743b, this.f20494b));
        }
    }

    static final class C implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C f20500a = new C();

        C() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AbstractC3500c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("WebRTC conn state: " + it, "LocalConsole");
        }
    }

    /* renamed from: Sd.e$a, reason: case insensitive filesystem */
    public static final class C3498a {
        public /* synthetic */ C3498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3498a() {
        }
    }

    /* renamed from: Sd.e$b, reason: case insensitive filesystem */
    private static abstract class AbstractC3499b {

        /* renamed from: Sd.e$b$a */
        public static final class a extends AbstractC3499b {

            /* renamed from: a, reason: collision with root package name */
            private final String f20501a;

            /* renamed from: b, reason: collision with root package name */
            private final C5969a f20502b;

            /* renamed from: c, reason: collision with root package name */
            private final inet.ipaddr.g f20503c;

            /* renamed from: d, reason: collision with root package name */
            private final String f20504d;

            /* renamed from: e, reason: collision with root package name */
            private final Set f20505e;

            public /* synthetic */ a(String str, C5969a c5969a, inet.ipaddr.g gVar, String str2, Set set, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, c5969a, gVar, str2, set);
            }

            public static /* synthetic */ a b(a aVar, String str, C5969a c5969a, inet.ipaddr.g gVar, String str2, Set set, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f20501a;
                }
                if ((i10 & 2) != 0) {
                    c5969a = aVar.f20502b;
                }
                C5969a c5969a2 = c5969a;
                if ((i10 & 4) != 0) {
                    gVar = aVar.f20503c;
                }
                inet.ipaddr.g gVar2 = gVar;
                if ((i10 & 8) != 0) {
                    str2 = aVar.f20504d;
                }
                String str3 = str2;
                if ((i10 & 16) != 0) {
                    set = aVar.f20505e;
                }
                return aVar.a(str, c5969a2, gVar2, str3, set);
            }

            public final a a(String consoleId, C5969a mac, inet.ipaddr.g ip, String str, Set trustedCerts) {
                AbstractC6492s.i(consoleId, "consoleId");
                AbstractC6492s.i(mac, "mac");
                AbstractC6492s.i(ip, "ip");
                AbstractC6492s.i(trustedCerts, "trustedCerts");
                return new a(consoleId, mac, ip, str, trustedCerts, null);
            }

            public String c() {
                return this.f20501a;
            }

            public final inet.ipaddr.g d() {
                return this.f20503c;
            }

            public final C5969a e() {
                return this.f20502b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return e.b.h(this.f20501a, aVar.f20501a) && AbstractC6492s.d(this.f20502b, aVar.f20502b) && AbstractC6492s.d(this.f20503c, aVar.f20503c) && AbstractC6492s.d(this.f20504d, aVar.f20504d) && AbstractC6492s.d(this.f20505e, aVar.f20505e);
            }

            public final String f() {
                return this.f20504d;
            }

            public final Set g() {
                return this.f20505e;
            }

            public int hashCode() {
                int iJ = ((((e.b.j(this.f20501a) * 31) + this.f20502b.hashCode()) * 31) + this.f20503c.hashCode()) * 31;
                String str = this.f20504d;
                return ((iJ + (str == null ? 0 : str.hashCode())) * 31) + this.f20505e.hashCode();
            }

            public String toString() {
                return "Direct(consoleId=" + e.b.l(this.f20501a) + ", mac=" + this.f20502b + ", ip=" + this.f20503c + ", ncaToken=" + this.f20504d + ", trustedCerts=" + this.f20505e + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private a(String consoleId, C5969a mac, inet.ipaddr.g ip, String str, Set trustedCerts) {
                super(null);
                AbstractC6492s.i(consoleId, "consoleId");
                AbstractC6492s.i(mac, "mac");
                AbstractC6492s.i(ip, "ip");
                AbstractC6492s.i(trustedCerts, "trustedCerts");
                this.f20501a = consoleId;
                this.f20502b = mac;
                this.f20503c = ip;
                this.f20504d = str;
                this.f20505e = trustedCerts;
            }
        }

        /* renamed from: Sd.e$b$b, reason: collision with other inner class name */
        public static final class C0743b extends AbstractC3499b {

            /* renamed from: a, reason: collision with root package name */
            private final String f20506a;

            public /* synthetic */ C0743b(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public String a() {
                return this.f20506a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0743b) && e.b.h(this.f20506a, ((C0743b) obj).f20506a);
            }

            public int hashCode() {
                return e.b.j(this.f20506a);
            }

            public String toString() {
                return "WebRTC(consoleId=" + e.b.l(this.f20506a) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private C0743b(String consoleId) {
                super(null);
                AbstractC6492s.i(consoleId, "consoleId");
                this.f20506a = consoleId;
            }
        }

        public /* synthetic */ AbstractC3499b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC3499b() {
        }
    }

    /* renamed from: Sd.e$c, reason: case insensitive filesystem */
    private static abstract class AbstractC3500c {

        /* renamed from: Sd.e$c$a */
        public static final class a extends AbstractC3500c {

            /* renamed from: a, reason: collision with root package name */
            private final String f20507a;

            /* renamed from: b, reason: collision with root package name */
            private final Td.a f20508b;

            public /* synthetic */ a(String str, Td.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, aVar);
            }

            public final String a() {
                return this.f20507a;
            }

            public final Td.a b() {
                return this.f20508b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return e.b.h(this.f20507a, aVar.f20507a) && AbstractC6492s.d(this.f20508b, aVar.f20508b);
            }

            public int hashCode() {
                return (e.b.j(this.f20507a) * 31) + this.f20508b.hashCode();
            }

            public String toString() {
                return "ConsoleConnState[Connected](id=" + this.f20507a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private a(String consoleId, Td.a session) {
                super(null);
                AbstractC6492s.i(consoleId, "consoleId");
                AbstractC6492s.i(session, "session");
                this.f20507a = consoleId;
                this.f20508b = session;
            }
        }

        /* renamed from: Sd.e$c$b */
        public static abstract class b extends AbstractC3500c {

            /* renamed from: Sd.e$c$b$a */
            public static final class a extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f20509a = new a();

                private a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return 852160258;
                }

                public String toString() {
                    return "ConsoleConnState[Connecting]";
                }
            }

            /* renamed from: Sd.e$c$b$b, reason: collision with other inner class name */
            public static final class C0744b extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0744b f20510a = new C0744b();

                private C0744b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0744b);
                }

                public int hashCode() {
                    return 1580064446;
                }

                public String toString() {
                    return "ConsoleConnState[Unauthorized]";
                }
            }

            /* renamed from: Sd.e$c$b$c, reason: collision with other inner class name */
            public static final class C0745c extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0745c f20511a = new C0745c();

                private C0745c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0745c);
                }

                public int hashCode() {
                    return -1742900922;
                }

                public String toString() {
                    return "ConsoleConnState[Unavailable]";
                }
            }

            /* renamed from: Sd.e$c$b$d */
            public static final class d extends b {

                /* renamed from: a, reason: collision with root package name */
                private final String f20512a;

                /* renamed from: b, reason: collision with root package name */
                private final Set f20513b;

                public /* synthetic */ d(String str, Set set, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, set);
                }

                public final Set a() {
                    return this.f20513b;
                }

                public final String b() {
                    return this.f20512a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return e.b.h(this.f20512a, dVar.f20512a) && AbstractC6492s.d(this.f20513b, dVar.f20513b);
                }

                public int hashCode() {
                    return (e.b.j(this.f20512a) * 31) + this.f20513b.hashCode();
                }

                public String toString() {
                    return "ConsoleConnState[UntrustedCerts](id=" + this.f20512a + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private d(String consoleId, Set certs) {
                    super(null);
                    AbstractC6492s.i(consoleId, "consoleId");
                    AbstractC6492s.i(certs, "certs");
                    this.f20512a = consoleId;
                    this.f20513b = certs;
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC3500c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC3500c() {
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f20514a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.b bVarD;
            gg.i iVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return (eVar == null || (bVarD = eVar.d()) == null || (iVarA = bVarD.a()) == null) ? gg.i.K0(AbstractC3689v.l()) : iVarA;
        }
    }

    /* renamed from: Sd.e$e, reason: collision with other inner class name */
    static final class C0746e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0746e f20515a = new C0746e();

        C0746e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            ArrayList arrayList = new ArrayList();
            for (Object obj : it) {
                if (((com.ui.wifiman.model.ubiquiti.console.e) obj).n()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    static final class f implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f20516a = new f();

        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List consoles, Map devicesOnLan) {
            AbstractC6492s.i(consoles, "consoles");
            AbstractC6492s.i(devicesOnLan, "devicesOnLan");
            for (Map.Entry entry : devicesOnLan.entrySet()) {
                inet.ipaddr.g gVar = (inet.ipaddr.g) entry.getKey();
                Dc.j jVar = (Dc.j) entry.getValue();
                Iterator it = consoles.iterator();
                while (it.hasNext()) {
                    com.ui.wifiman.model.ubiquiti.console.e eVar = (com.ui.wifiman.model.ubiquiti.console.e) it.next();
                    if (eVar.i() != null && jVar.k().contains(eVar.i())) {
                        return new C6556a(new d.b(eVar, gVar, eVar.i()));
                    }
                }
            }
            return new C6556a(null);
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f20517a = new g();

        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            d.b bVar = (d.b) c6556a.a();
            if (bVar == null) {
                Z7.b.g("Local not detected", "LocalConsole");
                return;
            }
            Z7.b.g("Local console [" + bVar.c() + "] found on " + bVar.b(), "LocalConsole");
        }
    }

    static final class h implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f20519a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(AbstractC3500c webRtcConnState) {
                AbstractC6492s.i(webRtcConnState, "webRtcConnState");
                if (webRtcConnState instanceof AbstractC3500c.a) {
                    gg.i iVarK0 = gg.i.K0(new C6556a(((AbstractC3500c.a) webRtcConnState).b()));
                    AbstractC6492s.h(iVarK0, "just(...)");
                    return iVarK0;
                }
                if (!(webRtcConnState instanceof AbstractC3500c.b.d) && !(webRtcConnState instanceof AbstractC3500c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                gg.i iVarK02 = gg.i.K0(new C6556a(null));
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean webRtcConnectionEnabled) {
            AbstractC6492s.i(webRtcConnectionEnabled, "webRtcConnectionEnabled");
            return !webRtcConnectionEnabled.booleanValue() ? gg.i.K0(new C6556a(null)) : e.this.f20488i.I1(a.f20519a);
        }
    }

    static final class i implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f20520a = new i();

        i() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC3500c directConnState, C6556a webRtcSession) {
            AbstractC6492s.i(directConnState, "directConnState");
            AbstractC6492s.i(webRtcSession, "webRtcSession");
            if (directConnState instanceof AbstractC3500c.b.a) {
                return new C6556a(null);
            }
            if (directConnState instanceof AbstractC3500c.a) {
                return new C6556a(((AbstractC3500c.a) directConnState).b());
            }
            if ((directConnState instanceof AbstractC3500c.b.d) || (directConnState instanceof AbstractC3500c.b.C0745c) || (directConnState instanceof AbstractC3500c.b.C0744b)) {
                return webRtcSession;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class j implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final j f20521a = new j();

        j() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Td.a aVar = (Td.a) it.b();
            String strD = aVar != null ? aVar.d() : null;
            String strL = strD == null ? "null" : e.b.l(strD);
            Td.a aVar2 = (Td.a) it.b();
            Z7.b.g("Local console session " + strL + "[conn: " + (aVar2 != null ? aVar2.b() : null) + "]", "LocalConsole");
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f20522a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.a apply(AbstractC3500c connectionState) {
            AbstractC6492s.i(connectionState, "connectionState");
            if (connectionState instanceof AbstractC3500c.a) {
                return new d.a.AbstractC0739a.b(((AbstractC3500c.a) connectionState).a(), null);
            }
            if (connectionState instanceof AbstractC3500c.b.d) {
                AbstractC3500c.b.d dVar = (AbstractC3500c.b.d) connectionState;
                return new d.a.AbstractC0739a.C0740a(dVar.b(), dVar.a(), null);
            }
            if ((connectionState instanceof AbstractC3500c.b.a) || (connectionState instanceof AbstractC3500c.b.C0745c) || (connectionState instanceof AbstractC3500c.b.C0744b)) {
                return d.a.b.f20475a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final l f20523a = new l();

        l() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(d.a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("Direct connection trust: " + it, "LocalConsole");
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f20524a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.b bVarD;
            gg.i iVarC;
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return (eVar == null || (bVarD = eVar.d()) == null || (iVarC = bVarD.c()) == null) ? gg.i.K0(new b.c()) : iVarC;
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f20525a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.b());
        }
    }

    static final class o implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final o f20526a = new o();

        o() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(C6556a c6556a, C6556a c6556a2) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            e.b bVar = (e.b) c6556a.a();
            String str = null;
            String strN = bVar != null ? bVar.n() : null;
            Map map = (Map) c6556a2.a();
            e.b bVarA = strN != null ? e.b.a(strN) : null;
            if (strN != null && map != null) {
                str = (String) map.get(e.b.a(strN));
            }
            return Yg.z.a(bVarA, str);
        }
    }

    static final class p implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final p f20527a = new p();

        p() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(Yg.s r5, Yg.s r6) {
            /*
                r4 = this;
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.AbstractC6492s.i(r5, r0)
                kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
                java.lang.Object r0 = r5.a()
                com.ui.wifiman.model.ubiquiti.console.e$b r0 = (com.ui.wifiman.model.ubiquiti.console.e.b) r0
                r1 = 0
                if (r0 == 0) goto L16
                java.lang.String r0 = r0.n()
                goto L17
            L16:
                r0 = r1
            L17:
                java.lang.Object r5 = r5.c()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r2 = r6.a()
                com.ui.wifiman.model.ubiquiti.console.e$b r2 = (com.ui.wifiman.model.ubiquiti.console.e.b) r2
                if (r2 == 0) goto L29
                java.lang.String r1 = r2.n()
            L29:
                java.lang.Object r6 = r6.c()
                java.lang.String r6 = (java.lang.String) r6
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L39
                if (r0 != 0) goto L37
                r0 = r2
                goto L40
            L37:
                r0 = r3
                goto L40
            L39:
                if (r0 != 0) goto L3c
                goto L37
            L3c:
                boolean r0 = com.ui.wifiman.model.ubiquiti.console.e.b.h(r1, r0)
            L40:
                if (r0 != 0) goto L43
                return r3
            L43:
                if (r6 == 0) goto L48
                if (r5 == 0) goto L48
                goto L49
            L48:
                r2 = r3
            L49:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Sd.e.p.a(Yg.s, Yg.s):boolean");
        }
    }

    static final class q implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final q f20528a = new q();

        q() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, Yg.s sVar) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(sVar, "<destruct>");
            d.b bVar = (d.b) c6556a.a();
            e.b bVar2 = (e.b) sVar.a();
            String strN = bVar2 != null ? bVar2.n() : null;
            String str = (String) sVar.c();
            if (bVar == null) {
                return new C6556a(null);
            }
            if (strN == null ? false : e.b.h(bVar.a().f(), strN)) {
                return new C6556a(new AbstractC3499b.a(bVar.a().f(), bVar.c(), bVar.b(), str, d0.e(), null));
            }
            return new C6556a(null);
        }
    }

    static final class r implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3499b.a f20530a;

            a(AbstractC3499b.a aVar) {
                this.f20530a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Set certs) {
                AbstractC6492s.i(certs, "certs");
                return new C6556a(AbstractC3499b.a.b(this.f20530a, null, null, null, null, certs, 15, null));
            }
        }

        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC3499b.a aVar = (AbstractC3499b.a) c6556a.a();
            return aVar == null ? gg.i.K0(new C6556a(null)) : e.this.f20480a.b(aVar.c()).N0(new a(aVar));
        }
    }

    static final class s implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final s f20531a = new s();

        s() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("Direct conn params: " + it, "LocalConsole");
        }
    }

    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f20532a = new t();

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            return Yg.z.a(((C6556a) sVar.a()).b(), ((C6556a) sVar.c()).b());
        }
    }

    static final class u implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3499b.a f20534a;

            a(AbstractC3499b.a aVar) {
                this.f20534a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3500c apply(Td.a it) {
                AbstractC6492s.i(it, "it");
                return new AbstractC3500c.a(this.f20534a.c(), it, null);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f20535a;

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f20536a;

                a(e eVar) {
                    this.f20536a = eVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    if (!(error instanceof UnifiConsoleConnectionError.UntrustedCertificate) && !(error instanceof UnifiConsoleConnectionError.Unauthorized)) {
                        return ((error instanceof UnifiConsoleConnectionError.RequestFailed) || (error instanceof UnifiConsoleConnectionError.IO)) ? gg.i.e2(5000L, TimeUnit.MILLISECONDS, this.f20536a.f20481b.a()) : gg.i.k0(error);
                    }
                    return gg.i.k0(error);
                }
            }

            b(e eVar) {
                this.f20535a = eVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(new a(this.f20535a));
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3499b.a f20537a;

            c(AbstractC3499b.a aVar) {
                this.f20537a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof UnifiConsoleConnectionError.UntrustedCertificate ? gg.i.K0(new AbstractC3500c.b.d(this.f20537a.c(), ((UnifiConsoleConnectionError.UntrustedCertificate) error).getCertificates(), null)) : error instanceof UnifiConsoleConnectionError.Unauthorized ? gg.i.K0(AbstractC3500c.b.C0744b.f20510a) : gg.i.k0(error);
            }
        }

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            AbstractC3499b.a aVar = (AbstractC3499b.a) sVar.a();
            Ld.e eVar = (Ld.e) sVar.c();
            return aVar == null ? gg.i.K0(AbstractC3500c.b.C0745c.f20511a) : aVar.f() == null ? gg.i.K0(AbstractC3500c.b.C0744b.f20510a) : eVar == null ? gg.i.K0(AbstractC3500c.b.C0745c.f20511a) : eVar.c().a(aVar.c(), aVar.d(), aVar.e(), aVar.f(), aVar.g()).N0(new a(aVar)).z1(AbstractC3500c.b.a.f20509a).p1(new b(e.this)).f1(new c(aVar));
        }
    }

    static final class v implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final v f20538a = new v();

        v() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AbstractC3500c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("Direct conn state: " + it, "LocalConsole");
        }
    }

    static final class w implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final w f20539a = new w();

        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            d.b bVar = (d.b) c6556a.a();
            String strF = bVar != null ? bVar.a().f() : null;
            return new C6556a(strF != null ? e.b.a(strF) : null);
        }
    }

    static final class x implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final x f20540a = new x();

        x() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            e.b bVar = (e.b) it.b();
            String strN = bVar != null ? bVar.n() : null;
            Z7.b.g("Local console id: " + (strN == null ? "null" : e.b.l(strN)), "LocalConsole");
        }
    }

    static final class y implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final y f20541a = new y();

        y() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [Sd.e$b$b] */
        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            e.b bVar = (e.b) c6556a.a();
            String strN = bVar != null ? bVar.n() : null;
            return new C6556a(strN != null ? new AbstractC3499b.C0743b(strN, defaultConstructorMarker) : null);
        }
    }

    static final class z implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final z f20542a = new z();

        z() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("WebRTC conn params: " + it, "LocalConsole");
        }
    }

    public e(Dc.e discovery, Ld.f cloudSessionService, a consoleCertManager, fe.u schedulers) {
        AbstractC6492s.i(discovery, "discovery");
        AbstractC6492s.i(cloudSessionService, "cloudSessionService");
        AbstractC6492s.i(consoleCertManager, "consoleCertManager");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f20480a = consoleCertManager;
        this.f20481b = schedulers;
        gg.i iVarW = cloudSessionService.a().I1(d.f20514a).N0(C0746e.f20515a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f20482c = iVarW;
        gg.i iVarI2 = gg.i.v(iVarW, discovery.b(), f.f20516a).W().f0(g.f20517a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f20483d = iVarI2;
        gg.i iVarI22 = c().N0(w.f20539a).W().f0(x.f20540a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f20484e = iVarI22;
        gg.i iVarI23 = gg.i.v(c(), gg.i.v(iVarI22, cloudSessionService.a().I1(m.f20524a).N0(n.f20525a), o.f20526a).X(p.f20527a), q.f20528a).I1(new r()).W().f0(s.f20531a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f20485f = iVarI23;
        gg.i iVarI24 = iVarI22.N0(y.f20541a).W().f0(z.f20542a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f20486g = iVarI24;
        gg.i iVarI25 = Ag.c.f753a.a(iVarI23, cloudSessionService.a()).N0(t.f20532a).I1(new u()).W().f0(v.f20538a).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f20487h = iVarI25;
        gg.i iVarI26 = iVarI24.I1(new B(cloudSessionService, this)).W().f0(C.f20500a).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f20488i = iVarI26;
        gg.i iVarI27 = iVarI25.N0(k.f20522a).W().f0(l.f20523a).o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f20489j = iVarI27;
        gg.i iVarI28 = iVarI25.N0(A.f20492a).W().o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f20490k = iVarI28;
        gg.i iVarI29 = gg.i.v(iVarI25, iVarI28.I1(new h()), i.f20520a).W().f0(j.f20521a).o1(1).i2();
        AbstractC6492s.h(iVarI29, "refCount(...)");
        this.f20491l = iVarI29;
    }

    @Override // Sd.d
    public gg.i a() {
        return this.f20489j;
    }

    @Override // Sd.d
    public gg.i b() {
        return this.f20491l;
    }

    @Override // Sd.d
    public gg.i c() {
        return this.f20483d;
    }
}
