package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class xd1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35256a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35257b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f35258c;

    public xd1(int i, int i10, SSLSocketFactory sSLSocketFactory) {
        this.f35256a = i;
        this.f35257b = i10;
        this.f35258c = sSLSocketFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd1)) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        return this.f35256a == xd1Var.f35256a && this.f35257b == xd1Var.f35257b && kotlin.jvm.internal.l.b(this.f35258c, xd1Var.f35258c);
    }

    public final int hashCode() {
        int iA = sx1.a(this.f35257b, this.f35256a * 31, 31);
        SSLSocketFactory sSLSocketFactory = this.f35258c;
        return iA + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    public final String toString() {
        int i = this.f35256a;
        int i10 = this.f35257b;
        SSLSocketFactory sSLSocketFactory = this.f35258c;
        StringBuilder sbI = androidx.work.s.i("OkHttpConfiguration(connectionTimeoutMs=", i, ", readTimeoutMs=", i10, ", sslSocketFactory=");
        sbI.append(sSLSocketFactory);
        sbI.append(")");
        return sbI.toString();
    }
}
