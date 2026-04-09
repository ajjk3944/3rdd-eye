package com.ui.wifiman.model.discovery.engine.bonjour;

import Lg.c;
import Yg.J;
import Zc.e;
import Zg.U;
import Zg.d0;
import android.net.wifi.WifiManager;
import b8.EnumC4076c;
import com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour;
import com.ui.wifiman.model.discovery.engine.bonjour.e;
import gg.AbstractC5912b;
import gg.D;
import gg.EnumC5911a;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.y;
import gg.z;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import kg.InterfaceC6464a;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import m9.C6783c;

/* loaded from: classes4.dex */
public final class e implements RxBonjour {

    /* renamed from: e, reason: collision with root package name */
    public static final a f42698e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f42699a;

    /* renamed from: b, reason: collision with root package name */
    private final y f42700b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f42701c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f42702d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final WifiManager f42703a;

        /* renamed from: b, reason: collision with root package name */
        private final inet.ipaddr.g f42704b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f42705c;

        /* renamed from: d, reason: collision with root package name */
        private final Fg.a f42706d;

        /* renamed from: e, reason: collision with root package name */
        private Kg.a f42707e;

        /* renamed from: f, reason: collision with root package name */
        private WifiManager.MulticastLock f42708f;

        /* renamed from: g, reason: collision with root package name */
        private final z f42709g;

        public b(WifiManager wifiManager, inet.ipaddr.g ip) {
            AbstractC6492s.i(wifiManager, "wifiManager");
            AbstractC6492s.i(ip, "ip");
            this.f42703a = wifiManager;
            this.f42704b = ip;
            this.f42705c = new AtomicInteger(0);
            Fg.a aVarJ2 = Fg.a.j2();
            AbstractC6492s.h(aVarJ2, "create(...)");
            this.f42706d = aVarJ2;
            z zVarO0 = aVarJ2.o0();
            AbstractC6492s.h(zVarO0, "firstOrError(...)");
            this.f42709g = zVarO0;
        }

        public final z a() {
            return this.f42709g;
        }

        public final void b() {
            if (this.f42705c.getAndIncrement() == 0) {
                Z7.b.g("JMDNS STARTING " + hashCode(), "BonjourJMDNS");
                try {
                    this.f42707e = Kg.a.f0(this.f42704b.p1(), "JMDNS-" + this.f42704b);
                    try {
                        WifiManager.MulticastLock multicastLockCreateMulticastLock = this.f42703a.createMulticastLock("BonjourJMDNS-" + this.f42704b);
                        this.f42708f = multicastLockCreateMulticastLock;
                        AbstractC6492s.f(multicastLockCreateMulticastLock);
                        multicastLockCreateMulticastLock.acquire();
                        Z7.b.g("JMDNS multicast lock ACQUIRED", "BonjourJMDNS");
                        Fg.a aVar = this.f42706d;
                        Kg.a aVar2 = this.f42707e;
                        AbstractC6492s.f(aVar2);
                        aVar.h(aVar2);
                        Z7.b.g("JMDNS STARTED " + hashCode(), "BonjourJMDNS");
                    } catch (Throwable th2) {
                        Z7.b.c("JMDNS failed to acquire multicast lock", th2, "BonjourJMDNS");
                        this.f42706d.onError(new RxBonjour.Error.InternalError("failed to create and acquire multicast lock", th2));
                    }
                } catch (IOException e10) {
                    Z7.b.i("JMDNS failed to create jmdns instance", e10, "BonjourJMDNS");
                    this.f42706d.onError(new RxBonjour.Error.InternalError("failed to create jmdns instance", e10));
                }
            }
        }

        public final void c() {
            if (this.f42705c.decrementAndGet() == 0) {
                Z7.b.g("JMDNS STOPPING " + hashCode(), "BonjourJMDNS");
                try {
                    Z7.b.g("JMDNS closing JMDNS instance on " + this.f42704b, "BonjourJMDNS");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Kg.a aVar = this.f42707e;
                    if (aVar != null) {
                        aVar.close();
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    Z7.b.g("JMDNS close JMDNS instance on " + this.f42704b + " took " + jCurrentTimeMillis2 + " ms", "BonjourJMDNS");
                } catch (Throwable th2) {
                    Z7.b.i("failed to close JMDNS instance", th2, "BonjourJMDNS");
                }
                WifiManager.MulticastLock multicastLock = this.f42708f;
                if (multicastLock != null && multicastLock.isHeld()) {
                    try {
                        WifiManager.MulticastLock multicastLock2 = this.f42708f;
                        if (multicastLock2 != null) {
                            multicastLock2.release();
                        }
                    } catch (Throwable th3) {
                        Z7.b.i("JMDNS failed to release multicast lock", th3, "BonjourJMDNS");
                    }
                }
                Z7.b.g("JMDNS STOPPED " + hashCode(), "BonjourJMDNS");
            }
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42710a;

        static {
            int[] iArr = new int[EnumC4076c.values().length];
            try {
                iArr[EnumC4076c.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4076c.ETHERNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4076c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4076c.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4076c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f42710a = iArr;
        }
    }

    static final class d implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42712b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f42713a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f42714b;

            a(e eVar, String str) {
                this.f42713a = eVar;
                this.f42714b = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(e eVar, final String str, final Kg.a aVar, gg.j emitter) {
                AbstractC6492s.i(emitter, "emitter");
                final Kg.e eVarN = eVar.n(emitter);
                final String strL = eVar.l(str);
                emitter.d(new InterfaceC6468e() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.h
                    @Override // kg.InterfaceC6468e
                    public final void cancel() {
                        e.d.a.e(str, aVar, strL, eVarN);
                    }
                });
                try {
                    Z7.b.g("Service browse " + str + " STARTING", "BonjourJMDNS");
                    aVar.b0(strL, eVarN);
                    Z7.b.g("Service browse " + str + " STARTED", "BonjourJMDNS");
                } catch (Throwable th2) {
                    Z7.b.i("Service browse " + str + " START FAILED", th2, "BonjourJMDNS");
                    emitter.c(new RxBonjour.Error.InternalError("addServiceListener '" + str + "' FAILED", th2));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(String str, Kg.a aVar, String str2, Kg.e eVar) {
                try {
                    Z7.b.g("removing service '" + str + "' listener", "BonjourJMDNS");
                    aVar.n0(str2, eVar);
                } catch (Throwable th2) {
                    Z7.b.c("FAILED to remove service'" + str + "' listener", th2, "BonjourJMDNS");
                }
            }

            @Override // kg.n
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(final Kg.a jmdns) {
                AbstractC6492s.i(jmdns, "jmdns");
                final e eVar = this.f42713a;
                final String str = this.f42714b;
                return gg.i.N(new gg.k() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.g
                    @Override // gg.k
                    public final void a(gg.j jVar) {
                        e.d.a.d(eVar, str, jmdns, jVar);
                    }
                }, EnumC5911a.BUFFER);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42715a;

            b(b bVar) {
                this.f42715a = bVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                this.f42715a.b();
            }
        }

        d(String str) {
            this.f42712b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar) {
            bVar.c();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final b manager) {
            AbstractC6492s.i(manager, "manager");
            return manager.a().w(new a(e.this, this.f42712b)).g0(new b(manager)).Z(new InterfaceC6464a() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.f
                @Override // kg.InterfaceC6464a
                public final void run() {
                    e.d.c(manager);
                }
            });
        }
    }

    /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.e$e, reason: collision with other inner class name */
    static final class C1400e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42716a;

        C1400e(String str) {
            this.f42716a = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(RxBonjour.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("BROWSE [" + this.f42716a + "] result", null, 2, null);
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42717a = new f();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42718a = new a();

            /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.e$f$a$a, reason: collision with other inner class name */
            public static final class C1401a implements Kg.f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ gg.j f42719a;

                C1401a(gg.j jVar) {
                    this.f42719a = jVar;
                }

                @Override // Kg.f
                public void a(Kg.c cVar) {
                    Z7.b.g("service subtype found - " + (cVar != null ? cVar.h() : null), "BonjourJMDNS");
                }

                @Override // Kg.f
                public void d(Kg.c cVar) {
                    String strH;
                    Z7.b.g("service type found - " + (cVar != null ? cVar.h() : null), "BonjourJMDNS");
                    if (cVar == null || (strH = cVar.h()) == null) {
                        return;
                    }
                    this.f42719a.h(strH);
                }
            }

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(final Kg.a aVar, gg.j emitter) {
                AbstractC6492s.i(emitter, "emitter");
                final C1401a c1401a = new C1401a(emitter);
                emitter.d(new InterfaceC6468e() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.k
                    @Override // kg.InterfaceC6468e
                    public final void cancel() {
                        e.f.a.e(aVar, c1401a);
                    }
                });
                try {
                    Z7.b.g("Service type discovery STARTING", "BonjourJMDNS");
                    aVar.d0(c1401a);
                    Z7.b.g("Service type discovery STARTED", "BonjourJMDNS");
                } catch (Throwable th2) {
                    Z7.b.i("Service type discovery START FAILED", th2, "BonjourJMDNS");
                    emitter.c(new RxBonjour.Error.InternalError("addServiceTypeListener FAILED", th2));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(Kg.a aVar, C1401a c1401a) {
                try {
                    Z7.b.g("removing service type listener", "BonjourJMDNS");
                    aVar.o0(c1401a);
                } catch (Throwable th2) {
                    Z7.b.c("FAILED to remove serviceTypeListener", th2, "BonjourJMDNS");
                }
            }

            @Override // kg.n
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(final Kg.a jmdns) {
                AbstractC6492s.i(jmdns, "jmdns");
                return gg.i.N(new gg.k() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.j
                    @Override // gg.k
                    public final void a(gg.j jVar) {
                        e.f.a.d(jmdns, jVar);
                    }
                }, EnumC5911a.BUFFER);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42720a;

            b(b bVar) {
                this.f42720a = bVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                this.f42720a.b();
            }
        }

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar) {
            bVar.c();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final b manager) {
            AbstractC6492s.i(manager, "manager");
            return manager.a().w(a.f42718a).g0(new b(manager)).Z(new InterfaceC6464a() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.i
                @Override // kg.InterfaceC6464a
                public final void run() {
                    e.f.c(manager);
                }
            });
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f42721a = new g();

        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(String it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("BROWSE SERVICE TYPE discovered: " + it + ")", "BonjourJMDNS");
        }
    }

    static final class h implements kg.n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(inet.ipaddr.g ip) {
            AbstractC6492s.i(ip, "ip");
            return new b(e.this.f42699a, ip);
        }
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f42723a = new i();

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("JMDNS Manager emission - " + it.hashCode(), "BonjourJMDNS");
        }
    }

    static final class j implements kg.n {
        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Zc.e networkConnection) {
            e.a aVarB;
            AbstractC6492s.i(networkConnection, "networkConnection");
            inet.ipaddr.g gVarB = null;
            if (e.this.m(networkConnection.g()) && (aVarB = networkConnection.b()) != null) {
                gVarB = aVarB.b();
            }
            return gVarB != null ? z.z(gVarB) : z.p(new RxBonjour.Error.DiscoveryUnavailable("JMDNS create failed - no IP available"));
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f42725a = new k();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ inet.ipaddr.g f42726a;

            a(inet.ipaddr.g gVar) {
                this.f42726a = gVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final inet.ipaddr.g apply(Long it) {
                AbstractC6492s.i(it, "it");
                return this.f42726a;
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(inet.ipaddr.g ip) {
            AbstractC6492s.i(ip, "ip");
            return gg.i.d2(1000L, TimeUnit.MILLISECONDS).N0(new a(ip));
        }
    }

    public static final class l implements Kg.e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gg.h f42728b;

        l(gg.h hVar) {
            this.f42728b = hVar;
        }

        @Override // Kg.e
        public void b(Kg.c cVar) {
            RxBonjour.a aVarJ;
            if (cVar == null) {
                Z7.b.c("serviceRemoved - null event", null, "BonjourJMDNS");
                return;
            }
            Z7.b.g("serviceRemoved - " + cVar.getName(), "BonjourJMDNS");
            Kg.d dVarD = cVar.d();
            if (dVarD == null || (aVarJ = e.this.j(dVarD)) == null) {
                Z7.b.c("serviceRemoved - parse failed", null, "BonjourJMDNS");
            } else {
                this.f42728b.h(new RxBonjour.b.C1394b(aVarJ));
            }
        }

        @Override // Kg.e
        public void c(Kg.c cVar) {
            Z7.b.h("serviceAdded " + (cVar != null ? cVar.h() : null) + "[" + (cVar != null ? cVar.getName() : null) + "]", null, 2, null);
        }

        @Override // Kg.e
        public void e(Kg.c cVar) {
            RxBonjour.a aVarJ;
            if (cVar == null) {
                Z7.b.c("serviceResolved - null event", null, "BonjourJMDNS");
                return;
            }
            Z7.b.g("Bonjour serviceResolved - " + cVar.getName(), "BonjourJMDNS");
            Kg.d dVarD = cVar.d();
            if (dVarD == null || (aVarJ = e.this.j(dVarD)) == null) {
                Z7.b.c("serviceResolved - parse failed", null, "BonjourJMDNS");
            } else {
                this.f42728b.h(new RxBonjour.b.a(aVarJ));
            }
        }
    }

    static final class m implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RxBonjour.a f42730b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f42731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RxBonjour.a f42732b;

            a(e eVar, RxBonjour.a aVar) {
                this.f42731a = eVar;
                this.f42732b = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(e eVar, final RxBonjour.a aVar, final Kg.a aVar2, InterfaceC5913c emitter) {
                AbstractC6492s.i(emitter, "emitter");
                final Kg.d dVarK = eVar.k(aVar);
                emitter.d(new InterfaceC6468e() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.n
                    @Override // kg.InterfaceC6468e
                    public final void cancel() {
                        e.m.a.e(aVar, aVar2, dVarK);
                    }
                });
                try {
                    Z7.b.g("registering service broadcast " + aVar, "BonjourJMDNS");
                    aVar2.m0(dVarK);
                    Z7.b.g("service broadcast REGISTERED " + aVar, "BonjourJMDNS");
                } catch (Throwable th2) {
                    emitter.c(new RxBonjour.Error.InternalError("addServiceListener FAILED", th2));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(RxBonjour.a aVar, Kg.a aVar2, Kg.d dVar) {
                try {
                    Z7.b.g("removing service broadcast " + aVar, "BonjourJMDNS");
                    aVar2.p0(dVar);
                } catch (Throwable th2) {
                    Z7.b.c("FAILED to remove serviceListener", th2, "BonjourJMDNS");
                }
            }

            @Override // kg.n
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(final Kg.a jmdns) {
                AbstractC6492s.i(jmdns, "jmdns");
                final e eVar = this.f42731a;
                final RxBonjour.a aVar = this.f42732b;
                return AbstractC5912b.r(new InterfaceC5915e() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.m
                    @Override // gg.InterfaceC5915e
                    public final void a(InterfaceC5913c interfaceC5913c) {
                        e.m.a.d(eVar, aVar, jmdns, interfaceC5913c);
                    }
                });
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42733a;

            b(b bVar) {
                this.f42733a = bVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f42733a.b();
            }
        }

        m(RxBonjour.a aVar) {
            this.f42730b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar) {
            bVar.c();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(final b manager) {
            AbstractC6492s.i(manager, "manager");
            return manager.a().t(new a(e.this, this.f42730b)).B(new b(manager)).w(new InterfaceC6464a() { // from class: com.ui.wifiman.model.discovery.engine.bonjour.l
                @Override // kg.InterfaceC6464a
                public final void run() {
                    e.m.c(manager);
                }
            });
        }
    }

    public e(Zc.f networkConnection, WifiManager wifiManager) throws SecurityException {
        AbstractC6492s.i(networkConnection, "networkConnection");
        AbstractC6492s.i(wifiManager, "wifiManager");
        this.f42699a = wifiManager;
        Logger logger = Logger.getLogger(Lg.c.class.getName());
        Level level = Level.OFF;
        logger.setLevel(level);
        Logger.getLogger(javax.jmdns.impl.constants.e.class.getName()).setLevel(level);
        Logger.getLogger(javax.jmdns.impl.constants.d.class.getName()).setLevel(level);
        Logger.getLogger(c.b.class.getName()).setLevel(level);
        this.f42700b = C6783c.f53633a.e(1, 3000L, "RxBonjour");
        gg.i iVarI2 = networkConnection.getState().x0(new j()).W().I1(k.f42725a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42701c = iVarI2;
        gg.i iVarI22 = iVarI2.N0(new h()).f0(i.f42723a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f42702d = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RxBonjour.a j(Kg.d dVar) {
        String strR;
        Map mapC = U.c();
        if (dVar.q().hasMoreElements()) {
            Enumeration enumerationQ = dVar.q();
            while (enumerationQ.hasMoreElements()) {
                String str = (String) enumerationQ.nextElement();
                if (str == null || t.m0(str)) {
                    str = null;
                }
                if (str != null && (strR = dVar.r(str)) != null) {
                    mapC.put(str, strR);
                }
            }
        }
        Map mapB = U.b(mapC);
        String strN = dVar.n();
        AbstractC6492s.h(strN, "getName(...)");
        String strA = dVar.A();
        AbstractC6492s.h(strA, "getType(...)");
        Set setB = d0.b();
        Inet4Address[] inet4AddressArrI = dVar.i();
        AbstractC6492s.h(inet4AddressArrI, "getInet4Addresses(...)");
        for (Inet4Address inet4Address : inet4AddressArrI) {
            AbstractC6492s.f(inet4Address);
            setB.add(inet4Address);
        }
        J j10 = J.f24997a;
        Set setA = d0.a(setB);
        Set setB2 = d0.b();
        Inet6Address[] inet6AddressArrK = dVar.k();
        AbstractC6492s.h(inet6AddressArrK, "getInet6Addresses(...)");
        for (Inet6Address inet6Address : inet6AddressArrK) {
            AbstractC6492s.f(inet6Address);
            setB2.add(inet6Address);
        }
        J j11 = J.f24997a;
        return new RxBonjour.a(strN, strA, mapB, setA, d0.a(setB2), dVar.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Kg.d k(RxBonjour.a aVar) {
        Kg.d dVarD = Kg.d.d(l(aVar.e()), aVar.b(), aVar.c(), 0, 0, true, aVar.d());
        AbstractC6492s.h(dVarD, "create(...)");
        return dVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l(String str) {
        if (t.B(str, ".local.", false, 2, null)) {
            return str;
        }
        return str + ".local.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(EnumC4076c enumC4076c) {
        int i10 = c.f42710a[enumC4076c.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Kg.e n(gg.h hVar) {
        return new l(hVar);
    }

    @Override // com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour
    public gg.i a() {
        gg.i iVarF0 = this.f42702d.X0(this.f42700b).I1(f.f42717a).g2(this.f42700b).a1().X0(Gg.a.a()).f0(g.f42721a);
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }

    @Override // com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour
    public gg.i b(String serviceType) {
        AbstractC6492s.i(serviceType, "serviceType");
        gg.i iVarF0 = this.f42702d.X0(this.f42700b).I1(new d(serviceType)).g2(this.f42700b).X0(this.f42700b).a1().X0(Gg.a.a()).f0(new C1400e(serviceType));
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }

    @Override // com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour
    public AbstractC5912b c(RxBonjour.a bs) {
        AbstractC6492s.i(bs, "bs");
        AbstractC5912b abstractC5912bL = this.f42702d.X0(this.f42700b).L1(new m(bs)).i0(this.f42700b).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }
}
