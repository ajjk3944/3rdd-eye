package com.yandex.mobile.ads.impl;

import N7.H7;
import c9.C2095p;
import c9.C2099t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ss1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta f33195a;

    /* renamed from: b, reason: collision with root package name */
    private final qs1 f33196b;

    /* renamed from: c, reason: collision with root package name */
    private final hn f33197c;

    /* renamed from: d, reason: collision with root package name */
    private final r50 f33198d;

    /* renamed from: e, reason: collision with root package name */
    private List<? extends Proxy> f33199e;

    /* renamed from: f, reason: collision with root package name */
    private int f33200f;

    /* renamed from: g, reason: collision with root package name */
    private List<? extends InetSocketAddress> f33201g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f33202h;

    public static final class a {
        public static String a(InetSocketAddress inetSocketAddress) {
            kotlin.jvm.internal.l.f(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                kotlin.jvm.internal.l.e(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            kotlin.jvm.internal.l.e(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<ps1> f33203a;

        /* renamed from: b, reason: collision with root package name */
        private int f33204b;

        public b(ArrayList routes) {
            kotlin.jvm.internal.l.f(routes, "routes");
            this.f33203a = routes;
        }

        public final List<ps1> a() {
            return this.f33203a;
        }

        public final boolean b() {
            return this.f33204b < this.f33203a.size();
        }

        public final ps1 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<ps1> list = this.f33203a;
            int i = this.f33204b;
            this.f33204b = i + 1;
            return list.get(i);
        }
    }

    public ss1(ta address, qs1 routeDatabase, tn1 call, r50 eventListener) {
        kotlin.jvm.internal.l.f(address, "address");
        kotlin.jvm.internal.l.f(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        this.f33195a = address;
        this.f33196b = routeDatabase;
        this.f33197c = call;
        this.f33198d = eventListener;
        C2099t c2099t = C2099t.f18581b;
        this.f33199e = c2099t;
        this.f33201g = c2099t;
        this.f33202h = new ArrayList();
        a(address.k(), address.f());
    }

    private final Proxy c() throws IOException {
        if (this.f33200f < this.f33199e.size()) {
            List<? extends Proxy> list = this.f33199e;
            int i = this.f33200f;
            this.f33200f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f33195a.k().g() + "; exhausted proxy configurations: " + this.f33199e);
    }

    public final boolean a() {
        return this.f33200f < this.f33199e.size() || !this.f33202h.isEmpty();
    }

    public final b b() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f33200f < this.f33199e.size()) {
            Proxy proxyC = c();
            Iterator<? extends InetSocketAddress> it = this.f33201g.iterator();
            while (it.hasNext()) {
                ps1 ps1Var = new ps1(this.f33195a, proxyC, it.next());
                if (this.f33196b.c(ps1Var)) {
                    this.f33202h.add(ps1Var);
                } else {
                    arrayList.add(ps1Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C2095p.b0(this.f33202h, arrayList);
            this.f33202h.clear();
        }
        return new b(arrayList);
    }

    private final void a(Proxy proxy) throws IOException {
        String strG;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f33201g = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                kotlin.jvm.internal.l.c(socketAddressAddress);
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a.a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(H7.o(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
            }
        } else {
            strG = this.f33195a.k().g();
            i = this.f33195a.k().i();
        }
        if (1 <= i && i < 65536) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(strG, i));
                return;
            }
            r50 r50Var = this.f33198d;
            hn hnVar = this.f33197c;
            r50Var.getClass();
            r50.a(hnVar, strG);
            List<InetAddress> listA = this.f33195a.c().a(strG);
            if (!listA.isEmpty()) {
                r50 r50Var2 = this.f33198d;
                hn hnVar2 = this.f33197c;
                r50Var2.getClass();
                r50.a(hnVar2, strG, listA);
                Iterator<InetAddress> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InetSocketAddress(it.next(), i));
                }
                return;
            }
            throw new UnknownHostException(this.f33195a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + StringUtils.PROCESS_POSTFIX_DELIMITER + i + "; port is out of range");
    }

    private final void a(rh0 url, Proxy proxy) {
        List<? extends Proxy> proxies;
        r50 r50Var = this.f33198d;
        hn call = this.f33197c;
        r50Var.getClass();
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(url, "url");
        if (proxy != null) {
            proxies = E.u.G(proxy);
        } else {
            URI uriL = url.l();
            if (uriL.getHost() == null) {
                proxies = t82.a(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = this.f33195a.h().select(uriL);
                if (listSelect != null && !listSelect.isEmpty()) {
                    proxies = t82.b(listSelect);
                } else {
                    proxies = t82.a(Proxy.NO_PROXY);
                }
            }
        }
        this.f33199e = proxies;
        this.f33200f = 0;
        r50 r50Var2 = this.f33198d;
        hn call2 = this.f33197c;
        r50Var2.getClass();
        kotlin.jvm.internal.l.f(call2, "call");
        kotlin.jvm.internal.l.f(proxies, "proxies");
    }
}
