package si;

import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f33798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33799b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33800c;

    public c(String str, String str2, boolean z3) {
        k.e(str, "skuId");
        this.f33798a = str;
        this.f33799b = str2;
        this.f33800c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.a(this.f33798a, cVar.f33798a) && this.f33799b.equals(cVar.f33799b) && this.f33800c == cVar.f33800c;
    }

    public final int hashCode() {
        return ((u.m(this.f33798a.hashCode() * 31, 31, this.f33799b) + (this.f33800c ? 1231 : 1237)) * 31) + 2;
    }

    public final String toString() {
        StringBuilder sbO = r5.c.o("IapOrder(skuId=", this.f33798a, ", token=", this.f33799b, ", isAutoRenewing=");
        sbO.append(this.f33800c);
        sbO.append(", iapImpl=2)");
        return sbO.toString();
    }
}
