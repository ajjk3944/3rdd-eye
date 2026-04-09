package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes3.dex */
public final class ps1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta f31908a;

    /* renamed from: b, reason: collision with root package name */
    private final Proxy f31909b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f31910c;

    public ps1(ta address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.l.f(address, "address");
        kotlin.jvm.internal.l.f(proxy, "proxy");
        kotlin.jvm.internal.l.f(socketAddress, "socketAddress");
        this.f31908a = address;
        this.f31909b = proxy;
        this.f31910c = socketAddress;
    }

    public final ta a() {
        return this.f31908a;
    }

    public final Proxy b() {
        return this.f31909b;
    }

    public final boolean c() {
        return this.f31908a.j() != null && this.f31909b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f31910c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ps1)) {
            return false;
        }
        ps1 ps1Var = (ps1) obj;
        return kotlin.jvm.internal.l.b(ps1Var.f31908a, this.f31908a) && kotlin.jvm.internal.l.b(ps1Var.f31909b, this.f31909b) && kotlin.jvm.internal.l.b(ps1Var.f31910c, this.f31910c);
    }

    public final int hashCode() {
        return this.f31910c.hashCode() + ((this.f31909b.hashCode() + ((this.f31908a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f31910c + "}";
    }
}
