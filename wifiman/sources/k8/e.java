package K8;

import Fd.C;
import Id.a;
import Id.f;
import Id.h;
import K8.d;
import L0.C3174d;
import L0.D;
import Li.N;
import Od.a;
import Q0.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Zc.e;
import android.content.Context;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ubnt.usurvey.ui.teleport.tunnel.TeleportIssueReportException;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import com.ui.wifiman.ui.teleport.B;
import com.ui.wifiman.ui.teleport.x;
import com.ui.wifiman.ui.teleport.y;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import i8.InterfaceC6084a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import la.C6562a;
import n8.AbstractC6912m;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.b;
import s9.d;
import sa.AbstractC7930a;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class e extends B implements K8.d, Id.f {

    /* renamed from: g, reason: collision with root package name */
    private final DI f10472g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f10473h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f10474i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f10475j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f10476k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f10477l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f10478m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f10479n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f10480o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f10481p;

    /* renamed from: q, reason: collision with root package name */
    private final Fg.a f10482q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f10483r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f10484s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f10485t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f10486u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f10487v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f10488w;

    /* renamed from: x, reason: collision with root package name */
    private final N f10489x;

    /* renamed from: y, reason: collision with root package name */
    private final N f10490y;

    /* renamed from: z, reason: collision with root package name */
    static final /* synthetic */ th.l[] f10471z = {O.h(new F(e.class, "teleportConsoles", "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;", 0)), O.h(new F(e.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(e.class, "teleportConnector", "getTeleportConnector()Lcom/ui/wifiman/model/teleport/TeleportConnection;", 0)), O.h(new F(e.class, "teleportStatusNotification", "getTeleportStatusNotification()Lcom/ui/wifiman/model/teleport/TeleportConnectionStatusNotification;", 0)), O.h(new F(e.class, "cloudStatusService", "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;", 0)), O.h(new F(e.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(e.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new F(e.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(e.class, "teleportTunnelAvailableService", "getTeleportTunnelAvailableService()Lcom/ui/wifiman/model/teleport/tunnel/TunnelAvailableService;", 0))};

    /* renamed from: A, reason: collision with root package name */
    public static final int f10470A = 8;

    private static abstract class a {

        /* renamed from: K8.e$a$a, reason: collision with other inner class name */
        public static final class C0419a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0419a f10491a = new C0419a();

            private C0419a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0419a);
            }

            public int hashCode() {
                return 1214447113;
            }

            public String toString() {
                return "Available";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Id.c f10492a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Id.c reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f10492a = reason;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f10492a, ((b) obj).f10492a);
            }

            public int hashCode() {
                return this.f10492a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(reason=" + this.f10492a + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final a.c f10493a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a.c reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f10493a = reason;
            }

            public final a.c a() {
                return this.f10493a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f10493a, ((c) obj).f10493a);
            }

            public int hashCode() {
                return this.f10493a.hashCode();
            }

            public String toString() {
                return "Disabled(reason=" + this.f10493a + ")";
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f10494a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 209069180;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Throwable f10496a;

            public a(Throwable th2) {
                this.f10496a = th2;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.e("Tunnel connection failed.", this.f10496a, null, 4, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (error instanceof TeleportConnection.Error.NoVpnProfile) {
                return e.this.N0().a(new InterfaceC6084a.b.E.e(true));
            }
            if (!(error instanceof TeleportConnection.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(TeleportConnection.a connectionState) {
            AbstractC6492s.i(connectionState, "connectionState");
            if ((connectionState instanceof TeleportConnection.a.C1439a) || (connectionState instanceof TeleportConnection.a.b.AbstractC1441b)) {
                return new C6556a(null);
            }
            if (!(connectionState instanceof TeleportConnection.a.b.C1440a)) {
                throw new NoWhenBranchMatchedException();
            }
            TeleportConnection.a.b.C1440a c1440a = (TeleportConnection.a.b.C1440a) connectionState;
            return new C6556a(new x(e.this.z0(c1440a.b().c()), e.this.z0(c1440a.b().a())));
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f10498a = new d();

        public static final class a implements InterfaceC5915e {
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.h("Tunnel connection failed.", null, 2, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportConnection.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a());
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: K8.e$e, reason: collision with other inner class name */
    static final class C0420e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0420e f10499a = new C0420e();

        C0420e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarB;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.ubiquiti.cloud.sso.c cVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.c) c6556a.a();
            return (cVar == null || (iVarB = cVar.b()) == null) ? gg.i.K0(Boolean.FALSE) : iVarB;
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f10500a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rf.e apply(Cc.j myself) {
            AbstractC6492s.i(myself, "myself");
            InterfaceC7929a interfaceC7929aF = AbstractC6912m.f(myself, m.c.SMALL, null, 2, null);
            String name = myself.getName();
            return new rf.e("myself", interfaceC7929aF, name != null ? new d.c(name) : new d.b(R.string.device_myself), new d.b(R.string.teleport_tunnel_your_device), null);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f10501a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RuntimeException apply(TeleportConnection.a tunnelState) {
            TeleportConnection.Error errorB;
            AbstractC6492s.i(tunnelState, "tunnelState");
            if ((tunnelState instanceof TeleportConnection.a.b.AbstractC1441b) || (tunnelState instanceof TeleportConnection.a.b.C1440a)) {
                errorB = null;
            } else {
                if (!(tunnelState instanceof TeleportConnection.a.C1439a)) {
                    throw new NoWhenBranchMatchedException();
                }
                errorB = ((TeleportConnection.a.C1439a) tunnelState).b();
            }
            return errorB != null ? errorB : new IllegalStateException("No teleport error available");
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f10502a = new h();

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RuntimeException f10503a;

            public a(RuntimeException runtimeException) {
                this.f10503a = runtimeException;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    AbstractC6492s.f(this.f10503a);
                    Z7.b.e("Sending latest Teleport error to crashlytics", new TeleportIssueReportException(this.f10503a), null, 4, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(RuntimeException error) {
            AbstractC6492s.i(error, "error");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(a availability) {
            AbstractC6492s.i(availability, "availability");
            if ((availability instanceof a.d) || (availability instanceof a.C0419a)) {
                return AbstractC5912b.m();
            }
            if (availability instanceof a.b) {
                return AbstractC5912b.m();
            }
            if (!(availability instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVarA = ((a.c) availability).a();
            if (cVarA instanceof a.c.d) {
                return e.this.N0().a(InterfaceC6084a.b.D.g.f48903a);
            }
            if (!(cVarA instanceof a.c.f) && !(cVarA instanceof a.c.e) && !(cVarA instanceof a.c.C0371a) && !(cVarA instanceof a.c.C0372c) && !(cVarA instanceof a.c.b) && !(cVarA instanceof a.c.g)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.h(abstractC5912bM, "complete(...)");
            return abstractC5912bM;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<com.ui.wifiman.model.teleport.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<a.InterfaceC0616a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<Id.h> {
    }

    static final class s implements kg.j {
        s() {
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final l9.C6556a a(l9.C6556a r7, rf.e r8, l9.C6556a r9, com.ui.wifiman.model.teleport.TeleportConnection.a r10, s9.d r11, Id.h.a r12) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: K8.e.s.a(l9.a, rf.e, l9.a, com.ui.wifiman.model.teleport.TeleportConnection$a, s9.d, Id.h$a):l9.a");
        }
    }

    static final class t implements kg.h {
        t() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(Zc.e networkConnection, TeleportConnection.a tunnelState, C6556a c6556a, Wc.b bVar) {
            AbstractC6492s.i(networkConnection, "networkConnection");
            AbstractC6492s.i(tunnelState, "tunnelState");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(bVar, "<destruct>");
            com.ui.wifiman.model.teleport.h hVar = (com.ui.wifiman.model.teleport.h) c6556a.a();
            Od.a aVar = (Od.a) bVar.a();
            if ((tunnelState instanceof TeleportConnection.a.b.AbstractC1441b) || (tunnelState instanceof TeleportConnection.a.b.C1440a)) {
                return a.C0419a.f10491a;
            }
            if (!(tunnelState instanceof TeleportConnection.a.C1439a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (hVar == null) {
                return a.d.f10494a;
            }
            Id.a aVarA = Id.b.a(hVar, networkConnection.f() == e.b.CONNECTED, aVar);
            if (aVarA instanceof a.b) {
                return a.d.f10494a;
            }
            if (aVarA instanceof a.c) {
                return new a.c((a.c) aVarA);
            }
            if (!(aVarA instanceof a.C0370a)) {
                throw new NoWhenBranchMatchedException();
            }
            TeleportConnection.Error errorB = ((TeleportConnection.a.C1439a) tunnelState).b();
            return errorB != null ? new a.b(e.this.O0(errorB)) : a.C0419a.f10491a;
        }
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f10507a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(TeleportConnection.a it) {
            boolean z10;
            AbstractC6492s.i(it, "it");
            if ((it instanceof TeleportConnection.a.b.C1440a) || (it instanceof TeleportConnection.a.b.AbstractC1441b)) {
                z10 = true;
            } else {
                if (!(it instanceof TeleportConnection.a.C1439a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class v implements InterfaceC6469f {
        v() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean switchEnabled) {
            AbstractC6492s.i(switchEnabled, "switchEnabled");
            e.this.f10482q.h(switchEnabled);
        }
    }

    static final class w implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final w f10509a = new w();

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            public static final a f10510a = new a();

            a() {
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(742099743);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(742099743, i10, -1, "com.ubnt.usurvey.ui.teleport.tunnel.TeleportTunnelVM.tunnelStateInfo.<anonymous>.<anonymous> (TeleportTunnelVM.kt:117)");
                }
                C3174d.a aVar = new C3174d.a(0, 1, null);
                int iN = aVar.n(new D(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    String string = context.getString(R.string.teleport_tunnel_state_disconnected);
                    AbstractC6492s.h(string, "getString(...)");
                    aVar.i(string);
                    J j10 = J.f24997a;
                    aVar.l(iN);
                    C3174d c3174dP = aVar.p();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                    interfaceC3540l.J();
                    return c3174dP;
                } catch (Throwable th2) {
                    aVar.l(iN);
                    throw th2;
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            public static final b f10511a = new b();

            b() {
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-2130231274);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-2130231274, i10, -1, "com.ubnt.usurvey.ui.teleport.tunnel.TeleportTunnelVM.tunnelStateInfo.<anonymous>.<anonymous> (TeleportTunnelVM.kt:130)");
                }
                C3174d.a aVar = new C3174d.a(0, 1, null);
                int iN = aVar.n(new D(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c(), 0L, A.f18971b.b(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
                try {
                    String string = context.getString(R.string.teleport_tunnel_state_connecting);
                    AbstractC6492s.h(string, "getString(...)");
                    aVar.i(string);
                    J j10 = J.f24997a;
                    aVar.l(iN);
                    C3174d c3174dP = aVar.p();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                    interfaceC3540l.J();
                    return c3174dP;
                } catch (Throwable th2) {
                    aVar.l(iN);
                    throw th2;
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f10512a = new c();

            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(1000L, TimeUnit.MILLISECONDS);
            }
        }

        static final class d implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f10513a = new d();

            d() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long apply(Long it) {
                AbstractC6492s.i(it, "it");
                return Long.valueOf(System.currentTimeMillis() - it.longValue());
            }
        }

        /* renamed from: K8.e$w$e, reason: collision with other inner class name */
        static final class C0421e implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0421e f10514a = new C0421e();

            /* renamed from: K8.e$w$e$a */
            static final class a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Long f10515a;

                a(Long l10) {
                    this.f10515a = l10;
                }

                public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(it, "it");
                    interfaceC3540l.U(1790999837);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1790999837, i10, -1, "com.ubnt.usurvey.ui.teleport.tunnel.TeleportTunnelVM.tunnelStateInfo.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelVM.kt:147)");
                    }
                    Long l10 = this.f10515a;
                    C3174d.a aVar = new C3174d.a(0, 1, null);
                    interfaceC3540l.U(-2141604225);
                    int iN = aVar.n(new D(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().c(), 0L, A.f18971b.b(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
                    try {
                        String string = it.getString(R.string.teleport_tunnel_state_connected_short_format);
                        AbstractC6492s.h(string, "getString(...)");
                        L8.d dVar = L8.d.f11260a;
                        AbstractC6492s.f(l10);
                        String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC7930a.a(dVar.b(l10.longValue()), interfaceC3540l, 0)}, 1));
                        AbstractC6492s.h(str, "format(...)");
                        aVar.i(str);
                        J j10 = J.f24997a;
                        aVar.l(iN);
                        interfaceC3540l.J();
                        C3174d c3174dP = aVar.p();
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return c3174dP;
                    } catch (Throwable th2) {
                        aVar.l(iN);
                        throw th2;
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                }
            }

            C0421e() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d.a apply(Long connectionDuration) {
                AbstractC6492s.i(connectionDuration, "connectionDuration");
                return new d.a(String.valueOf(connectionDuration.longValue()), new a(connectionDuration));
            }
        }

        public static final class f implements gg.C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportConnection.a f10516a;

            public f(TeleportConnection.a aVar) {
                this.f10516a = aVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(Long.valueOf(((TeleportConnection.a.b.C1440a) this.f10516a).b().b()));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(TeleportConnection.a connectionState) {
            AbstractC6492s.i(connectionState, "connectionState");
            if (connectionState instanceof TeleportConnection.a.C1439a) {
                return gg.i.K0(new d.a("disconnected", a.f10510a));
            }
            if (connectionState instanceof TeleportConnection.a.b.AbstractC1441b) {
                return gg.i.K0(new d.a("connecting", b.f10511a));
            }
            if (!(connectionState instanceof TeleportConnection.a.b.C1440a)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVarI = z.i(new f(connectionState));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI.K(c.f10512a).N0(d.f10513a).N0(C0421e.f10514a).e1();
        }
    }

    public e(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f10472g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, C.class), null);
        th.l[] lVarArr = f10471z;
        this.f10473h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10474i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, UiSSOAccountManager.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10475j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, TeleportConnection.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10476k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, com.ui.wifiman.model.teleport.g.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10477l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, a.InterfaceC0616a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10478m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, Zc.f.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10479n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, Cc.n.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10480o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, InterfaceC6084a.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f10481p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, Id.h.class), null).a(this, lVarArr[8]);
        Fg.a aVarJ2 = Fg.a.j2();
        AbstractC6492s.h(aVarJ2, "create(...)");
        this.f10482q = aVarJ2;
        gg.i iVarW = G0().c().I1(C0420e.f10499a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f10483r = iVarW;
        gg.i iVarI2 = aVarJ2.X0(Gg.a.a()).U0(K0().getState().N0(u.f10507a).W().f0(new v()).E0()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f10484s = iVarI2;
        gg.i iVarW2 = K0().getState().I1(w.f10509a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f10485t = iVarW2;
        gg.i iVarI22 = gg.i.t(J0().getState(), K0().getState(), L0().a(), H0().a(), new t()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f10486u = iVarI22;
        gg.i iVarW3 = K0().getState().N0(new c()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f10487v = iVarW3;
        gg.i iVarW4 = I0().b().N0(f.f10500a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f10488w = iVarW4;
        gg.i iVarW5 = gg.i.r(L0().a(), iVarW4, iVarW3, K0().getState(), iVarW2, M0().getState(), new s()).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f10489x = AbstractC8661g.h0(this, iVarW5, null, null, 2, null);
        this.f10490y = AbstractC8661g.d0(this, iVarI2, Boolean.FALSE, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rf.e A0(com.ui.wifiman.model.teleport.h hVar) {
        String strJ;
        InterfaceC7929a aVar;
        String strL;
        com.ui.wifiman.ui.teleport.z zVarC0 = C0(hVar != null ? hVar.s() : null);
        if (hVar == null || (strJ = hVar.j()) == null) {
            strJ = "no_console";
        }
        String str = strJ;
        if (hVar == null || (aVar = E0(hVar)) == null) {
            aVar = new b.a(R.drawable.ic_ubiquiti_u_128, null, null, 6, null);
        }
        return new rf.e(str, aVar, (hVar == null || (strL = hVar.l()) == null) ? new d.b(R.string.teleport_tunnel_name_unknown) : new d.c(strL), com.ui.wifiman.ui.teleport.C.d(zVarC0), zVarC0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y B0(TeleportConnection.a aVar) {
        if (aVar instanceof TeleportConnection.a.b.C1440a) {
            return y.a.f45163a;
        }
        if (aVar instanceof TeleportConnection.a.b.AbstractC1441b) {
            return new y.b(aVar.a());
        }
        if (aVar instanceof TeleportConnection.a.C1439a) {
            return y.c.f45165a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final AbstractC5912b D0() {
        AbstractC5912b abstractC5912bO = K0().connect().O(new b());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    private final AbstractC5912b F0() {
        AbstractC5912b abstractC5912bO = K0().disconnect().O(d.f10498a);
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    private final UiSSOAccountManager G0() {
        return (UiSSOAccountManager) this.f10474i.getValue();
    }

    private final a.InterfaceC0616a H0() {
        return (a.InterfaceC0616a) this.f10477l.getValue();
    }

    private final Cc.n I0() {
        return (Cc.n) this.f10479n.getValue();
    }

    private final Zc.f J0() {
        return (Zc.f) this.f10478m.getValue();
    }

    private final TeleportConnection K0() {
        return (TeleportConnection) this.f10475j.getValue();
    }

    private final C L0() {
        return (C) this.f10473h.getValue();
    }

    private final Id.h M0() {
        return (Id.h) this.f10481p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a N0() {
        return (InterfaceC6084a) this.f10480o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d y0(h.a aVar) {
        if ((aVar instanceof h.a.d) || (aVar instanceof h.a.C0376a) || (aVar instanceof h.a.b)) {
            return null;
        }
        if (!(aVar instanceof h.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        a.c cVarA = ((h.a.c) aVar).a();
        if ((cVarA instanceof a.c.e) || (cVarA instanceof a.c.f) || (cVarA instanceof a.c.C0372c) || (cVarA instanceof a.c.b) || (cVarA instanceof a.c.C0371a) || (cVarA instanceof a.c.g)) {
            return null;
        }
        if (cVarA instanceof a.c.d) {
            return new d.b(R.string.teleport_console_error_no_network_connection_button);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d z0(long j10) {
        return L8.b.b(W7.a.f23676b.b(j10 * 8), 0, 1, null);
    }

    @Override // Id.f
    public Id.c B(UnifiTeleportTunnel.Error error) {
        return f.a.a(this, error);
    }

    public com.ui.wifiman.ui.teleport.z C0(Fd.B b10) {
        return d.a.a(this, b10);
    }

    public InterfaceC7929a E0(com.ui.wifiman.model.teleport.h hVar) {
        return d.a.b(this, hVar);
    }

    public Id.c O0(TeleportConnection.Error error) {
        return f.a.c(this, error);
    }

    @Override // Id.f
    public Id.c S(UnifiConsoleConnectionError unifiConsoleConnectionError) {
        return f.a.d(this, unifiConsoleConnectionError);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f10472g;
    }

    @Override // com.ui.wifiman.ui.teleport.B
    public N n0() {
        return this.f10489x;
    }

    @Override // com.ui.wifiman.ui.teleport.B
    public N o0() {
        return this.f10490y;
    }

    @Override // com.ui.wifiman.ui.teleport.B
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = K0().getState().o0().A(g.f10501a).t(h.f10502a).g(N0().a(InterfaceC6084a.b.C1828b.f48920a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }

    @Override // com.ui.wifiman.ui.teleport.B
    public void q0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f10486u.o0().t(new i());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // com.ui.wifiman.ui.teleport.B
    public void r0(boolean z10) {
        if (z10) {
            this.f10482q.h(Boolean.TRUE);
            C8658d.f66727a.d(D0(), this);
        } else {
            this.f10482q.h(Boolean.FALSE);
            C8658d.f66727a.d(F0(), this);
        }
    }

    @Override // Id.f
    public Id.c t(TeleportCloud.Error error) {
        return f.a.b(this, error);
    }
}
