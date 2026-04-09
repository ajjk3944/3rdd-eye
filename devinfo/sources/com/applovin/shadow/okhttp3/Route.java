package com.applovin.shadow.okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import nk.k;
import yj.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        k.e(address, "address");
        k.e(proxy, "proxy");
        k.e(inetSocketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @a
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final Address m130deprecated_address() {
        return this.address;
    }

    @a
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m131deprecated_proxy() {
        return this.proxy;
    }

    @a
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m132deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return k.a(route.address, this.address) && k.a(route.proxy, this.proxy) && k.a(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
