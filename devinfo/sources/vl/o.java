package vl;

import androidx.lifecycle.f1;
import com.google.android.gms.internal.ads.dc;
import ec.t0;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import km.y;
import rl.b0;
import rl.c0;
import rl.d0;
import rl.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ul.d f36362a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f36363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36364c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36366e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36367f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36368h;

    /* renamed from: i, reason: collision with root package name */
    public final rl.a f36369i;
    public final km.i j;

    /* renamed from: k, reason: collision with root package name */
    public final m f36370k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f36371l;

    /* renamed from: m, reason: collision with root package name */
    public dc f36372m;

    /* renamed from: n, reason: collision with root package name */
    public u.l f36373n;

    /* renamed from: o, reason: collision with root package name */
    public d0 f36374o;

    /* renamed from: p, reason: collision with root package name */
    public final zj.l f36375p;

    public o(ul.d dVar, t0 t0Var, int i4, int i10, int i11, int i12, boolean z3, boolean z10, rl.a aVar, km.i iVar, m mVar, va.o oVar) {
        nk.k.e(dVar, "taskRunner");
        nk.k.e(t0Var, "connectionPool");
        nk.k.e(iVar, "routeDatabase");
        this.f36362a = dVar;
        this.f36363b = t0Var;
        this.f36364c = i4;
        this.f36365d = i10;
        this.f36366e = i11;
        this.f36367f = i12;
        this.g = z3;
        this.f36368h = z10;
        this.f36369i = aVar;
        this.j = iVar;
        this.f36370k = mVar;
        this.f36371l = !nk.k.a((String) oVar.f36147c, "GET");
        this.f36375p = new zj.l();
    }

    public final boolean a(n nVar) {
        u.l lVar;
        d0 d0Var;
        if (this.f36375p.isEmpty() && this.f36374o == null) {
            if (nVar != null) {
                synchronized (nVar) {
                    d0Var = null;
                    if (nVar.f36356l == 0 && nVar.j && sl.h.a(nVar.f36349c.f33052a.f33026h, this.f36369i.f33026h)) {
                        d0Var = nVar.f36349c;
                    }
                }
                if (d0Var != null) {
                    this.f36374o = d0Var;
                    return true;
                }
            }
            dc dcVar = this.f36372m;
            if ((dcVar == null || dcVar.f10424a >= dcVar.f10425b.size()) && (lVar = this.f36373n) != null) {
                return lVar.b();
            }
        }
        return true;
    }

    public final r b() {
        Socket socketJ;
        p pVar;
        n nVar = this.f36370k.f36338h;
        if (nVar == null) {
            pVar = null;
        } else {
            boolean zI = nVar.i(this.f36371l);
            synchronized (nVar) {
                try {
                    if (zI) {
                        socketJ = (nVar.j || !f(nVar.f36349c.f33052a.f33026h)) ? this.f36370k.j() : null;
                    } else {
                        nVar.j = true;
                        socketJ = this.f36370k.j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f36370k.f36338h == null) {
                if (socketJ != null) {
                    sl.h.c(socketJ);
                }
                pVar = null;
            } else {
                if (socketJ != null) {
                    throw new IllegalStateException("Check failed.");
                }
                pVar = new p(nVar);
            }
        }
        if (pVar != null) {
            return pVar;
        }
        p pVarE = e(null, null);
        if (pVarE != null) {
            return pVarE;
        }
        if (!this.f36375p.isEmpty()) {
            return (r) this.f36375p.removeFirst();
        }
        c cVarC = c();
        p pVarE2 = e(cVarC, cVarC.f36299k);
        return pVarE2 != null ? pVarE2 : cVarC;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.List] */
    public final c c() throws IOException {
        String hostAddress;
        int port;
        List listD;
        boolean zContains;
        d0 d0Var = this.f36374o;
        if (d0Var != null) {
            this.f36374o = null;
            return d(d0Var, null);
        }
        dc dcVar = this.f36372m;
        if (dcVar != null && dcVar.f10424a < dcVar.f10425b.size()) {
            int i4 = dcVar.f10424a;
            ArrayList arrayList = dcVar.f10425b;
            if (i4 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i10 = dcVar.f10424a;
            dcVar.f10424a = i10 + 1;
            return d((d0) arrayList.get(i10), null);
        }
        u.l lVar = this.f36373n;
        if (lVar == null) {
            lVar = new u.l(this.f36369i, this.j, this.f36370k, this.f36368h);
            this.f36373n = lVar;
        }
        if (!lVar.b()) {
            throw new IOException("exhausted all routes");
        }
        if (!lVar.b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (lVar.f34713b < ((List) lVar.f34716e).size()) {
            rl.a aVar = (rl.a) lVar.f34714c;
            if (lVar.f34713b >= ((List) lVar.f34716e).size()) {
                throw new SocketException("No route to " + aVar.f33026h.f33116d + "; exhausted proxy configurations: " + ((List) lVar.f34716e));
            }
            List list = (List) lVar.f34716e;
            int i11 = lVar.f34713b;
            lVar.f34713b = i11 + 1;
            Proxy proxy = (Proxy) list.get(i11);
            ArrayList arrayList3 = new ArrayList();
            lVar.f34717f = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                rl.n nVar = aVar.f33026h;
                hostAddress = nVar.f33116d;
                port = nVar.f33117e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    nk.k.d(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address.getHostAddress();
                    nk.k.d(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                vk.h hVar = sl.e.f33831a;
                nk.k.e(hostAddress, "<this>");
                vk.h hVar2 = sl.e.f33831a;
                hVar2.getClass();
                if (hVar2.f36288a.matcher(hostAddress).matches()) {
                    listD = cm.g.s(InetAddress.getByName(hostAddress));
                } else {
                    aVar.f33020a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        nk.k.d(allByName, "getAllByName(...)");
                        List listE0 = zj.m.e0(allByName);
                        if (listE0.isEmpty()) {
                            throw new UnknownHostException(aVar.f33020a + " returned no addresses for " + hostAddress);
                        }
                        listD = listE0;
                    } catch (NullPointerException e2) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e2);
                        throw unknownHostException;
                    }
                }
                if (lVar.f34712a && listD.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listD) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = sl.f.f33832a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        ak.c cVarF = cm.g.f();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                cVarF.add(it.next());
                            }
                            if (it2.hasNext()) {
                                cVarF.add(it2.next());
                            }
                        }
                        listD = cm.g.d(cVarF);
                    }
                }
                Iterator it3 = listD.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = lVar.f34717f.iterator();
            while (it4.hasNext()) {
                d0 d0Var2 = new d0((rl.a) lVar.f34714c, proxy, (InetSocketAddress) it4.next());
                km.i iVar = (km.i) lVar.f34715d;
                synchronized (iVar) {
                    zContains = ((LinkedHashSet) iVar.f28426b).contains(d0Var2);
                }
                if (zContains) {
                    ((ArrayList) lVar.g).add(d0Var2);
                } else {
                    arrayList2.add(d0Var2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            zj.n.W(arrayList2, (ArrayList) lVar.g);
            ((ArrayList) lVar.g).clear();
        }
        dc dcVar2 = new dc();
        dcVar2.f10425b = arrayList2;
        this.f36372m = dcVar2;
        if (this.f36370k.f36345p) {
            throw new IOException("Canceled");
        }
        if (dcVar2.f10424a >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i12 = dcVar2.f10424a;
        dcVar2.f10424a = i12 + 1;
        return d((d0) arrayList2.get(i12), arrayList2);
    }

    public final c d(d0 d0Var, ArrayList arrayList) throws UnknownServiceException {
        u uVar = u.H2_PRIOR_KNOWLEDGE;
        nk.k.e(d0Var, "route");
        rl.a aVar = d0Var.f33052a;
        if (aVar.f33022c == null) {
            if (!aVar.j.contains(rl.h.f33085f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = d0Var.f33052a.f33026h.f33116d;
            bm.e eVar = bm.e.f2349a;
            if (!bm.e.f2349a.i(str)) {
                throw new UnknownServiceException(d.h.t("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.f33027i.contains(uVar)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        va.o oVar = null;
        if (d0Var.f33053b.type() == Proxy.Type.HTTP) {
            rl.a aVar2 = d0Var.f33052a;
            if (aVar2.f33022c != null || aVar2.f33027i.contains(uVar)) {
                f1 f1Var = new f1(24);
                rl.n nVar = d0Var.f33052a.f33026h;
                nk.k.e(nVar, "url");
                f1Var.f1134b = nVar;
                f1Var.G("CONNECT", null);
                rl.a aVar3 = d0Var.f33052a;
                f1Var.C("Host", sl.h.i(aVar3.f33026h, true));
                f1Var.C("Proxy-Connection", "Keep-Alive");
                f1Var.C("User-Agent", "okhttp/5.3.2");
                oVar = new va.o(f1Var);
                b0 b0Var = c0.f33050b;
                y yVar = new y(17);
                com.bumptech.glide.d.r("Proxy-Authenticate");
                com.bumptech.glide.d.s("OkHttp-Preemptive", "Proxy-Authenticate");
                yVar.B("Proxy-Authenticate");
                com.bumptech.glide.d.j(yVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                yVar.x();
                nk.k.e(b0Var, "body");
                aVar3.f33025f.getClass();
            }
        }
        return new c(this.f36362a, this.f36363b, this.f36364c, this.f36365d, this.f36366e, this.f36367f, this.g, this.f36370k, this, d0Var, arrayList, oVar, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x0038, B:22:0x0045, B:25:0x004c), top: B:51:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final vl.p e(vl.c r11, java.util.List r12) {
        /*
            r10 = this;
            ec.t0 r0 = r10.f36363b
            boolean r1 = r10.f36371l
            rl.a r2 = r10.f36369i
            vl.m r3 = r10.f36370k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.c()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.lang.Object r0 = r0.f23072e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            nk.k.d(r0, r7)
        L25:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r0.next()
            vl.n r7 = (vl.n) r7
            nk.k.b(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L45
            yl.q r9 = r7.f36354i     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L3e
            r9 = r5
            goto L3f
        L3e:
            r9 = r4
        L3f:
            if (r9 != 0) goto L45
        L41:
            r9 = r4
            goto L50
        L43:
            r11 = move-exception
            goto L6b
        L45:
            boolean r9 = r7.f(r2, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto L4c
            goto L41
        L4c:
            r3.b(r7)     // Catch: java.lang.Throwable -> L43
            r9 = r5
        L50:
            monitor-exit(r7)
            if (r9 == 0) goto L25
            boolean r9 = r7.i(r1)
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L68
            java.net.Socket r8 = r3.j()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r7)
            if (r8 == 0) goto L25
            sl.h.c(r8)
            goto L25
        L68:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L6b:
            monitor-exit(r7)
            throw r11
        L6d:
            r7 = r8
        L6e:
            if (r7 != 0) goto L71
            return r8
        L71:
            if (r11 == 0) goto L7e
            rl.d0 r12 = r11.j
            r10.f36374o = r12
            java.net.Socket r11 = r11.f36305q
            if (r11 == 0) goto L7e
            sl.h.c(r11)
        L7e:
            vl.p r11 = new vl.p
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.o.e(vl.c, java.util.List):vl.p");
    }

    public final boolean f(rl.n nVar) {
        nk.k.e(nVar, "url");
        rl.n nVar2 = this.f36369i.f33026h;
        return nVar.f33117e == nVar2.f33117e && nk.k.a(nVar.f33116d, nVar2.f33116d);
    }
}
