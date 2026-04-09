package re;

import Zg.AbstractC3689v;
import Zg.d0;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wmw.WMWizard;
import com.ui.wmw.wifi.a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6835l;
import re.C7594g;
import re.InterfaceC7588a;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: re.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7594g implements InterfaceC7590c {

    /* renamed from: k, reason: collision with root package name */
    public static final a f60350k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f60351a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f60352b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f60353c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f60354d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f60355e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f60356f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f60357g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5912b f60358h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f60359i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5912b f60360j;

    /* renamed from: re.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: re.g$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f60361a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            a.InterfaceC1679a interfaceC1679aD;
            gg.i iVarB;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wmw.g gVar = (com.ui.wmw.g) c6556a.a();
            return (gVar == null || (interfaceC1679aD = gVar.d()) == null || (iVarB = interfaceC1679aD.b()) == null) ? gg.i.K0(d0.e()) : iVarB;
        }
    }

    /* renamed from: re.g$c */
    static final class c implements kg.n {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(C7594g c7594g, com.ui.wmw.wifi.a it) {
            AbstractC6492s.i(it, "it");
            return AbstractC6492s.d(it.n(), c7594g.f());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC7588a.C2110a e(com.ui.wmw.wifi.a it) {
            AbstractC6492s.i(it, "it");
            return new InterfaceC7588a.C2110a(it.c(), it.a(), it.d());
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Set apply(Collection scanResults) {
            AbstractC6492s.i(scanResults, "scanResults");
            InterfaceC8780j interfaceC8780jD0 = AbstractC3689v.d0(scanResults);
            final C7594g c7594g = C7594g.this;
            return AbstractC8783m.b0(AbstractC8783m.N(AbstractC8783m.C(interfaceC8780jD0, new InterfaceC6835l() { // from class: re.h
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C7594g.c.d(c7594g, (com.ui.wmw.wifi.a) obj));
                }
            }), new InterfaceC6835l() { // from class: re.i
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C7594g.c.e((com.ui.wmw.wifi.a) obj);
                }
            }));
        }
    }

    /* renamed from: re.g$d */
    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f60363a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(Set cache, Set aps) {
            AbstractC6492s.i(cache, "cache");
            AbstractC6492s.i(aps, "aps");
            synchronized (cache) {
                cache.addAll(aps);
            }
            return cache;
        }
    }

    /* renamed from: re.g$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f60364a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(Set cache) {
            Set setA;
            AbstractC6492s.i(cache, "cache");
            synchronized (cache) {
                Set setB = d0.b();
                setB.addAll(cache);
                setA = d0.a(setB);
            }
            return setA;
        }
    }

    /* renamed from: re.g$f */
    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f60365a = new f();

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(InterfaceC7588a.C2110a it) {
            AbstractC6492s.i(it, "it");
            return it.b().toString();
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("APCompare - APs to compare (" + it.size() + "): " + AbstractC3689v.z0(it, ", ", null, null, 0, null, new InterfaceC6835l() { // from class: re.j
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C7594g.f.c((InterfaceC7588a.C2110a) obj);
                }
            }, 30, null), null, 2, null);
        }
    }

    /* renamed from: re.g$g, reason: collision with other inner class name */
    static final class C2114g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2114g f60366a = new C2114g();

        C2114g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int c(InterfaceC7588a.C2110a it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set apply(Set aps) {
            AbstractC6492s.i(aps, "aps");
            return AbstractC8783m.b0(AbstractC8783m.N(AbstractC3689v.d0(aps), new InterfaceC6835l() { // from class: re.k
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(C7594g.C2114g.c((InterfaceC7588a.C2110a) obj));
                }
            }));
        }
    }

    /* renamed from: re.g$h */
    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final h f60367a = new h();

        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("APCompare - Priority channels: " + AbstractC3689v.z0(it, ", ", null, null, 0, null, null, 62, null), null, 2, null);
        }
    }

    /* renamed from: re.g$i */
    public static final class i implements InterfaceC5915e {
        public i() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C7594g.this.f60353c.h(d0.e());
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: re.g$j */
    public static final class j implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f60370b;

        public j(Set set) {
            this.f60370b = set;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C7594g.this.f60353c.h(this.f60370b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: re.g$k */
    static final class k implements InterfaceC6469f {
        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            C7594g.this.f60352b.h(Boolean.TRUE);
            Z7.b.h("APCompare - IN FOREGROUND", null, 2, null);
        }
    }

    /* renamed from: re.g$l */
    static final class l implements kg.n {

        /* renamed from: re.g$l$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7594g f60373a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wmw.g f60374b;

            /* renamed from: re.g$l$a$a, reason: collision with other inner class name */
            static final class C2115a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wmw.g f60375a;

                /* renamed from: re.g$l$a$a$a, reason: collision with other inner class name */
                static final class C2116a implements InterfaceC6469f {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Set f60376a;

                    C2116a(Set set) {
                        this.f60376a = set;
                    }

                    @Override // kg.InterfaceC6469f
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final void accept(InterfaceC6043c it) {
                        AbstractC6492s.i(it, "it");
                        Set set = this.f60376a;
                        AbstractC6492s.f(set);
                        Z7.b.h("APCompare - Requesting priority channels: [" + AbstractC3689v.z0(set, ", ", null, null, 0, null, null, 62, null) + "] - SUBSCRIBED", null, 2, null);
                    }
                }

                C2115a(com.ui.wmw.g gVar) {
                    this.f60375a = gVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c(Set set) {
                    AbstractC6492s.f(set);
                    Z7.b.h("APCompare - Requesting priority channels: [" + AbstractC3689v.z0(set, ", ", null, null, 0, null, null, 62, null) + "] - FINISHED", null, 2, null);
                }

                @Override // kg.n
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final gg.f apply(final Set priorityChannels) {
                    AbstractC6492s.i(priorityChannels, "priorityChannels");
                    return this.f60375a.d().c(priorityChannels).B(new C2116a(priorityChannels)).x(new InterfaceC6464a() { // from class: re.m
                        @Override // kg.InterfaceC6464a
                        public final void run() {
                            C7594g.l.a.C2115a.c(priorityChannels);
                        }
                    });
                }
            }

            /* renamed from: re.g$l$a$b */
            static final class b implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final b f60377a = new b();

                b() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    Z7.b.h("APCompare - Requesting to clear priority channels - SUBSCRIBED", null, 2, null);
                }
            }

            a(C7594g c7594g, com.ui.wmw.g gVar) {
                this.f60373a = c7594g;
                this.f60374b = gVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c() {
                Z7.b.h("APCompare - Requesting to clear priority channels - FINISHED", null, 2, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Boolean inForeground) {
                AbstractC6492s.i(inForeground, "inForeground");
                return inForeground.booleanValue() ? this.f60373a.f60356f.L1(new C2115a(this.f60374b)) : this.f60374b.d().c(d0.e()).B(b.f60377a).x(new InterfaceC6464a() { // from class: re.l
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        C7594g.l.a.c();
                    }
                });
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wmw.g gVar = (com.ui.wmw.g) c6556a.a();
            return gVar != null ? C7594g.this.f60352b.e1().Y0(Gg.a.a(), false, 1).L1(new a(C7594g.this, gVar)) : AbstractC5912b.m();
        }
    }

    /* renamed from: re.g$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f60378a = new m();

        /* renamed from: re.g$m$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60379a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof WMWizard.Error ? gg.i.d2(5000L, TimeUnit.MILLISECONDS) : gg.i.k0(error);
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f60379a);
        }
    }

    /* renamed from: re.g$n */
    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f60380a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                return new C6556a(((WifimanWizard.a.AbstractC1520a.C1521a) state).b());
            }
            if ((state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d) || (state instanceof WifimanWizard.a.b) || (state instanceof WifimanWizard.a.c)) {
                return new C6556a(null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C7594g(String ssid, WifimanWizard wizard) {
        AbstractC6492s.i(ssid, "ssid");
        AbstractC6492s.i(wizard, "wizard");
        this.f60351a = ssid;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f60352b = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(d0.e());
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f60353c = aVarK22;
        gg.i iVarI2 = wizard.getState().N0(n.f60380a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f60354d = iVarI2;
        gg.i iVarI22 = aVarK22.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f60355e = iVarI22;
        gg.i iVarI23 = b().N0(C2114g.f60366a).W().f0(h.f60367a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f60356f = iVarI23;
        gg.i iVarI24 = iVarI2.I1(b.f60361a).N0(new c()).q1(new LinkedHashSet(), d.f60363a).N0(e.f60364a).W().f0(f.f60365a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f60357g = iVarI24;
        AbstractC5912b abstractC5912bE0 = AbstractC5912b.r(new InterfaceC5915e() { // from class: re.d
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                C7594g.o(interfaceC5913c);
            }
        }).B(new k()).w(new InterfaceC6464a() { // from class: re.e
            @Override // kg.InterfaceC6464a
            public final void run() {
                C7594g.p(this.f60349a);
            }
        }).c0().F1(Gg.a.a()).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f60358h = abstractC5912bE0;
        AbstractC5912b abstractC5912bQ = iVarI2.L1(new l()).Q(m.f60378a);
        AbstractC6492s.h(abstractC5912bQ, "retryWhen(...)");
        this.f60359i = abstractC5912bQ;
        AbstractC5912b abstractC5912bE02 = AbstractC5912b.I(c().E0(), abstractC5912bQ).c0().o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE02, "ignoreElements(...)");
        this.f60360j = abstractC5912bE02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n() {
        Z7.b.h("APCompare - RESET", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(InterfaceC5913c it) {
        AbstractC6492s.i(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(C7594g c7594g) {
        c7594g.f60352b.h(Boolean.FALSE);
        Z7.b.h("APCompare - IN BACKGROUND", null, 2, null);
    }

    @Override // re.InterfaceC7590c
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new i());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bX = abstractC5912bR.x(new InterfaceC6464a() { // from class: re.f
            @Override // kg.InterfaceC6464a
            public final void run() {
                C7594g.n();
            }
        });
        AbstractC6492s.h(abstractC5912bX, "doOnComplete(...)");
        return abstractC5912bX;
    }

    @Override // re.InterfaceC7590c
    public gg.i b() {
        return this.f60355e;
    }

    @Override // re.InterfaceC7590c
    public gg.i c() {
        return this.f60357g;
    }

    @Override // re.InterfaceC7590c
    public AbstractC5912b d() {
        return this.f60358h;
    }

    @Override // re.InterfaceC7590c
    public AbstractC5912b e() {
        return this.f60360j;
    }

    @Override // re.InterfaceC7590c
    public String f() {
        return this.f60351a;
    }

    @Override // re.InterfaceC7590c
    public AbstractC5912b g(Set aps) {
        AbstractC6492s.i(aps, "aps");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new j(aps));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }
}
