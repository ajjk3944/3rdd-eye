package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rh0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    private final l30 f33497a;

    /* renamed from: b, reason: collision with root package name */
    private final SocketFactory f33498b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f33499c;

    /* renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f33500d;

    /* renamed from: e, reason: collision with root package name */
    private final zn f33501e;

    /* renamed from: f, reason: collision with root package name */
    private final vh f33502f;

    /* renamed from: g, reason: collision with root package name */
    private final Proxy f33503g;

    /* renamed from: h, reason: collision with root package name */
    private final ProxySelector f33504h;
    private final rh0 i;

    /* renamed from: j, reason: collision with root package name */
    private final List<gm1> f33505j;

    /* renamed from: k, reason: collision with root package name */
    private final List<lr> f33506k;

    public ta(String uriHost, int i, l30 dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, ud1 ud1Var, zn znVar, vh proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.l.f(uriHost, "uriHost");
        kotlin.jvm.internal.l.f(dns, "dns");
        kotlin.jvm.internal.l.f(socketFactory, "socketFactory");
        kotlin.jvm.internal.l.f(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        kotlin.jvm.internal.l.f(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.l.f(proxySelector, "proxySelector");
        this.f33497a = dns;
        this.f33498b = socketFactory;
        this.f33499c = sSLSocketFactory;
        this.f33500d = ud1Var;
        this.f33501e = znVar;
        this.f33502f = proxyAuthenticator;
        this.f33503g = null;
        this.f33504h = proxySelector;
        this.i = new rh0.a().c(sSLSocketFactory != null ? "https" : "http").b(uriHost).a(i).a();
        this.f33505j = t82.b(protocols);
        this.f33506k = t82.b(connectionSpecs);
    }

    public final zn a() {
        return this.f33501e;
    }

    public final List<lr> b() {
        return this.f33506k;
    }

    public final l30 c() {
        return this.f33497a;
    }

    public final HostnameVerifier d() {
        return this.f33500d;
    }

    public final List<gm1> e() {
        return this.f33505j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return kotlin.jvm.internal.l.b(this.i, taVar.i) && a(taVar);
    }

    public final Proxy f() {
        return this.f33503g;
    }

    public final vh g() {
        return this.f33502f;
    }

    public final ProxySelector h() {
        return this.f33504h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f33501e) + ((Objects.hashCode(this.f33500d) + ((Objects.hashCode(this.f33499c) + ((Objects.hashCode(this.f33503g) + ((this.f33504h.hashCode() + m9.a(this.f33506k, m9.a(this.f33505j, (this.f33502f.hashCode() + ((this.f33497a.hashCode() + ((this.i.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final SocketFactory i() {
        return this.f33498b;
    }

    public final SSLSocketFactory j() {
        return this.f33499c;
    }

    public final rh0 k() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb;
        String strG = this.i.g();
        int i = this.i.i();
        Object obj = this.f33503g;
        if (obj != null) {
            sb = new StringBuilder("proxy=");
        } else {
            obj = this.f33504h;
            sb = new StringBuilder("proxySelector=");
        }
        sb.append(obj);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(strG);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(i);
        sb2.append(", ");
        return B4.f.c(sb2, string, "}");
    }

    public final boolean a(ta that) {
        kotlin.jvm.internal.l.f(that, "that");
        return kotlin.jvm.internal.l.b(this.f33497a, that.f33497a) && kotlin.jvm.internal.l.b(this.f33502f, that.f33502f) && kotlin.jvm.internal.l.b(this.f33505j, that.f33505j) && kotlin.jvm.internal.l.b(this.f33506k, that.f33506k) && kotlin.jvm.internal.l.b(this.f33504h, that.f33504h) && kotlin.jvm.internal.l.b(this.f33503g, that.f33503g) && kotlin.jvm.internal.l.b(this.f33499c, that.f33499c) && kotlin.jvm.internal.l.b(this.f33500d, that.f33500d) && kotlin.jvm.internal.l.b(this.f33501e, that.f33501e) && this.i.i() == that.i.i();
    }
}
