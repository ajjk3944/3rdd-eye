package Cd;

import Cd.f;
import Cd.g;
import Ka.f;
import Qc.a;
import Zg.AbstractC3689v;
import com.ui.speedtest.UiSpeedtestLib;
import com.ui.wifiman.model.speedtest.Speedtest;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import inet.ipaddr.ipv4.C6180b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import td.InterfaceC8082d;

/* loaded from: classes4.dex */
public final class g implements Cd.f {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2566k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private f.a f2567a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f2568b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f2569c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentLinkedQueue f2570d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f2571e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f2572f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f2573g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f2574h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f2575i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5912b f2576j;

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
            private final C6180b f2577a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6180b speedtestIP) {
                super(null);
                AbstractC6492s.i(speedtestIP, "speedtestIP");
                this.f2577a = speedtestIP;
            }

            public final C6180b a() {
                return this.f2577a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f2577a, ((a) obj).f2577a);
            }

            public int hashCode() {
                return this.f2577a.hashCode();
            }

            public String toString() {
                return "Available(speedtestIP=" + this.f2577a + ")";
            }
        }

        /* renamed from: Cd.g$b$b, reason: collision with other inner class name */
        public static final class C0127b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0127b f2578a = new C0127b();

            private C0127b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0127b);
            }

            public int hashCode() {
                return 1784963418;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<unused var>");
            ConcurrentLinkedQueue concurrentLinkedQueue = g.this.f2570d;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(concurrentLinkedQueue, 10));
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                arrayList.add((Wc.c) it.next());
            }
            return arrayList;
        }
    }

    public static final class d implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(com.ubnt.usurvey.a.f39654r.a().getConfig().j()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Dc.e f2580a;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2581a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b apply(Map results) {
                Object next;
                AbstractC6492s.i(results, "results");
                Iterator it = results.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Dc.j jVar = (Dc.j) next;
                    if (jVar.C() != null && jVar.J() != null) {
                        break;
                    }
                }
                Dc.j jVar2 = (Dc.j) next;
                if (jVar2 != null) {
                    a.b bVarJ = jVar2.J();
                    C6180b c6180bD = bVarJ != null ? bVarJ.d() : null;
                    if (c6180bD != null) {
                        return new b.a(c6180bD);
                    }
                }
                return b.C0127b.f2578a;
            }
        }

        e(Dc.e eVar) {
            this.f2580a = eVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            if (enabled.booleanValue()) {
                gg.i iVarN0 = this.f2580a.b().e1().N0(a.f2581a);
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(b.C0127b.f2578a);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2582a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Infinite speedtest params " + it, null, 2, null);
        }
    }

    /* renamed from: Cd.g$g, reason: collision with other inner class name */
    static final class C0128g implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final C0128g f2583a = new C0128g();

        C0128g() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f.a a(b params, C6556a latestSpeed, Boolean started) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(latestSpeed, "latestSpeed");
            AbstractC6492s.i(started, "started");
            boolean z10 = params instanceof b.a;
            if (!z10 || !started.booleanValue()) {
                return z10 ? new f.a.AbstractC0125a.C0126a(((b.a) params).a()) : f.a.b.f2565a;
            }
            C6180b c6180bA = ((b.a) params).a();
            Long l10 = (Long) latestSpeed.b();
            return new f.a.AbstractC0125a.b(c6180bA, l10 != null ? W7.a.f23676b.b(l10.longValue()) : null);
        }
    }

    static final class h implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2585a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Speedtest.a.b apply(Ka.c status) {
                AbstractC6492s.i(status, "status");
                return td.h.a(status);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f2586a;

            b(g gVar) {
                this.f2586a = gVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Speedtest.a.b it) {
                AbstractC6492s.i(it, "it");
                this.f2586a.f2568b.h(new C6556a(Long.valueOf(it.a())));
                this.f2586a.h(it.a());
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f2587a;

            c(g gVar) {
                this.f2587a = gVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("Infinite speedtest subscribed", null, 2, null);
                this.f2587a.f2569c.h(Boolean.TRUE);
            }
        }

        static final class d implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f2588a = new d();

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final a f2589a = new a();

                a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    return error instanceof UiSpeedtestLib.Error ? gg.i.d2(1000L, TimeUnit.MILLISECONDS) : gg.i.k0(error);
                }
            }

            d() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(a.f2589a);
            }
        }

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(g gVar) {
            Z7.b.h("Infinite speedtest disposed", null, 2, null);
            gVar.f2569c.h(Boolean.FALSE);
            gVar.f2568b.h(new C6556a(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(g gVar) {
            gVar.f2570d.clear();
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(b params) {
            AbstractC6492s.i(params, "params");
            if (!(params instanceof b.a)) {
                if (params instanceof b.C0127b) {
                    return AbstractC5912b.m();
                }
                throw new NoWhenBranchMatchedException();
            }
            f.a aVar = g.this.f2567a;
            String strA0 = ((b.a) params).a().a0();
            AbstractC6492s.h(strA0, "toNormalizedString(...)");
            gg.i iVarG0 = Qi.i.c(aVar.a(new f.c.b(strA0, 8901, 40, true, null)), null, 1, null).N0(a.f2585a).f0(new b(g.this)).g0(new c(g.this));
            final g gVar = g.this;
            gg.i iVarP1 = iVarG0.Z(new InterfaceC6464a() { // from class: Cd.h
                @Override // kg.InterfaceC6464a
                public final void run() {
                    g.h.d(gVar);
                }
            }).p1(d.f2588a);
            final g gVar2 = g.this;
            return iVarP1.Z(new InterfaceC6464a() { // from class: Cd.i
                @Override // kg.InterfaceC6464a
                public final void run() {
                    g.h.e(gVar2);
                }
            }).E0();
        }
    }

    public g(Dc.e networkDiscovery, InterfaceC8082d speedtestApiFactory) {
        AbstractC6492s.i(networkDiscovery, "networkDiscovery");
        AbstractC6492s.i(speedtestApiFactory, "speedtestApiFactory");
        this.f2567a = speedtestApiFactory.a();
        Fg.a aVarK2 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f2568b = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f2569c = aVarK22;
        this.f2570d = new ConcurrentLinkedQueue();
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2571e = iVarI2;
        gg.i iVarI22 = aVarK22.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f2572f = iVarI22;
        z zVarI = z.i(new d());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI23 = zVarI.w(new e(networkDiscovery)).W().f0(f.f2582a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f2573g = iVarI23;
        gg.i iVarI24 = gg.i.u(iVarI23, iVarI2, iVarI22, C0128g.f2583a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f2574h = iVarI24;
        gg.i iVarI25 = iVarI2.N0(new c()).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f2575i = iVarI25;
        AbstractC5912b abstractC5912bF0 = iVarI23.L1(new h()).f0().x0(1).l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f2576j = abstractC5912bF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f2570d.add(new Wc.c(jCurrentTimeMillis, Long.valueOf(j10)));
        while (true) {
            Object objPeek = this.f2570d.peek();
            AbstractC6492s.f(objPeek);
            if (((Wc.c) objPeek).c() >= jCurrentTimeMillis - 35000) {
                return;
            } else {
                this.f2570d.poll();
            }
        }
    }

    @Override // Cd.f
    public AbstractC5912b a() {
        return this.f2576j;
    }

    @Override // Cd.f
    public gg.i b() {
        return this.f2575i;
    }

    @Override // Cd.f
    public gg.i getState() {
        return this.f2574h;
    }
}
