package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import nk.k;
import r5.c;
import yj.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i4, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        k.e(str, "uriHost");
        k.e(dns, "dns");
        k.e(socketFactory, "socketFactory");
        k.e(authenticator, "proxyAuthenticator");
        k.e(list, "protocols");
        k.e(list2, "connectionSpecs");
        k.e(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i4).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    @a
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m0deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @a
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m1deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @a
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m2deprecated_dns() {
        return this.dns;
    }

    @a
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m3deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @a
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m4deprecated_protocols() {
        return this.protocols;
    }

    @a
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m5deprecated_proxy() {
        return this.proxy;
    }

    @a
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m6deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @a
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m7deprecated_proxySelector() {
        return this.proxySelector;
    }

    @a
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m8deprecated_socketFactory() {
        return this.socketFactory;
    }

    @a
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m9deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @a
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m10deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return k.a(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        k.e(address, "that");
        return k.a(this.dns, address.dns) && k.a(this.proxyAuthenticator, address.proxyAuthenticator) && k.a(this.protocols, address.protocols) && k.a(this.connectionSpecs, address.connectionSpecs) && k.a(this.proxySelector, address.proxySelector) && k.a(this.proxy, address.proxy) && k.a(this.sslSocketFactory, address.sslSocketFactory) && k.a(this.hostnameVerifier, address.hostnameVerifier) && k.a(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder("Address{");
        sb3.append(this.url.host());
        sb3.append(':');
        sb3.append(this.url.port());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        return c.l(sb3, sb2.toString(), '}');
    }

    public final HttpUrl url() {
        return this.url;
    }
}
