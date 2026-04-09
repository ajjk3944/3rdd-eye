package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.s;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final s f17464a;

    /* renamed from: b, reason: collision with root package name */
    final n f17465b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f17466c;

    /* renamed from: d, reason: collision with root package name */
    final b f17467d;

    /* renamed from: e, reason: collision with root package name */
    final List<w> f17468e;

    /* renamed from: f, reason: collision with root package name */
    final List<j> f17469f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f17470g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    final Proxy f17471h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    final SSLSocketFactory f17472i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    final HostnameVerifier f17473j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    final f f17474k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f17464a = new s.a().f(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").b(str).a(i10).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f17465b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f17466c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f17467d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f17468e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f17469f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f17470g = proxySelector;
        this.f17471h = proxy;
        this.f17472i = sSLSocketFactory;
        this.f17473j = hostnameVerifier;
        this.f17474k = fVar;
    }

    @Nullable
    public f a() {
        return this.f17474k;
    }

    public List<j> b() {
        return this.f17469f;
    }

    public n c() {
        return this.f17465b;
    }

    @Nullable
    public HostnameVerifier d() {
        return this.f17473j;
    }

    public List<w> e() {
        return this.f17468e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17464a.equals(aVar.f17464a) && a(aVar);
    }

    @Nullable
    public Proxy f() {
        return this.f17471h;
    }

    public b g() {
        return this.f17467d;
    }

    public ProxySelector h() {
        return this.f17470g;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f17464a.hashCode() + 527) * 31) + this.f17465b.hashCode()) * 31) + this.f17467d.hashCode()) * 31) + this.f17468e.hashCode()) * 31) + this.f17469f.hashCode()) * 31) + this.f17470g.hashCode()) * 31;
        Proxy proxy = this.f17471h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f17472i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f17473j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f17474k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f17466c;
    }

    @Nullable
    public SSLSocketFactory j() {
        return this.f17472i;
    }

    public s k() {
        return this.f17464a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f17464a.g());
        sb.append(":");
        sb.append(this.f17464a.j());
        if (this.f17471h != null) {
            sb.append(", proxy=");
            sb.append(this.f17471h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f17470g);
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean a(a aVar) {
        return this.f17465b.equals(aVar.f17465b) && this.f17467d.equals(aVar.f17467d) && this.f17468e.equals(aVar.f17468e) && this.f17469f.equals(aVar.f17469f) && this.f17470g.equals(aVar.f17470g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17471h, aVar.f17471h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17472i, aVar.f17472i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17473j, aVar.f17473j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17474k, aVar.f17474k) && k().j() == aVar.k().j();
    }
}
