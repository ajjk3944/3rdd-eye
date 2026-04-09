package U9;

import U9.t;
import g0.C4356c;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Address.kt */
/* renamed from: U9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1604a {

    /* renamed from: a, reason: collision with root package name */
    public final n f12597a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f12598b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f12599c;

    /* renamed from: d, reason: collision with root package name */
    public final ga.d f12600d;

    /* renamed from: e, reason: collision with root package name */
    public final C1610g f12601e;

    /* renamed from: f, reason: collision with root package name */
    public final C1605b f12602f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f12603g;

    /* renamed from: h, reason: collision with root package name */
    public final t f12604h;
    public final List<y> i;

    /* renamed from: j, reason: collision with root package name */
    public final List<j> f12605j;

    public C1604a(String uriHost, int i, n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, ga.d dVar, C1610g c1610g, C1605b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.l.f(uriHost, "uriHost");
        kotlin.jvm.internal.l.f(dns, "dns");
        kotlin.jvm.internal.l.f(socketFactory, "socketFactory");
        kotlin.jvm.internal.l.f(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        kotlin.jvm.internal.l.f(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.l.f(proxySelector, "proxySelector");
        this.f12597a = dns;
        this.f12598b = socketFactory;
        this.f12599c = sSLSocketFactory;
        this.f12600d = dVar;
        this.f12601e = c1610g;
        this.f12602f = proxyAuthenticator;
        this.f12603g = proxySelector;
        t.a aVar = new t.a();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            aVar.f12721a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            aVar.f12721a = "https";
        }
        String strB = T1.B.B(t.b.c(0, 0, 7, uriHost));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        aVar.f12724d = strB;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(C4356c.h(i, "unexpected port: ").toString());
        }
        aVar.f12725e = i;
        this.f12604h = aVar.a();
        this.i = V9.b.w(protocols);
        this.f12605j = V9.b.w(connectionSpecs);
    }

    public final boolean a(C1604a that) {
        kotlin.jvm.internal.l.f(that, "that");
        return kotlin.jvm.internal.l.b(this.f12597a, that.f12597a) && kotlin.jvm.internal.l.b(this.f12602f, that.f12602f) && kotlin.jvm.internal.l.b(this.i, that.i) && kotlin.jvm.internal.l.b(this.f12605j, that.f12605j) && kotlin.jvm.internal.l.b(this.f12603g, that.f12603g) && kotlin.jvm.internal.l.b(this.f12599c, that.f12599c) && kotlin.jvm.internal.l.b(this.f12600d, that.f12600d) && kotlin.jvm.internal.l.b(this.f12601e, that.f12601e) && this.f12604h.f12716e == that.f12604h.f12716e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1604a)) {
            return false;
        }
        C1604a c1604a = (C1604a) obj;
        return kotlin.jvm.internal.l.b(this.f12604h, c1604a.f12604h) && a(c1604a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f12601e) + ((Objects.hashCode(this.f12600d) + ((Objects.hashCode(this.f12599c) + ((this.f12603g.hashCode() + ((this.f12605j.hashCode() + ((this.i.hashCode() + ((this.f12602f.hashCode() + ((this.f12597a.hashCode() + B4.g.n(527, 31, this.f12604h.i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        t tVar = this.f12604h;
        sb.append(tVar.f12715d);
        sb.append(':');
        sb.append(tVar.f12716e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f12603g);
        sb.append('}');
        return sb.toString();
    }
}
