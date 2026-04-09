package Zc;

import Zc.e;
import Zg.AbstractC3689v;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import b8.EnumC4076c;
import com.ui.wifiman.model.support.a;
import ee.AbstractC5456b;
import gg.i;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tc.InterfaceC8077a;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f25283e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f25284a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ui.wifiman.model.support.a f25285b;

    /* renamed from: c, reason: collision with root package name */
    private final i f25286c;

    /* renamed from: d, reason: collision with root package name */
    private final i f25287d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25288a;

        static {
            int[] iArr = new int[NetworkInfo.DetailedState.values().length];
            try {
                iArr[NetworkInfo.DetailedState.SCANNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkInfo.DetailedState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkInfo.DetailedState.AUTHENTICATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkInfo.DetailedState.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f25288a = iArr;
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e apply(Object it) {
            AbstractC6492s.i(it, "it");
            g gVar = g.this;
            return gVar.g(gVar.e().getActiveNetwork());
        }
    }

    static final class d implements InterfaceC6469f {
        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(e it) {
            AbstractC6492s.i(it, "it");
            g.this.f25285b.b(new a.AbstractC1437a.d(it));
            Z7.b.h("NETWORK CONNECTION UPDATE: " + it, null, 2, null);
        }
    }

    public g(ConnectivityManager connectivityManager, InterfaceC8077a androidSystemReceiverFactory, com.ui.wifiman.model.support.a supportFileDataCollector) {
        AbstractC6492s.i(connectivityManager, "connectivityManager");
        AbstractC6492s.i(androidSystemReceiverFactory, "androidSystemReceiverFactory");
        AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
        this.f25284a = connectivityManager;
        this.f25285b = supportFileDataCollector;
        i iVarA = androidSystemReceiverFactory.a(new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i iVarF1 = i.S0(AbstractC3689v.o(iVarA, i.F0(0L, 2000L, timeUnit))).U1(500L, timeUnit).e1().Y0(Gg.a.a(), false, 1).N0(new c()).W().f0(new d()).o1(1).i2().F1(Gg.a.a());
        AbstractC6492s.h(iVarF1, "subscribeOn(...)");
        this.f25286c = iVarF1;
        this.f25287d = iVarF1;
    }

    private final Integer c(InterfaceAddress interfaceAddress, boolean z10) {
        InetAddress address = interfaceAddress.getAddress();
        if (address instanceof Inet4Address) {
            return Integer.valueOf((z10 && interfaceAddress.getNetworkPrefixLength() == 32) ? (short) 24 : interfaceAddress.getNetworkPrefixLength());
        }
        if (address instanceof Inet6Address) {
            return Integer.valueOf(interfaceAddress.getNetworkPrefixLength());
        }
        return null;
    }

    private final inet.ipaddr.g d(LinkProperties linkProperties, InetAddress inetAddress) {
        InetAddress inetAddressH;
        List<RouteInfo> routes = linkProperties.getRoutes();
        AbstractC6492s.h(routes, "getRoutes(...)");
        Iterator<T> it = routes.iterator();
        while (it.hasNext()) {
            RouteInfo routeInfo = (RouteInfo) it.next();
            InetAddress gateway = routeInfo.getGateway();
            if (gateway != null && (inetAddressH = h(gateway)) != null) {
                try {
                    if (routeInfo.matches(inetAddress)) {
                        return AbstractC5456b.a(inetAddressH);
                    }
                    continue;
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Zc.e g(android.net.Network r15) throws java.net.SocketException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Zc.g.g(android.net.Network):Zc.e");
    }

    private final InetAddress h(InetAddress inetAddress) {
        if (inetAddress.getAddress() == null) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        AbstractC6492s.h(address, "getAddress(...)");
        for (byte b10 : address) {
            if (b10 != 0) {
                return inetAddress;
            }
        }
        return null;
    }

    private final e.b i(NetworkInfo.DetailedState detailedState) {
        int i10 = b.f25288a[detailedState.ordinal()];
        return (i10 == 1 || i10 == 2) ? e.b.CONNECTING : i10 != 3 ? i10 != 4 ? i10 != 5 ? e.b.DISCONNECTED : e.b.CONNECTED : e.b.OBTAINING_IP : e.b.AUTHENTICATING;
    }

    public final ConnectivityManager e() {
        return this.f25284a;
    }

    public final EnumC4076c f(NetworkCapabilities networkCapabilities) {
        AbstractC6492s.i(networkCapabilities, "<this>");
        return networkCapabilities.hasTransport(1) ? EnumC4076c.WIFI : networkCapabilities.hasTransport(0) ? EnumC4076c.MOBILE : networkCapabilities.hasTransport(3) ? EnumC4076c.ETHERNET : EnumC4076c.UNKNOWN;
    }

    @Override // Zc.f
    public i getState() {
        return this.f25287d;
    }
}
