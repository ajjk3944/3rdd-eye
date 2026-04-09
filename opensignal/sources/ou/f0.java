package ou;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f19904a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f19905b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f19906c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        br.l.e(inetSocketAddress, "socketAddress");
        this.f19904a = aVar;
        this.f19905b = proxy;
        this.f19906c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return br.l.a(f0Var.f19904a, this.f19904a) && br.l.a(f0Var.f19905b, this.f19905b) && br.l.a(f0Var.f19906c, this.f19906c);
    }

    public final int hashCode() {
        return this.f19906c.hashCode() + ((this.f19905b.hashCode() + ((this.f19904a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f19906c + '}';
    }
}
