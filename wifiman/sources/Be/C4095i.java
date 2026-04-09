package be;

import Fd.D;
import Kd.a;
import b8.EnumC4076c;
import be.C4095i;
import be.InterfaceC4089c;
import ce.ApiNetworkWifimanDeviceInfo;
import com.ui.wifiman.model.teleport.TeleportConnection;
import fe.AbstractC5817h;
import gg.AbstractC5912b;
import gg.z;
import hg.InterfaceC6043c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6835l;

/* renamed from: be.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4095i implements InterfaceC4091e {

    /* renamed from: m, reason: collision with root package name */
    public static final a f33130m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4089c.a f33131a;

    /* renamed from: b, reason: collision with root package name */
    private final P7.a f33132b;

    /* renamed from: c, reason: collision with root package name */
    private final D f33133c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ui.wifiman.model.support.a f33134d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f33135e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f33136f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f33137g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f33138h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f33139i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f33140j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f33141k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f33142l;

    /* renamed from: be.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: be.i$b */
    static final class b implements n {

        /* renamed from: be.i$b$a */
        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f33144a = new a();

            a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("Unifi api check subscribed", null, 2, null);
            }
        }

        /* renamed from: be.i$b$b, reason: collision with other inner class name */
        static final class C1154b implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1154b f33145a = new C1154b();

            C1154b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(10000L, TimeUnit.MILLISECONDS);
            }
        }

        /* renamed from: be.i$b$c */
        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f33146a = new c();

            c() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("Unifi api check REPEATED subscribed", null, 2, null);
            }
        }

        /* renamed from: be.i$b$d */
        static final class d implements p {

            /* renamed from: a, reason: collision with root package name */
            public static final d f33147a = new d();

            d() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                return ((InterfaceC4089c) c6556a.a()) != null;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Z7.b.h("Unifi api check ended", null, 2, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return C4095i.this.n((InterfaceC4089c.b) c6556a.a()).n(a.f33144a).W().n1(C1154b.f33145a).g0(c.f33146a).Z(new InterfaceC6464a() { // from class: be.j
                @Override // kg.InterfaceC6464a
                public final void run() {
                    C4095i.b.c();
                }
            }).R1(d.f33147a);
        }
    }

    /* renamed from: be.i$c */
    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC4089c interfaceC4089c = (InterfaceC4089c) c6556a.a();
            C4095i.this.f33134d.b(new com.ui.wifiman.model.support.b(interfaceC4089c != null));
            Z7.b.h("Unifi API emission " + interfaceC4089c, null, 2, null);
        }
    }

    /* renamed from: be.i$d */
    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f33149a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.q());
        }
    }

    /* renamed from: be.i$e */
    static final class e implements n {

        /* renamed from: be.i$e$a */
        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f33151a = new a();

            a() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a, C6556a c6556a2) {
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(c6556a2, "<destruct>");
                InterfaceC4089c.b bVar = (InterfaceC4089c.b) c6556a.a();
                InterfaceC4089c.b bVar2 = (InterfaceC4089c.b) c6556a2.a();
                if (bVar == null) {
                    bVar = bVar2;
                }
                return new C6556a(bVar);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean apiEnabled) {
            AbstractC6492s.i(apiEnabled, "apiEnabled");
            Z7.b.h("Unifi API enabled " + apiEnabled, null, 2, null);
            if (apiEnabled.booleanValue()) {
                gg.i iVarV = gg.i.v(C4095i.this.f33136f, C4095i.this.f33135e, a.f33151a);
                AbstractC6492s.f(iVarV);
                return iVarV;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: be.i$f */
    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f33152a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Unifi API params emission " + it, null, 2, null);
        }
    }

    /* renamed from: be.i$g */
    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f33153a = new g();

        /* renamed from: be.i$g$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f33154a;

            static {
                int[] iArr = new int[EnumC4076c.values().length];
                try {
                    iArr[EnumC4076c.ETHERNET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4076c.WIFI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC4076c.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC4076c.MOBILE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC4076c.DISCONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f33154a = iArr;
            }
        }

        g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final l9.C6556a apply(Zc.e r5) {
            /*
                r4 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.AbstractC6492s.i(r5, r0)
                b8.c r0 = r5.g()
                int[] r1 = be.C4095i.g.a.f33154a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                r2 = 2
                r3 = 0
                if (r0 == r1) goto L2a
                if (r0 == r2) goto L2a
                r5 = 3
                if (r0 == r5) goto L28
                r5 = 4
                if (r0 == r5) goto L28
                r5 = 5
                if (r0 != r5) goto L22
                goto L28
            L22:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L28:
                r5 = r3
                goto L3a
            L2a:
                Zc.e$a r5 = r5.b()
                if (r5 == 0) goto L28
                inet.ipaddr.g r5 = r5.a()
                if (r5 == 0) goto L28
                java.lang.String r5 = r5.toString()
            L3a:
                if (r5 == 0) goto L43
                be.c$b r0 = new be.c$b
                r1 = 0
                r0.<init>(r5, r1, r2, r3)
                r3 = r0
            L43:
                l9.a r5 = new l9.a
                r5.<init>(r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: be.C4095i.g.apply(Zc.e):l9.a");
        }
    }

    /* renamed from: be.i$h */
    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f33155a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(TeleportConnection.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof TeleportConnection.a.b.C1440a);
        }
    }

    /* renamed from: be.i$i, reason: collision with other inner class name */
    static final class C1155i implements n {

        /* renamed from: be.i$i$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f33157a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                Kd.a aVarA;
                a.C0428a c0428aC;
                String strJ;
                AbstractC6492s.i(c6556a, "<destruct>");
                com.ui.wifiman.model.teleport.n nVar = (com.ui.wifiman.model.teleport.n) c6556a.a();
                InterfaceC4089c.b bVar = null;
                if (nVar != null && (aVarA = nVar.a()) != null && (c0428aC = aVarA.c()) != null && (strJ = c0428aC.j()) != null) {
                    bVar = new InterfaceC4089c.b(strJ, 0, 2, null);
                }
                return new C6556a(bVar);
            }
        }

        C1155i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean tunnelConnected) {
            AbstractC6492s.i(tunnelConnected, "tunnelConnected");
            if (tunnelConnected.booleanValue()) {
                gg.i iVarN0 = C4095i.this.f33133c.a().N0(a.f33157a);
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: be.i$j */
    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4089c f33158a;

        j(InterfaceC4089c interfaceC4089c) {
            this.f33158a = interfaceC4089c;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(ApiNetworkWifimanDeviceInfo it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(this.f33158a);
        }
    }

    /* renamed from: be.i$k */
    static final class k implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f33159a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            return new C6556a((ApiNetworkWifimanDeviceInfo) bVar.a());
        }
    }

    /* renamed from: be.i$l */
    static final class l implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f33160a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            return Boolean.valueOf(((ApiNetworkWifimanDeviceInfo) bVar.a()) != null);
        }
    }

    /* renamed from: be.i$m */
    static final class m implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f33161a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            return new C6556a((List) bVar.a());
        }
    }

    public C4095i(Zc.f networkConnectionManager, InterfaceC4089c.a apiFactory, P7.a analytics, TeleportConnection teleportConnection, D teleportManager, com.ui.wifiman.model.support.a supportFileDataCollector) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(apiFactory, "apiFactory");
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(teleportConnection, "teleportConnection");
        AbstractC6492s.i(teleportManager, "teleportManager");
        AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
        this.f33131a = apiFactory;
        this.f33132b = analytics;
        this.f33133c = teleportManager;
        this.f33134d = supportFileDataCollector;
        gg.i iVarW = networkConnectionManager.getState().N0(g.f33153a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f33135e = iVarW;
        gg.i iVarW2 = teleportConnection.getState().N0(h.f33155a).W().I1(new C1155i()).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f33136f = iVarW2;
        gg.i iVarI2 = com.ubnt.usurvey.a.f39654r.a().b().N0(d.f33149a).W().I1(new e()).W().f0(f.f33152a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f33137g = iVarI2;
        gg.i iVarW3 = iVarI2.I1(new b()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        gg.i iVarI22 = n9.c.c(iVarW3, new InterfaceC6835l() { // from class: be.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C4095i.m(this.f33129a, (C6556a) obj);
            }
        }).f0(new c()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f33138h = iVarI22;
        gg.i iVarI23 = AbstractC5817h.m(c(), 1000L, new InterfaceC6835l() { // from class: be.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C4095i.q((InterfaceC4089c) obj);
            }
        }).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f33139i = iVarI23;
        gg.i iVarN0 = AbstractC5817h.h(iVarI23, false, 1, null).N0(k.f33159a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f33140j = iVarN0;
        gg.i iVarN02 = AbstractC5817h.g(iVarI23, false).N0(l.f33160a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f33141k = iVarN02;
        gg.i iVarI24 = AbstractC5817h.l(c(), 1000L, false, new InterfaceC6835l() { // from class: be.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C4095i.p((InterfaceC4089c) obj);
            }
        }, 2, null).N0(m.f33161a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f33142l = iVarI24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b m(C4095i c4095i, C6556a c6556a) {
        AbstractC6492s.i(c6556a, "<destruct>");
        if (((InterfaceC4089c) c6556a.a()) != null) {
            return c4095i.o();
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.f(abstractC5912bM);
        return abstractC5912bM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z n(InterfaceC4089c.b bVar) {
        InterfaceC4089c interfaceC4089cA;
        z zVarH;
        if (bVar != null && (interfaceC4089cA = this.f33131a.a(bVar)) != null && (zVarH = interfaceC4089cA.a().A(new j(interfaceC4089cA)).H(new C6556a(null))) != null) {
            return zVarH;
        }
        z zVarZ = z.z(new C6556a(null));
        AbstractC6492s.h(zVarZ, "just(...)");
        return zVarZ;
    }

    private final AbstractC5912b o() {
        return this.f33132b.d(new P7.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z p(InterfaceC4089c it) {
        AbstractC6492s.i(it, "it");
        return it.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z q(InterfaceC4089c it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    @Override // be.InterfaceC4091e
    public gg.i a() {
        return this.f33140j;
    }

    @Override // be.InterfaceC4091e
    public gg.i b() {
        return this.f33142l;
    }

    @Override // be.InterfaceC4091e
    public gg.i c() {
        return this.f33138h;
    }

    @Override // be.InterfaceC4091e
    public gg.i d() {
        return this.f33141k;
    }
}
