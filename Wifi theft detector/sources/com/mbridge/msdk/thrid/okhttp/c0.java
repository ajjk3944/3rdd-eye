package com.mbridge.msdk.thrid.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    final a f17527a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f17528b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f17529c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f17527a = aVar;
        this.f17528b = proxy;
        this.f17529c = inetSocketAddress;
    }

    public a a() {
        return this.f17527a;
    }

    public Proxy b() {
        return this.f17528b;
    }

    public boolean c() {
        return this.f17527a.f17472i != null && this.f17528b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f17529c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f17527a.equals(this.f17527a) && c0Var.f17528b.equals(this.f17528b) && c0Var.f17529c.equals(this.f17529c);
    }

    public int hashCode() {
        return ((((this.f17527a.hashCode() + 527) * 31) + this.f17528b.hashCode()) * 31) + this.f17529c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f17529c + "}";
    }
}
