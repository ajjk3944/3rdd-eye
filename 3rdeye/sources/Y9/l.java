package Y9;

import E.u;
import H6.I;
import U9.C1604a;
import U9.H;
import U9.InterfaceC1608e;
import U9.o;
import U9.t;
import c9.C2091l;
import c9.C2095p;
import c9.C2099t;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RouteSelector.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C1604a f13883a;

    /* renamed from: b, reason: collision with root package name */
    public final I f13884b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1608e f13885c;

    /* renamed from: d, reason: collision with root package name */
    public final o.a f13886d;

    /* renamed from: e, reason: collision with root package name */
    public final List<? extends Proxy> f13887e;

    /* renamed from: f, reason: collision with root package name */
    public int f13888f;

    /* renamed from: g, reason: collision with root package name */
    public Object f13889g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f13890h;

    /* compiled from: RouteSelector.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f13891a;

        /* renamed from: b, reason: collision with root package name */
        public int f13892b;

        public a(ArrayList arrayList) {
            this.f13891a = arrayList;
        }

        public final boolean a() {
            return this.f13892b < this.f13891a.size();
        }
    }

    public l(C1604a c1604a, I routeDatabase, InterfaceC1608e call, o.a eventListener) {
        List<? extends Proxy> listK;
        kotlin.jvm.internal.l.f(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        this.f13883a = c1604a;
        this.f13884b = routeDatabase;
        this.f13885c = call;
        this.f13886d = eventListener;
        C2099t c2099t = C2099t.f18581b;
        this.f13887e = c2099t;
        this.f13889g = c2099t;
        this.f13890h = new ArrayList();
        t url = c1604a.f12604h;
        kotlin.jvm.internal.l.f(url, "url");
        URI uriI = url.i();
        if (uriI.getHost() == null) {
            listK = V9.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = c1604a.f12603g.select(uriI);
            List<Proxy> list = proxiesOrNull;
            if (list == null || list.isEmpty()) {
                listK = V9.b.k(Proxy.NO_PROXY);
            } else {
                kotlin.jvm.internal.l.e(proxiesOrNull, "proxiesOrNull");
                listK = V9.b.w(proxiesOrNull);
            }
        }
        this.f13887e = listK;
        this.f13888f = 0;
    }

    public final boolean a() {
        return this.f13888f < this.f13887e.size() || !this.f13890h.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    public final a b() throws IOException {
        String hostName;
        int port;
        List listG;
        boolean zContains;
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f13888f < this.f13887e.size()) {
            boolean z10 = this.f13888f < this.f13887e.size();
            C1604a c1604a = this.f13883a;
            if (!z10) {
                throw new SocketException("No route to " + c1604a.f12604h.f12715d + "; exhausted proxy configurations: " + this.f13887e);
            }
            List<? extends Proxy> list = this.f13887e;
            int i = this.f13888f;
            this.f13888f = i + 1;
            Proxy proxy = list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.f13889g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                t tVar = c1604a.f12604h;
                hostName = tVar.f12715d;
                port = tVar.f12716e;
            } else {
                SocketAddress proxyAddress = proxy.address();
                if (!(proxyAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                }
                kotlin.jvm.internal.l.e(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                kotlin.jvm.internal.l.f(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostName = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.l.e(hostName, "hostName");
                } else {
                    hostName = address.getHostAddress();
                    kotlin.jvm.internal.l.e(hostName, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                byte[] bArr = V9.b.f13053a;
                kotlin.jvm.internal.l.f(hostName, "<this>");
                if (V9.b.f13058f.a(hostName)) {
                    listG = u.G(InetAddress.getByName(hostName));
                } else {
                    this.f13886d.getClass();
                    InterfaceC1608e call = this.f13885c;
                    kotlin.jvm.internal.l.f(call, "call");
                    c1604a.f12597a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostName);
                        kotlin.jvm.internal.l.e(allByName, "getAllByName(hostname)");
                        List listT = C2091l.t(allByName);
                        if (listT.isEmpty()) {
                            throw new UnknownHostException(c1604a.f12597a + " returned no addresses for " + hostName);
                        }
                        listG = listT;
                    } catch (NullPointerException e4) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e4);
                        throw unknownHostException;
                    }
                }
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                }
            }
            Iterator it2 = this.f13889g.iterator();
            while (it2.hasNext()) {
                H h10 = new H(this.f13883a, proxy, (InetSocketAddress) it2.next());
                I i10 = this.f13884b;
                synchronized (i10) {
                    zContains = ((LinkedHashSet) i10.f2053c).contains(h10);
                }
                if (zContains) {
                    this.f13890h.add(h10);
                } else {
                    arrayList.add(h10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C2095p.b0(this.f13890h, arrayList);
            this.f13890h.clear();
        }
        return new a(arrayList);
    }
}
