package z7;

import android.net.wifi.WifiManager;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.net.DatagramPacket;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o7.InterfaceC7096b;
import p7.C7236a;
import p7.InterfaceC7237b;
import s7.C7920g;
import u7.AbstractC8138a;
import x7.AbstractC8424a;
import z7.g;

/* loaded from: classes3.dex */
public final class g extends AbstractC8138a {

    /* renamed from: a, reason: collision with root package name */
    private final String f67076a;

    /* renamed from: b, reason: collision with root package name */
    private final List f67077b;

    /* renamed from: c, reason: collision with root package name */
    private final A7.d f67078c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f67079d;

    /* renamed from: e, reason: collision with root package name */
    private final x f67080e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f67081f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f67082g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC7237b f67083h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f67084i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f67085j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f67086k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC5912b f67087l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f67088m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f67089n;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f67090a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "BROADCAST DISCOVERY - multicast lock acquired";
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67091a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "BROADCAST DISCOVERY - multicast lock released";
        }
    }

    static final class c implements kg.n {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(final g this$0, z result, InterfaceC5913c it) {
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(result, "$result");
            AbstractC6492s.i(it, "it");
            this$0.l().c(result.a());
            it.d(new InterfaceC6468e() { // from class: z7.i
                @Override // kg.InterfaceC6468e
                public final void cancel() {
                    g.c.e(this$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(g this$0) {
            AbstractC6492s.i(this$0, "this$0");
            this$0.l().e();
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(final z result) {
            AbstractC6492s.i(result, "result");
            if (result.a() == null) {
                return AbstractC5912b.m();
            }
            final g gVar = g.this;
            return AbstractC5912b.r(new InterfaceC5915e() { // from class: z7.h
                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    g.c.d(gVar, result, interfaceC5913c);
                }
            });
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f67093a = new d();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f67094a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BROADCAST DISCOVERY - subscribed sender";
            }
        }

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            AbstractC8424a.c(a.f67094a);
        }
    }

    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(z result) {
            AbstractC6492s.i(result, "result");
            if (result.a() != null) {
                return q.f67125a.a(result.a(), g.this.f67083h).a();
            }
            gg.i iVarJ0 = gg.i.j0();
            AbstractC6492s.h(iVarJ0, "{\n                    Fl…empty()\n                }");
            return iVarJ0;
        }
    }

    static final class f implements kg.n {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f67097a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "error when parsing packet";
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(DatagramPacket it) {
            AbstractC6492s.i(it, "it");
            try {
                C7920g c7920gB = g.this.f67078c.b(it);
                if (c7920gB != null) {
                    return gg.n.o(c7920gB);
                }
            } catch (Exception e10) {
                AbstractC8424a.b(a.f67097a, e10);
            }
            return gg.n.h();
        }
    }

    /* renamed from: z7.g$g, reason: collision with other inner class name */
    static final class C2382g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2382g f67098a = new C2382g();

        /* renamed from: z7.g$g$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f67099a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BROADCAST DISCOVERY - subscribed observer";
            }
        }

        C2382g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            AbstractC8424a.c(a.f67099a);
        }
    }

    static final class h implements kg.n {
        h() {
        }

        public final Dj.a a(boolean z10) {
            return g.this.f67086k;
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {
        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return new w(g.this.k(), g.this.f67083h.a());
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.i invoke() {
            gg.i iVarI2 = InterfaceC8714a.f67062a.a(g.this.o()).a(g.this.p()).O(500L, TimeUnit.MILLISECONDS).o1(1).i2();
            AbstractC6492s.h(iVarI2, "AndroidNetworkManager.ne…)\n            .refCount()");
            return iVarI2;
        }
    }

    public /* synthetic */ g(String str, List list, A7.d dVar, Integer num, x xVar, InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC7237b interfaceC7237b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, dVar, (i10 & 8) != 0 ? null : num, xVar, interfaceC6835l, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? new C7236a() : interfaceC7237b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(g this$0, gg.j emitter) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(emitter, "emitter");
        final N n10 = new N();
        if (this$0.f67082g) {
            try {
                WifiManager.MulticastLock multicastLockCreateMulticastLock = this$0.m().c().createMulticastLock(o7.o.f55558a.b());
                multicastLockCreateMulticastLock.setReferenceCounted(true);
                multicastLockCreateMulticastLock.acquire();
                n10.f51689a = multicastLockCreateMulticastLock;
                AbstractC8424a.c(a.f67090a);
                emitter.h(Boolean.TRUE);
            } catch (SecurityException unused) {
                emitter.c(new IllegalStateException("Insufficient permissions to acquire Multicast lock. " + this$0.f67076a + " Discovery Server needs to set Multicast to work reliably. Make sure you specified 'android.permission.CHANGE_WIFI_MULTICAST_STATE' permission in app manifest."));
            } catch (Throwable th2) {
                emitter.c(th2);
            }
        } else {
            emitter.h(Boolean.FALSE);
        }
        emitter.d(new InterfaceC6468e() { // from class: z7.f
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                g.j(n10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(N multicastLock) {
        AbstractC6492s.i(multicastLock, "$multicastLock");
        WifiManager.MulticastLock multicastLock2 = (WifiManager.MulticastLock) multicastLock.f51689a;
        if (multicastLock2 != null) {
            multicastLock2.release();
        }
        AbstractC8424a.c(b.f67091a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w l() {
        return (w) this.f67085j.getValue();
    }

    private final InterfaceC7096b m() {
        return o7.o.f55558a.c();
    }

    private final gg.i n() {
        return (gg.i) this.f67084i.getValue();
    }

    @Override // u7.AbstractC8138a
    public InterfaceC6835l a() {
        return this.f67081f;
    }

    @Override // u7.AbstractC8138a
    public gg.i b() {
        return this.f67089n;
    }

    public final List k() {
        return this.f67077b;
    }

    public final x o() {
        return this.f67080e;
    }

    public final Integer p() {
        return this.f67079d;
    }

    public g(String name, List packets, A7.d packetParser, Integer num, x socketFactory, InterfaceC6835l resultTtlMs, boolean z10, InterfaceC7237b schedulerProvider) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(packets, "packets");
        AbstractC6492s.i(packetParser, "packetParser");
        AbstractC6492s.i(socketFactory, "socketFactory");
        AbstractC6492s.i(resultTtlMs, "resultTtlMs");
        AbstractC6492s.i(schedulerProvider, "schedulerProvider");
        this.f67076a = name;
        this.f67077b = packets;
        this.f67078c = packetParser;
        this.f67079d = num;
        this.f67080e = socketFactory;
        this.f67081f = resultTtlMs;
        this.f67082g = z10;
        this.f67083h = schedulerProvider;
        this.f67084i = Yg.n.b(new j());
        this.f67085j = Yg.n.b(new i());
        gg.i iVarG0 = n().I1(new e()).v0(new f()).g0(C2382g.f67098a);
        AbstractC6492s.h(iVarG0, "socket\n            .swit… subscribed observer\" } }");
        this.f67086k = iVarG0;
        AbstractC5912b abstractC5912bB = n().L1(new c()).B(d.f67093a);
        AbstractC6492s.h(abstractC5912bB, "socket\n            .swit… - subscribed sender\" } }");
        this.f67087l = abstractC5912bB;
        gg.i iVarN = gg.i.N(new gg.k() { // from class: z7.e
            @Override // gg.k
            public final void a(gg.j jVar) {
                g.i(this.f67074a, jVar);
            }
        }, EnumC5911a.LATEST);
        AbstractC6492s.h(iVarN, "create<Boolean>(\n       …sureStrategy.LATEST\n    )");
        this.f67088m = iVarN;
        gg.i iVarF1 = iVarN.p0(new h()).U0(abstractC5912bB).o1(1).i2().F1(Gg.a.d());
        AbstractC6492s.h(iVarF1, "acquireMulticastLock\n   …scribeOn(Schedulers.io())");
        this.f67089n = iVarF1;
    }
}
