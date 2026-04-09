package U9;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: Route.kt */
/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final C1604a f12594a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f12595b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f12596c;

    public H(C1604a c1604a, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.l.f(socketAddress, "socketAddress");
        this.f12594a = c1604a;
        this.f12595b = proxy;
        this.f12596c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return kotlin.jvm.internal.l.b(h10.f12594a, this.f12594a) && kotlin.jvm.internal.l.b(h10.f12595b, this.f12595b) && kotlin.jvm.internal.l.b(h10.f12596c, this.f12596c);
    }

    public final int hashCode() {
        return this.f12596c.hashCode() + ((this.f12595b.hashCode() + ((this.f12594a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f12596c + '}';
    }
}
