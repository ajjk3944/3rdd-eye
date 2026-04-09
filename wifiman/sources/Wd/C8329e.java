package wd;

import Sd.d;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import com.ui.wifiman.model.speedtest.Speedtest;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jd.C6292a;
import jd.InterfaceC6293b;
import ke.AbstractC6456a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import wd.C8329e;
import wd.InterfaceC8330f;
import xd.C8450a;
import xd.C8452c;
import xd.C8453d;
import xd.C8458i;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: wd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8329e implements InterfaceC8330f {

    /* renamed from: a, reason: collision with root package name */
    private final C8450a f64875a;

    /* renamed from: b, reason: collision with root package name */
    private final C8458i f64876b;

    /* renamed from: c, reason: collision with root package name */
    private final C8453d f64877c;

    /* renamed from: d, reason: collision with root package name */
    private final Sd.d f64878d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6293b f64879e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6586g f64880f;

    /* renamed from: wd.e$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64881a = new a();

        /* renamed from: wd.e$a$a, reason: collision with other inner class name */
        public static final class C2298a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((C6588i) obj2).f().a(), ((C6588i) obj).f().a());
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(C6588i it) {
            AbstractC6492s.i(it, "it");
            return it.m() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List signals) {
            AbstractC6492s.i(signals, "signals");
            return new C6556a(AbstractC8783m.T(AbstractC8783m.C(AbstractC3689v.d0(signals), new InterfaceC6835l() { // from class: wd.d
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C8329e.a.c((C6588i) obj));
                }
            }), new C2298a()));
        }
    }

    /* renamed from: wd.e$b */
    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f64882a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Could not get console information", null, null, 6, null);
            return z.z(new C6556a(null));
        }
    }

    /* renamed from: wd.e$c */
    static final class c implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f64883a = new c();

        c() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C8452c a(C6556a c6556a, C6556a c6556a2, C6556a c6556a3) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(c6556a3, "<destruct>");
            return new C8452c((C6292a.b) c6556a.a(), (InterfaceC8780j) c6556a2.a(), (d.b) c6556a3.a());
        }
    }

    /* renamed from: wd.e$d */
    static final class d implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final d f64884a = new d();

        d() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f a(C6556a c6556a, C6556a unifiResultId, C6556a serverId) {
            AbstractC6492s.i(c6556a, "<unused var>");
            AbstractC6492s.i(unifiResultId, "unifiResultId");
            AbstractC6492s.i(serverId, "serverId");
            return new Speedtest.f.a.c(new InterfaceC8330f.b((String) serverId.b(), (String) unifiResultId.b()));
        }
    }

    /* renamed from: wd.e$e, reason: collision with other inner class name */
    static final class C2299e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2299e f64885a = new C2299e();

        /* renamed from: wd.e$e$a */
        public static final class a implements C {
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(new Speedtest.f.a.c(new InterfaceC8330f.b(null, null)));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        C2299e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            Z7.b.j("Result reporting failed", error, null, 4, null);
            z zVarI = z.i(new a());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    /* renamed from: wd.e$f */
    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f64886a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Speedtest report - Analytics failed", it, null, 4, null);
        }
    }

    /* renamed from: wd.e$g */
    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f64887a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C8450a.C2315a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(null);
        }
    }

    /* renamed from: wd.e$h */
    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f64888a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C8458i.a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.a());
        }
    }

    /* renamed from: wd.e$i */
    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f64889a = new i();

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Speedtest report - Unifi failed", it, null, 4, null);
        }
    }

    /* renamed from: wd.e$j */
    static final class j implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8330f.a f64891b;

        j(InterfaceC8330f.a aVar) {
            this.f64891b = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C8452c consoleReportInfo) {
            AbstractC6492s.i(consoleReportInfo, "consoleReportInfo");
            return C8329e.this.f64877c.g(this.f64891b.a(), consoleReportInfo);
        }
    }

    /* renamed from: wd.e$k */
    static final class k implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f64892a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C8453d.a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.a());
        }
    }

    /* renamed from: wd.e$l */
    static final class l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final l f64893a = new l();

        l() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Speedtest report - Directory server failed", it, null, 4, null);
        }
    }

    public C8329e(C8450a analyticsService, C8458i unifiService, C8453d speedtestNetworkService, Sd.d localConsoleService, InterfaceC6293b topology, InterfaceC6586g wifiScannerService) {
        AbstractC6492s.i(analyticsService, "analyticsService");
        AbstractC6492s.i(unifiService, "unifiService");
        AbstractC6492s.i(speedtestNetworkService, "speedtestNetworkService");
        AbstractC6492s.i(localConsoleService, "localConsoleService");
        AbstractC6492s.i(topology, "topology");
        AbstractC6492s.i(wifiScannerService, "wifiScannerService");
        this.f64875a = analyticsService;
        this.f64876b = unifiService;
        this.f64877c = speedtestNetworkService;
        this.f64878d = localConsoleService;
        this.f64879e = topology;
        this.f64880f = wifiScannerService;
    }

    private final z f() {
        z zVarD0 = z.d0(this.f64879e.c().o0(), this.f64880f.b().N0(a.f64881a).o0(), this.f64878d.c().o0().F(b.f64882a), c.f64883a);
        AbstractC6492s.h(zVarD0, "zip(...)");
        return zVarD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6556a g(Throwable it) {
        AbstractC6492s.i(it, "it");
        return new C6556a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6556a h(Throwable it) {
        AbstractC6492s.i(it, "it");
        return new C6556a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6556a i(Throwable it) {
        AbstractC6492s.i(it, "it");
        return new C6556a(null);
    }

    @Override // wd.InterfaceC8330f
    public gg.i a(InterfaceC8330f.a params) {
        AbstractC6492s.i(params, "params");
        gg.i iVarZ1 = z.d0(this.f64875a.f(params.a(), null).m(f.f64886a).A(g.f64887a).G(new n() { // from class: wd.a
            @Override // kg.n
            public final Object apply(Object obj) {
                return C8329e.g((Throwable) obj);
            }
        }), this.f64876b.a(params.a(), null).A(h.f64888a).m(i.f64889a).G(new n() { // from class: wd.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return C8329e.h((Throwable) obj);
            }
        }), f().s(new j(params)).A(k.f64892a).m(l.f64893a).G(new n() { // from class: wd.c
            @Override // kg.n
            public final Object apply(Object obj) {
                return C8329e.i((Throwable) obj);
            }
        }), d.f64884a).Q(params.b(), TimeUnit.MILLISECONDS).F(C2299e.f64885a).W().z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }
}
