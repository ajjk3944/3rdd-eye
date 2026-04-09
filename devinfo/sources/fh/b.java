package fh;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @uf.b("order_info")
    private final String f24042a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.a(this.f24042a, ((b) obj).f24042a);
    }

    public final int hashCode() {
        return this.f24042a.hashCode();
    }

    public final String toString() {
        return d.h.t("AlipayData(orderInfo=", this.f24042a, ")");
    }
}
