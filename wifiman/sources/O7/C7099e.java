package o7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import gg.EnumC5911a;
import kg.InterfaceC6468e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import o7.AbstractC7095a;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7099e implements InterfaceC7096b {

    /* renamed from: b, reason: collision with root package name */
    private final Context f55513b;

    /* renamed from: c, reason: collision with root package name */
    private final q f55514c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f55515d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f55516e;

    /* renamed from: o7.e$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectivityManager invoke() {
            Object systemService = C7099e.this.f55513b.getSystemService("connectivity");
            AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            return (ConnectivityManager) systemService;
        }
    }

    /* renamed from: o7.e$b */
    public static final class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.j f55518a;

        /* renamed from: o7.e$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Network f55519a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Network network) {
                super(0);
                this.f55519a = network;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onAvailable - " + this.f55519a;
            }
        }

        /* renamed from: o7.e$b$b, reason: collision with other inner class name */
        static final class C2005b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Network f55520a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ NetworkCapabilities f55521b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2005b(Network network, NetworkCapabilities networkCapabilities) {
                super(0);
                this.f55520a = network;
                this.f55521b = networkCapabilities;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onCapabilitiesChanged - " + this.f55520a + " - " + this.f55521b;
            }
        }

        /* renamed from: o7.e$b$c */
        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f55522a = new c();

            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onUnavailable";
            }
        }

        b(gg.j jVar) {
            this.f55518a = jVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC6492s.i(network, "network");
            v7.d.b(new a(network));
            this.f55518a.h(new AbstractC7095a.C2004a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC6492s.i(network, "network");
            AbstractC6492s.i(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            v7.d.b(new C2005b(network, networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            v7.d.b(c.f55522a);
            this.f55518a.h(AbstractC7095a.b.f55506a);
        }
    }

    /* renamed from: o7.e$c */
    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WifiManager invoke() {
            Object systemService = C7099e.this.f55513b.getApplicationContext().getSystemService("wifi");
            AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            return (WifiManager) systemService;
        }
    }

    public C7099e(Context context, q systemInfo) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(systemInfo, "systemInfo");
        this.f55513b = context;
        this.f55514c = systemInfo;
        this.f55515d = Yg.n.b(new a());
        this.f55516e = Yg.n.b(new c());
    }

    private final boolean g() {
        return this.f55514c.c() >= 22 && !h();
    }

    private final boolean h() {
        return this.f55514c.c() >= 23 && AbstractC6492s.d(this.f55514c.b(), "6.0") && !this.f55514c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final C7099e this$0, gg.j emitter) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(emitter, "emitter");
        if (!this$0.g()) {
            emitter.h(AbstractC7095a.c.f55507a);
            emitter.a();
            return;
        }
        final b bVar = new b(emitter);
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(4);
        builder.addTransportType(3);
        builder.addTransportType(1);
        this$0.b().registerNetworkCallback(builder.build(), bVar);
        emitter.d(new InterfaceC6468e() { // from class: o7.d
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                C7099e.j(this.f55511a, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C7099e this$0, b callback) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(callback, "$callback");
        this$0.b().unregisterNetworkCallback(callback);
    }

    @Override // o7.InterfaceC7096b
    public gg.i a() {
        gg.i iVarN = gg.i.N(new gg.k() { // from class: o7.c
            @Override // gg.k
            public final void a(gg.j jVar) {
                C7099e.i(this.f55510a, jVar);
            }
        }, EnumC5911a.LATEST);
        AbstractC6492s.h(iVarN, "create<AndroidNetwork>({…kpressureStrategy.LATEST)");
        return iVarN;
    }

    @Override // o7.InterfaceC7096b
    public ConnectivityManager b() {
        return (ConnectivityManager) this.f55515d.getValue();
    }

    @Override // o7.InterfaceC7096b
    public WifiManager c() {
        return (WifiManager) this.f55516e.getValue();
    }
}
