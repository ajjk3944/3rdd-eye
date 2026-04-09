package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f17683a;

    /* renamed from: b, reason: collision with root package name */
    private final d f17684b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f17685c;

    /* renamed from: d, reason: collision with root package name */
    private final o f17686d;

    /* renamed from: e, reason: collision with root package name */
    private List<Proxy> f17687e;

    /* renamed from: f, reason: collision with root package name */
    private int f17688f;

    /* renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f17689g;

    /* renamed from: h, reason: collision with root package name */
    private final List<c0> f17690h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<c0> f17691a;

        /* renamed from: b, reason: collision with root package name */
        private int f17692b = 0;

        public a(List<c0> list) {
            this.f17691a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f17691a);
        }

        public boolean b() {
            return this.f17692b < this.f17691a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f17691a;
            int i10 = this.f17692b;
            this.f17692b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        List list = Collections.EMPTY_LIST;
        this.f17687e = list;
        this.f17689g = list;
        this.f17690h = new ArrayList();
        this.f17683a = aVar;
        this.f17684b = dVar;
        this.f17685c = dVar2;
        this.f17686d = oVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f17688f < this.f17687e.size();
    }

    private Proxy d() throws IOException {
        if (b()) {
            List<Proxy> list = this.f17687e;
            int i10 = this.f17688f;
            this.f17688f = i10 + 1;
            Proxy proxy = list.get(i10);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f17683a.k().g() + "; exhausted proxy configurations: " + this.f17687e);
    }

    public boolean a() {
        return b() || !this.f17690h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f17689g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = new c0(this.f17683a, proxyD, this.f17689g.get(i10));
                if (this.f17684b.c(c0Var)) {
                    this.f17690h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f17690h);
            this.f17690h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f17683a.h() != null) {
            this.f17683a.h().connectFailed(this.f17683a.k().n(), c0Var.b().address(), iOException);
        }
        this.f17684b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f17687e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f17683a.h().select(sVar.n());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f17687e = listA;
        }
        this.f17688f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f17689g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f17683a.k().g();
            iJ = this.f17683a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f17689g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f17686d.dnsStart(this.f17685c, strG);
            List<InetAddress> listA = this.f17683a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f17686d.dnsEnd(this.f17685c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f17689g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f17683a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + ":" + iJ + "; port is out of range");
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
