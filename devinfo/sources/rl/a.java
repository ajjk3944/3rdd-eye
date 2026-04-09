package rl;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f33020a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f33021b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f33022c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f33023d;

    /* renamed from: e, reason: collision with root package name */
    public final e f33024e;

    /* renamed from: f, reason: collision with root package name */
    public final b f33025f;
    public final ProxySelector g;

    /* renamed from: h, reason: collision with root package name */
    public final n f33026h;

    /* renamed from: i, reason: collision with root package name */
    public final List f33027i;
    public final List j;

    public a(String str, int i4, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, fm.c cVar, e eVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        nk.k.e(str, "uriHost");
        nk.k.e(bVar, "dns");
        nk.k.e(socketFactory, "socketFactory");
        nk.k.e(bVar2, "proxyAuthenticator");
        nk.k.e(list, "protocols");
        nk.k.e(list2, "connectionSpecs");
        nk.k.e(proxySelector, "proxySelector");
        this.f33020a = bVar;
        this.f33021b = socketFactory;
        this.f33022c = sSLSocketFactory;
        this.f33023d = cVar;
        this.f33024e = eVar;
        this.f33025f = bVar2;
        this.g = proxySelector;
        ed.a0 a0Var = new ed.a0(1);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            a0Var.f23258c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            a0Var.f23258c = "https";
        }
        String strB = sl.e.b(gm.a.d(0, 0, 7, str));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        a0Var.f23261f = strB;
        if (1 > i4 || i4 >= 65536) {
            throw new IllegalArgumentException(je.u.r(i4, "unexpected port: ").toString());
        }
        a0Var.f23257b = i4;
        this.f33026h = a0Var.b();
        this.f33027i = sl.h.j(list);
        this.j = sl.h.j(list2);
    }

    public final boolean a(a aVar) {
        nk.k.e(aVar, "that");
        return nk.k.a(this.f33020a, aVar.f33020a) && nk.k.a(this.f33025f, aVar.f33025f) && nk.k.a(this.f33027i, aVar.f33027i) && nk.k.a(this.j, aVar.j) && nk.k.a(this.g, aVar.g) && nk.k.a(this.f33022c, aVar.f33022c) && nk.k.a(this.f33023d, aVar.f33023d) && nk.k.a(this.f33024e, aVar.f33024e) && this.f33026h.f33117e == aVar.f33026h.f33117e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return nk.k.a(this.f33026h, aVar.f33026h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f33024e) + ((Objects.hashCode(this.f33023d) + ((Objects.hashCode(this.f33022c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.f33027i.hashCode() + ((this.f33025f.hashCode() + ((this.f33020a.hashCode() + je.u.m(527, 31, this.f33026h.f33120i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        n nVar = this.f33026h;
        sb2.append(nVar.f33116d);
        sb2.append(':');
        sb2.append(nVar.f33117e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.g);
        sb2.append('}');
        return sb2.toString();
    }
}
