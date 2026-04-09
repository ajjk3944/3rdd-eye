package E8;

import Cd.j;
import Li.N;
import androidx.lifecycle.InterfaceC4017o;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.advanced.a;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import i8.InterfaceC6084a;
import java.util.UUID;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.O;
import l9.C6556a;
import me.InterfaceC6814f;
import mh.InterfaceC6824a;
import nf.e;
import org.kodein.di.DI;
import qd.InterfaceC7451a;
import rj.InterfaceC7810x2;
import s9.d;
import u8.InterfaceC8140a;
import vc.InterfaceC8209b;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class x extends nf.h {

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4318F = {O.h(new kotlin.jvm.internal.F(x.class, "speedtestInternet", "getSpeedtestInternet()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "speedtestLocal", "getSpeedtestLocal()Lcom/ui/wifiman/model/speedtest/lan/LocalSpeedtest;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "speedtestA2A", "getSpeedtestA2A()Lcom/ui/wifiman/model/speedtest/a2a/App2AppSpeedtest;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "speedtestCombined", "getSpeedtestCombined()Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtest;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "uiStateManager", "getUiStateManager()Lcom/ui/wifiman/model/android/window/AppWindowService;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "wifiScanner", "getWifiScanner()Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiScanner;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "popupController", "getPopupController()Lcom/ubnt/usurvey/ui/popup/ApplicationPopupController;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "speedtestOnMeteredNetwork", "getSpeedtestOnMeteredNetwork()Lcom/ui/wifiman/model/speedtest/SpeedtestOnMeteredNetwork;", 0)), O.g(new kotlin.jvm.internal.D(x.class, "stream", "<v#0>", 0)), O.g(new kotlin.jvm.internal.D(x.class, "stream", "<v#1>", 0)), O.g(new kotlin.jvm.internal.D(x.class, "stream", "<v#2>", 0)), O.g(new kotlin.jvm.internal.D(x.class, "stream", "<v#3>", 0))};

    /* renamed from: G, reason: collision with root package name */
    public static final int f4319G = 8;

    /* renamed from: A, reason: collision with root package name */
    private final N f4320A;

    /* renamed from: B, reason: collision with root package name */
    private final N f4321B;

    /* renamed from: C, reason: collision with root package name */
    private final N f4322C;

    /* renamed from: D, reason: collision with root package name */
    private final N f4323D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC6043c f4324E;

    /* renamed from: g, reason: collision with root package name */
    private final DI f4325g;

    /* renamed from: h, reason: collision with root package name */
    private final UUID f4326h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4327i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4328j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4329k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f4330l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f4331m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f4332n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f4333o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f4334p;

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f4335q;

    /* renamed from: r, reason: collision with root package name */
    private final Yg.m f4336r;

    /* renamed from: s, reason: collision with root package name */
    private final Fg.a f4337s;

    /* renamed from: t, reason: collision with root package name */
    private final Fg.a f4338t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f4339u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f4340v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.z f4341w;

    /* renamed from: x, reason: collision with root package name */
    private final N f4342x;

    /* renamed from: y, reason: collision with root package name */
    private final N f4343y;

    /* renamed from: z, reason: collision with root package name */
    private final N f4344z;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<UUID> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<InternetSpeedtest> {
    }

    public static final class C extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4345a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(Object obj) {
            super(0);
            this.f4345a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f4345a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class D extends org.kodein.type.o<UUID> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<Cd.j> {
    }

    public static final class F extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(Object obj) {
            super(0);
            this.f4346a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f4346a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class G extends org.kodein.type.o<UUID> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class H extends org.kodein.type.o<InterfaceC7451a> {
    }

    public static final class I extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(Object obj) {
            super(0);
            this.f4347a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f4347a;
        }
    }

    public static final class J implements gg.C {
        public J() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            Object hVar;
            Object mVar;
            try {
                nf.e eVarQ0 = x.this.q0();
                if (eVarQ0 instanceof e.c) {
                    gg.i iVarW = x.this.f4340v.m0(o.f4369a).o0().w(x.this.new p());
                    AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
                    mVar = new l(iVarW, x.this.getDi());
                } else if (eVarQ0 instanceof e.d) {
                    gg.i iVarA = x.this.U0().a(new j.c(((e.d) eVarQ0).a()));
                    DI di2 = x.this.getDi();
                    String string = ((e.d) eVarQ0).a().toString();
                    AbstractC6492s.h(string, "toString(...)");
                    mVar = new m(iVarA, string, di2);
                } else {
                    if (eVarQ0 instanceof e.a) {
                        gg.i iVarA2 = x.this.R0().a(new InterfaceC7451a.C2063a(((e.a) eVarQ0).a(), ((e.a) eVarQ0).d(), ((e.a) eVarQ0).c(), ((e.a) eVarQ0).b()));
                        String string2 = ((e.a) eVarQ0).a().toString();
                        AbstractC6492s.h(string2, "toString(...)");
                        hVar = new g(iVarA2, string2, x.this.getDi());
                    } else {
                        if (!(eVarQ0 instanceof e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = new h(x.this.S0().a(new a.C1418a(e.b.d(((e.b) eVarQ0).a()), ((e.b) eVarQ0).b(), null)), x.this.getDi());
                    }
                    mVar = hVar;
                }
                interfaceC5910A.onSuccess(mVar);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class K implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final K f4349a = new K();

        K() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.i();
        }
    }

    static final class L implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final L f4350a = new L();

        L() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(k it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(((it instanceof l) || (it instanceof h)) ? new d.b(R.string.speedtest_process_internet_title) : ((it instanceof m) || (it instanceof g)) ? new d.b(R.string.speedtest_process_network_title) : null);
        }
    }

    static final class M implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final M f4351a = new M();

        M() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.k();
        }
    }

    /* renamed from: E8.x$a, reason: case insensitive filesystem */
    static final class C2659a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2659a f4352a = new C2659a();

        C2659a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    /* renamed from: E8.x$b, reason: case insensitive filesystem */
    static final class C2660b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2660b f4353a = new C2660b();

        C2660b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.d();
        }
    }

    /* renamed from: E8.x$c, reason: case insensitive filesystem */
    static final class C2661c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C2661c f4354a = new C2661c();

        C2661c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nf.d apply(nf.e params, Boolean internetSpeedtestEnabled) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(internetSpeedtestEnabled, "internetSpeedtestEnabled");
            if (params instanceof e.c) {
                return internetSpeedtestEnabled.booleanValue() ? nf.d.TEST : nf.d.METERED_NETWORK_WARNING;
            }
            if ((params instanceof e.d) || (params instanceof e.a) || (params instanceof e.b)) {
                return nf.d.TEST;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: E8.x$d, reason: case insensitive filesystem */
    static final class C2662d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2662d f4355a = new C2662d();

        C2662d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.j();
        }
    }

    /* renamed from: E8.x$e, reason: case insensitive filesystem */
    static final class C2663e implements kg.n {

        /* renamed from: E8.x$e$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Speedtest.d f4357a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f4358b;

            public a(Speedtest.d dVar, x xVar) {
                this.f4357a = dVar;
                this.f4358b = xVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                AbstractC5912b abstractC5912bA;
                try {
                    if (this.f4357a.b() != null) {
                        InterfaceC6084a interfaceC6084aX0 = this.f4358b.X0();
                        Speedtest.Error errorB = this.f4357a.b();
                        AbstractC6492s.f(errorB);
                        abstractC5912bA = interfaceC6084aX0.a(new InterfaceC6084a.b.B.AbstractC1814b.C1816b(errorB));
                    } else if (this.f4357a.c()) {
                        com.ui.wifiman.model.speedtest.result.b bVar = (com.ui.wifiman.model.speedtest.result.b) this.f4357a.f().b();
                        if (bVar == null || (abstractC5912bA = this.f4358b.X0().a(new InterfaceC6084a.b.B.AbstractC1814b.C1815a(bVar.f(), true))) == null) {
                            throw new IllegalStateException("speedtest is successfully finished but no result ID available");
                        }
                    } else {
                        abstractC5912bA = null;
                    }
                    if (abstractC5912bA != null) {
                        oVar.onSuccess(abstractC5912bA);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        C2663e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Speedtest.d state) {
            AbstractC6492s.i(state, "state");
            gg.n nVarC = gg.n.c(new a(state, x.this));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: E8.x$f, reason: case insensitive filesystem */
    static final class C2664f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2664f f4359a = new C2664f();

        C2664f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC5912b it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: E8.x$g, reason: case insensitive filesystem */
    static final class C2665g implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final C2665g f4360a = new C2665g();

        C2665g() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean a(Zc.e connection, Boolean enabledOnMeteredAndDoNotAsk, Boolean enabledOnMetered) {
            AbstractC6492s.i(connection, "connection");
            AbstractC6492s.i(enabledOnMeteredAndDoNotAsk, "enabledOnMeteredAndDoNotAsk");
            AbstractC6492s.i(enabledOnMetered, "enabledOnMetered");
            return Boolean.valueOf(!connection.d() || enabledOnMetered.booleanValue() || enabledOnMeteredAndDoNotAsk.booleanValue());
        }
    }

    /* renamed from: E8.x$h, reason: case insensitive filesystem */
    static final class C2666h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2666h f4361a = new C2666h();

        C2666h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.j();
        }
    }

    /* renamed from: E8.x$i, reason: case insensitive filesystem */
    static final class C2667i implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final C2667i f4362a = new C2667i();

        C2667i() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Speedtest.d it) {
            AbstractC6492s.i(it, "it");
            return it.h() == Speedtest.e.END;
        }
    }

    /* renamed from: E8.x$j, reason: case insensitive filesystem */
    static final class C2668j implements kg.n {

        /* renamed from: E8.x$j$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f4364a;

            public a(x xVar) {
                this.f4364a = xVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f4364a.f4338t.h(Boolean.TRUE);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        C2668j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean doNotAskAgain) {
            AbstractC6492s.i(doNotAskAgain, "doNotAskAgain");
            if (doNotAskAgain.booleanValue()) {
                return x.this.V0().b(doNotAskAgain.booleanValue());
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(x.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: E8.x$k, reason: case insensitive filesystem */
    static final class C2669k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2669k f4365a = new C2669k();

        C2669k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    /* renamed from: E8.x$l, reason: case insensitive filesystem */
    static final class C2670l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2670l f4366a = new C2670l();

        C2670l() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(nf.b it) {
            AbstractC6492s.i(it, "it");
        }
    }

    /* renamed from: E8.x$m, reason: case insensitive filesystem */
    static final class C2671m implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2671m f4367a = new C2671m();

        C2671m() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            Eg.a.v(error);
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f4368a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    static final class o implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final o f4369a = new o();

        o() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            return enabled.booleanValue();
        }
    }

    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean it) {
            AbstractC6492s.i(it, "it");
            return x.this.T0().a(new InternetSpeedtest.a(true, true));
        }
    }

    public static final class q implements gg.k {
        public q() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(x.this.q0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<UUID> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class s extends org.kodein.type.o<com.ui.wifiman.model.speedtest.advanced.a> {
    }

    public static final class t extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Object obj) {
            super(0);
            this.f4372a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f4372a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class u extends org.kodein.type.o<InterfaceC8209b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<InterfaceC6814f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<InterfaceC8140a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E8.x$x, reason: collision with other inner class name */
    public static final class C0185x extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class y extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class z extends org.kodein.type.o<pd.q> {
    }

    public x(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4325g = di2;
        UUID testId = UUID.randomUUID();
        this.f4326h = testId;
        AbstractC6492s.h(testId, "testId");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE, UUID.class);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2B = org.kodein.di.d.b(this, dVar, new org.kodein.type.d(iVarE2, InternetSpeedtest.class), null, new C(testId));
        th.l[] lVarArr = f4318F;
        this.f4327i = interfaceC7810x2B.a(this, lVarArr[0]);
        AbstractC6492s.h(testId, "testId");
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar2 = new org.kodein.type.d(iVarE3, UUID.class);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4328j = org.kodein.di.d.b(this, dVar2, new org.kodein.type.d(iVarE4, Cd.j.class), null, new F(testId)).a(this, lVarArr[1]);
        AbstractC6492s.h(testId, "testId");
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar3 = new org.kodein.type.d(iVarE5, UUID.class);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4329k = org.kodein.di.d.b(this, dVar3, new org.kodein.type.d(iVarE6, InterfaceC7451a.class), null, new I(testId)).a(this, lVarArr[2]);
        AbstractC6492s.h(testId, "testId");
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar4 = new org.kodein.type.d(iVarE7, UUID.class);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new s().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4330l = org.kodein.di.d.b(this, dVar4, new org.kodein.type.d(iVarE8, com.ui.wifiman.model.speedtest.advanced.a.class), null, new t(testId)).a(this, lVarArr[3]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new u().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4331m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, InterfaceC8209b.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4332n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, InterfaceC6814f.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4333o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, InterfaceC8140a.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new C0185x().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4334p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE12, InterfaceC6084a.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4335q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE13, Zc.f.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4336r = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE14, pd.q.class), null).a(this, lVarArr[9]);
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f4337s = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f4338t = aVarK22;
        gg.i iVarI2 = aVarK22.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4339u = iVarI2;
        gg.i iVarI22 = gg.i.u(P0().getState(), V0().a(), iVarI2, C2665g.f4360a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f4340v = iVarI22;
        gg.z zVarI = gg.z.i(new J());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarE = zVarI.e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f4341w = zVarE;
        gg.i iVarI23 = gg.i.N(new q(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        gg.i iVarV = gg.i.v(iVarI23, iVarI22, C2661c.f4354a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        this.f4342x = AbstractC8661g.d0(this, iVarV, nf.d.NOTHING, false, null, 6, null);
        gg.i iVarW = zVarE.W().N0(L.f4350a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f4343y = AbstractC8661g.h0(this, iVarW, null, null, 2, null);
        gg.i iVarW2 = zVarE.w(C2659a.f4352a);
        AbstractC6492s.h(iVarW2, "flatMapPublisher(...)");
        this.f4344z = AbstractC8661g.d0(this, iVarW2, nf.b.f54638c.a(), false, null, 6, null);
        gg.i iVarW3 = zVarE.w(K.f4349a);
        AbstractC6492s.h(iVarW3, "flatMapPublisher(...)");
        this.f4320A = AbstractC8661g.d0(this, iVarW3, nf.c.f54641e.a(), false, null, 6, null);
        gg.i iVarW4 = zVarE.w(M.f4351a);
        AbstractC6492s.h(iVarW4, "flatMapPublisher(...)");
        this.f4321B = AbstractC8661g.h0(this, iVarW4, null, null, 2, null);
        gg.i iVarW5 = zVarE.w(C2660b.f4353a);
        AbstractC6492s.h(iVarW5, "flatMapPublisher(...)");
        this.f4322C = AbstractC8661g.h0(this, iVarW5, null, null, 2, null);
        gg.i iVarW6 = zVarE.w(n.f4368a);
        AbstractC6492s.h(iVarW6, "flatMapPublisher(...)");
        this.f4323D = AbstractC8661g.h0(this, iVarW6, null, null, 2, null);
    }

    private final void J0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(L0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: E8.t
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return x.K0(this.f4314a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i K0(x xVar) {
        gg.i iVarC0 = AbstractC5912b.I(xVar.Q0().b()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i L0(C8658d.a aVar) {
        return aVar.c(null, f4318F[11]);
    }

    private final void M0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(O0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: E8.u
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return x.N0(this.f4315a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i N0(x xVar) {
        gg.i iVarC0 = xVar.Y0().b().c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i O0(C8658d.a aVar) {
        return aVar.c(null, f4318F[12]);
    }

    private final Zc.f P0() {
        return (Zc.f) this.f4335q.getValue();
    }

    private final InterfaceC8140a Q0() {
        return (InterfaceC8140a) this.f4333o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7451a R0() {
        return (InterfaceC7451a) this.f4329k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.speedtest.advanced.a S0() {
        return (com.ui.wifiman.model.speedtest.advanced.a) this.f4330l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternetSpeedtest T0() {
        return (InternetSpeedtest) this.f4327i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cd.j U0() {
        return (Cd.j) this.f4328j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pd.q V0() {
        return (pd.q) this.f4336r.getValue();
    }

    private final InterfaceC8209b W0() {
        return (InterfaceC8209b) this.f4331m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a X0() {
        return (InterfaceC6084a) this.f4334p.getValue();
    }

    private final InterfaceC6814f Y0() {
        return (InterfaceC6814f) this.f4332n.getValue();
    }

    private final void Z0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(b1(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: E8.w
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return x.a1(this.f4317a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i a1(x xVar) {
        gg.i iVarC0 = xVar.f4341w.w(C2662d.f4355a).v0(xVar.new C2663e()).n0().k(C2664f.f4359a).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i b1(C8658d.a aVar) {
        return aVar.c(null, f4318F[13]);
    }

    private final void c1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(e1(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: E8.v
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return x.d1(this.f4316a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i d1(x xVar) {
        gg.i iVarC0 = xVar.W0().a().X(xVar.f4341w.w(C2666h.f4361a).R1(C2667i.f4362a).E0()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i e1(C8658d.a aVar) {
        return aVar.c(null, f4318F[10]);
    }

    @Override // androidx.lifecycle.N
    protected void W() {
        super.W();
        InterfaceC6043c interfaceC6043c = this.f4324E;
        if (interfaceC6043c != null) {
            interfaceC6043c.dispose();
        }
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f4325g;
    }

    @Override // nf.h
    public N getTitle() {
        return this.f4343y;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        c1();
        J0();
        M0();
        Z0();
    }

    @Override // nf.h
    public N n0() {
        return this.f4344z;
    }

    @Override // nf.h
    public N o0() {
        return this.f4322C;
    }

    @Override // ye.AbstractC8661g, androidx.lifecycle.InterfaceC4007e
    public void onStart(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        super.onStart(owner);
        this.f4324E = this.f4341w.w(C2669k.f4365a).B1(C2670l.f4366a, C2671m.f4367a);
    }

    @Override // nf.h
    public N p0() {
        return this.f4342x;
    }

    @Override // nf.h
    public N r0() {
        return this.f4323D;
    }

    @Override // nf.h
    public N s0() {
        return this.f4320A;
    }

    @Override // nf.h
    public N t0() {
        return this.f4321B;
    }

    @Override // nf.h
    public void u0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f4337s.o0().t(new C2668j());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // nf.h
    public void v0(boolean z10) {
        this.f4337s.h(Boolean.valueOf(z10));
    }
}
