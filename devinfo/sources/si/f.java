package si;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f33809a;

    public f(String str) {
        k.e(str, "skuId");
        this.f33809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k.a(this.f33809a, ((f) obj).f33809a);
    }

    public final int hashCode() {
        return this.f33809a.hashCode() * 31;
    }

    public final String toString() {
        return d.h.t("PayFor(skuId=", this.f33809a, ", offerToken=null)");
    }
}
