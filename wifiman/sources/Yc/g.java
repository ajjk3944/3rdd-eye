package Yc;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import gg.EnumC5911a;
import gg.i;
import gg.j;
import gg.k;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public abstract class g implements Yc.c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f24871c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f24872a;

    /* renamed from: b, reason: collision with root package name */
    private final i f24873b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f24874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24875b;

        b(j jVar, String str) {
            this.f24874a = jVar;
            this.f24875b = str;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC6492s.i(network, "network");
            super.onAvailable(network);
            this.f24874a.h(new C6556a(network));
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onAvailable", null, 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            AbstractC6492s.i(network, "network");
            super.onBlockedStatusChanged(network, z10);
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onBlockedStatusChanged " + z10, null, 2, null);
            j jVar = this.f24874a;
            if (z10) {
                network = null;
            }
            jVar.h(new C6556a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC6492s.i(network, "network");
            AbstractC6492s.i(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onCapabilitiesChanged", null, 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            AbstractC6492s.i(network, "network");
            AbstractC6492s.i(linkProperties, "linkProperties");
            super.onLinkPropertiesChanged(network, linkProperties);
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onLinkPropertiesChanged", null, 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i10) {
            AbstractC6492s.i(network, "network");
            super.onLosing(network, i10);
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onLosing " + i10, null, 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC6492s.i(network, "network");
            super.onLost(network);
            this.f24874a.h(new C6556a(null));
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onLost", null, 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            Z7.b.h("AndroidNetwork " + this.f24875b + " - onUnavailable", null, 2, null);
            this.f24874a.h(new C6556a(null));
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24876a;

        c(String str) {
            this.f24876a = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("AndroidNetwork " + this.f24876a + " - Subscribed", null, 2, null);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f24877a = new d();

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24878a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof RuntimeException)) {
                    return i.k0(error);
                }
                Z7.b.j("App has probably too many callbacks registered", error, null, 4, null);
                return i.d2(5000L, TimeUnit.MILLISECONDS);
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f24878a);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24879a;

        e(String str) {
            this.f24879a = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("AndroidNetwork " + this.f24879a + " - " + (it.b() == null ? "Unavailable" : "Available"), null, 2, null);
        }
    }

    public g(String id2, NetworkRequest networkRequest, ConnectivityManager connectivityManager) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(connectivityManager, "connectivityManager");
        this.f24872a = connectivityManager;
        this.f24873b = d(id2, networkRequest);
    }

    private final i d(final String str, final NetworkRequest networkRequest) {
        i iVarI2 = i.N(new k() { // from class: Yc.d
            @Override // gg.k
            public final void a(j jVar) {
                g.f(networkRequest, this, str, jVar);
            }
        }, EnumC5911a.LATEST).g0(new c(str)).Z(new InterfaceC6464a() { // from class: Yc.e
            @Override // kg.InterfaceC6464a
            public final void run() {
                g.h(str);
            }
        }).g2(Gg.a.d()).F1(Gg.a.d()).p1(d.f24877a).e1().W().Y0(Gg.a.a(), false, 1).f0(new e(str)).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(NetworkRequest networkRequest, final g gVar, String str, j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final b bVar = new b(emitter, str);
        emitter.d(new InterfaceC6468e() { // from class: Yc.f
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                g.g(this.f24869a, bVar);
            }
        });
        if (networkRequest != null) {
            gVar.f24872a.requestNetwork(networkRequest, bVar, 2000);
        } else {
            gVar.f24872a.registerDefaultNetworkCallback(bVar);
            emitter.h(new C6556a(gVar.f24872a.getActiveNetwork()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(g gVar, b bVar) {
        try {
            gVar.f24872a.unregisterNetworkCallback(bVar);
        } catch (RuntimeException e10) {
            Z7.b.e("Failed to unregister network callback", e10, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str) {
        Z7.b.h("AndroidNetwork " + str + " - Finished", null, 2, null);
    }

    @Override // Yc.c
    public i e() {
        return this.f24873b;
    }
}
