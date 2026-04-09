package ou;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f19851a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f19852b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f19853c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f19854d;

    /* renamed from: e, reason: collision with root package name */
    public final j f19855e;

    /* renamed from: f, reason: collision with root package name */
    public final b f19856f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f19857g;

    /* renamed from: h, reason: collision with root package name */
    public final t f19858h;

    /* renamed from: i, reason: collision with root package name */
    public final List f19859i;
    public final List j;

    public a(String str, int i10, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j jVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        br.l.e(str, "uriHost");
        br.l.e(bVar, "dns");
        br.l.e(socketFactory, "socketFactory");
        br.l.e(bVar2, "proxyAuthenticator");
        br.l.e(list, "protocols");
        br.l.e(list2, "connectionSpecs");
        br.l.e(proxySelector, "proxySelector");
        this.f19851a = bVar;
        this.f19852b = socketFactory;
        this.f19853c = sSLSocketFactory;
        this.f19854d = hostnameVerifier;
        this.f19855e = jVar;
        this.f19856f = bVar2;
        this.f19857g = proxySelector;
        ee.x xVar = new ee.x(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            xVar.f8166c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            xVar.f8166c = "https";
        }
        String strG = a.a.G(b.e(str, 0, 0, 7));
        if (strG == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        xVar.f8169f = strG;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(h0.b.h(i10, "unexpected port: ").toString());
        }
        xVar.f8165b = i10;
        this.f19858h = xVar.b();
        this.f19859i = pu.b.w(list);
        this.j = pu.b.w(list2);
    }

    public final boolean a(a aVar) {
        br.l.e(aVar, "that");
        return br.l.a(this.f19851a, aVar.f19851a) && br.l.a(this.f19856f, aVar.f19856f) && br.l.a(this.f19859i, aVar.f19859i) && br.l.a(this.j, aVar.j) && br.l.a(this.f19857g, aVar.f19857g) && br.l.a(this.f19853c, aVar.f19853c) && br.l.a(this.f19854d, aVar.f19854d) && br.l.a(this.f19855e, aVar.f19855e) && this.f19858h.f19971e == aVar.f19858h.f19971e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f19858h, aVar.f19858h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19855e) + ((Objects.hashCode(this.f19854d) + ((Objects.hashCode(this.f19853c) + ((this.f19857g.hashCode() + h0.b.c(h0.b.c((this.f19856f.hashCode() + ((this.f19851a.hashCode() + c7.a.g(this.f19858h.f19974h, 527, 31)) * 31)) * 31, 31, this.f19859i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        t tVar = this.f19858h;
        sb2.append(tVar.f19970d);
        sb2.append(':');
        sb2.append(tVar.f19971e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f19857g);
        sb2.append('}');
        return sb2.toString();
    }
}
