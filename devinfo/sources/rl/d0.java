package rl;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f33052a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f33053b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f33054c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        nk.k.e(inetSocketAddress, "socketAddress");
        this.f33052a = aVar;
        this.f33053b = proxy;
        this.f33054c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return nk.k.a(d0Var.f33052a, this.f33052a) && nk.k.a(d0Var.f33053b, this.f33053b) && nk.k.a(d0Var.f33054c, this.f33054c);
    }

    public final int hashCode() {
        return this.f33054c.hashCode() + ((this.f33053b.hashCode() + ((this.f33052a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        n nVar = this.f33052a.f33026h;
        String str = nVar.f33116d;
        InetSocketAddress inetSocketAddress = this.f33054c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : sl.e.b(hostAddress);
        if (vk.i.z0(str, ':')) {
            sb2.append("[");
            sb2.append(str);
            sb2.append("]");
        } else {
            sb2.append(str);
        }
        if (nVar.f33117e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb2.append(":");
            sb2.append(nVar.f33117e);
        }
        if (!str.equals(strB)) {
            if (this.f33053b.equals(Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strB == null) {
                sb2.append("<unresolved>");
            } else if (vk.i.z0(strB, ':')) {
                sb2.append("[");
                sb2.append(strB);
                sb2.append("]");
            } else {
                sb2.append(strB);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
