package V8;

import G6.G;
import G6.N;
import G6.O;
import G6.P;
import T8.b;
import V8.e;
import Z8.a;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import c9.InterfaceC4232a;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import com.ui.btle.rxandroidble.a;
import com.ui.btle.v2.a;
import com.ui.btle.v2.d;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import h9.C5969a;
import hg.InterfaceC6043c;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class k extends V8.e {

    /* renamed from: c, reason: collision with root package name */
    private final C5969a f23172c;

    /* renamed from: d, reason: collision with root package name */
    private final UUID f23173d;

    /* renamed from: e, reason: collision with root package name */
    private final UUID f23174e;

    /* renamed from: f, reason: collision with root package name */
    private final UUID f23175f;

    /* renamed from: g, reason: collision with root package name */
    private final UUID f23176g;

    /* renamed from: h, reason: collision with root package name */
    private final e.b f23177h;

    /* renamed from: i, reason: collision with root package name */
    private final a.AbstractC0966a f23178i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.y f23179j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.y f23180k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.y f23181l;

    /* renamed from: m, reason: collision with root package name */
    private final Fg.a f23182m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f23183n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC5912b f23184o;

    static final class A implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final A f23185a = new A();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f23186a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10) {
                super(0);
                this.f23186a = i10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "MTU - Negotiated to " + this.f23186a;
            }
        }

        A() {
        }

        public final void a(int i10) {
            X8.a.c(new a(i10));
        }

        @Override // kg.InterfaceC6469f
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Number) obj).intValue());
        }
    }

    static final class B implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final B f23187a = new B();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23188a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Connection priority - Requesting maximal...";
            }
        }

        B() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(a.f23188a);
        }
    }

    static final class C extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C f23189a = new C();

        C() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connection priority Successfully set";
        }
    }

    public static final class D implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f23190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23191b;

        public D(G g10, k kVar) {
            this.f23190a = g10;
            this.f23191b = kVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(this.f23190a.b(this.f23191b.f23172c.d(":")));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: V8.k$a, reason: case insensitive filesystem */
    static final class C3623a extends AbstractC6494u implements InterfaceC6824a {
        C3623a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connection " + k.this.f23172c + " [" + k.this.hashCode() + "] instantiated";
        }
    }

    /* renamed from: V8.k$b, reason: case insensitive filesystem */
    static final class C3624b extends AbstractC6494u implements InterfaceC6824a {
        C3624b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            C5969a c5969a = k.this.f23172c;
            int iHashCode = k.this.hashCode();
            UUID uuid = k.this.f23173d;
            if (uuid == null) {
                uuid = null;
            }
            return "Connection " + c5969a + " [" + iHashCode + "] RS:" + uuid;
        }
    }

    /* renamed from: V8.k$c, reason: case insensitive filesystem */
    static final class C3625c extends AbstractC6494u implements InterfaceC6824a {
        C3625c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connection " + k.this.f23172c + " [" + k.this.hashCode() + "] RCH:" + k.this.f23174e;
        }
    }

    /* renamed from: V8.k$d, reason: case insensitive filesystem */
    static final class C3626d extends AbstractC6494u implements InterfaceC6824a {
        C3626d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            C5969a c5969a = k.this.f23172c;
            int iHashCode = k.this.hashCode();
            UUID uuid = k.this.f23175f;
            if (uuid == null) {
                uuid = null;
            }
            return "Connection " + c5969a + " [" + iHashCode + "] WS:" + uuid;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connection " + k.this.f23172c + " [" + k.this.hashCode() + "] WCH:" + k.this.f23176g;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {
        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connection " + k.this.f23172c + " [" + k.this.hashCode() + "] Encryption:" + k.this.J();
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f23198a = new g();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5912b f23199a;

            a(AbstractC5912b abstractC5912b) {
                this.f23199a = abstractC5912b;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Yg.s apply(N connection) {
                AbstractC6492s.i(connection, "connection");
                return Yg.z.a(connection, this.f23199a);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.v apply(O device) {
            AbstractC6492s.i(device, "device");
            gg.s sVarL1 = device.a(false).x0(1).l1();
            AbstractC6492s.h(sVarL1, "device.establishConnecti…              .refCount()");
            AbstractC5912b abstractC5912bF0 = sVarL1.f0();
            AbstractC6492s.h(abstractC5912bF0, "connectionStream.ignoreElements()");
            return sVarL1.i0(new a(abstractC5912bF0));
        }
    }

    static final class h implements InterfaceC6469f {
        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            k.this.f23182m.h(a.AbstractC1282a.b.c.f41116a);
        }
    }

    static final class i implements InterfaceC6469f {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23202a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(0);
                this.f23202a = kVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Connecting to device: " + this.f23202a.f23172c;
            }
        }

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(k.this));
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Disconnected from device: " + k.this.f23172c;
        }
    }

    /* renamed from: V8.k$k, reason: collision with other inner class name */
    static final class C0860k implements InterfaceC6469f {

        /* renamed from: V8.k$k$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23205a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(0);
                this.f23205a = kVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Successfully connected to BLE device " + this.f23205a.f23172c;
            }
        }

        C0860k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Yg.s it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(k.this));
        }
    }

    static final class l implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23207a;

            a(k kVar) {
                this.f23207a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f23207a.f23182m.h(a.AbstractC1282a.b.C1284a.f41114a);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23208a;

            b(k kVar) {
                this.f23208a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f23208a.f23182m.h(a.AbstractC1282a.b.d.f41117a);
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23209a;

            c(k kVar) {
                this.f23209a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f23209a.f23182m.h(a.AbstractC1282a.b.e.f41118a);
            }
        }

        static final class d implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23210a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f23211b;

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23212a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ V8.a f23213b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ V8.b f23214c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ N f23215d;

                /* renamed from: V8.k$l$d$a$a, reason: collision with other inner class name */
                static final class C0861a implements kg.n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ k f23216a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ d.a f23217b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ d.b f23218c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC4232a f23219d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ N f23220e;

                    C0861a(k kVar, d.a aVar, d.b bVar, InterfaceC4232a interfaceC4232a, N n10) {
                        this.f23216a = kVar;
                        this.f23217b = aVar;
                        this.f23218c = bVar;
                        this.f23219d = interfaceC4232a;
                        this.f23220e = n10;
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final com.ui.btle.v2.i apply(Z8.a encryptionInstance) {
                        AbstractC6492s.i(encryptionInstance, "encryptionInstance");
                        k kVar = this.f23216a;
                        return kVar.i(this.f23217b, this.f23218c, this.f23219d, encryptionInstance, kVar.K(this.f23220e));
                    }
                }

                a(k kVar, V8.a aVar, V8.b bVar, N n10) {
                    this.f23212a = kVar;
                    this.f23213b = aVar;
                    this.f23214c = bVar;
                    this.f23215d = n10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.D apply(InterfaceC4232a sequence) {
                    AbstractC6492s.i(sequence, "sequence");
                    k kVar = this.f23212a;
                    V8.a frameReader = this.f23213b;
                    AbstractC6492s.h(frameReader, "frameReader");
                    d.a aVarF = kVar.f(frameReader, this.f23212a.f23180k, this.f23212a.f23181l);
                    k kVar2 = this.f23212a;
                    V8.b frameWriter = this.f23214c;
                    AbstractC6492s.h(frameWriter, "frameWriter");
                    d.b bVarG = kVar2.g(frameWriter, this.f23212a.f23179j, this.f23212a.f23181l);
                    k kVar3 = this.f23212a;
                    return kVar3.c(kVar3.J(), aVarF, bVarG, sequence).A(new C0861a(this.f23212a, aVarF, bVarG, sequence, this.f23215d));
                }
            }

            static final class b implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23221a;

                b(k kVar) {
                    this.f23221a = kVar;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    this.f23221a.f23182m.h(a.AbstractC1282a.b.C1285b.f41115a);
                }
            }

            static final class c implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23222a;

                c(k kVar) {
                    this.f23222a = kVar;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(com.ui.btle.v2.i session) {
                    AbstractC6492s.i(session, "session");
                    this.f23222a.f23182m.h(new a.AbstractC1282a.C1283a(session));
                }
            }

            d(k kVar, N n10) {
                this.f23210a = kVar;
                this.f23211b = n10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Yg.s sVar) {
                AbstractC6492s.i(sVar, "<name for destructuring parameter 0>");
                V8.a aVar = (V8.a) sVar.a();
                return gg.s.j0(aVar.e().f0(), this.f23210a.h().s(new a(this.f23210a, aVar, (V8.b) sVar.c(), this.f23211b)).Y()).G(new b(this.f23210a)).F(new c(this.f23210a)).f0();
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<name for destructuring parameter 0>");
            N n10 = (N) sVar.a();
            AbstractC5912b abstractC5912b = (AbstractC5912b) sVar.c();
            AbstractC5912b abstractC5912bB = k.this.N(n10).B(new a(k.this));
            Ag.e eVar = Ag.e.f756a;
            gg.z apply = k.this.L(n10, abstractC5912b).n(new b(k.this));
            AbstractC6492s.h(apply, "apply");
            gg.z apply2 = k.this.M(n10).n(new c(k.this));
            AbstractC6492s.h(apply2, "apply");
            return abstractC5912bB.k(eVar.a(apply, apply2)).t(new d(k.this, n10));
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f23223a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof BleException ? AbstractC5912b.D(new BTLEv2RxAndroidBle.Error("BTLE Connection stream ended with an error", error)) : AbstractC5912b.D(error);
        }
    }

    static final class n implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final n f23224a = new n();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.AbstractC1282a f23225a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.AbstractC1282a abstractC1282a) {
                super(0);
                this.f23225a = abstractC1282a;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Connection STATE - " + this.f23225a;
            }
        }

        n() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.AbstractC1282a it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(it));
        }
    }

    static final class o implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final o f23226a = new o();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23227a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Connection STATE SUBSCRIBED";
            }
        }

        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(a.f23227a);
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final p f23228a = new p();

        p() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connection STATE Finished";
        }
    }

    public static final class q implements b.c {

        /* renamed from: a, reason: collision with root package name */
        private final int f23229a;

        /* renamed from: b, reason: collision with root package name */
        private final gg.z f23230b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23231a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof BleException ? gg.z.p(new BTLEv2RxAndroidBle.Error("RSSI GATT operation failed", error)) : gg.z.p(error);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final b f23232a = new b();

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f23233a = new a();

                a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "RSSI Check Subscribed";
                }
            }

            b() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(a.f23233a);
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f23234a = new c();

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f23235a = new a();

                a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "RSSI Check Failed";
                }
            }

            c() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                X8.a.d(a.f23235a, it);
            }
        }

        q(N n10, k kVar) {
            this.f23229a = n10.a();
            gg.z zVarO = n10.g().F(a.f23231a).n(b.f23232a).m(c.f23234a).E(Gg.a.a()).O(kVar.f23181l);
            AbstractC6492s.h(zVarO, "readRssi()\n             …beOn(schedulerProcessing)");
            this.f23230b = zVarO;
        }
    }

    static final class r implements InterfaceC6469f {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23237a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(0);
                this.f23237a = kVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.String invoke() {
                /*
                    r4 = this;
                    V8.k r0 = r4.f23237a
                    java.util.UUID r0 = V8.k.r(r0)
                    if (r0 == 0) goto L21
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Service: '"
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = "'"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    if (r0 != 0) goto L23
                L21:
                    java.lang.String r0 = "Any Service"
                L23:
                    V8.k r1 = r4.f23237a
                    java.util.UUID r1 = V8.k.q(r1)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Frame Reader Creating - "
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = ", Char: "
                    r2.append(r0)
                    r2.append(r1)
                    java.lang.String r0 = r2.toString()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: V8.k.r.a.invoke():java.lang.String");
            }
        }

        r() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(k.this));
        }
    }

    static final class s implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23239a;

            /* renamed from: V8.k$s$a$a, reason: collision with other inner class name */
            static final class C0862a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23240a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0862a(k kVar) {
                    super(0);
                    this.f23240a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Reader Searching for service '" + this.f23240a.f23173d + "'";
                }
            }

            a(k kVar) {
                this.f23239a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new C0862a(this.f23239a));
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23241a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23242a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23242a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Reader Service '" + this.f23242a.f23173d + "' found. Searching for characteristic:'" + this.f23242a.f23174e + "'";
                }
            }

            b(k kVar) {
                this.f23241a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(BluetoothGattService it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23241a));
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23243a;

            c(k kVar) {
                this.f23243a = kVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BluetoothGattCharacteristic apply(BluetoothGattService service) {
                AbstractC6492s.i(service, "service");
                return service.getCharacteristic(this.f23243a.f23174e);
            }
        }

        static final class d implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23244a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23245a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23245a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Reader Characteristic '" + this.f23245a.f23174e + "' found.";
                }
            }

            d(k kVar) {
                this.f23244a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(BluetoothGattCharacteristic it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23244a));
            }
        }

        static final class e implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23246a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23247a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23247a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Reader Searching for Characteristic '" + this.f23247a.f23174e + "'";
                }
            }

            e(k kVar) {
                this.f23246a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23246a));
            }
        }

        static final class f implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23248a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23249a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23249a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Reader Characteristic '" + this.f23249a.f23174e + "' found.";
                }
            }

            f(k kVar) {
                this.f23248a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(BluetoothGattCharacteristic it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23248a));
            }
        }

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(P services) {
            AbstractC6492s.i(services, "services");
            return k.this.f23173d != null ? services.c(k.this.f23173d).n(new a(k.this)).o(new b(k.this)).A(new c(k.this)).o(new d(k.this)) : services.b(k.this.f23174e).n(new e(k.this)).o(new f(k.this));
        }
    }

    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f23250a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5912b f23251b;

        t(N n10, AbstractC5912b abstractC5912b) {
            this.f23250a = n10;
            this.f23251b = abstractC5912b;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a apply(BluetoothGattCharacteristic characteristic) {
            AbstractC6492s.i(characteristic, "characteristic");
            return new a(this.f23250a, characteristic, this.f23251b);
        }
    }

    static final class u implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final u f23252a = new u();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23253a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Frame Reader CREATED";
            }
        }

        u() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(V8.a it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(a.f23253a);
        }
    }

    static final class v implements InterfaceC6469f {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23255a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(0);
                this.f23255a = kVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.String invoke() {
                /*
                    r4 = this;
                    V8.k r0 = r4.f23255a
                    java.util.UUID r0 = V8.k.x(r0)
                    if (r0 == 0) goto L21
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Service: '"
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = "'"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    if (r0 != 0) goto L23
                L21:
                    java.lang.String r0 = "Any Service"
                L23:
                    V8.k r1 = r4.f23255a
                    java.util.UUID r1 = V8.k.w(r1)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Frame Writer Creating - "
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = ", Char: "
                    r2.append(r0)
                    r2.append(r1)
                    java.lang.String r0 = r2.toString()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: V8.k.v.a.invoke():java.lang.String");
            }
        }

        v() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(k.this));
        }
    }

    static final class w implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23257a;

            /* renamed from: V8.k$w$a$a, reason: collision with other inner class name */
            static final class C0863a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23258a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0863a(k kVar) {
                    super(0);
                    this.f23258a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Writer Searching for service '" + this.f23258a.f23175f + "'";
                }
            }

            a(k kVar) {
                this.f23257a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new C0863a(this.f23257a));
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23259a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23260a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23260a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Writer Service '" + this.f23260a.f23175f + "' found. Searching for characteristic:'" + this.f23260a.f23176g + "'";
                }
            }

            b(k kVar) {
                this.f23259a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(BluetoothGattService it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23259a));
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23261a;

            c(k kVar) {
                this.f23261a = kVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BluetoothGattCharacteristic apply(BluetoothGattService service) {
                AbstractC6492s.i(service, "service");
                return service.getCharacteristic(this.f23261a.f23176g);
            }
        }

        static final class d implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23262a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23263a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23263a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Writer Characteristic '" + this.f23263a.f23176g + "' found.";
                }
            }

            d(k kVar) {
                this.f23262a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(BluetoothGattCharacteristic it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23262a));
            }
        }

        static final class e implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23264a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23265a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23265a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Writer Searching for Characteristic '" + this.f23265a.f23176g + "'";
                }
            }

            e(k kVar) {
                this.f23264a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23264a));
            }
        }

        static final class f implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23266a;

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f23267a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k kVar) {
                    super(0);
                    this.f23267a = kVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Frame Writer Characteristic '" + this.f23267a.f23176g + "' found.";
                }
            }

            f(k kVar) {
                this.f23266a = kVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(BluetoothGattCharacteristic it) {
                AbstractC6492s.i(it, "it");
                X8.a.c(new a(this.f23266a));
            }
        }

        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(P services) {
            AbstractC6492s.i(services, "services");
            return k.this.f23175f != null ? services.c(k.this.f23175f).n(new a(k.this)).o(new b(k.this)).A(new c(k.this)).o(new d(k.this)) : services.b(k.this.f23176g).n(new e(k.this)).o(new f(k.this));
        }
    }

    static final class x implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f23268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23269b;

        x(N n10, k kVar) {
            this.f23268a = n10;
            this.f23269b = kVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(BluetoothGattCharacteristic characteristic) {
            AbstractC6492s.i(characteristic, "characteristic");
            return new b(this.f23268a, characteristic, this.f23269b.f23177h.c(), this.f23269b.f23177h.e());
        }
    }

    static final class y implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final y f23270a = new y();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23271a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Frame Writer CREATED";
            }
        }

        y() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(b it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(a.f23271a);
        }
    }

    static final class z implements InterfaceC6469f {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23273a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(0);
                this.f23273a = kVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "MTU - Requesting " + ((e.b.AbstractC0859b.a) this.f23273a.f23177h.d()).a() + "...";
            }
        }

        z() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(k.this));
        }
    }

    public /* synthetic */ k(G g10, C5969a c5969a, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, e.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(g10, c5969a, uuid, uuid2, uuid3, uuid4, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(k this$0) {
        AbstractC6492s.i(this$0, "this$0");
        X8.a.c(this$0.new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(k this$0) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.f23182m.h(a.AbstractC1282a.c.f41119a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I() {
        X8.a.c(p.f23228a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b.c K(N n10) {
        return new q(n10, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z L(N n10, AbstractC5912b abstractC5912b) {
        gg.z zVarO = n10.b().n(new r()).s(new s()).A(new t(n10, abstractC5912b)).o(u.f23252a);
        AbstractC6492s.h(zVarO, "private fun RxBleConnect…Frame Reader CREATED\" } }");
        return zVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z M(N n10) {
        gg.z zVarO = n10.b().n(new v()).s(new w()).A(new x(n10, this)).o(y.f23270a);
        AbstractC6492s.h(zVarO, "private fun RxBleConnect…Frame Writer CREATED\" } }");
        return zVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b N(N n10) {
        if (!(this.f23177h.d() instanceof e.b.AbstractC0859b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5912b abstractC5912bY = n10.e(((e.b.AbstractC0859b.a) this.f23177h.d()).a()).n(new z()).o(A.f23185a).y();
        AbstractC6492s.h(abstractC5912bY, "private fun RxBleConnect…\n            },\n        )");
        if (!(this.f23177h.a() instanceof e.b.a.C0858a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5912b abstractC5912bX = n10.d(((e.b.a.C0858a) this.f23177h.a()).b(), ((e.b.a.C0858a) this.f23177h.a()).a(), TimeUnit.MILLISECONDS).B(B.f23187a).x(new InterfaceC6464a() { // from class: V8.g
            @Override // kg.InterfaceC6464a
            public final void run() {
                k.O();
            }
        });
        AbstractC6492s.h(abstractC5912bX, "requestConnectionPriorit…ity Successfully set\" } }");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bY, abstractC5912bX);
        AbstractC6492s.h(abstractC5912bP, "private fun RxBleConnect…\n            },\n        )");
        return abstractC5912bP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O() {
        X8.a.c(C.f23189a);
    }

    public a.AbstractC0966a J() {
        return this.f23178i;
    }

    @Override // com.ui.btle.v2.a
    public gg.i b() {
        return this.f23183n;
    }

    @Override // com.ui.btle.v2.b
    protected AbstractC5912b d() {
        return this.f23184o;
    }

    private k(G client, C5969a hwAddress, UUID uuid, UUID readCharacteristic, UUID uuid2, UUID writeCharacteristic, e.b params) {
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(hwAddress, "hwAddress");
        AbstractC6492s.i(readCharacteristic, "readCharacteristic");
        AbstractC6492s.i(writeCharacteristic, "writeCharacteristic");
        AbstractC6492s.i(params, "params");
        this.f23172c = hwAddress;
        this.f23173d = uuid;
        this.f23174e = readCharacteristic;
        this.f23175f = uuid2;
        this.f23176g = writeCharacteristic;
        this.f23177h = params;
        X8.a.c(new C3623a());
        X8.a.c(new C3624b());
        X8.a.c(new C3625c());
        X8.a.c(new C3626d());
        X8.a.c(new e());
        X8.a.c(new f());
        this.f23178i = params.b();
        a.C1281a c1281a = a.C1281a.f41109a;
        this.f23179j = c1281a.c(this);
        this.f23180k = c1281a.b(this);
        gg.y yVarA = c1281a.a();
        this.f23181l = yVarA;
        Fg.a aVarK2 = Fg.a.k2(a.AbstractC1282a.c.f41119a);
        AbstractC6492s.h(aVarK2, "createDefault<BTLEv2Conn…ction.State.Disconnected)");
        this.f23182m = aVarK2;
        gg.i iVarI2 = aVarK2.X0(Gg.a.a()).W().f0(n.f23224a).g0(o.f23226a).Z(new InterfaceC6464a() { // from class: V8.h
            @Override // kg.InterfaceC6464a
            public final void run() {
                k.I();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "stateProcessor\n         …)\n            .refCount()");
        this.f23183n = iVarI2;
        gg.z zVarI = gg.z.i(new D(client, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bO = zVarI.v(g.f23198a).G(new h()).G(new i()).y(new InterfaceC6464a() { // from class: V8.i
            @Override // kg.InterfaceC6464a
            public final void run() {
                k.G(this.f23170a);
            }
        }).F(new C0860k()).Q0(new l()).w(new InterfaceC6464a() { // from class: V8.j
            @Override // kg.InterfaceC6464a
            public final void run() {
                k.H(this.f23171a);
            }
        }).W(yVarA).O(m.f23223a);
        AbstractC6492s.h(abstractC5912bO, "single { client.getBleDe…          }\n            }");
        this.f23184o = abstractC5912bO;
    }
}
